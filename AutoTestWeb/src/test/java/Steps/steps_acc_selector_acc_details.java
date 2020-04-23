package Steps;

import Actions.LanguageSwitcher;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class steps_acc_selector_acc_details {
    WebDriver driver;
    LanguageSwitcher languageSwitcher;
    SharedDriver sharedDriver;

    public steps_acc_selector_acc_details(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        languageSwitcher = new LanguageSwitcher(driver);

    }


    @Then("^select current account from dashboard$")
    public void selectCurrentAccountFromDashboard() {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[1]/div[2]/div/button/bb-product-kind/div")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("^select loan account from account selector$")
    public void selectLoanAccountFromAccountSelector() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement as = driver.findElement(By.className("ng-arrow-wrapper"));
        as.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-selector-extended-widget/bb-product-summary-account-selector-widget/bb-account-selector-ui/ng-select/ng-dropdown-panel/div[2]/div[2]/div[3]/bb-product-item-basic-account-ui/div/div/div[1]/div/div[1]/bb-ellipsis-ui/div")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("^click account details tab$")
    public void clickAccountDetailsTab() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")).click();

    }

    @And("^account details are loaded$")
    public void accountDetailsAreLoaded() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement detail = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-details-widget-extended/bb-product-summary-details-widget/bb-product-summary-details/bb-loan-details/div/div[1]/div[1]/div[1]/div"));

        if (!detail.getText().contains("Basic Loan Account")) {
            driver.findElement(By.id("123"));
        }
    }

}
