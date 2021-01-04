package Steps;

import Actions.*;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class steps_logout {

    Logout logout;
    SharedDriver sharedDriver;

    public steps_logout(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
        logout = new Logout(sharedDriver);
    }

    @And("^want to logout$")
    public void want_to_logout() {
        logout.findDropdownLogout();
        logout.ClickLogout();
    }

    @And("^logout successfully$")
    public void logoutSuccessfully() {
        logout.LogoutSuccessfully();
    }
}
