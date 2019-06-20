package com.jc.service.sec.org;

import com.jc.common.ResultEntity;
import com.jc.iservice.sec.org.ISecOrgService;
import com.jc.mapper.sec.org.SecOrgMapper;
import com.jc.model.sec.org.SecOrg;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @program: webDemo
 * @Date: 2019/4/12 0:01
 * @Author: JcLi
 * @Description:
 */
@Service
public class SecOrgService implements ISecOrgService {
    private final static Logger logger = LoggerFactory.getLogger(SecOrgService.class);

    private static String MESSAGE_SUCCESS_CREATE = "创建成功";
    private static String MESSAGE_FAIL_CREATE = "创建失败";
    private static String MESSAGE_SUCCESS_QUERY = "查询成功";
    private static String MESSAGE_FAIL_QUERY = "查询失败";
    private static String MESSAGE_SUCCESS_UPDATE = "更新成功";
    private static String MESSAGE_FAIL_UPDATE = "更新失败";
    private static String MESSAGE_SUCCESS_DELETE = "删除成功";
    private static String MESSAGE_FAIL_DELETE = "删除失败";

    @Autowired
    private SecOrgMapper secOrgMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ResultEntity createSecOrg(SecOrg secOrg) {
        ResultEntity resultEntity = new ResultEntity();

        try{
            String orgId = secOrg.getOrgId();
            if(StringUtils.isEmpty(orgId)){
                secOrg.setOrgId(UUID.randomUUID().toString());
            }
            secOrg.setCreateTime(new Date());
            secOrg.setUpdateTime(new Date());
            secOrgMapper.insert(secOrg);
            int i = 1/0;
            resultEntity.setMessage(MESSAGE_SUCCESS_CREATE);
        }catch (Exception e){
            logger.error(MESSAGE_FAIL_CREATE, e);
            resultEntity.setSuccess(false);
            resultEntity.setMessage(MESSAGE_FAIL_CREATE);
            // 异常捕获后不会进行事务回滚，需要手动设置回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultEntity;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ResultEntity updateSecOrg(SecOrg secOrg) {
        ResultEntity resultEntity = new ResultEntity();

        try{
            secOrg.setUpdateTime(new Date());
            secOrgMapper.updateByPrimaryKey(secOrg);
            resultEntity.setMessage(MESSAGE_SUCCESS_UPDATE);
        }catch (Exception e){
            logger.error(MESSAGE_FAIL_CREATE, e);
            resultEntity.setSuccess(false);
            resultEntity.setMessage(MESSAGE_FAIL_UPDATE);
            // 异常捕获后不会进行事务回滚，需要手动设置回滚
        }
        return resultEntity;
    }

    @Override
    public ResultEntity<SecOrg> getSecOrg(String orgId) {
        ResultEntity resultEntity = new ResultEntity();

        try{
            SecOrg secOrg = secOrgMapper.selectByPrimaryKey(orgId);
            resultEntity.setBusinessObject(secOrg);
            resultEntity.setMessage(MESSAGE_SUCCESS_QUERY);
        }catch (Exception e){
            logger.error(MESSAGE_FAIL_CREATE, e);
            resultEntity.setSuccess(false);
            resultEntity.setMessage(MESSAGE_FAIL_QUERY);
        }
        return resultEntity;
    }

    @Override
    public ResultEntity<List<SecOrg>> querySecOrgAll() {
        ResultEntity resultEntity = new ResultEntity();

        try{
            List<SecOrg> secOrgList = secOrgMapper.selectAll();
            resultEntity.setBusinessObject(secOrgList);
            resultEntity.setMessage(MESSAGE_SUCCESS_QUERY);
        }catch (Exception e){
            logger.error(MESSAGE_FAIL_CREATE, e);
            resultEntity.setSuccess(false);
            resultEntity.setMessage(MESSAGE_FAIL_QUERY);
        }
        return resultEntity;
    }

    @Override
    public ResultEntity deleteSecOrg(String orgId) {
        ResultEntity resultEntity = new ResultEntity();
        try{
            secOrgMapper.deleteByPrimaryKey(orgId);
            resultEntity.setMessage(MESSAGE_SUCCESS_DELETE);
        }catch (Exception e){
            logger.error(MESSAGE_FAIL_DELETE, e);
            resultEntity.setSuccess(false);
            resultEntity.setMessage(MESSAGE_FAIL_DELETE);
            // 异常捕获后不会进行事务回滚，需要手动设置回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return resultEntity;
    }
}
