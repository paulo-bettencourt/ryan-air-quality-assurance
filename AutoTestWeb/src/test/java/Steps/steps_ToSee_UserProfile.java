package Steps;

import Actions.Login;
import Actions.UserProfile;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_ToSee_UserProfile {

    WebDriver driver;
    SharedDriver sharedDriver;
    UserProfile profile;

    public steps_ToSee_UserProfile(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(driver, this);
        driver = sharedDriver.getDriver();
        profile = new UserProfile(driver);
    }

    @Then("^i click on user profile$")
    public void i_click_on_user_profile() throws Throwable {
        // Thread.sleep(2000);
        profile.clickonUS();

    }

    @Then("^i see the User Profile details$")
    public void i_see_the_User_Profile_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
