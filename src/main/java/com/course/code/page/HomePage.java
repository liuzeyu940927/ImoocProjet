package com.course.code.page;

import com.course.code.base.DriverBase;
import com.course.code.util.GetByLocator;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取‘登录’链接
     * @return
     */
    public WebElement getLoginLinkElement(){
        return element(GetByLocator.getLocator("loginLink"));
    }

    /**
     * 获取‘用户名’element
     * @return
     */
    public WebElement getUsernameElement(){
        return element(GetByLocator.getLocator("username"));
    }

    /**
     * 获取‘密码’element
     * @return
     */
    public WebElement getPasswordElement(){
        return element(GetByLocator.getLocator("password"));
    }

    /**
     * 获取‘登录按钮’element
     * @return
     */
    public WebElement getLoginButtonElement(){
        return element(GetByLocator.getLocator("loginButton"));
    }

}
