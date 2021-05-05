package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.event.KeyEvent;

public class Business_Transfers {

    SharedDriver sharedDriver;

    public Business_Transfers(SharedDriver sharedDriver) {

        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Create a Transfer')] | //span[contains(text(), 'Criar Transferência')]")
    WebElement transfersNavBar;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' Transfers ')] | //h3[contains(text(), ' Transferências ')]")
    WebElement transfersTitle;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb_input_4\"]")
    WebElement beneficiaryName;

    @FindBy(how = How.XPATH, using = "//*[contains(@data-role, 'beneficiary-account-number')]")
    WebElement beneficiaryAccount;

    @FindBy(how = How.XPATH, using = "//*[contains(@data-role, 'beneficiary-account-number')]")
    WebElement beneficiaryAccountOtherBank;

    @FindBy(how = How.XPATH, using = "//*[contains(@formcontrolname, 'amount')]")
    WebElement amountTransferInput;

    @FindBy(how = How.XPATH, using = "//*[contains(@data-role, 'textarea-text-field')]")
    WebElement amountDescriptionInput;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Seguinte')] | //button[contains(text(), 'Next')]")
    WebElement transfersContinueButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container//sba-payord-initiate-payment-widget-extended/bb-payord-initiate-payment-widget/bb-payment-review-container/bb-payment-review/div[1]")
    WebElement transfersReviewPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-payment-review-container/bb-payment-review/div[2]/bb-button-ui[3]/button")
    WebElement transfersConfirmationButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route//bb-payment-status-container/bb-payment-status/div[1]/div[1]/bb-alert-ui/ngb-alert")
    WebElement transfersSuccessAlert;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-payment-status-container/bb-payment-status/div[1]")
    WebElement transfersCompletionPage;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Outro Banco')] | //button[contains(text(), 'Other Bank')]")
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

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Editar')] | //span[contains(text(), 'Edit')]")
    WebElement editButton;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Cancelar')] | //button[contains(text(), ' Cancel ')]")
    WebElement cancelButton;

    @FindBy(how = How.XPATH, using = "/html/body/ngb-modal-window/div/div/div[2]/div/button[2]")
    WebElement cancelButtonModalConfirmation;

    @FindBy(className = "bb-product-selector__icon")
    WebElement accountSelectorArrow;

    @FindBy(how = How.XPATH, using = "//*[contains(@data-role, 'search-input')]")
    WebElement accountSelectorSearch;

    @FindBy(className = "bb-loading-indicator__circle")
    WebElement loadingSpinner;

    @FindBy(how = How.XPATH, using = "//*[contains(@formcontrolname, 'decimal')]")
    WebElement decimalAmountTransferInput;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Autorizar')] | //button[contains(text(), ' Authorize ')]")
    WebElement reviewPageAuthorizeButton;

    public void iAmInTransfers() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersNavBar)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersTitle));
    }

    public void fillInNameAndAccount(String beneficiaryFullName, String account) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(beneficiaryName)).click();
        beneficiaryName.sendKeys(beneficiaryFullName);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(beneficiaryAccount)).click();
        beneficiaryAccount.sendKeys(account);
    }

    public void fillInNameAndAccountOtherBank(String beneficiaryFullName, String account) throws InterruptedException {
        synchronized (sharedDriver.getDriver()) {
            sharedDriver.getDriver().wait(5000);
        }
        toOtherBankButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(beneficiaryName)).sendKeys(beneficiaryFullName);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(beneficiaryAccountOtherBank)).sendKeys(account);
    }

    public void fillAmount(String amount) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountTransferInput)).sendKeys(amount);
        decimalAmountTransferInput.click();
    }

    public void fillAmountAndDescription(String amount, String description) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountTransferInput)).sendKeys(amount);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountDescriptionInput)).sendKeys(description);
    }
    public void fillDescription(String description) throws InterruptedException {
        //there's a bug where if the contact field takes long to load (when the services are slow) the description gets deleted
        synchronized (sharedDriver.getDriver()) {
            sharedDriver.getDriver().wait(5000);
        }
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountDescriptionInput)).sendKeys(description);
    }
    public void clickContinueButton() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersContinueButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(reviewPageAuthorizeButton));
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

    public void searchAndSelectAccount(String accountName) throws InterruptedException {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountSelectorArrow)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountSelectorSearch)).click();
        accountSelectorSearch.sendKeys(accountName);
        //avoids multi-thread problems, while this is active, no others threads get active
        synchronized (sharedDriver.getDriver()) {
                  sharedDriver.getDriver().wait(5000);
         }
         sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sharedDriver.getDriver().findElement(By.xpath("//*[contains(@data-role, 'card-title')]"))));
        //sharedDriver.getWait().until(ExpectedConditions.invisibilityOf(loadingSpinner));
        accountSelectorSearch.click();
        accountSelectorSearch.sendKeys(Keys.BACK_SPACE);
        //click first card
        sharedDriver.getDriver().findElement(By.className("bb-account-info")).click();
    }

    public void verifyDescription(String description) {
        //error on html, on the html the tax field also has the data role of description
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sharedDriver.getDriver().findElements(By.xpath("//*[contains(@data-role, 'description')]")).get(1))).getText().equals(description);
    }

}
