package com.course.code.business;

import com.course.code.base.DriverBase;
import com.course.code.handle.DetailedCoursePageHandle;

public class DetailedCoursePagePro {
    public DriverBase driver;
    public DetailedCoursePageHandle dcph;

    public DetailedCoursePagePro(DriverBase driver) {
        this.driver = driver;
        this.dcph = new DetailedCoursePageHandle(driver);
    }

    /**
     * 点击‘立即购买’按钮
     * @return ‘课程详情页面’中的课程信息
     */
    public String clickBuyButton(){
        String courseDesc = dcph.getCourseDesc();
        dcph.clickBuyButton();
        return courseDesc;
    }
}
