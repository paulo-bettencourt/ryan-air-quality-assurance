package Steps;

import Actions.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class steps_login {

    WebDriver driver;
    Login login;
    SharedDriver sharedDriver;

    public steps_login(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        login = new Login(driver);
    }

    @Then("^i want to login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_want_to_login_with_and(String user, String pass) throws Throwable {
        login.FillIn(user, pass);
    }

    @Given("^i am in login page$")
    public void i_am_in_login_page() throws Throwable {
        login.openBrowser();
    }

    @And("^i logged in successfully$")
    public void iLoggedInSuccessfully() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.id("banner-url"));
     //   driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[1]/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-column-container/div/bb-column[2]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-context-menu-widget-extended/bb-user-context-menu-widget/bb-user-context-menu-container/div/bb-dropdown-menu-ui/div/button/div/div/div/bb-icon-ui"));
  Thread.sleep(3000);
    }
}