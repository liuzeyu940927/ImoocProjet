package com.course.code.handle;

import com.course.code.base.DriverBase;
import com.course.code.page.HomePage;

public class HomePageHandle {
    public DriverBase driver;
    public HomePage homePage;

    public HomePageHandle(DriverBase driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
    }

    /**
     * 点击‘登录’链接
     */
    public void clickLoginLink(){
        homePage.click(homePage.getLoginLinkElement());
    }

    /**
     * 输入‘用户名’
     * @param username
     */
    public void sendKeysUsername(String username){
        homePage.sendKeys(homePage.getUsernameElement(), username);
    }

    /**
     * 输入‘密码’
     * @param password
     */
    public void sendKeysPassword(String password){
        homePage.sendKeys(homePage.getPasswordElement(), password);
    }

    /**
     * 点击‘登录’按钮
     */
    public void clickLoginButton(){
        homePage.click(homePage.getLoginButtonElement());
    }
}
