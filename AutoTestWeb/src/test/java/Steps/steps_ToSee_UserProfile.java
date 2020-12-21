package Steps;


import Actions.UserProfile;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

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
