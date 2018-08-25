package com.course.code.testCase;

import com.course.code.base.DriverBase;
import com.course.code.business.ConfirmOrderPagePro;
import com.course.code.business.DetailedCoursePagePro;
import com.course.code.business.HomePagePro;
import com.course.code.business.PayCenterPagePro;
import com.course.code.util.GetByLocator;
import com.course.code.util.GetUrl;
import com.course.code.util.GetUserInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testBuy extends CaseBase {
    public DriverBase driver;
    public HomePagePro homePagePro;
    public DetailedCoursePagePro detailedCoursePagePro;
    public ConfirmOrderPagePro confirmOrderPagePro;
    public PayCenterPagePro payCenterPagePro;

    @BeforeClass
    public void init(){
        this.driver = initDriver("chrome");
        this.homePagePro = new HomePagePro(driver);
        this.detailedCoursePagePro = new DetailedCoursePagePro(driver);
        this.confirmOrderPagePro = new ConfirmOrderPagePro(driver);
        this.payCenterPagePro = new PayCenterPagePro(driver);
        //跳转到慕课网首页
        driver.get(GetUrl.getUrl("imoocHomePage"));
    }
    
    @Test
    public void login(){
        String username = GetUserInfo.getUserInfo("username");
        String password = GetUserInfo.getUserInfo("password");
        //登录流程
        homePagePro.login(username, password);
        driver.sleep(2000);
    }
    
    @Test(dependsOnMethods = {"login"})
    public void testBuy(){
        //跳转到课程详情页面
        driver.get(GetUrl.getUrl("detailedCoursePage"));

        //点击立即购买
        String courseDescInDcp = detailedCoursePagePro.clickBuyButton();
        System.out.println(getCurrentTime()+"在课程详情页面，课程信息："+courseDescInDcp);

        //提交订单
        driver.waitForElement(GetByLocator.getLocator("submitOrderButton"));
        String courseDescInCop = confirmOrderPagePro.submitOrder();
        System.out.println(getCurrentTime()+"在提交订单页面，课程信息："+courseDescInCop);

        //点击支付
        driver.waitForElement(GetByLocator.getLocator("orderText"));
        String courseDescInPcp = payCenterPagePro.payOrder();
        System.out.println(getCurrentTime()+"在支付中心页面，课程信息："+courseDescInPcp);
    }

    @AfterClass
    public void terminate(){
        driver.sleep(3000);
        driver.stop();
    }
}
