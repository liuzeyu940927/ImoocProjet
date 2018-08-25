package com.course.code.page;

import com.course.code.base.DriverBase;
import com.course.code.util.GetByLocator;
import org.openqa.selenium.WebElement;

public class ConfirmOrderPage extends BasePage {
    public ConfirmOrderPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取课程信息element
     * @return
     */
    public WebElement getCourseDescElement(){
        return element(GetByLocator.getLocator("courseDescInCop"));
    }

    /**
     * 获取提交订单按钮element
     * @return
     */
    public WebElement getSubmitOrderButtonElement(){
        return element(GetByLocator.getLocator("submitOrderButton"));
    }
}
