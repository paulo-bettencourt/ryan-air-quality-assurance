package Actions;

import Steps.SharedDriver;
import gherkin.lexer.Th;
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

    @FindBy(how = How.XPATH, using = "//button[contains(text(), ' See Details ')]")
    WebElement kebabSeeDetailOption;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(), ' General ')]")
    WebElement generalLabelDetails;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container//bb-product-summary-account-selector-widget/bb-account-selector-ui/ng-select/div")
    WebElement accountSelector;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[2]/td[8]/bb-dropdown-menu-ui/div/button/div")
    WebElement documentaryCollectionKebabMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[2]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement documentaryCollectionDetails;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[2]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement LoanSeeDetailsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[3]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement DebitSeeDetailsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[1]/td[8]/bb-dropdown-menu-ui/div/div/button")
    WebElement BankGuaranteeDetailsButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]//table/tbody/tr[4]/td[8]/bb-dropdown-menu-ui/div/div/button")
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

    @FindBy(how = How.XPATH, using = "//*[@id=\"bb-main-content\"]/bb-panel-container//tr[4]/td[8]/bb-dropdown-menu-ui/div/button")
    WebElement LettersOfCreditKebabMenu;


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
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsListViewButton));
        accountsListViewButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsListView));
    }

    public void viewAccountsCardsView(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsCardViewButton));
        accountsCardViewButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(accountsCardsView));
    }

    public void iClickOnFirstAccountKebabMenu() {
        sharedDriver.getDriver().findElements(By.className("dropdown-menu-toggle-button__content")).get(2).click();

    }

    public void iClickOnDocumentaryCollectionAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(documentaryCollectionKebabMenu));
        documentaryCollectionKebabMenu.click();
    }

    public void iChooseSeeDetailsKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(kebabSeeDetailOption));
        kebabSeeDetailOption.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iChooseSeeDocumentaryCollectionKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(documentaryCollectionDetails));
        documentaryCollectionDetails.click();
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
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(SavingsAccountKebabMenu));
        SavingsAccountKebabMenu.click();
    }

    public void iClickOnLoanAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LoanAccountKebabMenu));
        LoanAccountKebabMenu.click();
    }

    public void iClickOnDebitAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(DebitAccountKebabMenu));
        DebitAccountKebabMenu.click();
    }

    public void iClickOnBankGuaranteeAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(BankGuaranteeKebabMenu));
        BankGuaranteeKebabMenu.click();
    }

    public void iClickOnLetterOfCreditAccountKebabMenu() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LettersOfCreditKebabMenu));
        LettersOfCreditKebabMenu.click();
    }

    public void iChooseLoanKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LoanSeeDetailsButton));
        LoanSeeDetailsButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iChooseDebitKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(DebitSeeDetailsButton));
        DebitSeeDetailsButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iChooseLetterOfCreditKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LocSeeDetailsButton));
        LocSeeDetailsButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }

    public void iChooseBankGuaranteeKebabMenuDetails() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(BankGuaranteeDetailsButton));
        BankGuaranteeDetailsButton.click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(generalLabelDetails));
    }
}
