package com.bridgelabz.selenium.pages;

import org.openqa.selenium.By;
import com.bridgelabz.selenium.base.Base;

public class Registration extends Base {

    public void registration() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]")).click();
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("anku");
        driver.findElement(By.name("lastname")).sendKeys("patil");
        driver.findElement(By.name("reg_email__")).sendKeys("ankitakhairnar100@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ankitakhairnar100@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("anki123");
        driver.findElement(By.id("day")).sendKeys("12");
        //driver.findElement(By.name("month")).sendKeys("jan");
        driver.findElement(By.id("year")).sendKeys("1997");
        //driver.findElement(By.id("u_3_2_uq") ).click();
        driver.findElement(By.name("sex") ).sendKeys("male");
        driver.findElement(By.name("websubmit")).click();
        driver.navigate().forward();
        Thread.sleep(3000);
    }
}
