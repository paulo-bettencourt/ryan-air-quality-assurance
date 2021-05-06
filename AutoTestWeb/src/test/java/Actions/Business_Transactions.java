package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Business_Transactions {

    SharedDriver sharedDriver;

    public Business_Transactions(SharedDriver sharedDriver) {

        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Transactions')] | //span[contains(text(), 'Transacções')] | //bb-navigation-link-widget-ang/ul/li[3]/ul/li[2]/a")
    WebElement transactionsNavBar;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' Transactions ')] | //h3[contains(text(), ' Transacções ')]")
    WebElement transactionsTitle;

    @FindBy(how = How.CLASS_NAME, using = "bb-account-selector-ui")
    WebElement transactionsSelector;

    @FindBy(how = How.ID, using = "2")
    WebElement thirdaccountList;

    @FindBy(how = How.CLASS_NAME, using = "print-button")
    WebElement transactionsPrintButton;

    @FindBy(how = How.CLASS_NAME, using = "filter-button")
    WebElement transactionsFilterButton;

    @FindBy(how = How.CSS, using = "input[type='search']")
    WebElement transactionsSearchField;

    @FindBy(how = How.CLASS_NAME, using = "transactions-table")
    WebElement transactionsTable;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route//bb-transactions-controls/div/div[2]/div[3]/bb-dropdown-menu-ui/div/button")
    WebElement transactionsExportButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/a")
    WebElement transactionsExportCSVButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome//bb-transactions-table/div[1]/div/div/table/tbody/tr[1]/td[2]")
    WebElement firstTransactionRow;

    @FindBy(how = How.CLASS_NAME, using = "modal-content")
    WebElement transactionsModal;

    @FindBy(how = How.CLASS_NAME, using = "ng-arrow-wrapper")
    WebElement dropdownArrow;



    public void iAmInTransactions() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsNavBar)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsTitle));
    }

    public void iChooseAccount() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(dropdownArrow)).click();
        //dropdownArrow.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(thirdaccountList)).click();
        transactionsTitle.click();
    }

    public void iPressPrintButton() throws Exception {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsPrintButton));
        // the only way to access the print dialog is to click the print button with JavascriptExecutor in a async way
        JavascriptExecutor executor = (JavascriptExecutor) sharedDriver.getDriver();
        try {
            executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", transactionsPrintButton);
        } catch(Exception e) {
            throw new Exception("<<<<<<<<<<<<<< Print button could not be clicked >>>>>>>>>>>>>>");
        }

        sharedDriver.getDriver().quit();
    }

    public void iClickFilterButton() throws Exception {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsFilterButton)).click();
    }

    public void iSearchTransactions() throws Exception {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsSearchField)).sendKeys("100");
        transactionsSearchField.sendKeys(Keys.ENTER);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsTable));
    }

    public void iSeeAndClickCSVExportButton() throws Exception {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsExportButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsExportCSVButton)).click();
    }

    public void iSelectATransaction() throws Exception {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstTransactionRow)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transactionsModal));
    }
}
