package Steps;

import Actions.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class steps_login_forgot_password {

    SharedDriver sharedDriver;
    Login login;

    public steps_login_forgot_password(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        login = new Login(sharedDriver.getDriver(), sharedDriver);
    }


    @And("^i forgot my password, so i click on the link$")
    public void iForgotMyPasswordSoIClickOnTheLink() {
    login.ClickForgotPassword();
    }

    @Then("^i am redirected to the forgot password page$")
    public void iAmRedirectedToTheForgotPasswordPage() {
 login.OnForgotPasswordPage();
    }
}
