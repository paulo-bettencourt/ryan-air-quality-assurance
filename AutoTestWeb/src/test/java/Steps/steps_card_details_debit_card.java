package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_card_details_debit_card {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_card_details_debit_card(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i click on cards on the nav bar$")
    public void iClickOnCardsOnTheNavBar() throws InterruptedException {
        Thread.sleep(4000);
        //click on cards on the nav bar
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/sba-heading-widget-extended/div/div[2]/div/div/bb-dropdown-menu-ui/div/button/div/bb-icon-ui")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/sba-heading-widget-extended/div/div[2]/div/div/bb-dropdown-menu-ui/div/div/div[2]/a")).click();

    }

    @Then("^i select one debit card$")
    public void iSelectOneDebitCard() throws InterruptedException {
        Thread.sleep(3000);
        //click on the first debit card
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-list-widget-extended/bb-cards-list-widget/bb-payment-cards-container/bb-payment-card-group/div/bb-payment-card[1]/div/bb-payment-card-state-wrapper-ui/div/div[1]")).click();
    }


    @And("^i can see the debit card details$")
    public void iCanSeeTheDebitCardDetails() throws InterruptedException {
        Thread.sleep(4000);
        String name = "Card Details";
        String text = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/sba-heading-widget-extended/div/div[2]/bb-header-ui/h3")).getText();

        //returns true if all string are contained in the string retrieved from the driver
        Assert.assertTrue(text.contains(name) );

    }
}
