package com.Pages;

import com.Constants.HomePageConstants;
import com.Constants.LoginPageConstants;
import com.Constants.RegisterPageConstants;
import com.Runners.BaseClass;
import cucumber.api.DataTable;
import org.junit.Assert;

import java.util.Map;

public class LoginRegisterPage extends BaseClass {

    public void entersValidCredentialsForLogin(DataTable userData){
        Map<String, String> signinDetails = userData.asMap(String.class, String.class);
        String EmailID = signinDetails.get("email ID");
        String Password = signinDetails.get("password");
        Assert.assertEquals("SIGN IN", get.getElementText(LoginPageConstants.ASSERTSIGNIN));
        action.updateElement(LoginPageConstants.SIGNINEMAIL,EmailID);
        action.updateElement(LoginPageConstants.SIGNINPASSWORD,Password);

    }

    public void clickOnLoginButton(){

        action.clickonElement(LoginPageConstants.LOGINBUTTON);
    }
    public void getTheCustomerAccountPage(){
        Assert.assertEquals("https://www.lkbennett.com/",get.getCurrentUrl());
    }

    public void enterValidEmail(){
        Assert.assertEquals("SIGN IN", get.getElementText(LoginPageConstants.ASSERTSIGNIN));
       action.updateElement(LoginPageConstants.SIGNINEMAIL,"shyjithosh@gmail.com");
    }

    public void clickOnForgotPassword(){
     action.clickonElement(LoginPageConstants.FORGOTPASSWORD);
    }

    public void directToResetPasswordPage(){
    //Assert.assertEquals("RESET PASSWORD",get.getElementText(LoginPageConstants.ASSERTRESETPASSWORD));
    }

    public void clickOnResetPasswordButton() throws InterruptedException {
        Thread.sleep(3000);
        action.clickonElement(LoginPageConstants.RESETPASSWORDBUTTON);
    }

    public void resetConfirmation(){
  Assert.assertEquals("RESET PASSWORD",get.getElementText(LoginPageConstants.ASSERTRESETPASSWORD1));
    }

   public void enterAllValidCredentials(DataTable userData) throws InterruptedException {
        Assert.assertEquals("SIGN IN", get.getElementText(LoginPageConstants.ASSERTSIGNIN));
        action.dropDownByIndex(RegisterPageConstants.RTITLE,2);
       Map<String, String>registerDetails = userData.asMap(String.class, String.class);
       String FirstName = registerDetails.get("first name");
       String LastName = registerDetails.get("last name");
       String Telephone = registerDetails.get("telephone");
       String EmailId = registerDetails.get("email address");
       String ConfirmEmail = registerDetails.get("confirm email");
       String Password = registerDetails.get("password");
       String ConfirmPassword = registerDetails.get("confirm password");
       action.updateElement(RegisterPageConstants.RFIRSTNAME,FirstName);
       action.updateElement(RegisterPageConstants.RLASTNAME,LastName);
       action.updateElement(RegisterPageConstants.RTELEPHONE,Telephone);
       action.updateElement(RegisterPageConstants.REMAIL,EmailId);
       action.updateElement(RegisterPageConstants.RCONFIRMEMAIL,ConfirmEmail);
       action.updateElement(RegisterPageConstants.RPASSWORD,Password);
       action.updateElement(RegisterPageConstants.RCONFIRMPASSWORD,ConfirmPassword);

    }

    public void clickOnRegisterButton()  {
        action.clickonElement(RegisterPageConstants.REGISTERBUTTON);
    }

    public void shouldSeeRegisterConfirmation(){
        System.out.println("Got Register Confirmation");
    }


}
