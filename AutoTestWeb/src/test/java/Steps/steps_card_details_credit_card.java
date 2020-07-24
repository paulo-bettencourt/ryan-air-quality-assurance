package Steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_card_details_credit_card {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_card_details_credit_card(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i select one credit card$")
    public void iSelectOneCreditCard() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //click on the first credit card
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-list-widget-extended/bb-cards-list-widget/bb-payment-cards-container/bb-payment-card-group[1]/div/bb-payment-card/div/bb-payment-card-state-wrapper-ui/div/div/bb-payment-card-ui/div/div/div[1]/bb-logo-ui/div")).click();

    }
}
