package Steps;


import Actions.UserProfile;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_ToSee_UserProfile {

    SharedDriver sharedDriver;
    UserProfile profile;

    public steps_ToSee_UserProfile(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        profile = new UserProfile(sharedDriver);
    }

    @Then("^i click on user profile$")
    public void i_click_on_user_profile() {
        profile.clickonUS();
    }

    @Then("^i see the User Profile details$")
    public void i_see_the_User_Profile_details() {
 profile.OnProfilePage();
    }
}
