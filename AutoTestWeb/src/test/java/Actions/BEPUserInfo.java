package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BEPUserInfo {
    SharedDriver sharedDriver;

    public BEPUserInfo(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[3]/div/button")
    WebElement manageEmailBtn;


    @FindBy(xpath = "//*[@id=\"bb_input_1\"]")
    WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[3]/bb-admin-user-details-email-form/form/div[3]/button")
    WebElement cancelEmailBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[4]/div/button")
    WebElement managePhoneBtn;

    @FindBy(xpath = "//*[@id=\"bb_input_2\"]")
    WebElement phoneInput;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[4]/bb-admin-user-details-mobile-form/form/div[3]/button")
    WebElement cancelPhoneBtn;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/div/bb-modal-footer-ui/div/button[2]")
    WebElement yesCancelBtn;

    public void selectManageEmail() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(manageEmailBtn)).click();

    }

    public void changeEmail() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(emailInput)).sendKeys("ABCD");

    }

    public void cancelEmailChange() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cancelEmailBtn)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(yesCancelBtn)).click();
    }

    public void selectManagePhone() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(managePhoneBtn)).click();
    }

    public void changePhone() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(phoneInput)).sendKeys("12345");
    }

    public void cancelPhoneChange(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cancelPhoneBtn)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(yesCancelBtn)).click();
    }


}
