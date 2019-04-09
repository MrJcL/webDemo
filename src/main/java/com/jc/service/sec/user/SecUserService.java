package com.jc.service.sec.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jc.dao.sec.user.SecUserDao;
import com.jc.iservice.sec.user.ISecUserService;
import com.jc.model.sec.user.SecUserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: springBootDemo
 * @Date: 2018/12/7 14:49
 * @Author: LiJc
 * @Description:
 */
@Service
public class SecUserService implements ISecUserService {
    private  final Logger log= LoggerFactory.getLogger(SecUserService.class);
    @Autowired
    private SecUserDao secUserDao;

    @Override
    public boolean crateUser(SecUserModel SecUserModel) {
       int i = this.secUserDao.insert(SecUserModel);
       return i > 0;
    }

    @Override
    public PageInfo<List<SecUserModel>> queryAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<SecUserModel> secUserModels =  this.secUserDao.selectSecUserModels();
        return new PageInfo(secUserModels);
    }

    @Override
    public List<Map<String, Object>> queryAllUser() {
        List<Map<String, Object>> secUserModels =  this.secUserDao.selectUsersToMap();
        log.info("======================="+secUserModels.toString());
        return secUserModels;
    }

    @Override
    public SecUserModel getSecUserModel(String userId) {
        return this.secUserDao.getSecUserModel(userId);
    }


}
