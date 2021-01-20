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
 * Module Name: eurynome-cloud-kernel
 * File Name: EnableLogCenter.java
 * Author: gengwei.zheng
 * Date: 2020/6/9 下午1:06
 * LastModified: 2020/5/29 下午8:25
 */

package cn.herodotus.eurynome.kernel.annotation;

import java.lang.annotation.*;

/**
 * <p>Project: eurynome-cloud </p>
 * <p>File: EnableHerodotusFeign </p>
 *
 * <p>Description: 开启Kernel </p>
 * 目前主要功能：
 * 1.启用日志收集
 *
 * @author : gengwei.zheng
 * @date : 2020/5/23 10:04
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableLogCenter
@EnableHerodotusFeign
public @interface EnableHerodotusKernel {
}