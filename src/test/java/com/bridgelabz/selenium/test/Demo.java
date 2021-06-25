package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.Login;
import org.testng.annotations.Test;

public class Demo extends Base {

    @Test
    public void loginTo_Application() throws InterruptedException {
        Login login = new Login(); // creating object
        login.login();
    }

}
