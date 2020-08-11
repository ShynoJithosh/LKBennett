package com.Constants;

import org.openqa.selenium.By;

public interface RegisterPageConstants {

    By RTITLE = By.cssSelector("#registerForm1 .form-control");
    By RFIRSTNAME = By.cssSelector("input[name='firstName']");
    By RLASTNAME = By.cssSelector("input[name='lastName']");
    By RTELEPHONE = By.cssSelector("input[name='telephoneNumber']");
    By REMAIL = By.cssSelector("input[name='email']");
    By RCONFIRMEMAIL = By.cssSelector("input[name='confirmCustomerEmail']");
    By RPASSWORD = By.cssSelector("input[name='pwd']");
    By RCONFIRMPASSWORD = By.cssSelector("input[name='checkPwd']");
    By REGISTERBUTTON = By.cssSelector("#registerForm1 .js-submitBtn");
}
