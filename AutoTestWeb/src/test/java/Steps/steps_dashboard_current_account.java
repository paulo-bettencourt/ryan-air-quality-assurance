package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class steps_dashboard_current_account {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_dashboard_current_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }


    @Then("^i can click on a current account$")
    public void iCanClickOnACurrentAccount() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Current Account
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[1]/div[2]/div/button/bb-product-kind/div/div[1]/div[1]")).click();

    }


    @And("^i am redirected to the Current transactions page$")
    public void iAmRedirectedToTheCurrentTransactionsPage() {
        String account = "Current";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-selector-extended-widget/bb-product-summary-account-selector-widget/bb-account-selector-ui/ng-select/div/div/div[2]/bb-product-item-basic-account-ui/div/div/div[2]/div/div[1]/bb-ellipsis-ui/div")).getText();

        //Makes the test pass if the drivers url contains the variable url
        Assert.assertTrue(s.contains(account));
    }
}
