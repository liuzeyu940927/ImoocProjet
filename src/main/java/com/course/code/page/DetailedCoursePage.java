package com.course.code.page;

import com.course.code.base.DriverBase;
import com.course.code.util.GetByLocator;
import org.openqa.selenium.WebElement;

public class DetailedCoursePage extends BasePage {
    public DetailedCoursePage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取课程信息element
     * @return
     */
    public WebElement getCourseDescElement(){
        return element(element(GetByLocator.getLocator("courseDesc")),
                GetByLocator.getLocator("courseDescNode"));
    }

    /**
     * 获取‘立即购买按钮’element
     * @return
     */
    public WebElement getBuyButtonElement(){
        return element(GetByLocator.getLocator("buyButton"));
    }

    /**
     * 获取‘添加购物车’element
     * @return
     */
    public WebElement getAddIntoCartElement(){
        return element(GetByLocator.getLocator("addIntoCart"));
    }
}
