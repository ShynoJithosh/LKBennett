package com.Constants;

import org.openqa.selenium.By;

public interface LoginPageConstants {
    By SIGNINEMAIL = By.cssSelector("#j_username");
    By SIGNINPASSWORD = By.cssSelector("#j_password");
    By LOGINBUTTON = By.cssSelector("#loginForm .btn-block.btn--large");
    By ASSERTSIGNIN = By.cssSelector(".pagecontainer .col-md-5 .signin .headline");
    By FORGOTPASSWORD = By.cssSelector(".js-password-forgotten");
    By RESETPASSWORDBUTTON = By.cssSelector("#forgottenPwdForm .btn-block");
    By ASSERTRESETPASSWORD1 = By.cssSelector("#cboxTitle");


}
