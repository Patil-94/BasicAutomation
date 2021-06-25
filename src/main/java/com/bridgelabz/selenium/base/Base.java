package com.bridgelabz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//added chromedriver
//get the link of Facebook Application
//maximize the windows
//add after all the test is done using close methods
public class Base {
   public static WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(800);
    }
     @AfterTest
    public void tearDown(){

        driver.close();
    }
}
