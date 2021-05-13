package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TransferDetails {
    SharedDriver sharedDriver;

    public TransferDetails(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(), 'New Transfer' ) ]")
    WebElement transfersQuickActions;

    @FindBy(xpath = "//legend[contains(text(), 'From' ) ]")
    WebElement fromLabel;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")
    WebElement myTransfersTab;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-history-widget/div[2]/header")
    WebElement myTransfersHeader;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-history-widget/div[2]/bb-collapsible-accordion-ui/bb-collapsible-card-ui[1]/bb-collapsible-ui/div[2]/div/div/div")
    WebElement firstTransfer;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/div/div[2]/div[1]")
    WebElement generalLabel;

    public void ClickTransfersQuickActions() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(transfersQuickActions)).click();
    }

    public void OnNewTransferPage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(fromLabel));
    }

    public void ClickMyTransfers() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(myTransfersTab)).click();
    }

    public void OnMyTransfers() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(myTransfersHeader));
    }

    public void ClickOnFirstTransfer() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(firstTransfer)).click();
    }

    public void SeeTransferDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabel));
    }
}
