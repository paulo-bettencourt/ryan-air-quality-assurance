package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_transfer_own {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_transfer_own(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i can click on new transfer on the quick action button$")
    public void iCanClickOnNewTransferOnTheQuickActionButton() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/sba-heading-widget-extended/div/div[2]/div/div/a")).click();
    }


    @And("^i am redirected to the new transfer page$")
    public void iAmRedirectedToTheNewTransferPage() {
        String url = "create-transfer/form";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String s = driver.getCurrentUrl();

        Assert.assertTrue(s.contains(url));
    }


    @Then("^i select a savings account on the from selector$")
    public void iSelectASavingsAccountOnTheFromSelector() {
        //select the acc selector
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/div[1]/bb-fieldset-ui/fieldset/bb-product-selector-ui/div/div/button/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //select savings account
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/div[1]/bb-fieldset-ui/fieldset/bb-product-selector-ui/div/div/div/button[1]/bb-product-item-basic-account-ui/div/div/div[2]/div/div[1]")).click();

    }

    @And("^i select a current account on the to selector$")
    public void iSelectACurrentAccountOnTheToSelector() {
        //search for "current account"
        driver.findElement(By.xpath("//*[@id=\"beneficiaryName\"]")).sendKeys("Current Account");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //click on the current account
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/div[2]/bb-fieldset-ui/fieldset/div/div[1]/div/div/div[1]/button")).click();

    }

    @And("^i insert \"([^\"]*)\" on the amount input$")
    public void iInsertOnTheAmountInput(String amount) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //insert the amount on the input
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/bb-fieldset-ui/fieldset/div/div[1]/div/bb-currency-input-ui/div/div[1]/div[2]/input")).sendKeys(amount);

    }

    @Then("^i click on next button$")
    public void iClickOnNextButton()  {
      //  Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //find next button and click on it
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/bb-fieldset-ui/fieldset/div/div[3]/bb-button-ui/button")).click();
    }

    @And("^i am redirected to the review page$")
    public void iAmRedirectedToTheReviewPage()  {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String url = "review";
        String s = driver.getCurrentUrl();
        //returns true if we are on the review page
        Assert.assertTrue(s.contains(url));
    }


    @Then("^i click on the authorize button$")
    public void iClickOnTheAuthorizeButton() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-review-container/bb-payment-review/div[2]/bb-button-ui[1]/button")).click();
    }


    @And("^transfers was successfully made$")
    public void transfersWasSuccessfullyMade() {
        String s = "submitted successfully";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String msg = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-status-container/bb-payment-status/div[1]/div[1]/bb-alert-ui/ngb-alert/div/div")).getText();
      // Thread.sleep(3000);
        Assert.assertTrue(msg.contains(s));
    }



}
