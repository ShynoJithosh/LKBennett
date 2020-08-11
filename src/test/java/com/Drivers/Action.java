package com.Drivers;

import com.Runners.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Action extends BaseClass {
    public void moveToElement(By elementName){
        driver.findElement(elementName).click();
    }
    public void clickonElement(By elementName) {
        driver.findElement(elementName).click();
    }
    public void updateElement(By elementName,String keyword){
        driver.findElement(elementName).clear();
        driver.findElement(elementName).sendKeys(keyword);
    }

    public void clickOnTheElementByIndex(By elementName,int index) {
        driver.findElements(elementName).get(index).click();
    }
    public void dropDownByValue(By elementName, String value) {
        Select DropDown = new Select(driver.findElement(elementName));
        DropDown.selectByValue(value);
    }

    public void dropDownByIndex(By elementName, int index) {
        Select DropDown = new Select(driver.findElement(elementName));
        DropDown.selectByIndex(index);
    }

    public void  scrollDown(By elementName) {
        WebElement element = driver.findElement(elementName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void scrollUp(By elementName) {
        WebElement element = driver.findElement(elementName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void mouseMovePerform(By elementName){
        driver.findElement(elementName).click();
    }
}
