package com.course.code.page;

import com.course.code.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public DriverBase driver;

    public BasePage(DriverBase driver) {
        this.driver = driver;
    }

    /**
     * 定位元素
     * @param by 元素的定位信息
     * @return
     */
    public WebElement element(By by){
        return driver.findElement(by);
    }

    /**
     * 在父元素下定位子元素
     * @param element 父元素
     * @param by 子元素的定位信息
     * @return
     */
    public WebElement element(WebElement element, By by){
        return driver.findElement(element, by);
    }

    /**
     * 点击元素
     * @param element 元素信息
     */
    public void click(WebElement element){
        element.click();
    }

    /**
     * 在指定元素内输入内容
     * @param element 元素信息
     * @param value 输入的内容
     */
    public void sendKeys(WebElement element, String value){
        element.sendKeys(value);
    }

    /**
     * 获取元素内的文本信息
     * @param element 元素信息
     * @return
     */
    public String getText(WebElement element){
        return element.getText();
    }
}
