/*
 * Copyright (c) 2019-2021 Gengwei Zheng (herodotus@aliyun.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project Name: eurynome-cloud
 * Module Name: eurynome-cloud-upms-logic
 * File Name: OwnershipRemove.java
 * Author: gengwei.zheng
 * Date: 2021/09/25 10:27:25
 */

package cn.herodotus.eurynome.upms.logic.dto;

import cn.herodotus.eurynome.common.definition.dto.BaseDTO;
import com.google.common.base.MoreObjects;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;

/**
 * <p>Description: 删除人员归属参数BO对象 </p>
 *
 * @author : gengwei.zheng
 * @date : 2021/9/25 10:25
 */
@Schema(description = "删除人员归属参数BO对象")
public class OwnershipRemove extends BaseDTO {

    @NotNull(message = "归属ID不能为空")
    @Schema(description = "归属ID")
    private String ownershipId;

    @NotNull(message = "部门ID不能为空")
    @Schema(description = "部门ID")
    private String departmentId;

    @NotNull(message = "人员ID不能为空")
    @Schema(description = "人员ID")
    private String employeeId;

    public String getOwnershipId() {
        return ownershipId;
    }

    public void setOwnershipId(String ownershipId) {
        this.ownershipId = ownershipId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("ownershipId", ownershipId)
                .add("departmentId", departmentId)
                .add("employeeId", employeeId)
                .toString();
    }
}
