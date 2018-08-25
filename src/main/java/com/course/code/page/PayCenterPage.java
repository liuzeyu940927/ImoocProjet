package com.course.code.page;

import com.course.code.base.DriverBase;
import com.course.code.util.GetByLocator;
import org.openqa.selenium.WebElement;

public class PayCenterPage extends BasePage {
    public PayCenterPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取订单文本
     * @return
     */
    public WebElement getOrderTextElement(){
        return element(element(GetByLocator.getLocator("orderText")),
                GetByLocator.getLocator("orderTextNode"));
    }

    /**
     * 获取课程信息
     * @return
     */
    public WebElement getCourseDesc(){
        return element(element(GetByLocator.getLocator("courseDescInPcp")),
                GetByLocator.getLocator("courseDescInPcpNode"));
    }

    /**
     * 获取支付宝element
     * @return
     */
    public WebElement getAlipayElement(){
        return element(GetByLocator.getLocator("alipay"));
    }

    /**
     * 获取立即支付按钮element
     * @return
     */
    public WebElement getPayButtonElement(){
        return element(GetByLocator.getLocator("payButton"));
    }

}
