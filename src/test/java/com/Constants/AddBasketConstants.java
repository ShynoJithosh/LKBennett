package com.Constants;

import org.openqa.selenium.By;

public interface AddBasketConstants {
    By SHOES = By.linkText("Shoes");
    By SELECTIMAGE =By.cssSelector(".plp-grid img");
    By ASSERTSHOES = By.cssSelector(".bannertxt h1");
    By SELECTCOLOUR = By.cssSelector(".colorVariant");
    By SELECTSIZE = By.cssSelector("#Size");
    By ADDTOBAGBUTTON =By.cssSelector("#addToCartButton");
    By ASSERTMINISHOPPINGBAG = By.cssSelector("#minicart_container h3");
    By MINIBAGMOUSEOVER = By.cssSelector("#popoverData");
}
