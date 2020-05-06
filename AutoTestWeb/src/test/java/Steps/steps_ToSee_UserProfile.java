package Steps;


import Actions.UserProfile;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

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
    public void i_click_on_user_profile() {
        profile.clickonUS();

    }

    @Then("^i see the User Profile details$")
    public void i_see_the_User_Profile_details()  {
        String s = "Customer Details";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String path = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-manage-profile-widget-extended/bb-user-manage-profile-widget/section/div/div/sba-customer-details-ui/div/div[1]/bb-header-ui/h6")).getText();

        Assert.assertTrue(s.contains(path));

    }
}
