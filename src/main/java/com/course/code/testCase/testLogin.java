package com.course.code.testCase;

import com.course.code.base.DriverBase;
import com.course.code.business.HomePagePro;
import com.course.code.util.GetUrl;
import com.course.code.util.GetUserInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testLogin extends CaseBase {
    public DriverBase driver;
    public HomePagePro homePagePro;

    @BeforeClass
    public void init(){
        this.driver = initDriver("chrome");
        this.homePagePro = new HomePagePro(driver);
        driver.get(GetUrl.getUrl("imoocHomePage"));
    }

    @Test
    public void login(){
        String username = GetUserInfo.getUserInfo("username");
        String password = GetUserInfo.getUserInfo("password");
        homePagePro.login(username, password);
    }

    @AfterClass(enabled = false)
    public void terminate(){
        driver.sleep(3000);
        driver.stop();
    }

}
