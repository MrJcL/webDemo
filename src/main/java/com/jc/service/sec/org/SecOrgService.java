package com.jc.service.sec.org;

import com.jc.common.ResultEntity;
import com.jc.iservice.sec.org.ISecOrgService;
import com.jc.mapper.sec.org.SecOrgMapper;
import com.jc.model.sec.org.SecOrg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Autowired
    private SecOrgMapper secOrgMapper;

    @Override
    public ResultEntity createSecOrg(SecOrg secOrg) {
        ResultEntity resultEntity = new ResultEntity();

        try{
            secOrg.setCreateTime(new Date());
            secOrg.setUpdateTime(new Date());
            secOrgMapper.insert(secOrg);
            resultEntity.setMessage(MESSAGE_SUCCESS_CREATE);
        }catch (Exception e){
            logger.error(MESSAGE_FAIL_CREATE, e);
            resultEntity.setSuccess(false);
            resultEntity.setMessage(MESSAGE_FAIL_CREATE);
        }
        return resultEntity;
    }

    @Override
    public ResultEntity updateSecOrg(SecOrg secOrg) {
        ResultEntity resultEntity = new ResultEntity();

        try{
            secOrgMapper.updateByPrimaryKey(secOrg);
            resultEntity.setMessage(MESSAGE_SUCCESS_UPDATE);
        }catch (Exception e){
            logger.error(MESSAGE_FAIL_CREATE, e);
            resultEntity.setSuccess(false);
            resultEntity.setMessage(MESSAGE_FAIL_UPDATE);
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
}
