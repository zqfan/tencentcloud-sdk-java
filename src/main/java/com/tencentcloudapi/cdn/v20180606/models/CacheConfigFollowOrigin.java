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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheConfigFollowOrigin extends AbstractModel{

    /**
    * 路径缓存遵循源站配置开关，取值有：
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 启发式缓存配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeuristicCache")
    @Expose
    private HeuristicCache HeuristicCache;

    /**
     * Get 路径缓存遵循源站配置开关，取值有：
on：开启
off：关闭 
     * @return Switch 路径缓存遵循源站配置开关，取值有：
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 路径缓存遵循源站配置开关，取值有：
on：开启
off：关闭
     * @param Switch 路径缓存遵循源站配置开关，取值有：
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 启发式缓存配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeuristicCache 启发式缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HeuristicCache getHeuristicCache() {
        return this.HeuristicCache;
    }

    /**
     * Set 启发式缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeuristicCache 启发式缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeuristicCache(HeuristicCache HeuristicCache) {
        this.HeuristicCache = HeuristicCache;
    }

    public CacheConfigFollowOrigin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfigFollowOrigin(CacheConfigFollowOrigin source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.HeuristicCache != null) {
            this.HeuristicCache = new HeuristicCache(source.HeuristicCache);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "HeuristicCache.", this.HeuristicCache);

    }
}

