package com.course.code.util;

public class GetUserInfo {
    public static String getUserInfo(String key){
        PropUtil propUtil = new PropUtil("conf/user.properties");
        return propUtil.getProp(key);
    }
}
