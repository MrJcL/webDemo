package com.jc.iservice.sec.org;

import com.jc.common.ResultEntity;
import com.jc.model.sec.org.SecOrg;

import java.util.List;

/**
 * @program: webDemo
 * @Date: 2019/4/12 0:00
 * @Author: JcLi
 * @Description:
 */
public interface ISecOrgService {

    /**
     * 创建
     * @param secOrg
     * @return
     */
    public ResultEntity createSecOrg(SecOrg secOrg);

    /**
     * 编辑
     * @param secOrg
     * @return
     */
    public ResultEntity updateSecOrg(SecOrg secOrg);

    /**
     * 获取
     * @param orgId
     * @return
     */
    public ResultEntity<SecOrg> getSecOrg(String orgId);

    /**
     * 获取所有
     * @return
     */
    public ResultEntity<List<SecOrg>> querySecOrgAll();

    /**
     * 删除
     * @param orgId
     * @return
     */
    public ResultEntity deleteSecOrg(String orgId);
}
