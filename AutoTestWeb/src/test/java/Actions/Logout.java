package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Logout {
    SharedDriver sharedDriver;

    public Logout(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(), ' Hi ')]")
    WebElement userContextDropdown;

    @FindBy(xpath = "//*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui/div/div/div/bb-user-context-menu-dropdown/button[2]")
    WebElement logoutOption;

    @FindBy(id = "username")
    WebElement loginUsernameInput;

    public void findDropdownLogout() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(userContextDropdown)).click();
    }

    public void clickLogout() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(logoutOption)).click();
    }

    public void logoutSuccessfully() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(loginUsernameInput));
    }
}
