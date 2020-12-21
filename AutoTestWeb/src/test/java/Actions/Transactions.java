package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Transactions {
    SharedDriver sharedDriver;

    public Transactions(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-transactions-widget-extended/bb-transactions-list-widget/bb-transactions-container/bb-transactions-list/div[1]/bb-transactions-list-item-group/div/div/div[1]/bb-transactions-list-item/div/div")
    WebElement firstTransaction;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-transactions-widget-extended/bb-transactions-list-widget/bb-transactions-container/bb-transactions-list/bb-empty-state-ui")
    WebElement emptyTransactions;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/div/div[2]/bb-transaction-details/div[1]/span")
    WebElement generalLabel;

    public void TransactionsPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstTransaction));
    }

    public void EmptyTransactionsPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(emptyTransactions));
    }

    public void SeeTransactionDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabel));
    }

    public void ClickFirstTransaction() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstTransaction)).click();
    }

}
