package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class steps_transfers_other {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_transfers_other(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @And("^i select IBAN tab$")
    public void iSelectIBANTab() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/div[2]/bb-fieldset-ui/fieldset/div/div[2]/div/button[2]")).click();
    }

    @And("^i insert \"([^\"]*)\" on the IBAN input$")
    public void iInsertOnTheIBANInput(String iban) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bb_input_8\"]")).sendKeys(iban);
        Thread.sleep(2000);
    }

    @Then("^next button is disabled$")
    public void nextButtonIsDisabled() {
        Boolean x = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/bb-fieldset-ui/fieldset/div/div[2]/bb-button-ui/button")).isEnabled();

        Assert.assertFalse(x);
    }


    @And("^i insert a recipients name \"([^\"]*)\"$")
    public void iInsertARecipientsName(String name) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"beneficiaryName\"]")).sendKeys(name);
    }

    @And("^i select \"([^\"]*)\" on the recipient name selector$")
    public void iSelectOnTheRecipientNameSelector(String recipient) throws InterruptedException {
        //search for "John Doe"
        driver.findElement(By.xpath("//*[@id=\"beneficiaryName\"]")).sendKeys(recipient);
        //click on the first option displayed
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/div[2]/bb-fieldset-ui/fieldset/div/div[1]/div/div/div/button")).click();
        Thread.sleep(2000);
    }
}
