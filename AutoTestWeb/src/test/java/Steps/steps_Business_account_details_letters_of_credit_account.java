package Steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_Business_account_details_letters_of_credit_account {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_Business_account_details_letters_of_credit_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @And("^business letter of credit account details are loaded$")
    public void business_account_details_loc_account_are_loaded() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String letterOfCreditType = "LC Imp DefPay";
        String s = String.valueOf(driver.findElement(By.xpath("//span[contains(text(), 'LC Imp DefPay' )]")));
        Assert.assertTrue(s.contains(letterOfCreditType));
    }
}
