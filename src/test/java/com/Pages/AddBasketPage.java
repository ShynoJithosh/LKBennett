package com.Pages;

import com.Constants.AddBasketConstants;
import com.Runners.BaseClass;
import org.junit.Assert;

public class AddBasketPage extends BaseClass {

    public void selectTheProduct(){
        Assert.assertEquals("SHOES",get.getElementText(AddBasketConstants.ASSERTSHOES));
        action.clickOnTheElementByIndex(AddBasketConstants.SELECTIMAGE,0);
    }

    public void selectColourAndSize() throws InterruptedException {
        Thread.sleep(3000);
        action.clickOnTheElementByIndex(AddBasketConstants.SELECTCOLOUR,0);
        wait.elementToBeClickable(AddBasketConstants.SELECTSIZE,30);
        action.dropDownByIndex(AddBasketConstants.SELECTSIZE,3);
    }
    public void clickOnAddToShoppingBag(){
        action.clickonElement(AddBasketConstants.ADDTOBAGBUTTON);
     }
    public void shouldSeeMiniShoppingBagPage() throws InterruptedException {
        action.moveToElement(AddBasketConstants.MINIBAGMOUSEOVER);
        Assert.assertEquals("SHOPPING BAG",get.getElementText(AddBasketConstants.ASSERTMINISHOPPINGBAG));
    }
}
