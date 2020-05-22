/*
 * Copyright 2019-2019 the original author or authors.
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
 * Project Name: luban-cloud
 * Module Name: luban-cloud-upms-logic
 * File Name: AbstractRequestMappingProcessor.java
 * Author: gengwei.zheng
 * Date: 2019/11/21 下午12:38
 * LastModified: 2019/11/21 下午12:38
 */

package cn.herodotus.eurynome.upms.logic.processor;

import cn.herodotus.eurynome.common.domain.RequestMappingResource;
import cn.herodotus.eurynome.upms.api.entity.system.SysAuthority;
import cn.herodotus.eurynome.upms.api.helper.UpmsHelper;
import cn.herodotus.eurynome.upms.logic.service.system.SysAuthorityService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * <p> Description : 基础的RequestMapping信息存储处理 </p>
 *
 * @author : gengwei.zheng
 * @date : 2019/11/21 12:38
 */
@Slf4j
public abstract class AbstractRequestMappingProcessor {

    private SysAuthorityService sysAuthorityService;

    public AbstractRequestMappingProcessor(SysAuthorityService sysAuthorityService) {
        this.sysAuthorityService = sysAuthorityService;
    }

    protected boolean store(List<RequestMappingResource> requestMappingResources) {

        List<SysAuthority> sysAuthorities = UpmsHelper.convertServiceResourceToSysAuthorities(requestMappingResources);

        List<SysAuthority> result = sysAuthorityService.batchSaveOrUpdate(sysAuthorities);

        if (CollectionUtils.isNotEmpty(result)) {
            log.info("[Herodotus] |- Store Service Resources Success!");
            return true;
        } else {
            log.error("[Herodotus] |- Store Service Resources May Be Error, Please Check!");
            return false;
        }
    }
}
