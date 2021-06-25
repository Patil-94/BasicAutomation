package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.Registration;
import org.testng.annotations.Test;

public class RegistrationTest extends Base {
    @Test
    public void RegistrationTo_Application() throws InterruptedException {
        Registration registration = new Registration(); // creating object
        registration.registration();
    }
}
