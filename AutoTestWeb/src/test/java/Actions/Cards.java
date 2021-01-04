package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cards {
    SharedDriver sharedDriver;

    public Cards(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bb-page-layout-sidebar\"]/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul/li[1]/nav/ul/li[4]")
    WebElement cardsMenu;

    @FindBy(xpath = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-details-widget-extended/bb-card-details-widget/bb-card-details-container/bb-payment-card/bb-payment-card-summary/div/h2")
    WebElement CardDetailsTitle;

    public void ClickCardsMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cardsMenu)).click();
    }

    public void SeeCardDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(CardDetailsTitle));
    }
}
