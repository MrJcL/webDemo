package com.jc.iservice.sec;

import com.jc.service.sec.org.SecOrgService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: webDemo
 * @Date: 2019/5/21 1:43
 * @Author: JcLi
 * @Description:
 */
@Service
public class HelloService {
    private final static Logger logger = LoggerFactory.getLogger(SecOrgService.class);

//    private Lock lock = new ReentrantLock();
    private Map<String, String> lock = null;
    public void t(String id){
//        lock.lock();
        if(lock==null){
            lock = new HashMap<>();
            lock.put("id",id);
        }else{
            if(lock.get("id")!=null && !StringUtils.isEmpty(lock.get("id"))){
                if(!lock.get("id").equals(id)){
                    lock = new HashMap<>();
                    lock.put("id",id);
                }
            }
        }
        synchronized (lock){
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
//            lock.unlock();
            }
        }
    }
}
