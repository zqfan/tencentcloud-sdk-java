/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsResponse extends AbstractModel{

    /**
    * 数据总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 项目列表
    */
    @SerializedName("Projects")
    @Expose
    private Project [] Projects;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据总条数 
     * @return Total 数据总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 数据总条数
     * @param Total 数据总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 项目列表 
     * @return Projects 项目列表
     */
    public Project [] getProjects() {
        return this.Projects;
    }

    /**
     * Set 项目列表
     * @param Projects 项目列表
     */
    public void setProjects(Project [] Projects) {
        this.Projects = Projects;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeProjectsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsResponse(DescribeProjectsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Projects != null) {
            this.Projects = new Project[source.Projects.length];
            for (int i = 0; i < source.Projects.length; i++) {
                this.Projects[i] = new Project(source.Projects[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Projects.", this.Projects);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
