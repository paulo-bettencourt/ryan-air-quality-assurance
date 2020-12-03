package Steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_Business_account_details_current_account {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_Business_account_details_current_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @And("^business current account details are loaded$")
    public void business_account_details_current_account_are_loaded() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String account = "Current Account";
        String s = String.valueOf(driver.findElement(By.xpath("//span[contains(text(), 'Current Account' )]")));
        Assert.assertTrue(s.contains(account));
    }
}
