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
        String account = "18 MAY 2020";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-transactions-widget-extended/bb-transactions-list-widget/bb-transactions-container/bb-transactions-list/div[1]/bb-transactions-list-item-group/strong")).getText();
                                                  //*[@id="bb-main-content"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-transactions-widget-extended/bb-transactions-list-widget/bb-transactions-container/bb-transactions-list/div[1]/bb-transactions-list-item-group/strong
        //Makes the test pass if the drivers url contains the variable url
        Assert.assertTrue(s.contains(account));
    }
}
