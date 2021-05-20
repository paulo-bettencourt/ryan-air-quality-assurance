package Steps;

import Actions.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_login {

    WebDriver driver;
    Login login;
    SharedDriver sharedDriver;

    public steps_login(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        PageFactory.initElements(driver, this);
        login = new Login(driver, sharedDriver);
    }

    @Then("^i want to login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_want_to_login_with_and(String user, String pass) {
        login.FillIn(user, pass);
    }

    @Given("^i am in login page$")
    public void i_am_in_login_page() throws Throwable {
        login.openBrowser();
    }

    @Given("^i am in the business login page$")
    public void i_am_in_business_login_page() throws Throwable {
        login.openBrowser_business();
    }

    @And("^i logged in successfully$")
    public void iLoggedInSuccessfully(){
       login.findBanner();
    }

    @And("^my login failed$")
    public void myLoginFailed() {
       login.failedLogin();
    }


    @And("^i see the error message of right password, but account still blocked$")
    public void iSeeErrorMessageOfRightInfoButAccountBlocked() {
        login.seeToManyWrongTriesErrorMessage();
    }
}