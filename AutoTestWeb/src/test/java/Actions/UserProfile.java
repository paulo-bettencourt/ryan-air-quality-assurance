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

    @FindBy(xpath = "//*[@id=\"bb-page-layout-sidebar\"]/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul/li[2]/nav/ul/li[1]/a/span")
    WebElement userProfileMenu;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-manage-profile-widget-extended/bb-user-manage-profile-widget/section/div/bb-header-ui/h4")
    WebElement nameLabel;

    public void clickonUS() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(userProfileMenu)).click();
    }

    public void OnProfilePage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nameLabel));
    }
}
