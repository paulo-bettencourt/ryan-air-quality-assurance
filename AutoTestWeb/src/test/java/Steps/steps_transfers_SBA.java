package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_transfers_SBA {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_transfers_SBA(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @And("^i select Jane Doe on the to selector$")
    public void iSelectJaneDoeOnTheToSelector() {
        //search for "Jane Doe"
        driver.findElement(By.xpath("//*[@id=\"beneficiaryName\"]")).sendKeys("Account leader");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //click on the "Jane Doe" account
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/div[2]/bb-fieldset-ui/fieldset/div/div[1]/div/div/div/button")).click();

    }

    @And("^i fill the OTP modal$")
    public void iFillTheOTPModal() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"code0\"]")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"code1\"]")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"code2\"]")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"code3\"]")).sendKeys("4");
        driver.findElement(By.xpath("//*[@id=\"code4\"]")).sendKeys("5");
        Thread.sleep(4000);
    }

    @Then("^click on the transfer button$")
    public void clickOnTheTransferButton() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div[3]/div/button[1]")).click();

    }

    @Then("^i insert a wrong BBAN \"([^\"]*)\"$")
    public void iInsertAWrongBBAN(String bban) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"accountNumber\"]")).sendKeys(bban);
    }

    @And("^a error message appears$")
    public void aErrorMessageAppears() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Boolean x = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-review-container/bb-payment-review/div[1]/div[1]/div[1]/bb-alert-ui/ngb-alert/div/div")).isDisplayed();
        Assert.assertTrue(x);
    }
}
