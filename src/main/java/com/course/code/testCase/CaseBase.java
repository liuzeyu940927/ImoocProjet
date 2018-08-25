package com.course.code.testCase;

import com.course.code.base.DriverBase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CaseBase {
    /**
     * 初始化DriverBase
     * @param browser
     * @return
     */
    public DriverBase initDriver(String browser){
        return new DriverBase(browser);
    }

    /**
     * 获取并格式化当前时间
     * @return
     */
    public String getCurrentTime(){
        SimpleDateFormat fmt = new SimpleDateFormat("[yyyy_MM_dd HH:mm:ss]:");
        Calendar cal = Calendar.getInstance();
        Date time = cal.getTime();
        return fmt.format(time);
    }
}
