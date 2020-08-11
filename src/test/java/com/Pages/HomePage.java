package com.Pages;

import com.Constants.AddBasketConstants;
import com.Constants.HomePageConstants;
import com.Constants.SearchPageConstants;
import com.Runners.BaseClass;
import org.junit.Assert;

public class HomePage extends BaseClass {

    public void verifyHomePage(){
        Assert.assertEquals("https://www.lkbennett.com/",driver.getCurrentUrl());

    }
   public void clickOnMyAccountIcon() throws InterruptedException {
        action.moveToElement(HomePageConstants.SIGNINREGISTERICON);
        Thread.sleep(3000);
        action.clickonElement(HomePageConstants.SIGNINBUTTON);
   }

    public void clickOnCreateAccount() throws InterruptedException {
        action.moveToElement(HomePageConstants.SIGNINREGISTERICON);
        action.clickonElement(HomePageConstants.CREATEANACCOUNTBUTTON);
    }

    public void searchWithValidProduct(String searchWord){
        //Assert.assertEquals("https://www.lkbennett.com/",driver.getCurrentUrl());
        action.updateElement(HomePageConstants.SEARCHTEXTBOX,searchWord);
        action.clickonElement(HomePageConstants.SEARCHBUTTON);

    }

    public void searchWithRightCategoryName(){
        action.clickonElement(HomePageConstants.SEARCHACCESSORIES);
       // Assert.assertEquals("ACCESSORIES",get.getElementText(SearchPageConstants.ASSERTACCESSORIES));
    }


    public void searchWithInvalidProduct(){
        action.updateElement(HomePageConstants.SEARCHTEXTBOX,"drinks");
        action.clickonElement(HomePageConstants.SEARCHBUTTON);
    }

    public void clickOnShoesCategory(){
        action.clickonElement(AddBasketConstants.SHOES);
    }





}
