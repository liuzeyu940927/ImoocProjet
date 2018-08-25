package com.course.code.handle;

import com.course.code.base.DriverBase;
import com.course.code.page.PayCenterPage;

public class PayCenterPageHandle {
    public DriverBase driver;
    public PayCenterPage pcp;

    public PayCenterPageHandle(DriverBase driver) {
        this.driver = driver;
        this.pcp = new PayCenterPage(driver);
    }

    /**
     * 判断页面是否正确显示
     * @return
     */
    public Boolean assertOrder(){
        if(pcp.getOrderTextElement() != null){
            return true;
        }
        return false;
    }

    /**
     * 获取课程信息
     * @return
     */
    public String getCourseDesc(){
        return pcp.getText(pcp.getCourseDesc());
    }

    /**
     * 支付方式选择‘支付宝’
     */
    public void chooseAlipay(){
        pcp.click(pcp.getAlipayElement());
    }

    /**
     * 点击‘立即支付’按钮
     */
    public void clickPayButton(){
        pcp.click(pcp.getPayButtonElement());
    }
}
