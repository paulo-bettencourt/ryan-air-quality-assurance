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
       //String account = "3 APRIL 2020";
        String account = "2020";
       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(2000);
        String s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-transactions-widget-extended/bb-transactions-list-widget/bb-transactions-container/bb-transactions-list/div[1]/bb-transactions-list-item-group/strong")).getText();

        //Makes the test pass if the drivers url contains the variable url
        Assert.assertTrue(s.contains(account));
    }


    @Then("^Debit card details are loaded$")
    public void debit_card_details_are_loaded() throws InterruptedException {
        String s = "Account Info";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String name = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")).getText();
        Assert.assertTrue(s.contains(name));
    }
}
