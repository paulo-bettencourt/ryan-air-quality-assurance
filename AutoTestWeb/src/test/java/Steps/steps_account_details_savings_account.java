package Steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_account_details_savings_account {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_account_details_savings_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @And("^savings account details are loaded$")
    public void savingsAccountDetailsAreLoaded() {
        String account = "Savings";
        String s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-details-widget-extended/bb-product-summary-details-widget/bb-product-summary-details/bb-savings-account-details/div/div[1]/div[1]/div/span")).getText();

        Assert.assertTrue(s.contains(account));

    }
}
