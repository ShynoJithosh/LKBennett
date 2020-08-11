package com.StepDefinitions;

import com.Constants.HomePageConstants;
import com.Runners.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {

    @Before
    public static void initializedriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitho\\IdeaProjects\\LKBennett\\src\\test\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(HomePageConstants.baseURL);
        driver.manage().window().maximize();
    }
//    @After
//    public void destroy() {
//        driver.close();
//    }
}
