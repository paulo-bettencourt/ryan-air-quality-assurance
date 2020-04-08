package Steps;

import Actions.LanguageSwitcher;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class steps_dashboard_current_account {
    WebDriver driver;
    LanguageSwitcher languageSwitcher;
    SharedDriver sharedDriver;

    public steps_dashboard_current_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        languageSwitcher = new LanguageSwitcher(driver);

    }

    @Then("^Dashboard is loaded$")
    public void dashboardIsLoaded() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[1]/div[2]"));

    }




}
