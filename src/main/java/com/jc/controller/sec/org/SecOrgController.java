package com.jc.controller.sec.org;

import com.jc.common.ResultEntity;
import com.jc.iservice.sec.org.ISecOrgService;
import com.jc.model.sec.org.SecOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResultEntity createSecOrg(@RequestBody SecOrg secOrg){
       return this.secOrgService.createSecOrg(secOrg);
    }

    @PatchMapping
    public ResultEntity updateSecOrg(@RequestBody SecOrg secOrg){
        return this.secOrgService.updateSecOrg(secOrg);
    }

    @GetMapping
    public ResultEntity getSecOrg(String orgId){
        return this.secOrgService.getSecOrg(orgId);
    }

    @GetMapping("querySecOrgAll")
    public ResultEntity querySecOrgAll(){
        return this.secOrgService.querySecOrgAll();
    }

    @DeleteMapping("delete")
    public ResultEntity deleteSecOrg(String orgId){
        return this.secOrgService.deleteSecOrg(orgId);
    }
}
