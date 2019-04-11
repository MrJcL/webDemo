package com.jc.service.sec.org;

import com.jc.common.ResultEntity;
import com.jc.iservice.sec.org.ISecOrgService;
import com.jc.mapper.sec.org.SecOrgMapper;
import com.jc.model.sec.org.SecOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: webDemo
 * @Date: 2019/4/12 0:01
 * @Author: JcLi
 * @Description:
 */
@Service
public class SecOrgService implements ISecOrgService {

    @Autowired
    private SecOrgMapper secOrgMapper;

    @Override
    public ResultEntity createSecOrg(SecOrg secOrg) {
        secOrgMapper.insert(secOrg);
        return null;
    }

    @Override
    public ResultEntity updateSecOrg(SecOrg secOrg) {
        return null;
    }

    @Override
    public ResultEntity<SecOrg> getSecOrg(String orgId) {
        return null;
    }

    @Override
    public ResultEntity<List<SecOrg>> querySecOrgAll() {
        return null;
    }
}
