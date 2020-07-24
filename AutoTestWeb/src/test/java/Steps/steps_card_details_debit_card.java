package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //click on cards on the nav bar
        driver.findElement(By.xpath("//*[@id=\"bb-page-layout-sidebar\"]/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul/li[1]/nav/ul/li[4]/a")).click();

    }

    @Then("^i select one debit card$")
    public void iSelectOneDebitCard() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //click on the first debit card
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul/li[1]/nav/ul/li[4]/a")).click();
    }


    @And("^i can see the debit card details$")
    public void iCanSeeTheDebitCardDetails() throws InterruptedException {
        Thread.sleep(4000);
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String name = "Card Details";
        String text = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/sba-heading-widget-extended/div/div[2]/bb-header-ui/h3")).getText();

        // String a = "Daily  Withdrawals";
        //String b = "Daily  Payments";
        //String c = "Daily  Online purchases";


        //to use when whe have more stable cards
        //String txta = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-details-widget-extended/bb-card-details-widget/bb-card-details-container/bb-payment-card/sba-payment-card-limits-ui/div/div/sba-payment-card-limit-ui[1]/div/div[1]/div[1]/h6")).getText();
        //String txtb = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-details-widget-extended/bb-card-details-widget/bb-card-details-container/bb-payment-card/sba-payment-card-limits-ui/div/div/sba-payment-card-limit-ui[2]/div/div[1]/div[1]/h6")).getText();
        //String txtc = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-details-widget-extended/bb-card-details-widget/bb-card-details-container/bb-payment-card/sba-payment-card-limits-ui/div/div/sba-payment-card-limit-ui[3]/div/div[1]/div[1]/h6")).getText();

        //returns true if all string are contained in the string retrieved from the driver
        Assert.assertTrue(text.contains(name) );

    }
}
