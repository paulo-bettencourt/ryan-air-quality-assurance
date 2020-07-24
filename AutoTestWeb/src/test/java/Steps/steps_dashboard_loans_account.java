package Steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class steps_dashboard_loans_account {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_dashboard_loans_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }

    @Then("^i can click on a loans account$")
    public void iCanClickOnALoansAccount() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //Loans Account
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[3]/div[2]/div/button/bb-product-kind/div")).click();

    }

    @And("^i am redirected to the Loans transactions page$")
    public void iAmRedirectedToTheLoansTransactionsPage() throws InterruptedException {
        String account = "LOAN";
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
        String s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-transactions-widget-extended/bb-transactions-list-widget/bb-transactions-container/bb-transactions-list/div[1]/bb-transactions-list-item-group/div/div/div/bb-transactions-list-item/div/div/div[1]/div[2]/strong")).getText();

        //Makes the test pass if the drivers url contains the variable url
        Assert.assertTrue(s.contains(account));
    }
}
