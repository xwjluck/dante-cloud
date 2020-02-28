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
 * Module Name: luban-cloud-upms-ability
 * File Name: SysRoleController.java
 * Author: gengwei.zheng
 * Date: 2019/11/25 上午11:05
 * LastModified: 2019/11/25 上午11:02
 */

package cn.herodotus.eurynome.upms.rest.controller.system;

import cn.herodotus.eurynome.component.common.domain.Result;
import cn.herodotus.eurynome.component.security.controller.AbstractController;
import cn.herodotus.eurynome.upms.api.entity.system.SysRole;
import cn.herodotus.eurynome.upms.logic.service.system.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
@Api(value = "平台角色接口", tags = "用户中心服务")
public class SysRoleController extends AbstractController {

    private final SysRoleService sysRoleService;

    @Autowired
    public SysRoleController(SysRoleService sysRoleService) {
        this.sysRoleService = sysRoleService;
    }

    @ApiOperation(value = "获取角色分页数据", notes = "通过pageNumber和pageSize获取分页数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNumber", required = true, value = "当前页数"),
            @ApiImplicitParam(name = "pageSize", required = true, value = "每页显示数据条目")
    })
    @GetMapping
    public Result findByPage(
            @RequestParam("pageNumber") Integer pageNumber,
            @RequestParam("pageSize") Integer pageSize) {
        if (pageSize != 0) {
            Page<SysRole> pages = sysRoleService.findByPage(pageNumber, pageSize);
            return Result.ok().data(getFrontPageMap(pages));
        } else {
            return Result.failed();
        }
    }

    @ApiOperation(value = "保存或更新角色", notes = "接收JSON数据，转换为SysRole实体，进行保存或更新")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sysRole", required = true, value = "可转换为SysRole实体的json数据", paramType = "JSON")
    })
    @PostMapping
    public Result saveOrUpdate(@RequestBody SysRole sysRole) {
        SysRole newSysRole = sysRoleService.saveOrUpdate(sysRole);
        if (null != newSysRole) {
            return Result.ok().data(newSysRole);
        } else {
            return Result.failed().message("保存失败！");
        }
    }

    @ApiOperation(value = "删除角色", notes = "根据roleId删除角色，以及相关联的关联关系数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roleId", required = true, value = "角色ID", paramType = "JSON")
    })
    @DeleteMapping
    public Result delete(@RequestBody String roleId) {
        if (StringUtils.isNotEmpty(roleId)) {
            sysRoleService.deleteById(roleId);
            return Result.ok();
        } else {
            return Result.failed().message("参数错误，删除失败！");
        }
    }

    @ApiOperation(value = "给角色授权", notes = "为角色赋予权限")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roleId", required = true, value = "角色ID"),
            @ApiImplicitParam(name = "authorities[]", required = true, value = "权限对象组成的数组")
    })
    @PutMapping
    public Result authorize(@RequestParam(name = "roleId") String roleId, @RequestParam(name = "authorities[]") String[] authorities) {
        SysRole sysRole = sysRoleService.authorize(roleId, authorities);
        if (null != sysRole) {
            return Result.ok();
        } else {
            return Result.failed().message("授权失败");
        }
    }
}
