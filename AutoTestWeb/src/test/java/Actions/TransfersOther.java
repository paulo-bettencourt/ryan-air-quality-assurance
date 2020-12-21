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

    @FindBy(id = "beneficiaryName")
    WebElement recipientInput;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-form-container/bb-payment-form/div/div/form/div[2]/bb-fieldset-ui/fieldset/div/div[2]/div/button[2]")
    WebElement otherBankTab;

    @FindBy(xpath = "//*[@id=\"credit-item\"]")
    WebElement firstRecipient;

    @FindBy(id = "bb_input_8")
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
