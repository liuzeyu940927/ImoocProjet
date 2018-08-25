package com.course.code.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelecctDriver {
    /**
     * 根据传入的浏览器信息，返回对应的WebDriver对象
     * [Note]: 支持Chrome和Firefox
     * @param browser 浏览器信息
     * @return WebDriver对象
     */
    public WebDriver getDriverByBrowser(String browser){
        if("chrome".equalsIgnoreCase(browser)){
            //Chrome
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Nathan\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            return new ChromeDriver();
        }else{
            //Firefox
            System.setProperty("webdriver.firefox.marionette",
                    "C:\\Firefox\\geckodriver.exe");
            return new FirefoxDriver();
        }
    }
}
