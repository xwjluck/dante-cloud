package cn.herodotus.eurynome.integration.sms.service.aliyun;

import cn.herodotus.eurynome.integration.content.properties.AliyunProperties;
import cn.herodotus.eurynome.integration.sms.domain.aliyun.SendSmsRequest;
import cn.herodotus.eurynome.integration.sms.domain.aliyun.SmsResponse;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>Description: 阿里发送短信服务 </p>
 *
 * @author : gengwei.zheng
 * @date : 2021/4/16 15:01
 */
@Slf4j
@Service
public class SendSmsService {

	@Autowired
	private AliyunProperties aliyunProperties;
	@Autowired
	private IAcsClient iAcsClient;

	public SmsResponse send(List<String> phoneNumbers, Map<String, Object> templateParam) {
		String phoneNumberString = StringUtils.join(phoneNumbers, ",");
		String templateParamString = JSON.toJSONString(templateParam);
		return this.send(phoneNumberString, templateParamString);
	}

	public SmsResponse send(String phoneNumbers, String templateParam) {
		SendSmsRequest sendSmsRequest = new SendSmsRequest();
		sendSmsRequest.setPhoneNumbers(phoneNumbers);
		sendSmsRequest.setSignName(sendSmsRequest.getSignName());
		sendSmsRequest.setTemplateCode(sendSmsRequest.getTemplateCode());
		sendSmsRequest.setTemplateParam(templateParam);
		return this.send(sendSmsRequest);
	}


	public SmsResponse send(SendSmsRequest sendSmsRequest) {
		CommonRequest commonRequest = new CommonRequest();
		commonRequest.setSysMethod(MethodType.POST);
		commonRequest.setSysDomain(aliyunProperties.getSms().getDomain());
		commonRequest.setSysVersion(aliyunProperties.getSms().getVersion());
		commonRequest.setSysAction(sendSmsRequest.getAction());
		sendSmsRequest.getParameters().forEach(commonRequest::putQueryParameter);

		try {
			CommonResponse commonResponse = iAcsClient.getCommonResponse(commonRequest);
			if (ObjectUtils.isNotEmpty(commonResponse) && commonResponse.getHttpStatus() == 200) {
				return JSON.parseObject(commonResponse.getData(), SmsResponse.class);
			} else {
				return null;
			}
		} catch (ClientException e) {
			e.printStackTrace();
			return null;
		}
	}
}
