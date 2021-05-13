package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TransfersOther {
    SharedDriver sharedDriver;

    public TransfersOther(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(id = "bb_input_4")
    WebElement recipientInput;

    @FindBy(xpath = "//button[contains(text(), ' Other Bank ')]")
     WebElement otherBankTab;

    @FindBy(xpath = "//span[contains(text(), ' retail test ')]")
    WebElement firstRecipient;

    @FindBy(xpath = "//*[@id=\"tabPanel_bb-tab-container-ang-_-edfeb05757aa\"]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget/sba-form/sba-recipient/form/bb-fieldset-ui/fieldset/div/div/div/div/sba-recipient-account-number/div/div/div/input")
    WebElement ibanInput;

    public void InsertRecipientName(String name) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(recipientInput)).sendKeys(name);
    }

    public void SelectFirstRecipient() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstRecipient)).click();
    }

    public void OtherBankTab() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(otherBankTab)).click();
    }

    public void InsertIban(String iban) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(ibanInput)).sendKeys(iban);
    }


}
