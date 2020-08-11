package com.Runners;

import com.Constants.HomePageConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRun {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitho\\IdeaProjects\\LKBennett\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(HomePageConstants.baseURL);
        driver.manage().window().maximize();
    }
}
