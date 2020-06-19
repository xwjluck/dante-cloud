package cn.herodotus.eurynome.common.enums.captcha;

import com.wf.captcha.base.Captcha;

/**
 * <p> Description : HappyCaptcha字幕类型Enum </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/2/25 14:53
 */
public enum CaptchaLetterType {

    /**
     * enum
     */
    DEFAULT(Captcha.TYPE_DEFAULT),
    ONLY_NUMBER(Captcha.TYPE_ONLY_NUMBER),
    ONLY_CHAR(Captcha.TYPE_ONLY_CHAR),
    ONLY_UPPER(Captcha.TYPE_ONLY_UPPER),
    ONLY_LOWER(Captcha.TYPE_ONLY_LOWER),
    NUM_AND_UPPER(Captcha.TYPE_NUM_AND_UPPER);

    private int type;

    CaptchaLetterType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
