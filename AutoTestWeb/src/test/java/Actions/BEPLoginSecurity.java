package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BEPLoginSecurity {
    SharedDriver sharedDriver;

    public BEPLoginSecurity(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

   @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")
    WebElement loginTab;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/sba-reset-password-widget-extended/bb-reset-password-action-widget/div/bb-header-ui/h2")
    WebElement loginString;

    public void clickLoginTab() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(loginTab)).click();
    }

    public void onLoginPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(loginString));
    }


}
