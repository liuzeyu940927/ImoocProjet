package com.course.code.business;

import com.course.code.base.DriverBase;
import com.course.code.handle.ConfirmOrderPageHandle;

public class ConfirmOrderPagePro {
    public DriverBase driver;
    public ConfirmOrderPageHandle coph;

    public ConfirmOrderPagePro(DriverBase driver) {
        this.driver = driver;
        this.coph = new ConfirmOrderPageHandle(driver);
    }

    /**
     * 提交订单
     * @return
     */
    public String submitOrder(){
        String courseDesc = coph.getCourseDesc();
        coph.clickSubmitOrderButton();
        return courseDesc;
    }
}
