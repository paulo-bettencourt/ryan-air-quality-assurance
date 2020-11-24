package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Business_Dashboard {

    SharedDriver sharedDriver;

    public Business_Dashboard(SharedDriver sharedDriver) {

        this.sharedDriver = sharedDriver;
        PageFactory.initElements(sharedDriver.getDriver(), this);
    }

    @FindBy(how = How.XPATH, using = "//div[contains(text(), ' Hi CompanyB User1 ')]")
    WebElement helloMessage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), ' Olá CompanyB User1 ')]")
    WebElement helloMessagePortuguese;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-page-layout-sidebar\"]/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul")
    WebElement sideNavigationBar;

    @FindBy(how = How.XPATH, using = " //*[@id=\"bb-main-content\"]/bb-panel-container//bb-accounts-overview-cards/div")
    WebElement accountsCardsView;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-accounts-overview-container/bb-accounts-overview-table/table/tbody")
    WebElement accountsListView;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area//bb-accounts-overview-container/bb-accounts-overview-header/div/div[2]/div/div/button[1]/bb-icon-ui")
    WebElement accountsListViewButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome//bb-accounts-overview-container/bb-accounts-overview-header/div/div[2]/div/div/button[2]/bb-icon-ui")
    WebElement accountsCardViewButton;


    public void iAmInBusinessDashboard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(helloMessage));
    }

    public void iAmInBusinessDashboardPortuguese() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(helloMessagePortuguese));
    }
    public void viewNavigationBar(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sideNavigationBar));
    }

    public void viewAccountsListView(){
        accountsListViewButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsListView));
    }

    public void viewAccountsCardsView(){
        accountsCardViewButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsCardsView));
    }
}
