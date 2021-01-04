package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreditCardDetails {

    SharedDriver sharedDriver;

    public CreditCardDetails(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-list-widget-extended/bb-cards-list-widget/bb-payment-cards-container/bb-payment-card-group[1]/div/bb-payment-card/div/bb-payment-card-state-wrapper-ui/div/div/bb-payment-card-ui/div")
    WebElement creditCard;


    public void SelectCreditCard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(creditCard)).click();
    }


}
