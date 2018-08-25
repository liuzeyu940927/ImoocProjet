package com.course.code.handle;

import com.course.code.base.DriverBase;
import com.course.code.page.DetailedCoursePage;

public class DetailedCoursePageHandle {
    public DriverBase driver;
    public DetailedCoursePage dcp;

    public DetailedCoursePageHandle(DriverBase driver) {
        this.driver = driver;
        this.dcp = new DetailedCoursePage(driver);
    }

    /**
     * 点击‘立即购买’按钮
     */
    public void clickBuyButton(){
        dcp.click(dcp.getBuyButtonElement());
    }

    /**
     * 获取‘课程详情页面’中的课程信息
     * @return
     */
    public String getCourseDesc(){
        return dcp.getText(dcp.getCourseDescElement());
    }
}
