package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DebitCardDetails {
    SharedDriver sharedDriver;

    public DebitCardDetails(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-list-widget-extended/bb-cards-list-widget/bb-payment-cards-container/bb-payment-card-group[2]/div/bb-payment-card/div/bb-payment-card-state-wrapper-ui/div/div/bb-payment-card-ui/div/div/div[1]/bb-logo-ui/div")
    WebElement debitCard;



    public void SelectDebitCard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(debitCard)).click();
    }



}
