package com.Constants;

import org.openqa.selenium.By;

public interface EndToEndPageConstants {
    By VIEWSHOPPINGBAGBUTTON = By.cssSelector(".btn.btn--transparent");
    By CHECKOUTSECUREBUTTON =By.cssSelector(".checkout-btn .btn.btn--primary");
    By CHECKOUTEMAILGUEST = By.cssSelector("input[name='email']");
    By ASSERTSHOPPINGBAG = By.cssSelector(".cart-heading");
    By CHECKOUTSECURE1BUTTON = By.cssSelector(".form-group .btn.btn--primary");
    By CLICKANDCOLLECTSTOREBUTTON = By.cssSelector("a[href='#storePickup']");
    By CLICKCOLLECTPOSTCODE = By.cssSelector("input[name='postcode']");
    By CLICKCOLLECTSEARCH = By.cssSelector("#find_stores1");
    By SELECTADDRESSDROPDOWN = By.cssSelector("button[name='button']");
    By CLICKCOLLECTSELECTTITLE =By.cssSelector("select[name='titleCode']");
    By CLICKCOLLECTFIRSTNAME = By.cssSelector("input[name='firstName']");
    By CLICKCOLLECTLASTNAME = By.cssSelector("input[name='lastName']");
    By CLICKCOLLECTMOBILENO = By.cssSelector("input[name='phone']");
    By NEXTBUTTON = By.cssSelector("#collectFromStoreForm .col-sm-4 .btn.btn--primary");
    By COUNTRYDROPDOWN = By.cssSelector("select[name='billTo_country']");
    By BILLADDRESSMANUALLY =By.cssSelector("#enterAddressManually .enter-address-btn");
    By BILLADDRESSTITLE = By.cssSelector("select[name='billTo_titleCode']");
    By BILLFIRSTNAME = By.cssSelector("input[name='billTo_firstName']");
    By BILLLASTNAME = By.cssSelector("input[name='billTo_lastName']");
    By BUILDINGNAME = By.cssSelector("input[name='billTo_houseNumber']");
    By ADDRESSNAME1 = By.cssSelector("input[name='billTo_street1']");
    By ADDRESSNAME2 = By.cssSelector("input[name='billTo_street2']");
    By CITY = By.cssSelector("input[name='billTo_city']");
    By POSTCODE =By.cssSelector("input[name='billTo_postalCode']");
    By USETHISADDRESSBUTTON = By.cssSelector("#paymentselectAddress");
    By ACCEPTTERMSANDPOLICIES = By.cssSelector("label[for='termscheckbox']");


}
