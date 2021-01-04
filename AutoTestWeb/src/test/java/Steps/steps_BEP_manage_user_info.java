package Steps;

import Actions.BEPUserInfo;
import Actions.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_BEP_manage_user_info {

    SharedDriver sharedDriver;
    BEPUserInfo bepUserInfo;

    public steps_BEP_manage_user_info(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        bepUserInfo = new BEPUserInfo(sharedDriver);
    }

    @Then("^i try to change the email and cancel$")
    public void iTryToChangeTheEmailAndCancel() {
  bepUserInfo.selectManageEmail();
        bepUserInfo.changeEmail();
        bepUserInfo.cancelEmailChange();
    }

    @And("^try to change the phone number and cancel$")
    public void tryToChangeThePhoneNumberAndCancel() {
  bepUserInfo.selectManagePhone();
        bepUserInfo.changePhone();
        bepUserInfo.cancelPhoneChange();
    }
}
