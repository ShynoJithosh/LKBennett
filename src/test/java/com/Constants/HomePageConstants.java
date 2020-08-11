package com.Constants;

import org.openqa.selenium.By;

public interface HomePageConstants {

    String baseURL = ("https://www.lkbennett.com/");
    By SIGNINREGISTERICON = By.cssSelector("#jsSignInPopup");
    By SIGNINBUTTON = By.cssSelector(".info-container .jsSignInbtn.ts-2x");
    By CREATEANACCOUNTBUTTON = By.linkText("CREATE AN ACCOUNT");
    By SEARCHTEXTBOX = By.cssSelector("input[type='text'");
    By SEARCHBUTTON = By.cssSelector(".icon-Search");
    By SEARCHACCESSORIES =By.linkText("Accessories");

}
