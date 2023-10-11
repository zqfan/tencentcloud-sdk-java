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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQuotasResponse extends AbstractModel{

    /**
    * 资源额度列表
    */
    @SerializedName("GeneralResourceQuotaSet")
    @Expose
    private GeneralResourceQuotaSet [] GeneralResourceQuotaSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源额度列表 
     * @return GeneralResourceQuotaSet 资源额度列表
     */
    public GeneralResourceQuotaSet [] getGeneralResourceQuotaSet() {
        return this.GeneralResourceQuotaSet;
    }

    /**
     * Set 资源额度列表
     * @param GeneralResourceQuotaSet 资源额度列表
     */
    public void setGeneralResourceQuotaSet(GeneralResourceQuotaSet [] GeneralResourceQuotaSet) {
        this.GeneralResourceQuotaSet = GeneralResourceQuotaSet;
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

    public DescribeQuotasResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQuotasResponse(DescribeQuotasResponse source) {
        if (source.GeneralResourceQuotaSet != null) {
            this.GeneralResourceQuotaSet = new GeneralResourceQuotaSet[source.GeneralResourceQuotaSet.length];
            for (int i = 0; i < source.GeneralResourceQuotaSet.length; i++) {
                this.GeneralResourceQuotaSet[i] = new GeneralResourceQuotaSet(source.GeneralResourceQuotaSet[i]);
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
        this.setParamArrayObj(map, prefix + "GeneralResourceQuotaSet.", this.GeneralResourceQuotaSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

