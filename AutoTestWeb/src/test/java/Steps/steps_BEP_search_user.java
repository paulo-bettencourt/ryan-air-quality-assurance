package Steps;

import Actions.BEPSearchUser;
import Actions.Login;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class steps_BEP_search_user {

    WebDriver driver;
    SharedDriver sharedDriver;
    Login login;
    BEPSearchUser bepSearchUser;

    public steps_BEP_search_user(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        login = new Login(driver, sharedDriver);
        bepSearchUser = new BEPSearchUser(sharedDriver);
    }

    @Given("^i am in the BEP login page$")
    public void iAmInTheBEPLoginPage() throws IOException, InterruptedException {
        login.openBrowser_BEP();
    }

    @Then("^i search for \"([^\"]*)\"$")
    public void iSearchFor(String user) {
 bepSearchUser.searchUser(user);
    }



    @And("^i click on the user first user$")
    public void iClickOnTheUserFirstUser() {
        bepSearchUser.clickOnUser();
    }
}
