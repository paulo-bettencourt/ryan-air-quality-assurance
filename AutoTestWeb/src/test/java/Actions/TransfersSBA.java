package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TransfersSBA {
    SharedDriver sharedDriver;

    public TransfersSBA(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(id = "accountNumber")
    WebElement bbanInput;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-review-container/bb-payment-review/div[1]/div[1]/div[1]/bb-alert-ui/ngb-alert")
    WebElement errorMessage;

    public void InsertBBAN(String bban){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(bbanInput)).sendKeys(bban);
    }

    public void SeeErrorMessage(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(errorMessage));
    }

}
