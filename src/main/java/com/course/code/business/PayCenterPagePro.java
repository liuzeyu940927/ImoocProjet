package com.course.code.business;

import com.course.code.base.DriverBase;
import com.course.code.handle.PayCenterPageHandle;

public class PayCenterPagePro {
    public DriverBase driver;
    public PayCenterPageHandle pph;

    public PayCenterPagePro(DriverBase driver) {
        this.driver = driver;
        this.pph = new PayCenterPageHandle(driver);
    }

    /**
     * 支付
     * @return
     */
    public String payOrder(){
        if(pph.assertOrder()){
            String courseDescInPcp = pph.getCourseDesc();
            pph.chooseAlipay();
            pph.clickPayButton();
            return courseDescInPcp;
        }
        return "";
    }
}
