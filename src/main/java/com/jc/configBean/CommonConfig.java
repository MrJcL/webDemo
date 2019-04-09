package com.jc.configBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: springBootDemo
 * @Date: 2018/12/12 17:37
 * @Author: LiJc
 * @Description:
 */
@Configuration
@PropertySource(value = "classpath:config/common-${spring.profiles.active}.yml")
@ConfigurationProperties(prefix="common")
public class CommonConfig {
    @Value("${uploadPath}")
    private String uploadPath;
    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }
}
