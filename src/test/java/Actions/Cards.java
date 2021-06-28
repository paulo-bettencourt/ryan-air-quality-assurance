package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cards {
    SharedDriver sharedDriver;

    public Cards(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"048c95c6-a194-4cc1-8168-6f180cd40924\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-ui/div/div[2]/div[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/ul/li[1]/ul/li[4]/a/span")
    WebElement cardsMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"048c95c6-a194-4cc1-8168-6f180cd40924\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-ui/div/div[2]/div[2]/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-cards-details-widget-extended/bb-card-details-widget/bb-card-details-container/bb-payment-card/bb-card-details-payment-card-controls/div/h4")
    WebElement selfServiceString;

    public void ClickCardsMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cardsMenu)).click();
    }

    public void SeeCardDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(selfServiceString));
    }
}
