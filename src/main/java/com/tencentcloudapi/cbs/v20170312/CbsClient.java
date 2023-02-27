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
package com.tencentcloudapi.cbs.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cbs.v20170312.models.*;

public class CbsClient extends AbstractClient{
    private static String endpoint = "cbs.tencentcloudapi.com";
    private static String service = "cbs";
    private static String version = "2017-03-12";

    public CbsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CbsClient(Credential credential, String region, ClientProfile profile) {
        super(CbsClient.endpoint, CbsClient.version, credential, region, profile);
    }

    /**
     *本接口（ApplyDiskBackup）用于回滚备份点到原云硬盘。

* 仅支持回滚到原云硬盘上。对于数据盘备份点，如果您需要复制备份点数据到其它云硬盘上，请先使用 CreateSnapshot 将备份点转换为快照，然后使用 CreateDisks 接口创建新的弹性云硬盘，将快照数据复制到新购云硬盘上。
* 用于回滚的备份点必须处于NORMAL状态。备份点状态可以通过DescribeDiskBackups接口查询，见输出参数中BackupState字段解释。
* 如果是弹性云硬盘，则云硬盘必须处于未挂载状态，云硬盘挂载状态可以通过DescribeDisks接口查询，见Attached字段解释；如果是随实例一起购买的非弹性云硬盘，则实例必须处于关机状态，实例状态可以通过DescribeInstancesStatus接口查询。
     * @param req ApplyDiskBackupRequest
     * @return ApplyDiskBackupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyDiskBackupResponse ApplyDiskBackup(ApplyDiskBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyDiskBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyDiskBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyDiskBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ApplySnapshot）用于回滚快照到原云硬盘。

* 仅支持回滚到原云硬盘上。对于数据盘快照，如果您需要复制快照数据到其它云硬盘上，请使用[CreateDisks](/document/product/362/16312)接口创建新的弹性云盘，将快照数据复制到新购云盘上。 
* 用于回滚的快照必须处于NORMAL状态。快照状态可以通过[DescribeSnapshots](/document/product/362/15647)接口查询，见输出参数中SnapshotState字段解释。
* 如果是弹性云盘，则云盘必须处于未挂载状态，云硬盘挂载状态可以通过[DescribeDisks](/document/product/362/16315)接口查询，见Attached字段解释；如果是随实例一起购买的非弹性云盘，则实例必须处于关机状态，实例状态可以通过[DescribeInstancesStatus](/document/product/213/15738)接口查询。
     * @param req ApplySnapshotRequest
     * @return ApplySnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ApplySnapshotResponse ApplySnapshot(ApplySnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplySnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplySnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplySnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachDisks）用于挂载云硬盘。
 
* 支持批量操作，将多块云盘挂载到同一云主机。如果多个云盘中存在不允许挂载的云盘，则操作不执行，返回特定的错误码。
* 本接口为异步接口，当挂载云盘的请求成功返回时，表示后台已发起挂载云盘的操作，可通过接口[DescribeDisks](/document/product/362/16315)来查询对应云盘的状态，如果云盘的状态由“ATTACHING”变为“ATTACHED”，则为挂载成功。
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（BindAutoSnapshotPolicy）用于绑定云硬盘到指定的定期快照策略。

* 每个地域下的定期快照策略配额限制请参考文档[定期快照](/document/product/362/8191)。
* 当已绑定定期快照策略的云硬盘处于未使用状态（即弹性云盘未挂载或非弹性云盘的主机处于关机状态）将不会创建定期快照。
     * @param req BindAutoSnapshotPolicyRequest
     * @return BindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public BindAutoSnapshotPolicyResponse BindAutoSnapshotPolicy(BindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindAutoSnapshotPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindAutoSnapshotPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindAutoSnapshotPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CopySnapshotCrossRegions）用于快照跨地域复制。

* 本接口为异步接口，当跨地域复制的请求下发成功后会返回一个新的快照ID，此时快照未立即复制到目标地域，可请求目标地域的[DescribeSnapshots](/document/product/362/15647)接口查询新快照的状态，判断是否复制完成。如果快照的状态为“NORMAL”，表示快照复制完成。
* 本接口实现的快照跨地域复制操作将产生跨地域流量，预计2022年第三季度会针对此功能进行商业化计费；请留意后续站内信公告，避免产生预期外扣费。
     * @param req CopySnapshotCrossRegionsRequest
     * @return CopySnapshotCrossRegionsResponse
     * @throws TencentCloudSDKException
     */
    public CopySnapshotCrossRegionsResponse CopySnapshotCrossRegions(CopySnapshotCrossRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopySnapshotCrossRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CopySnapshotCrossRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CopySnapshotCrossRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAutoSnapshotPolicy）用于创建定期快照策略。

* 每个地域可创建的定期快照策略数量限制请参考文档[定期快照](/document/product/362/8191)。
* 每个地域可创建的快照有数量和容量的限制，具体请见腾讯云控制台快照页面提示，如果快照超配额，定期快照创建会失败。
     * @param req CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoSnapshotPolicyResponse CreateAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoSnapshotPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoSnapshotPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAutoSnapshotPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为云硬盘创建一个备份点。
     * @param req CreateDiskBackupRequest
     * @return CreateDiskBackupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDiskBackupResponse CreateDiskBackup(CreateDiskBackupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDiskBackupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDiskBackupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDiskBackup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDisks）用于创建云硬盘。

* 预付费云盘的购买会预先扣除本次云盘购买所需金额，在调用本接口前请确保账户余额充足。
* 本接口支持传入数据盘快照来创建云盘，实现将快照数据复制到新购云盘上。
* 本接口为异步接口，当创建请求下发成功后会返回一个新建的云盘ID列表，此时云盘的创建并未立即完成。可以通过调用[DescribeDisks](/document/product/362/16315)接口根据DiskId查询对应云盘，如果能查到云盘，且状态为'UNATTACHED'或'ATTACHED'，则表示创建成功。
     * @param req CreateDisksRequest
     * @return CreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisksResponse CreateDisks(CreateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateSnapshot）用于对指定云盘创建快照。

* 只有具有快照能力的云硬盘才能创建快照。云硬盘是否具有快照能力可由[DescribeDisks](/document/product/362/16315)接口查询，见SnapshotAbility字段。
* 可创建快照数量限制见[产品使用限制](https://cloud.tencent.com/doc/product/362/5145)。
* 当前支持将备份点转化为普通快照，转化之后可能会收取快照使用费用，备份点不保留，其占用的备份点配额也将被释放。
     * @param req CreateSnapshotRequest
     * @return CreateSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotResponse CreateSnapshot(CreateSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAutoSnapshotPolicies）用于删除定期快照策略。

*  支持批量操作。如果多个定期快照策略存在无法删除的，则操作不执行，以特定错误码返回。
     * @param req DeleteAutoSnapshotPoliciesRequest
     * @return DeleteAutoSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoSnapshotPoliciesResponse DeleteAutoSnapshotPolicies(DeleteAutoSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAutoSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAutoSnapshotPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAutoSnapshotPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除指定的云硬盘备份点。
     * @param req DeleteDiskBackupsRequest
     * @return DeleteDiskBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDiskBackupsResponse DeleteDiskBackups(DeleteDiskBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDiskBackupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDiskBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDiskBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSnapshots）用于删除快照。

* 快照必须处于NORMAL状态，快照状态可以通过[DescribeSnapshots](/document/product/362/15647)接口查询，见输出参数中SnapshotState字段解释。
* 支持批量操作。如果多个快照存在无法删除的快照，则操作不执行，以特定的错误码返回。
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAutoSnapshotPolicies）用于查询定期快照策略。

* 可以根据定期快照策略ID、名称或者状态等信息来查询定期快照策略的详细信息，不同条件之间为与(AND)的关系，过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的定期快照策略表。
     * @param req DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoSnapshotPoliciesResponse DescribeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoSnapshotPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoSnapshotPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDiskAssociatedAutoSnapshotPolicy）用于查询云盘绑定的定期快照策略。
     * @param req DescribeDiskAssociatedAutoSnapshotPolicyRequest
     * @return DescribeDiskAssociatedAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskAssociatedAutoSnapshotPolicyResponse DescribeDiskAssociatedAutoSnapshotPolicy(DescribeDiskAssociatedAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskAssociatedAutoSnapshotPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskAssociatedAutoSnapshotPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskAssociatedAutoSnapshotPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDiskBackups）用于查询备份点的详细信息。

根据备份点ID、创建备份点的云硬盘ID、创建备份点的云硬盘类型等对结果进行过滤，不同条件之间为与(AND)的关系，过滤信息详细请见过滤器Filter。
如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的备份点列表。
     * @param req DescribeDiskBackupsRequest
     * @return DescribeDiskBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskBackupsResponse DescribeDiskBackups(DescribeDiskBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskBackupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskBackupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskBackups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDiskConfigQuota）用于查询云硬盘配额。
     * @param req DescribeDiskConfigQuotaRequest
     * @return DescribeDiskConfigQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskConfigQuotaResponse DescribeDiskConfigQuota(DescribeDiskConfigQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskConfigQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskConfigQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskConfigQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口已废弃，切换至云审计接口。见https://tapd.woa.com/pro/prong/stories/view/1010114221880719007

查询云盘操作日志功能已迁移至LookUpEvents接口（https://cloud.tencent.com/document/product/629/12359），本接口（DescribeDiskOperationLogs）即将下线，后续不再提供调用，请知悉。
     * @param req DescribeDiskOperationLogsRequest
     * @return DescribeDiskOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskOperationLogsResponse DescribeDiskOperationLogs(DescribeDiskOperationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskOperationLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskOperationLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskOperationLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDiskStoragePool）查询用户的云硬盘独享集群列表。

* 可以根据独享集群ID(CdcId)、可用区(zone)等信息来查询和过滤云硬盘独享集群详细信息，不同的过滤条件之间为与(AND)的关系，过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的云硬盘独享集群列表。
     * @param req DescribeDiskStoragePoolRequest
     * @return DescribeDiskStoragePoolResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDiskStoragePoolResponse DescribeDiskStoragePool(DescribeDiskStoragePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDiskStoragePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDiskStoragePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDiskStoragePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDisks）用于查询云硬盘列表。

* 可以根据云硬盘ID、云硬盘类型或者云硬盘状态等信息来查询云硬盘的详细信息，不同条件之间为与(AND)的关系，过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的云硬盘列表。
     * @param req DescribeDisksRequest
     * @return DescribeDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksResponse DescribeDisks(DescribeDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeInstancesDiskNum）用于查询实例已挂载云硬盘数量。

* 支持批量操作，当传入多个云服务器实例ID，返回结果会分别列出每个云服务器挂载的云硬盘数量。
     * @param req DescribeInstancesDiskNumRequest
     * @return DescribeInstancesDiskNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDiskNumResponse DescribeInstancesDiskNum(DescribeInstancesDiskNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesDiskNumResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesDiskNumResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstancesDiskNum");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口已废弃，切换至云审计接口。见https://tapd.woa.com/pro/prong/stories/view/1010114221880719007

查询快照操作日志功能已迁移至LookUpEvents接口（https://cloud.tencent.com/document/product/629/12359），本接口（DescribeSnapshotOperationLogs）即将下线，后续不再提供调用，请知悉。

     * @param req DescribeSnapshotOperationLogsRequest
     * @return DescribeSnapshotOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotOperationLogsResponse DescribeSnapshotOperationLogs(DescribeSnapshotOperationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotOperationLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotOperationLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotOperationLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSnapshotSharePermission）用于查询快照的分享信息。
     * @param req DescribeSnapshotSharePermissionRequest
     * @return DescribeSnapshotSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotSharePermissionResponse DescribeSnapshotSharePermission(DescribeSnapshotSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotSharePermissionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotSharePermissionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshotSharePermission");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSnapshots）用于查询快照的详细信息。

* 根据快照ID、创建快照的云硬盘ID、创建快照的云硬盘类型等对结果进行过滤，不同条件之间为与(AND)的关系，过滤信息详细请见过滤器`Filter`。
*  如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的快照列表。
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSnapshots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachDisks）用于卸载云硬盘。

* 支持批量操作，卸载挂载在同一主机上的多块云盘。如果多块云盘中存在不允许卸载的云盘，则操作不执行，返回特定的错误码。
* 本接口为异步接口，当请求成功返回时，云盘并未立即从主机卸载，可通过接口[DescribeDisks](/document/product/362/16315)来查询对应云盘的状态，如果云盘的状态由“ATTACHED”变为“UNATTACHED”，则为卸载成功。
     * @param req DetachDisksRequest
     * @return DetachDisksResponse
     * @throws TencentCloudSDKException
     */
    public DetachDisksResponse DetachDisks(DetachDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取快照概览信息
     * @param req GetSnapOverviewRequest
     * @return GetSnapOverviewResponse
     * @throws TencentCloudSDKException
     */
    public GetSnapOverviewResponse GetSnapOverview(GetSnapOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetSnapOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetSnapOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetSnapOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新初始化云硬盘至云硬盘初始创建时的状态。使用云硬盘的重新初始化功能时需要注意以下4点：
1. 如果云硬盘是由快照创建的，则重新初始化会通过此快照重新回滚此云硬盘，即将云硬盘恢复为与快照一致的状态；
2. 如果云硬盘不是通过快照创建的，则重新初始化会清空此云硬盘的数据；请在重新初始化云硬盘前检查并备份必要的数据；
3. 当前仅未挂载的、非共享属性的数据盘云硬盘支持重新初始化；
4. 当创建此云硬盘的原始快照被删除时，不再支持重新初始化此云硬盘。
     * @param req InitializeDisksRequest
     * @return InitializeDisksResponse
     * @throws TencentCloudSDKException
     */
    public InitializeDisksResponse InitializeDisks(InitializeDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InitializeDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InitializeDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InitializeDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquirePricePriceModifyDiskBackupQuota）用于修改云硬盘备份点配额询价。
     * @param req InquirePriceModifyDiskBackupQuotaRequest
     * @return InquirePriceModifyDiskBackupQuotaResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyDiskBackupQuotaResponse InquirePriceModifyDiskBackupQuota(InquirePriceModifyDiskBackupQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceModifyDiskBackupQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceModifyDiskBackupQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceModifyDiskBackupQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquirePriceModifyDiskExtraPerformance）用于调整云硬盘额外性能询价。
     * @param req InquirePriceModifyDiskExtraPerformanceRequest
     * @return InquirePriceModifyDiskExtraPerformanceResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyDiskExtraPerformanceResponse InquirePriceModifyDiskExtraPerformance(InquirePriceModifyDiskExtraPerformanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceModifyDiskExtraPerformanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquirePriceModifyDiskExtraPerformanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquirePriceModifyDiskExtraPerformance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceCreateDisks）用于创建云硬盘询价。

* 支持查询创建多块云硬盘的价格，此时返回结果为总价格。
     * @param req InquiryPriceCreateDisksRequest
     * @return InquiryPriceCreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateDisksResponse InquiryPriceCreateDisks(InquiryPriceCreateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceRenewDisks）用于续费云硬盘询价。

* 只支持查询预付费模式的弹性云盘续费价格。
* 支持与挂载实例一起续费的场景，需要在[DiskChargePrepaid](/document/product/362/15669#DiskChargePrepaid)参数中指定CurInstanceDeadline，此时会按对齐到实例续费后的到期时间来续费询价。
* 支持为多块云盘指定不同的续费时长，此时返回的价格为多块云盘续费的总价格。
     * @param req InquiryPriceRenewDisksRequest
     * @return InquiryPriceRenewDisksResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewDisksResponse InquiryPriceRenewDisks(InquiryPriceRenewDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceRenewDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceResizeDisk）用于扩容云硬盘询价。
     * @param req InquiryPriceResizeDiskRequest
     * @return InquiryPriceResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResizeDiskResponse InquiryPriceResizeDisk(InquiryPriceResizeDiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResizeDiskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResizeDiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceResizeDisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAutoSnapshotPolicyAttribute）用于修改定期快照策略属性。

* 可通过该接口修改定期快照策略的执行策略、名称、是否激活等属性。
* 修改保留天数时必须保证不与是否永久保留属性冲突，否则整个操作失败，以特定的错误码返回。
     * @param req ModifyAutoSnapshotPolicyAttributeRequest
     * @return ModifyAutoSnapshotPolicyAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoSnapshotPolicyAttributeResponse ModifyAutoSnapshotPolicyAttribute(ModifyAutoSnapshotPolicyAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoSnapshotPolicyAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoSnapshotPolicyAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAutoSnapshotPolicyAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ** 只支持修改弹性云盘的项目ID。随云主机创建的云硬盘项目ID与云主机联动。可以通过[DescribeDisks](/document/product/362/16315)接口查询，见输出参数中Portable字段解释。
* “云硬盘名称”仅为方便用户自己管理之用，腾讯云并不以此名称作为提交工单或是进行云盘管理操作的依据。
* 支持批量操作，如果传入多个云盘ID，则所有云盘修改为同一属性。如果存在不允许操作的云盘，则操作不执行，以特定错误码返回。
     * @param req ModifyDiskAttributesRequest
     * @return ModifyDiskAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskAttributesResponse ModifyDiskAttributes(ModifyDiskAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiskAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiskAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiskAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口 (ModifyDiskBackupQuota) 用于修改云硬盘备份点配额。
     * @param req ModifyDiskBackupQuotaRequest
     * @return ModifyDiskBackupQuotaResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskBackupQuotaResponse ModifyDiskBackupQuota(ModifyDiskBackupQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiskBackupQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiskBackupQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiskBackupQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDiskExtraPerformance）用于调整云硬盘额外的性能。

* 目前仅支持极速型SSD云硬盘（CLOUD_TSSD）和高性能SSD云硬盘(CLOUD_HSSD)。
     * @param req ModifyDiskExtraPerformanceRequest
     * @return ModifyDiskExtraPerformanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDiskExtraPerformanceResponse ModifyDiskExtraPerformance(ModifyDiskExtraPerformanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDiskExtraPerformanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDiskExtraPerformanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDiskExtraPerformance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口请求域名： cbs.tencentcloudapi.com 。

本接口 (ModifyDisksChargeType) 用于切换云盘的计费模式。

非弹性云盘不支持此接口，请通过修改实例计费模式接口将实例连同非弹性云盘一起转换。
默认接口请求频率限制：10次/秒。

     * @param req ModifyDisksChargeTypeRequest
     * @return ModifyDisksChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksChargeTypeResponse ModifyDisksChargeType(ModifyDisksChargeTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDisksChargeTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDisksChargeTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDisksChargeType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDisksRenewFlag）用于修改云硬盘续费标识，支持批量修改。
     * @param req ModifyDisksRenewFlagRequest
     * @return ModifyDisksRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDisksRenewFlagResponse ModifyDisksRenewFlag(ModifyDisksRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDisksRenewFlagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDisksRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDisksRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySnapshotAttribute）用于修改指定快照的属性。

* 当前仅支持修改快照名称及将非永久快照修改为永久快照。
* “快照名称”仅为方便用户自己管理之用，腾讯云并不以此名称作为提交工单或是进行快照管理操作的依据。
     * @param req ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotAttributeResponse ModifySnapshotAttribute(ModifySnapshotAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshotAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySnapshotsSharePermission）用于修改快照分享信息。

分享快照后，被分享账户可以通过该快照创建云硬盘。
* 每个快照最多可分享给50个账户。
* 分享快照无法更改名称，描述，仅可用于创建云硬盘。
* 只支持分享到对方账户相同地域。
* 仅支持分享数据盘快照。
     * @param req ModifySnapshotsSharePermissionRequest
     * @return ModifySnapshotsSharePermissionResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotsSharePermissionResponse ModifySnapshotsSharePermission(ModifySnapshotsSharePermissionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotsSharePermissionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotsSharePermissionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySnapshotsSharePermission");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RenewDisk）用于续费云硬盘。

* 只支持预付费的云硬盘。云硬盘类型可以通过[DescribeDisks](/document/product/362/16315)接口查询，见输出参数中DiskChargeType字段解释。
* 支持与挂载实例一起续费的场景，需要在[DiskChargePrepaid](/document/product/362/15669#DiskChargePrepaid)参数中指定CurInstanceDeadline，此时会按对齐到子机续费后的到期时间来续费。
     * @param req RenewDiskRequest
     * @return RenewDiskResponse
     * @throws TencentCloudSDKException
     */
    public RenewDiskResponse RenewDisk(RenewDiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewDiskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewDiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewDisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResizeDisk）用于扩容云硬盘。

* 只支持扩容弹性云盘。云硬盘类型可以通过[DescribeDisks](/document/product/362/16315)接口查询，见输出参数中Portable字段解释。非弹性云硬盘需通过[ResizeInstanceDisks](/document/product/213/15731)接口扩容。
* 本接口为异步接口，接口成功返回时，云盘并未立即扩容到指定大小，可通过接口[DescribeDisks](/document/product/362/16315)来查询对应云盘的状态，如果云盘的状态为“EXPANDING”，表示正在扩容中。 
     * @param req ResizeDiskRequest
     * @return ResizeDiskResponse
     * @throws TencentCloudSDKException
     */
    public ResizeDiskResponse ResizeDisk(ResizeDiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResizeDiskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResizeDiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResizeDisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（TerminateDisks）用于退还云硬盘。

* 不再使用的云盘，可通过本接口主动退还。
* 本接口支持退还预付费云盘和按小时后付费云盘。按小时后付费云盘可直接退还，预付费云盘需符合退还规则。
* 支持批量操作，每次请求批量云硬盘的上限为100。如果批量云盘存在不允许操作的，请求会以特定错误码返回。
     * @param req TerminateDisksRequest
     * @return TerminateDisksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDisksResponse TerminateDisks(TerminateDisksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TerminateDisksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TerminateDisksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TerminateDisks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnbindAutoSnapshotPolicy）用于解除云硬盘绑定的定期快照策略。

* 支持批量操作，可一次解除多个云盘与同一定期快照策略的绑定。 
* 如果传入的云盘未绑定到当前定期快照策略，接口将自动跳过，仅解绑与当前定期快照策略绑定的云盘。
     * @param req UnbindAutoSnapshotPolicyRequest
     * @return UnbindAutoSnapshotPolicyResponse
     * @throws TencentCloudSDKException
     */
    public UnbindAutoSnapshotPolicyResponse UnbindAutoSnapshotPolicy(UnbindAutoSnapshotPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindAutoSnapshotPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindAutoSnapshotPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindAutoSnapshotPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
