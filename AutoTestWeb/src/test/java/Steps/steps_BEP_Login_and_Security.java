package Steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class steps_BEP_Login_and_Security {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_BEP_Login_and_Security(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i click on the login and security tab$")
    public void iClickOnTheLoginAndSecurityTab() throws InterruptedException {
        Thread.sleep(1000);
        //login&Security tab
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")).click();
        //Reset Password button, just to know that the page was loaded
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/sba-reset-password-widget-extended/bb-reset-password-action-widget/div/div/button"));
    }
}
