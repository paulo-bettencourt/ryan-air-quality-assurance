package Actions;


import Steps.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BillPaymentsReview {

    SharedDriver sharedDriver;

    public BillPaymentsReview(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(), ' Bill Payments' ) ]")
    WebElement billPaymentsMenu;

    @FindBy(css = "form>bb-search-box-ui>div>input")
    WebElement searchBar;

    @FindBy(xpath = "//bb-route/bb-chrome//sba-sba-bill-payments-home/div/div/div[2]/div/div/button")
    WebElement firstEntity;

    @FindBy(id = "reference")
    WebElement reference;

    @FindBy(xpath = "//bb-fieldset-ui/fieldset/div/div[3]/div/sba-dropdown-ui/div/div[1]/button/div/span[2]")
    WebElement amountDropdownRechargeable;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[4]/div/sba-dropdown-ui/div/div")
    WebElement getAmountDropdownStateConfig;

    @FindBy(css = "bb-currency-input-ui>div>div>div.bb-currency-input__integer>input")
    WebElement amountInputReference;

    @FindBy(id = "bb_element_9")
    WebElement amountInputStateStandard;

    @FindBy(xpath = "//bb-fieldset-ui/fieldset/div/div[3]/div/sba-dropdown-ui/div/div[2]/button[1]")
    WebElement firstAmountRechargeable;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[4]/div/sba-dropdown-ui/div/div[2]/button[1]")
    WebElement firstAmountStateConfig;

    @FindBy(xpath = "//bb-fieldset-ui/fieldset/div/div[6]/bb-button-ui/button")
    WebElement nextBtnRechargeable;

    @FindBy(xpath = "//button[contains(text(), ' Next ')] | //button[contains(text(), 'Seguinte')]")
    WebElement nextBtnReference;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[7]/bb-button-ui/button")
    WebElement nextBtnStateConfig;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-bill-payments-widget/sba-sba-bill-payments-state-payment/form/div[2]/bb-fieldset-ui/fieldset/div/div[6]/bb-button-ui/button")
    WebElement nextBtnStateStandard;

    @FindBy(xpath = "//div[contains(text(), 'Payment Details')] | //div[contains(text(), 'Dados do Pagamento')]")
    WebElement paymentDetailsString;

    @FindBy(id = "bb_input_1")
    WebElement searchBarBusiness;

    @FindBy(className = "searched-entity-container")
    WebElement firstEntityBusiness;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' Bill Payments ')] | //h3[contains(text(), ' Pagamentos ')]")
    WebElement billPaymentsTitle;

    @FindBy(className = "bb-product-selector-ui")
    WebElement billAccountSelector;

    @FindBy(className = "bb-loading-indicator")
    WebElement accountLoaderSpinner;

    @FindBy(how = How.XPATH, using = "//form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/button")
    WebElement currentAccountDropdown;

    @FindBy(how = How.XPATH, using = "//form/div[1]/bb-fieldset-ui/fieldset/sba-billpay-account-selector-ui/bb-product-selector-ui/div/div/div/button")
    WebElement firstCurrentAccountItem;



    public void ClickBillPaymentsMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(billPaymentsMenu)).click();
    }

    public void InputSearchBar(String entity) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchBar)).sendKeys(entity);
    }

    public void SelectFirstEntity() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstEntity)).click();
    }

    public void InsertReferenceRechargeable(String ref) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(reference)).sendKeys(ref);
    }

    public void SelectFirstAmountRechargeable() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountDropdownRechargeable)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstAmountRechargeable)).click();
    }

    public void SelectFirstAmountStateConfig() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(getAmountDropdownStateConfig)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstAmountStateConfig)).click();
    }

    public void ClickNextBtnRechargeable() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtnRechargeable)).click();
    }

    public void ClickNextBtnReference() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtnReference)).click();
    }

    public void ClickNextBtnStateConfig() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtnStateConfig)).click();
    }

    public void ClickNextBtnStateStandard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextBtnStateStandard)).click();
    }

    public void ReviewPageCheck() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(paymentDetailsString));
    }

    public void InsertAmountReference(String amount) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountInputReference)).sendKeys(amount);
    }

    public void InsertAmountStateStandard(String amount) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(amountInputStateStandard)).sendKeys(amount);
    }

    public void inputSearchBarBusiness(String entity) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchBarBusiness)).sendKeys(entity);
    }

    public void businessSelectFirstEntity() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstEntityBusiness)).click();
    }

    public void iAmInBillPayments() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(billPaymentsMenu)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(billPaymentsTitle));
    }

    public void iSelectBillDebitAccount(String accountName) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(billAccountSelector));
        billAccountSelector.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sharedDriver.getDriver().findElement(By.id("debitAccounts"))));
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sharedDriver.getDriver().findElement(By.className("bb-loading-indicator"))));
        sharedDriver.getWait().until(ExpectedConditions.invisibilityOf(sharedDriver.getDriver().findElement(By.className("bb-loading-indicator"))));
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sharedDriver.getDriver().findElement(By.xpath("//div[contains(text(), '"+ accountName +"')]"))));
        sharedDriver.getDriver().findElement(By.xpath("//div[contains(text(), '"+ accountName +"')]")).click();
    }

    public void iConfirmBillDebitAccountSelectedWithSuccess(String accountName, String accountNumber) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sharedDriver.getDriver().findElement(By.xpath("//div[contains(text(), '"+ accountName +"')]"))));
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sharedDriver.getDriver().findElement(By.xpath("//div[contains(text(), '"+ accountNumber +"')]"))));
    }

    public void iSeeResultsForEntitySearch(String entitySearchResult) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sharedDriver.getDriver().findElement(By.xpath("//span[contains(text(), '"+ entitySearchResult +"')]"))));
    }

    public void selectCurrentAccount() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(currentAccountDropdown)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstCurrentAccountItem)).click();
    }
}