package com.course.code.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverBase {
    public WebDriver driver;

    public DriverBase(String browser) {
        this.driver = new SelecctDriver().getDriverByBrowser(browser);
    }

    /**
     * 获取WebDriver
     * @return
     */
    public WebDriver getDriver(){
        return this.driver;
    }

    /**
     * 使当前线程休眠特定时间
     * @param time 休眠时间
     */
    public void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 等待指定元素加载
     * @param by 指定元素的定位信息
     */
    public void waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     * 跳转到指定URL
     * @param url URL地址
     */
    public void get(String url){
        driver.get(url);
        //使窗口最大化
        driver.manage().window().maximize();
    }

    /**
     * 定位元素，可以是父元素
     * @param by 元素的定位信息
     * @return
     */
    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    /**
     * 在父元素下定位子元素
     * @param element 父元素
     * @param by 子元素的定位信息
     * @return
     */
    public WebElement findElement(WebElement element, By by){
        return element.findElement(by);
    }

    /**
     * 将鼠标移入到指定元素
     * @param element
     */
    public void moveTo(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * 关闭Driver
     */
    public void stop(){
        driver.close();
    }


}
