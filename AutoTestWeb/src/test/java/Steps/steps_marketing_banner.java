package Steps;


import Actions.Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class steps_marketing_banner {
    WebDriver driver;
    SharedDriver sharedDriver;
    Login login;

    public steps_marketing_banner(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        PageFactory.initElements(driver, this);
        login = new Login (driver, sharedDriver);

    }

    @And("^click on banner$")
    public void clickOnBanner() {
     login.clickBanner();
    }


    @And("^redirect successfully$")
    public void redirectSuccessfully() {
        String url = "heroisdeazul";
        boolean found = false;

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);

            if (driver.getCurrentUrl().contains(url)) {
                found = true;
            }
        }

        //Makes the test fail if the drivers url doesn't contains the variable url
        Assert.assertTrue(found);
    }


}
