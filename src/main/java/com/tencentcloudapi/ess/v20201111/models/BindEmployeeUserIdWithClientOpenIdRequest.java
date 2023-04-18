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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindEmployeeUserIdWithClientOpenIdRequest extends AbstractModel{

    /**
    * OpenId与UserId二选一必填一个，当传入客户系统openId，传入的openId需与电子签员工userId绑定，且渠道channel必填，channel值为INTEGRATE，否则传入userId
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 电子签系统员工UserId
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 客户系统OpenId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get OpenId与UserId二选一必填一个，当传入客户系统openId，传入的openId需与电子签员工userId绑定，且渠道channel必填，channel值为INTEGRATE，否则传入userId 
     * @return Operator OpenId与UserId二选一必填一个，当传入客户系统openId，传入的openId需与电子签员工userId绑定，且渠道channel必填，channel值为INTEGRATE，否则传入userId
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set OpenId与UserId二选一必填一个，当传入客户系统openId，传入的openId需与电子签员工userId绑定，且渠道channel必填，channel值为INTEGRATE，否则传入userId
     * @param Operator OpenId与UserId二选一必填一个，当传入客户系统openId，传入的openId需与电子签员工userId绑定，且渠道channel必填，channel值为INTEGRATE，否则传入userId
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 电子签系统员工UserId 
     * @return UserId 电子签系统员工UserId
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 电子签系统员工UserId
     * @param UserId 电子签系统员工UserId
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 客户系统OpenId 
     * @return OpenId 客户系统OpenId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 客户系统OpenId
     * @param OpenId 客户系统OpenId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    public BindEmployeeUserIdWithClientOpenIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindEmployeeUserIdWithClientOpenIdRequest(BindEmployeeUserIdWithClientOpenIdRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

