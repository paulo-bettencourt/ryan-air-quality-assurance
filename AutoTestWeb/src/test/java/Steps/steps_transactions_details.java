package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_transactions_details {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_transactions_details(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }


    @Then("^i can click on the first transaction$")
    public void iCanClickOnTheFirstTransaction() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //click on first transaction displayed
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-transactions-widget-extended/bb-transactions-list-widget/bb-transactions-container/bb-transactions-list/div[1]/bb-transactions-list-item-group/div/div/div[1]")).click();
    }

    @And("^i can see the transaction details$")
    public void iCanSeeTheTransactionDetails() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String ref = "Transaction";

        String s = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div[2]/bb-transaction-details/div[1]/div[1]/div")).getText();

        Assert.assertTrue(s.contains(ref));
    }
}
