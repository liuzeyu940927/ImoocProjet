package com.course.code.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropUtil {
    private String filePath;
    private Properties prop;

    public PropUtil(String filePath) {
        this.filePath = filePath;
        this.prop = readProp();
    }

    /**
     * 获取配置文件中的属性
     * @param key 属性的key
     * @return 属性的value
     */
    public String getProp(String key){
        if(prop.containsKey(key)){
            return prop.getProperty(key);
        }else{
            return "";
        }
    }

    /**
     * 读取配置文件
     * @return
     */
    public Properties readProp(){
        Properties properties = new Properties();
        try {
            InputStream is = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(is);
            properties.load(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
