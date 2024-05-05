/*
 * Copyright (c) 2020-2030 ZHENGGENGWEI(码匠君)<herodotus@aliyun.com>
 *
 * Dante Cloud licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * <http://www.apache.org/licenses/LICENSE-2.0>
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Dante Cloud 采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：
 *
 * 1.请不要删除和修改根目录下的LICENSE文件。
 * 2.请不要删除和修改 Dante Cloud 源码头部的版权声明。
 * 3.请保留源码和相关描述文件的项目出处，作者声明等。
 * 4.分发源码时候，请注明软件出处 <https://gitee.com/dromara/dante-cloud>
 * 5.在修改包名，模块名称，项目代码等时，请注明软件出处 <https://gitee.com/dromara/dante-cloud>
 * 6.若您的项目无法满足以上几点，可申请商业授权
 */

package cn.herodotus.cloud.rpc.server.upms.autoconfigure.grpc.converter;

import cn.herodotus.stirrup.grpc.permission.GrpcHerodotusPermission;
import cn.herodotus.stirrup.grpc.permission.GrpcHerodotusPermissions;
import cn.herodotus.stirrup.logic.upms.entity.security.SysPermission;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.core.convert.converter.Converter;

import java.util.List;

/**
 * <p>Description: List<SysPermission> 转  GrpcHerodotusPermissions 转换器</p>
 *
 * @author : gengwei.zheng
 * @date : 2024/3/19 14:40
 */
public class HerodotusToGrpcPermissionConverter implements Converter<List<SysPermission>, GrpcHerodotusPermissions> {
    @Override
    public GrpcHerodotusPermissions convert(List<SysPermission> source) {
        if (CollectionUtils.isNotEmpty(source)) {
            return GrpcHerodotusPermissions.newBuilder().addAllPermissions(toGrpcs(source)).build();
        } else {
            return GrpcHerodotusPermissions.newBuilder().build();
        }
    }

    private List<GrpcHerodotusPermission> toGrpcs(List<SysPermission> sysPermissions) {
        return sysPermissions.stream().map(this::toGrpc).toList();
    }

    private GrpcHerodotusPermission toGrpc(SysPermission sysPermission) {
        return GrpcHerodotusPermission.newBuilder()
                .setPermissionId(sysPermission.getPermissionId())
                .setPermissionCode(sysPermission.getPermissionCode())
                .setPermissionName(sysPermission.getPermissionName())
                .build();
    }
}
