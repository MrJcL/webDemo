package com.jc.dao.sec.user;

import com.jc.model.sec.user.SecUserModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: springBootDemo
 * @Date: 2018/12/7 13:54
 * @Author: LiJc
 * @Description:
 */
@Repository
public interface SecUserDao {

    //  新增用户
    int insert(SecUserModel secUserModel);

    //  查询所有用户
    List<SecUserModel> selectSecUserModels();

    //  查询所有用户
    List<Map<String, Object>> selectUsersToMap();

    //  根据用户ID获取用户信息
    SecUserModel getSecUserModel(String userId);
}
