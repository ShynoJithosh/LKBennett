package com.Drivers;

import com.Runners.BaseClass;
import org.openqa.selenium.By;

public class Get extends BaseClass {

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String getElementText(By elementName){
        return driver.findElement(elementName).getText();

    }


}
