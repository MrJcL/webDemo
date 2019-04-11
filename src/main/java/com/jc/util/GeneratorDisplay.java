package com.jc.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: webDemo
 * @Date: 2019/4/11 1:13
 * @Author: JcLi
 * @Description:
 *              mybatis逆向代码生成
 */
public class GeneratorDisplay {

    public void generator() throws Exception{
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        File file = new File(this.getClass().getClassLoader().getResource("generator/generatorConfig.xml").getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = cp.parseConfiguration(file);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) throws Exception{
        try{
            GeneratorDisplay generatorDisplay = new GeneratorDisplay();
            generatorDisplay.generator();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
