package Steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class steps_marketing_banner {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_marketing_banner(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }

    @And("^click on banner$")
    public void clickOnBanner(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("banner-url")).click();
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
