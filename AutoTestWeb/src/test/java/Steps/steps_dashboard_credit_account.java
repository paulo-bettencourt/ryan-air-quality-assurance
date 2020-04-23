package Steps;

import Actions.LanguageSwitcher;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class steps_dashboard_credit_account {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_dashboard_credit_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }

    @And("^i can see the Credit account amount$")
    public void iCanSeeTheCreditAccountAmount() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement CreditAmount = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[4]/div[2]/div/button/bb-product-kind/div/div[2]/div/bb-amount-ui"));
        String s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[4]/div[2]/div/button/bb-product-kind/div/div[2]/div/bb-amount-ui")).getText();

        //if the amount is empty
        if (s.length() <= 0) {
            driver.findElement(By.id("123"));
        }
    }
}
