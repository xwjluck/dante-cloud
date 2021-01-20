/*
 * Copyright (c) 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Project Name: eurynome-cloud
 * Module Name: eurynome-cloud-security
 * File Name: HerodotusWebResponseExceptionTranslator.java
 * Author: gengwei.zheng
 * Date: 2020/6/8 上午11:54
 * LastModified: 2020/6/6 下午5:47
 */

package cn.herodotus.eurynome.security.response;

import cn.herodotus.eurynome.common.domain.Result;
import cn.herodotus.eurynome.security.response.exception.SecurityGlobalExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author gengwei.zheng
 */

@Slf4j
public class HerodotusWebResponseExceptionTranslator implements WebResponseExceptionTranslator {

    @Override
    public ResponseEntity<Result<String>> translate(Exception e) throws Exception {
        HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
        Result<String> result = SecurityGlobalExceptionHandler.resolveOauthException(e, request.getRequestURI());
        return ResponseEntity.status(result.getStatus()).body(result);
    }
}