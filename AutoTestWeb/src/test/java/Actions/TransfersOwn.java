package Actions;

import Steps.SharedDriver;
import org.junit.Assert;
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

    @FindBy(name = "contacts")
    WebElement recipientListBtn;

    @FindBy(xpath = "//*[@id=\"tabPanel_bb-tab-container-ang-_-edfeb05757aa\"]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget/sba-form/sba-recipient/form/bb-fieldset-ui/fieldset/div/div/sba-recipient-name/div/div/div/div[1]/div[2]/button")
    WebElement firstAcc;

    @FindBy(xpath = "//*[@id=\"tabPanel_bb-tab-container-ang-_-edfeb05757aa\"]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget/sba-form/sba-transfer-domestic-data/bb-fieldset-ui/fieldset/div/div/div[2]/div[2]/input[1]")
    WebElement amountInput;

    @FindBy(xpath = "//button[contains(text(), ' Next ')]")
    WebElement nextBtn;

    @FindBy(xpath = "//div[contains(text(), ' From ')]")
      WebElement fromLabel;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-review-container/bb-payment-review/div[2]/bb-button-ui[3]/button")
    WebElement authorizeBtn;

    @FindBy(className = "alert alert-success alert-dismissible")
    WebElement successMessage;

    @FindBy(xpath = "//label[contains(text(), 'Personal Note (Optional)')]")
    WebElement personalNoteLabel;


    public void SelectRecipientList() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(recipientListBtn)).click();
    }

    public void SelectCurrentAcc() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstAcc)).click();
    }

    public void InsertAmount(String amount) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountInput)).sendKeys(amount);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(personalNoteLabel)).click();
    }

    public void ClickNextBtn() throws InterruptedException {
        Thread.sleep(2000);
        if (sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtn)).isDisplayed()) {
            nextBtn.click();
        }else{
            sharedDriver.getDriver().quit();
            System.exit(111);
        }


        /*if (sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtn)).isEnabled()) {
            nextBtn.click();
            return true;
        } else {

            return false;
        }*/
    }

    public void nextButtonIsDisabled() {
        Assert.assertFalse(sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtn)).isEnabled());
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
