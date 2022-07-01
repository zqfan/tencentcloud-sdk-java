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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationProxyDetailResponse extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 代理名称
当ProxyType=hostname时，表示域名或者子域名
当ProxyType=instance时，表示实例名称
    */
    @SerializedName("ProxyName")
    @Expose
    private String ProxyName;

    /**
    * 调度模式：
ip表示Anycast IP
domain表示CNAME
    */
    @SerializedName("PlatType")
    @Expose
    private String PlatType;

    /**
    * 0关闭安全，1开启安全
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * 0关闭加速，1开启加速
    */
    @SerializedName("AccelerateType")
    @Expose
    private Long AccelerateType;

    /**
    * 字段已经移至Rule.ForwardClientIp
    */
    @SerializedName("ForwardClientIp")
    @Expose
    private String ForwardClientIp;

    /**
    * 字段已经移至Rule.SessionPersist
    */
    @SerializedName("SessionPersist")
    @Expose
    private Boolean SessionPersist;

    /**
    * 规则列表
    */
    @SerializedName("Rule")
    @Expose
    private ApplicationProxyRule [] Rule;

    /**
    * 状态：
online：启用
offline：停用
progress：部署中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 调度信息
    */
    @SerializedName("ScheduleValue")
    @Expose
    private String [] ScheduleValue;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 会话保持时间
    */
    @SerializedName("SessionPersistTime")
    @Expose
    private Long SessionPersistTime;

    /**
    * 服务类型
hostname：子域名模式
instance：实例模式
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
    * 当ProxyType=hostname时：
ProxyName为域名，如：test.123.com
HostId表示该域名，即test.123.com对应的代理加速唯一标识
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例ID 
     * @return ProxyId 实例ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 实例ID
     * @param ProxyId 实例ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 代理名称
当ProxyType=hostname时，表示域名或者子域名
当ProxyType=instance时，表示实例名称 
     * @return ProxyName 代理名称
当ProxyType=hostname时，表示域名或者子域名
当ProxyType=instance时，表示实例名称
     */
    public String getProxyName() {
        return this.ProxyName;
    }

    /**
     * Set 代理名称
当ProxyType=hostname时，表示域名或者子域名
当ProxyType=instance时，表示实例名称
     * @param ProxyName 代理名称
当ProxyType=hostname时，表示域名或者子域名
当ProxyType=instance时，表示实例名称
     */
    public void setProxyName(String ProxyName) {
        this.ProxyName = ProxyName;
    }

    /**
     * Get 调度模式：
ip表示Anycast IP
domain表示CNAME 
     * @return PlatType 调度模式：
ip表示Anycast IP
domain表示CNAME
     */
    public String getPlatType() {
        return this.PlatType;
    }

    /**
     * Set 调度模式：
ip表示Anycast IP
domain表示CNAME
     * @param PlatType 调度模式：
ip表示Anycast IP
domain表示CNAME
     */
    public void setPlatType(String PlatType) {
        this.PlatType = PlatType;
    }

    /**
     * Get 0关闭安全，1开启安全 
     * @return SecurityType 0关闭安全，1开启安全
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set 0关闭安全，1开启安全
     * @param SecurityType 0关闭安全，1开启安全
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get 0关闭加速，1开启加速 
     * @return AccelerateType 0关闭加速，1开启加速
     */
    public Long getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set 0关闭加速，1开启加速
     * @param AccelerateType 0关闭加速，1开启加速
     */
    public void setAccelerateType(Long AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get 字段已经移至Rule.ForwardClientIp 
     * @return ForwardClientIp 字段已经移至Rule.ForwardClientIp
     */
    public String getForwardClientIp() {
        return this.ForwardClientIp;
    }

    /**
     * Set 字段已经移至Rule.ForwardClientIp
     * @param ForwardClientIp 字段已经移至Rule.ForwardClientIp
     */
    public void setForwardClientIp(String ForwardClientIp) {
        this.ForwardClientIp = ForwardClientIp;
    }

    /**
     * Get 字段已经移至Rule.SessionPersist 
     * @return SessionPersist 字段已经移至Rule.SessionPersist
     */
    public Boolean getSessionPersist() {
        return this.SessionPersist;
    }

    /**
     * Set 字段已经移至Rule.SessionPersist
     * @param SessionPersist 字段已经移至Rule.SessionPersist
     */
    public void setSessionPersist(Boolean SessionPersist) {
        this.SessionPersist = SessionPersist;
    }

    /**
     * Get 规则列表 
     * @return Rule 规则列表
     */
    public ApplicationProxyRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set 规则列表
     * @param Rule 规则列表
     */
    public void setRule(ApplicationProxyRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 状态：
online：启用
offline：停用
progress：部署中 
     * @return Status 状态：
online：启用
offline：停用
progress：部署中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：
online：启用
offline：停用
progress：部署中
     * @param Status 状态：
online：启用
offline：停用
progress：部署中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 调度信息 
     * @return ScheduleValue 调度信息
     */
    public String [] getScheduleValue() {
        return this.ScheduleValue;
    }

    /**
     * Set 调度信息
     * @param ScheduleValue 调度信息
     */
    public void setScheduleValue(String [] ScheduleValue) {
        this.ScheduleValue = ScheduleValue;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称 
     * @return ZoneName 站点名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称
     * @param ZoneName 站点名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 会话保持时间 
     * @return SessionPersistTime 会话保持时间
     */
    public Long getSessionPersistTime() {
        return this.SessionPersistTime;
    }

    /**
     * Set 会话保持时间
     * @param SessionPersistTime 会话保持时间
     */
    public void setSessionPersistTime(Long SessionPersistTime) {
        this.SessionPersistTime = SessionPersistTime;
    }

    /**
     * Get 服务类型
hostname：子域名模式
instance：实例模式 
     * @return ProxyType 服务类型
hostname：子域名模式
instance：实例模式
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set 服务类型
hostname：子域名模式
instance：实例模式
     * @param ProxyType 服务类型
hostname：子域名模式
instance：实例模式
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get 当ProxyType=hostname时：
ProxyName为域名，如：test.123.com
HostId表示该域名，即test.123.com对应的代理加速唯一标识 
     * @return HostId 当ProxyType=hostname时：
ProxyName为域名，如：test.123.com
HostId表示该域名，即test.123.com对应的代理加速唯一标识
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 当ProxyType=hostname时：
ProxyName为域名，如：test.123.com
HostId表示该域名，即test.123.com对应的代理加速唯一标识
     * @param HostId 当ProxyType=hostname时：
ProxyName为域名，如：test.123.com
HostId表示该域名，即test.123.com对应的代理加速唯一标识
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
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

    public DescribeApplicationProxyDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationProxyDetailResponse(DescribeApplicationProxyDetailResponse source) {
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ProxyName != null) {
            this.ProxyName = new String(source.ProxyName);
        }
        if (source.PlatType != null) {
            this.PlatType = new String(source.PlatType);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new Long(source.AccelerateType);
        }
        if (source.ForwardClientIp != null) {
            this.ForwardClientIp = new String(source.ForwardClientIp);
        }
        if (source.SessionPersist != null) {
            this.SessionPersist = new Boolean(source.SessionPersist);
        }
        if (source.Rule != null) {
            this.Rule = new ApplicationProxyRule[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new ApplicationProxyRule(source.Rule[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ScheduleValue != null) {
            this.ScheduleValue = new String[source.ScheduleValue.length];
            for (int i = 0; i < source.ScheduleValue.length; i++) {
                this.ScheduleValue[i] = new String(source.ScheduleValue[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.SessionPersistTime != null) {
            this.SessionPersistTime = new Long(source.SessionPersistTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ProxyName", this.ProxyName);
        this.setParamSimple(map, prefix + "PlatType", this.PlatType);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "ForwardClientIp", this.ForwardClientIp);
        this.setParamSimple(map, prefix + "SessionPersist", this.SessionPersist);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "ScheduleValue.", this.ScheduleValue);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "SessionPersistTime", this.SessionPersistTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

