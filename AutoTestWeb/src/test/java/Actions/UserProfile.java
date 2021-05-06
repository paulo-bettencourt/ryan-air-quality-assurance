package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserProfile {

    SharedDriver sharedDriver;

    public UserProfile(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"048c95c6-a194-4cc1-8168-6f180cd40924\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-ui/div/div[2]/div[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/ul/li[2]/ul/li[1]/a/span")
    WebElement userProfileMenu;

    @FindBy(xpath = "//h6[contains(text(), ' Customer Details ')]")
    WebElement customerDetailsLabel;

    public void clickonUS() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(userProfileMenu)).click();
    }

    public void OnProfilePage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(customerDetailsLabel));
    }
}
