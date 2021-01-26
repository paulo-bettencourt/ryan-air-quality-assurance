package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Business_Transfers {

    SharedDriver sharedDriver;

    public Business_Transfers(SharedDriver sharedDriver) {

        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Transfers')]")
    WebElement transfersNavBar;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' Transfers ')]")
    WebElement transfersTitle;

    @FindBy(how = How.XPATH, using = "//*[@id=\"beneficiaryName\"]")
    WebElement beneficiaryName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"accountNumber\"]")
    WebElement beneficiaryAccount;

    @FindBy(how = How.CSS, using = ".account-input-wrapper>bb-input-text-ui>input")
    WebElement beneficiaryAccountOtherBank;

    @FindBy(how = How.CSS, using = ".bb-currency-input__integer > input")
    WebElement amountTransferInput;

    @FindBy(how = How.CSS, using = ".payment-details-fieldset>fieldset>.payment-details-subcontainer>bb-textarea-ui>div>textarea")
    WebElement amountDescriptionInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-fieldset-ui/fieldset/div/div[2]/bb-button-ui/button")
    WebElement transfersContinueButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container//sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-review-container/bb-payment-review/div[1]")
    WebElement transfersReviewPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-payment-review-container/bb-payment-review/div[2]/bb-button-ui[3]/button")
    WebElement transfersConfirmationButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route//bb-payment-status-container/bb-payment-status/div[1]/div[1]/bb-alert-ui/ngb-alert")
    WebElement transfersSuccessAlert;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-payment-status-container/bb-payment-status/div[1]")
    WebElement transfersCompletionPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-payment-form-container/bb-payment-form/div/div/form/div[2]/bb-fieldset-ui/fieldset/div/div[2]/div/button[2]")
    WebElement toOtherBankButton;

    @FindBy(how = How.XPATH, using = "/html/body/ngb-modal-window/div/div/div[2]/div[2]")
    WebElement otpModal;

    @FindBy(how = How.XPATH, using = "//*[@id=\"code0\"]")
    WebElement otpFieldOne;

    @FindBy(how = How.XPATH, using = "//*[@id=\"code1\"]")
    WebElement otpFieldTwo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"code2\"]")
    WebElement otpFieldThree;

    @FindBy(how = How.XPATH, using = "//*[@id=\"code3\"]")
    WebElement otpFieldFour;

    @FindBy(how = How.XPATH, using = "//*[@id=\"code4\"]")
    WebElement otpFieldFive;

    @FindBy(how = How.XPATH, using = "//*[@id=\"code5\"]")
    WebElement otpFieldSix;

    @FindBy(how = How.XPATH, using = "/html/body/ngb-modal-window/div/div/div[2]/div[3]/div/button[2]")
    WebElement otpTransferButton;

    @FindBy(how = How.XPATH, using = "/html/body/ngb-modal-window/div/div/div[2]/div[3]/div/button[1]")
    WebElement otpResendCodeButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-payment-review-container/bb-payment-review/div[2]/bb-button-ui[2]/button")
    WebElement editButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-payment-review-container/bb-payment-review/div[2]/bb-button-ui[1]/button")
    WebElement cancelButton;

    @FindBy(how = How.XPATH, using = "/html/body/ngb-modal-window/div/div/div[2]/div/button[2]")
    WebElement cancelButtonModalConfirmation;

    public void iAmInTransfers() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersNavBar)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersTitle));
    }

    public void fillInNameAndAccount(String beneficiaryFullName, String account) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(beneficiaryName)).sendKeys(beneficiaryFullName);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(beneficiaryAccount)).sendKeys(account);
    }

    public void fillInNameAndAccountOtherBank(String beneficiaryFullName, String account) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(beneficiaryName)).sendKeys(beneficiaryFullName);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(beneficiaryAccountOtherBank)).sendKeys(account);
    }

    public void fillAmount(String amount) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountTransferInput)).sendKeys(amount);
    }

    public void fillAmountAndDescription(String amount, String description) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountTransferInput)).sendKeys(amount);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountDescriptionInput)).sendKeys(description);
    }
    public void fillDescription(String description) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountDescriptionInput)).sendKeys(description);
    }
    public void clickContinueButton() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersContinueButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersReviewPage));
    }

    public void clickTransferConfirmationButton() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersConfirmationButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersSuccessAlert));
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersCompletionPage));
    }

    public void clickOtherBankButton() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(toOtherBankButton)).click();
    }

    public void enterOTPCode() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(otpModal));
        otpFieldOne.sendKeys("1");
        otpFieldTwo.sendKeys("1");
        otpFieldThree.sendKeys("1");
        otpFieldFour.sendKeys("1");
        otpFieldFive.sendKeys("1");
        otpFieldSix.sendKeys("1");
    }
    public void submitOTPTransfer() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(otpTransferButton));
    }

    public void clickEditButton() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(editButton)).click();
    }

    public void clickCancelButton() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cancelButton)).click();
    }
    public void confirmCancelTransfer() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cancelButtonModalConfirmation)).click();
    }

}
