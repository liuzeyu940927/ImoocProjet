package com.course.code.handle;

import com.course.code.base.DriverBase;
import com.course.code.page.ConfirmOrderPage;

public class ConfirmOrderPageHandle {
    public DriverBase driver;
    public ConfirmOrderPage cop;

    public ConfirmOrderPageHandle(DriverBase driver) {
        this.driver = driver;
        this.cop = new ConfirmOrderPage(driver);
    }

    /**
     * 点击提交订单按钮
     */
    public void clickSubmitOrderButton(){
        cop.click(cop.getSubmitOrderButtonElement());
    }

    /**
     * 获取提交订单页面中的课程信息
     * @return
     */
    public String getCourseDesc(){
        return cop.getText(cop.getCourseDescElement());
    }
}
