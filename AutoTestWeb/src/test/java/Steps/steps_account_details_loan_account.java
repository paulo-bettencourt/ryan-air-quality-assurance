package Steps;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_account_details_loan_account {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_account_details_loan_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }


    @And("^loan account details are loaded$")
    public void loanAccountDetailsAreLoaded() throws InterruptedException {
        String account = "Fixed Term Dep";
        Thread.sleep(6000);
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String detail = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container")).getText();

        Assert.assertTrue(detail.contains(account));
    }
}
