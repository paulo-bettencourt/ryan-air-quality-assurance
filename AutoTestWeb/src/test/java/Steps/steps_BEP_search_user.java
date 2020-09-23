package Steps;

import Actions.Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class steps_BEP_search_user {

    WebDriver driver;
    SharedDriver sharedDriver;
    Login login;

    public steps_BEP_search_user(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        login = new Login(driver);
    }

    @Given("^i am in the BEP login page$")
    public void iAmInTheBEPLoginPage() throws IOException, InterruptedException {
        login.openBrowser_BEP();

    }

    @Then("^i search for \"([^\"]*)\"$")
    public void iSearchFor(String user) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"bb_input_0\"]")).sendKeys(user);
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/sba-user-search-widget-extended/bb-user-search-widget/section/div[1]/bb-search-box-ui/div/div[1]/button")).click();
        Thread.sleep(2000);
    }

    @And("^i click on the user \"([^\"]*)\"$")
    public void iClickOnTheUser(String user) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/sba-user-search-widget-extended/bb-user-search-widget/section/div[2]/div[2]/table/tbody/tr")).click();
        String username = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[2]/div/div/div/span")).getText();
        Assert.assertTrue(user.equalsIgnoreCase(username));
    }



}
