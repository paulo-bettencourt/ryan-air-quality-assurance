package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Transactions {
    SharedDriver sharedDriver;

    public Transactions(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);

    }

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), ' My Accounts Details ')] ")
    WebElement mytransactions;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(), ' Anuidade ')]")
    WebElement firstcredittransaction;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(), '1000132587')]")
    WebElement firstcurrenttranaction;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(), 'STANDARD BANK')]")
    WebElement firstsavingtranaction;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), '309,208')]")
    WebElement firstloantranaction;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(), 'Recon POS HVT SBAO TRA.0031877.77 Internet')]")
    WebElement firstdebittranaction;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-transactions-widget-extended/bb-transactions-list-widget/bb-transactions-container/bb-transactions-list/bb-empty-state-ui")
    WebElement emptyTransactions;

    @FindBy(xpath = "//span[contains(text(), 'General')]")
    WebElement generalLabel;

    public void TransactionsPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(mytransactions));
    }

    public void EmptyTransactionsPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(emptyTransactions));
    }

    public void SeeTransactionDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabel));
    }

    public void ClickFirstCreditTransaction() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstcredittransaction)).click();
    }
    public void ClickFirstCurrentTransaction(){
      sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstcurrenttranaction)).click();
    }

    public void ClickFirstSavingTransaction(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstsavingtranaction)).click();
    }

    public void ClickFirstLoanTransaction(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstloantranaction)).click();
    }

    public void ClickFirstDebitTransaction(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstdebittranaction)).click();
    }
}
