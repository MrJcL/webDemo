package com.jc.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @program: webDemo
 * @Date: 2019/4/11 0:48
 * @Author: JcLi
 * @Description:
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
