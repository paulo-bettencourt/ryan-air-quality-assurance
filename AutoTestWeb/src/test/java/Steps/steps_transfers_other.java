package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_transfers_other {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_transfers_other(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @And("^i select John Doe on the to selector$")
    public void iSelectJohnDoeOnTheToSelector() {
        //search for "John Doe"
        driver.findElement(By.xpath("//*[@id=\"beneficiaryName\"]")).sendKeys("John Doe");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //click on the current account
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/div[2]/bb-fieldset-ui/fieldset/div/div[1]/div/div/div/button")).click();

    }

}
