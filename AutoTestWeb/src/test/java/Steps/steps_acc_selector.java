package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class steps_acc_selector {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_acc_selector(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^select loan account from account selector$")
    public void selectLoanAccountFromAccountSelector()  {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement as = driver.findElement(By.className("ng-arrow-wrapper"));
        as.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-selector-extended-widget/bb-product-summary-account-selector-widget/bb-account-selector-ui/ng-select/ng-dropdown-panel/div[2]/div[2]/div[4]/bb-product-item-basic-account-ui/div/div")).click();
driver.findElement(By.xpath("//*[@id=\"a2b83a0f4c00-3\"]/bb-product-item-basic-account-ui/div/div/div[1]/div/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @And("^click account details tab$")
    public void clickAccountDetailsTab() {
       // driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")).click();

    }

}
