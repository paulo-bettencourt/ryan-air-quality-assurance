package Steps;

import cucumber.api.java.en.Then;
import gherkin.lexer.Sr_cyrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class steps_my_transfers_details {
    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_my_transfers_details(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i click on My Transfers$")
    public void i_click_on_My_Transfers() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")).click();
        // Write code here that turns the phrase above into concrete actions

    }


    @Then("^i am on My Transfers Page$")
    public void i_am_on_My_Transfers_Page() throws Throwable {
        String url = "my-transfers";
        Thread.sleep(1000);
        String url2 = driver.getCurrentUrl();
        System.out.println(url2);
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(url2.contains(url));
    }


    @Then("^i open a Transfers and see their details$")
    public void i_open_a_Transfers_and_see_their_details() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-history-widget/div[1]/div[2]")).click();

        Thread.sleep(1000);
        String text = "Transfer ID";
        String path = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/div[2]/div[2]/div[1]/span")).getText();

        Assert.assertTrue(path.contains(text));
    }
}
