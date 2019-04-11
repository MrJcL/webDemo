package com.jc.model.sec.org;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sec_org")
public class SecOrg {
    /**
     * 组织Id
     */
    @Id
    @Column(name = "org_id")
    private String orgId;

    /**
     * 组织名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 组织code
     */
    @Column(name = "org_code")
    private String orgCode;

    /**
     * 父组织id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 排序号
     */
    @Column(name = "order_no")
    private Integer orderNo;

    /**
     * 状态
     */
    @Column(name = "record_status")
    private String recordStatus;

    /**
     * 创建人id
     */
    @Column(name = "create_user_id")
    private String createUserId;

    /**
     * 创建人名称
     */
    @Column(name = "create_user_name")
    private String createUserName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人id
     */
    @Column(name = "update_user_id")
    private String updateUserId;

    /**
     * 更新人名称
     */
    @Column(name = "update_user_name")
    private String updateUserName;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取组织Id
     *
     * @return org_id - 组织Id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织Id
     *
     * @param orgId 组织Id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取组织名称
     *
     * @return org_name - 组织名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置组织名称
     *
     * @param orgName 组织名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取组织code
     *
     * @return org_code - 组织code
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置组织code
     *
     * @param orgCode 组织code
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取父组织id
     *
     * @return parent_id - 父组织id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父组织id
     *
     * @param parentId 父组织id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取排序号
     *
     * @return order_no - 排序号
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 设置排序号
     *
     * @param orderNo 排序号
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取状态
     *
     * @return record_status - 状态
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置状态
     *
     * @param recordStatus 状态
     */
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * 获取创建人id
     *
     * @return create_user_id - 创建人id
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人id
     *
     * @param createUserId 创建人id
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建人名称
     *
     * @return create_user_name - 创建人名称
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 设置创建人名称
     *
     * @param createUserName 创建人名称
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新人id
     *
     * @return update_user_id - 更新人id
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置更新人id
     *
     * @param updateUserId 更新人id
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取更新人名称
     *
     * @return update_user_name - 更新人名称
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 设置更新人名称
     *
     * @param updateUserName 更新人名称
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}