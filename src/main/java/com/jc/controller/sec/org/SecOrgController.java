package com.jc.controller.sec.org;

import com.jc.iservice.sec.org.ISecOrgService;
import com.jc.model.sec.org.SecOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: webDemo
 * @Date: 2019/4/12 1:01
 * @Author: JcLi
 * @Description:
 */
@RestController
@RequestMapping("secOrg")
public class SecOrgController {

    @Autowired
    private ISecOrgService secOrgService;

    @PostMapping("create")
    public void createSecOrg(){
        SecOrg secOrg = new SecOrg();
        secOrg.setOrgId("id");
        secOrg.setOrgCode("code1");
        secOrg.setOrgName("name");
        secOrg.setCreateTime(new Date());
        secOrg.setCreateUserId("testUser");
        secOrg.setUpdateUserName("ts");
        secOrg.setUpdateTime(new Date());
        secOrg.setUpdateUserId("testUser");
        secOrg.setCreateUserName("ts");
        secOrg.setRecordStatus("1");
        this.secOrgService.createSecOrg(secOrg);
    }
}
