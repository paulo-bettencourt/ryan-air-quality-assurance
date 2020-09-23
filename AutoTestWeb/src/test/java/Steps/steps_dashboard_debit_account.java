package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class steps_dashboard_debit_account {


    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_dashboard_debit_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }

    @Then("^i can click on a debit account$")
    public void iCanClickOnADebitAccount()  {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Debit Account

        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[4]/div[2]/div/button[1]/bb-product-kind/div")).click();

    }


    @And("^i am redirected to the Debit transactions page$")
    public void iAmRedirectedToTheDebitTransactionsPage() throws InterruptedException {
        String account = "DEBIT";
        Thread.sleep(2000);
        String s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-selector-extended-widget/bb-product-summary-account-selector-widget/bb-account-selector-ui/ng-select/div/div/div[2]/bb-product-item-basic-account-ui/div/div/div[2]/div/div[1]/bb-ellipsis-ui/div")).getText();

        //Makes the test pass if the drivers url contains the variable url
        Assert.assertTrue(s.contains(account));
    }


    @Then("^Debit card details are loaded$")
    public void debit_card_details_are_loaded() throws InterruptedException {
        String s = "Card";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String name = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-details-widget-extended/bb-product-summary-details-widget/bb-product-summary-details/bb-debit-card-details/div/div[1]/div[1]/div[1]/span")).getText();
        Assert.assertTrue(name.contains(s));
    }
}
