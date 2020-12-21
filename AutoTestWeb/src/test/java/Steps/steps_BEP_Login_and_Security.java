package Steps;

import Actions.BEPLoginSecurity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class steps_BEP_Login_and_Security {

    SharedDriver sharedDriver;
    BEPLoginSecurity bepLoginSecurity;

    public steps_BEP_Login_and_Security(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        bepLoginSecurity = new BEPLoginSecurity(sharedDriver);
    }

    @Then("^i click on the login and security tab$")
    public void iClickOnTheLoginAndSecurityTab() {
        bepLoginSecurity.clickLoginTab();
    }

    @And("^i can see the login and security page$")
    public void iCanSeeTheLoginAndSecurityPage() {
        bepLoginSecurity.onLoginPage();
    }
}
