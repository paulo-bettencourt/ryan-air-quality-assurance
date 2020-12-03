package Steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_Business_account_details_documentary_collection_account {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_Business_account_details_documentary_collection_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @And("^business documentary collection account details are loaded$")
    public void business_account_details_documentary_collection_account_are_loaded() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String account = "Documentary Collection";
        String s = String.valueOf(driver.findElement(By.xpath("//h3[contains(text(), 'Documentary Collection' )]")));
        Assert.assertTrue(s.contains(account));
    }
}
