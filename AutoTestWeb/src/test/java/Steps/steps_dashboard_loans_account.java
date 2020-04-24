package Steps;

import Actions.LanguageSwitcher;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class steps_dashboard_loans_account {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_dashboard_loans_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }

    @Then("^i can click on a loans account$")
    public void iCanClickOnALoansAccount() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Loans Account
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[3]/div[2]/div/button/bb-product-kind/div/div[1]/div[1]")).click();

    }

}
