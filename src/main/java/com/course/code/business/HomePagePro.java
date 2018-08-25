package com.course.code.business;

import com.course.code.base.DriverBase;
import com.course.code.handle.HomePageHandle;
import com.course.code.util.GetByLocator;

public class HomePagePro {
    public DriverBase driver;
    public HomePageHandle homePageHandle;

    public HomePagePro(DriverBase driver) {
        this.driver = driver;
        this.homePageHandle = new HomePageHandle(driver);
    }

    /**
     * 登录流程
     * @param username 用户名
     * @param password 密码
     */
    public void login(String username, String password){
        //点击‘登录’链接
        homePageHandle.clickLoginLink();
        //等待元素加载
        driver.waitForElement(GetByLocator.getLocator("username"));
        //输入用户名
        homePageHandle.sendKeysUsername(username);
        //输入密码
        homePageHandle.sendKeysPassword(password);
        //点击登录按钮
        homePageHandle.clickLoginButton();
    }
}
