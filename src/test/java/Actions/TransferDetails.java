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

    @FindBy(id = "tab_bb-tab-container-ang-_-edfeb05757aa_1")
    WebElement myTransfersTab;

    @FindBy(xpath = "//div[contains(text(), 'Status')]")
    WebElement myTransfersHeader;

    @FindBy(xpath = "//*[@id=\"tabPanel_bb-tab-container-ang-_-edfeb05757aa\"]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-payord-history-widget/div[2]/bb-collapsible-accordion-ui/bb-collapsible-card-ui[1]/bb-collapsible-ui/div[2]/div/div/div[1]")
    WebElement firstTransfer;

    @FindBy(xpath = "//div[contains(text(), 'General')]")
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
