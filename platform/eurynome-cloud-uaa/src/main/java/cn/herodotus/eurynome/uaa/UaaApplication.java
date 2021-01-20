/*
 * Copyright (c) 2019-2021 the original author or authors.
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
 * Module Name: eurynome-cloud-uaa
 * File Name: UaaApplication.java
 * Author: gengwei.zheng
 * Date: 2021/1/19 下午2:53
 * LastModified: 2021/1/19 下午2:52
 */

package cn.herodotus.eurynome.uaa;

import cn.herodotus.eurynome.kernel.annotation.EnableHerodotusKernel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>Project: eurynome-cloud-athena </p>
 * <p>File: UaaApplication.java </p>
 *
 * <p>Description: Uaa服务 </p>
 *
 * @author : gengwei.zheng
 * @date : 2021/1/19 14:52
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHerodotusKernel
public class UaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UaaApplication.class, args);
    }

}