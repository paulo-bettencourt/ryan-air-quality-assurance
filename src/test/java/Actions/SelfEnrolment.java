package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelfEnrolment {
    SharedDriver sharedDriver;

    public SelfEnrolment(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(id = "kc-enrollment")
    WebElement registerBtn;

    @FindBy(xpath = "//*[@id=\"bb_input_0\"]/option[3]")
    WebElement clientNumberOption;

    @FindBy(id = "bb_input_1")
    WebElement clientNumberInput;

    @FindBy(xpath = "//*[@id=\"606f7742-fb56-49e4-ad61-9d66ab64f7f1\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-self-enrollment-identification-widget-extended/bb-self-enrollment-identification-widget/bb-self-enrollment-identification-ui/div[2]/bb-load-button-ui/button")
    WebElement nextBtn;

    @FindBy(xpath = "//*[@id=\"606f7742-fb56-49e4-ad61-9d66ab64f7f1\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-self-enrollment-verification-widget-extended/div/div[1]/div/div[1]/div[2]/div[1]/span[2]")
    WebElement emailString;

    public void ClickRegisterBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(registerBtn)).click();
    }

    public void ClickClientNumber() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(clientNumberOption)).click();
    }

    public void InsertClientNumber(String num) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(clientNumberInput)).sendKeys(num);
    }

    public void ClickNextBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtn)).click();
    }

    public boolean NextBtnEnable() {
        return sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtn)).isEnabled();
    }

    public void OnVerificationPage(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(emailString));
    }
}
