package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TransfersOwn {
    SharedDriver sharedDriver;

    public TransfersOwn(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"beneficiaries-btn\"]")
    WebElement recipientListBtn;

    @FindBy(xpath = "//*[@id=\"credit-item\"]")
    WebElement currentAcc;

    @FindBy(id = "bb_element_8")//8
            WebElement amountInput;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/bb-fieldset-ui/fieldset/div/div[2]/bb-button-ui/button")
    WebElement nextBtn;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-review-container/bb-payment-review/div[1]/div[1]/div[2]")
    WebElement fromLabel;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-review-container/bb-payment-review/div[2]/bb-button-ui[3]/button")
    WebElement authorizeBtn;

    @FindBy(className = "alert alert-success alert-dismissible")
    WebElement successMessage;


    public void SelectRecipientList() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(recipientListBtn)).click();
    }

    public void SelectCurrentAcc() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(currentAcc)).click();
    }

    public void InsertAmount(String amount) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountInput)).sendKeys(amount);
    }

    public boolean ClickNextBtn() {

        if(sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtn)).isEnabled()){
            nextBtn.click();
            return true;
        } else {
            return false;
        }
    }

    public void OnReviewPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(fromLabel));
    }

    public void ClickAuthorizeBtn() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(authorizeBtn)).click();
    }

    public void TransferSuccess() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(successMessage));
    }

}
