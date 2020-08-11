package com.Runners;

import com.Drivers.Action;
import com.Drivers.Get;
import com.Drivers.Wait;
import com.Pages.*;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;
    public static HomePage homepage = new HomePage();
    public static LoginRegisterPage loginregisterpage = new LoginRegisterPage();
    public static Action action = new Action();
    public static Get get = new Get();
    public static Wait wait = new Wait();
    public static SearchResultsPage searchresultspage = new SearchResultsPage();
    public static AddBasketPage addBasketpage = new AddBasketPage();
    public static EndToEndPage endtoendpage = new EndToEndPage();

}
