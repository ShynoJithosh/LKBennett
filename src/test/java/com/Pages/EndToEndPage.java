package com.Pages;

import com.Constants.AddBasketConstants;
import com.Constants.EndToEndPageConstants;
import com.Runners.BaseClass;
import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

public class EndToEndPage extends BaseClass {

    public void mouseOverAndClickOnViewShoppingBagIcon(){
        wait.elementToBeLocated(EndToEndPageConstants.VIEWSHOPPINGBAGBUTTON,30);
        action.clickonElement(EndToEndPageConstants.VIEWSHOPPINGBAGBUTTON);//took view shopping bag icon
    }

    public void clickOnCheckoutSecureButton(){
        Assert.assertEquals("YOUR SHOPPING BAG (1)",get.getElementText(EndToEndPageConstants.ASSERTSHOPPINGBAG));
        action.clickonElement(EndToEndPageConstants.CHECKOUTSECUREBUTTON);
    }

    public void enterValidEmailGuestCheckout() throws InterruptedException {
        Thread.sleep(3000);
        action.updateElement(EndToEndPageConstants.CHECKOUTEMAILGUEST,"jithoshj@gmail.com");
    }

    public void clickOnCheckoutSecure1Button(){
        action.clickonElement(EndToEndPageConstants.CHECKOUTSECURE1BUTTON);
    }

    public void clickAndCollectFromStoreButton(){
        action.clickonElement(EndToEndPageConstants.CLICKANDCOLLECTSTOREBUTTON);
    }

    public void enterValidPostCode(){
      action.updateElement(EndToEndPageConstants.CLICKCOLLECTPOSTCODE,"MK430PG");
    }

    public void clickOnSearchAndSelectTheAddressDropdown() throws InterruptedException {
     action.clickonElement(EndToEndPageConstants.CLICKCOLLECTSEARCH);
     Thread.sleep(3000);
     action.clickonElement(EndToEndPageConstants.SELECTADDRESSDROPDOWN);
    }

    public void enterValidInformationsInYourDetails(DataTable userData){
        action.dropDownByIndex(EndToEndPageConstants.CLICKCOLLECTSELECTTITLE,2);
        Map<String, String> clickCollectDetails = userData.asMap(String.class, String.class);

        String FirstName = clickCollectDetails.get("FirstName");
        String LastName = clickCollectDetails.get("LastName");
        String MobileNumber = clickCollectDetails.get("MobileNumber");
        action.updateElement(EndToEndPageConstants.CLICKCOLLECTFIRSTNAME,FirstName);
        action.updateElement(EndToEndPageConstants.CLICKCOLLECTLASTNAME,LastName);
        action.updateElement(EndToEndPageConstants.CLICKCOLLECTMOBILENO,MobileNumber);
    }

    public void clickOnNextButton() throws InterruptedException {
        action.clickonElement(EndToEndPageConstants.NEXTBUTTON);
    }

    public void selectCountryDropdown() throws InterruptedException {
        Thread.sleep(3000);
     action.dropDownByValue(EndToEndPageConstants.COUNTRYDROPDOWN,"GB");
    }

    public void clickOnEnterAddressManually(DataTable userData) throws InterruptedException {
        Thread.sleep(3000);
        action.clickonElement(EndToEndPageConstants.BILLADDRESSMANUALLY);
        action.dropDownByIndex(EndToEndPageConstants.BILLADDRESSTITLE,2);
        Map<String, String> billDetails = userData.asMap(String.class, String.class);
        String FirstName = billDetails.get("FirstName");
        String LastName = billDetails.get("LastName");
        String BuildingName = billDetails.get("BuildingName");
        String AddressLine1 = billDetails.get("AddressLine1");
        String AddressLine2 = billDetails.get("AddressLine2");
        String City = billDetails.get("City");
        String PostCode = billDetails.get("PostCode");
        action.updateElement(EndToEndPageConstants.BILLFIRSTNAME,FirstName);
        action.updateElement(EndToEndPageConstants.BILLLASTNAME,LastName);
        action.updateElement(EndToEndPageConstants.BUILDINGNAME,BuildingName);
        action.updateElement(EndToEndPageConstants.ADDRESSNAME1,AddressLine1);
        action.updateElement(EndToEndPageConstants.ADDRESSNAME2,AddressLine2);
        action.updateElement(EndToEndPageConstants.CITY,City);
        action.updateElement(EndToEndPageConstants.POSTCODE,PostCode);
    }

    public void clickOnUseThisAddress() throws InterruptedException {
       // wait.elementToBeLocated(EndToEndPageConstants.USETHISADDRESSBUTTON,30);
       // wait.elementToBeClickable(EndToEndPageConstants.USETHISADDRESSBUTTON,30);
        action.clickonElement(EndToEndPageConstants.USETHISADDRESSBUTTON);
    }

    public void acceptTermsAndConditionCheckBox() throws InterruptedException {
        wait.elementToBeClickable(EndToEndPageConstants.ACCEPTTERMSANDPOLICIES,30);
        action.clickonElement(EndToEndPageConstants.ACCEPTTERMSANDPOLICIES);
    }

    public void clickOnPaymentCardOptionAndCardDetails(DataTable cardData) throws InterruptedException {
        System.out.println("Cant automate further from payment due to HTML Format");
    }

}
