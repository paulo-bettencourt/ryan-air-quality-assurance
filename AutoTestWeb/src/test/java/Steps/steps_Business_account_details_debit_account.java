package Steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_Business_account_details_debit_account {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_Business_account_details_debit_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @And("^business debit account details are loaded$")
    public void business_account_details_loan_account_are_loaded() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String account = "DEBIT";
        String s = String.valueOf(driver.findElement(By.xpath("//span[contains(text(), 'DEBIT' )]")));
        Assert.assertTrue(s.contains(account));
    }
}
