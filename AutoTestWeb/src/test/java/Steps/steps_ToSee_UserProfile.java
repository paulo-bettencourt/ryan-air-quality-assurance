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
        driver = sharedDriver.getDriver();
        PageFactory.initElements(driver, this);
        profile = new UserProfile(driver);
    }

    @Then("^i click on user profile$")
    public void i_click_on_user_profile() throws Throwable {
        profile.clickonUS();

    }

    @Then("^i see the User Profile details$")
    public void i_see_the_User_Profile_details() throws Throwable {

        //throw new PendingException();
    }
}
