package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.By;

public class Login extends Base {
    public void login() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("ankitakhairnar10@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ankoo1711997");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button") ).click() ;
        driver.navigate().forward();
        Thread.sleep(5000);
    }

}
