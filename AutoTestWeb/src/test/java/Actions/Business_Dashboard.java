package Actions;

import Steps.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(how = How.XPATH, using = "//*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui//div[contains(text(), 'Hi')] | //*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui//div[contains(text(), 'Olá')]")
    WebElement helloMessage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), ' Olá CompanyB User1 ')]")
    WebElement helloMessagePortuguese;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-page-layout-sidebar\"]/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul")
    WebElement sideNavigationBar;

    @FindBy(how = How.XPATH, using = " //*[@id=\"bb-main-content\"]/bb-panel-container//bb-accounts-overview-cards/div")
    WebElement accountsCardsView;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//bb-accounts-overview-widget/bb-accounts-overview-container/bb-accounts-overview-table/table")
    WebElement accountsListView;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//bb-accounts-overview-widget/bb-accounts-overview-container/bb-accounts-overview-header/div/div[2]/div/div/button[1]")
    WebElement accountsListViewButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//bb-accounts-overview-widget/bb-accounts-overview-container/bb-accounts-overview-header/div/div[2]/div/div/button[2]")
    WebElement accountsCardViewButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//table/tbody/tr[3]/td[8]/bb-dropdown-menu-ui/div/div/button[contains(text(), 'Ver Detalhes')] | //*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//table/tbody/tr[3]/td[8]/bb-dropdown-menu-ui/div/div/button[contains(text(), 'See Details')]")
    WebElement kebabSeeDetailOption;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//bb-navigation-link-widget-ang/ul/li[3]/ul/li[1]/a")
    WebElement accountOverviewButton;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(), ' General ')] | //h4[contains(text(), 'Informação Geral')]")
    WebElement generalLabelDetails;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//bb-account-selector-ui/ng-select/div")
    WebElement accountSelector;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[2]/td[8]/bb-dropdown-menu-ui/div/button/div")
    WebElement documentaryCollectionKebabMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//table/tbody/tr[3]/td[8]/bb-dropdown-menu-ui/div/button/div")
    WebElement currentAccountKebabMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[2]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement documentaryCollectionDetails;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[2]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement LoanSeeDetailsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[3]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement DebitSeeDetailsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[1]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement BankGuaranteeDetailsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app//bb-accounts-overview-table/table/tbody/tr[1]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement LocSeeDetailsButton;

    @FindBy(how = How.XPATH, using = "//bb-icon-ui[@name='print']")
    WebElement accountDetailsPrint;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container//tr/td[8]/bb-dropdown-menu-ui/div/button/div")
    WebElement SavingsAccountKebabMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container//tr[2]/td[8]/bb-dropdown-menu-ui/div/button/div")
    WebElement LoanAccountKebabMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container//tr[3]/td[8]/bb-dropdown-menu-ui/div/button/div")
    WebElement DebitAccountKebabMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container//tr[1]/td[8]/bb-dropdown-menu-ui/div/button")
    WebElement BankGuaranteeKebabMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"e49fd830-de81-4e49-b54f-39ff13a230fb\"]/sba-sba-business-app/bb-root/bb-area/bb-chrome//table/tbody/tr[1]/td[8]/bb-dropdown-menu-ui/div/button/div")
    WebElement LettersOfCreditKebabMenu;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), 'Dashboard')]")
    WebElement dashboardTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Contas Favoritas ')]")
    WebElement dashboardFavoriteTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Últimas Transacções ')]")
    WebElement dashboardLatestTransactionsTitle;
    public void iAmInBusinessDashboard() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(dashboardTitle));
    }

    public void iAmInAccountsPage() {
        this.iAmInBusinessDashboard();
        accountOverviewButton.click();
    }
    public void iAmInBusinessDashboardPortuguese() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(helloMessagePortuguese));
    }
    public void viewNavigationBar(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(sideNavigationBarTitle));
    }

    public void viewAccountsListView(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsListViewButton));
        accountsListViewButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsListView));
    }

    public void viewAccountsCardsView(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsCardViewButton));
        accountsCardViewButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsCardsView));
    }

    public void iClickOnCurrentAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(currentAccountKebabMenu)).click();
    }

    public void iClickOnDocumentaryCollectionAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(documentaryCollectionKebabMenu)).click();
    }

    public void iChooseSeeDetailsKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(kebabSeeDetailOption)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iChooseSeeDocumentaryCollectionKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(documentaryCollectionDetails)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void viewAccountSelector() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountSelector));
    }

    public void iPrintAccountDetails() throws Exception {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountDetailsPrint));
        // the only way to access the print dialog is to click the print button with JavascriptExecutor in a async way
        JavascriptExecutor executor = (JavascriptExecutor) sharedDriver.getDriver();
        try {
            executor.executeScript("var elem=arguments[0]; setTimeout(function() {elem.click();}, 100)", accountDetailsPrint);
        } catch(Exception e) {
            throw new Exception("<<<<<<<<<<<<<< Print button could not be clicked >>>>>>>>>>>>>>");
        }
        sharedDriver.getDriver().quit();
    }

    public void iClickOnSavingsAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(SavingsAccountKebabMenu)).click();
    }

    public void iClickOnLoanAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LoanAccountKebabMenu)).click();
    }

    public void iClickOnDebitAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(DebitAccountKebabMenu)).click();
    }

    public void iClickOnBankGuaranteeAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(BankGuaranteeKebabMenu)).click();
    }

    public void iClickOnLetterOfCreditAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LettersOfCreditKebabMenu)).click();
    }

    public void iChooseLoanKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LoanSeeDetailsButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iChooseDebitKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(DebitSeeDetailsButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iChooseLetterOfCreditKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LocSeeDetailsButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iChooseBankGuaranteeKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(BankGuaranteeDetailsButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iSeeFavAccounts() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(dashboardFavoriteTitle));
    }

    public void iSeeLatestTransactions(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(dashboardLatestTransactionsTitle));
    }
}
