package Actions;

import Steps.SharedDriver;
import Config.ReadPropFile;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.IOException;

public class Login {
    private static WebDriver driver;
    private SharedDriver sharedDriver;

    public Login(WebDriver driver, SharedDriver sharedDriver) {
        this.driver = driver;
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "input-button__departure")
    WebElement goTrip;

    @FindBy(how = How.ID, using = "input-button__destination")
    WebElement returnTrip;

    @FindBy(xpath = "//*[contains(@data-id, '2021-10-04')]")
    WebElement dateDivFrom;

    @FindBy(xpath = "//*[contains(@data-id, '2021-10-29')]")
    WebElement dateDivUntil;

    @FindBy(xpath = "//button[contains(text(), 'Sim, concordo')]")
    WebElement agreeButton;

    @FindBy(how = How.XPATH, using = "//*[contains(@data-id, 'LIS')]")
    WebElement lisbonButton;

    @FindBy(how = How.CLASS_NAME, using = "flight-search-widget__start-search")
    WebElement searchButton;

    @FindBy(how = How.CLASS_NAME, using="card-wrapper")
    WebElement cardWrapper;

    @FindBy(how = How.CLASS_NAME, using = "fare-card--primary")
    WebElement lugaggeButton;

    @FindBy(how = How.CLASS_NAME, using = "fare-upgrade-footer-continue_button")
    WebElement continueButton;

    @FindBy(xpath = "//span[contains(text(), 'Iniciar sessão mais tarde')]")
    WebElement laterLink;

    @FindBy(how = How.CLASS_NAME, using = "dropdown__toggle")
    WebElement dropDownMenu;

    @FindBy(how = How.CLASS_NAME, using = "dropdown-item__label")
    WebElement dropDownMr;

    @FindBy(how = How.ID, using = "form.passengers.ADT-0.name")
    WebElement namePaxOne;

    @FindBy(how = How.ID, using = "form.passengers.ADT-0.surname")
    WebElement namePaxTwo;

    @FindBy(how = How.CLASS_NAME, using ="continue-flow__button")
    WebElement nextContinueButton;

    @FindBy(how = How.CLASS_NAME, using ="ry-radio-circle-button__label")
    WebElement radioLuggageButton;

    @FindBy(how = How.CLASS_NAME, using ="ry-button--gradient-yellow")
    WebElement continueLuggageButton;

    @FindBy(how = How.CLASS_NAME, using = "enhanced-takeover__product-dismiss-cta")
    WebElement noThanks;

    @FindBy(xpath = "//h4[contains(text(), 'Selecionar lugares mais tarde')]")
    WebElement seatsLater;

    @FindBy(xpath = "//div[contains(text(), 'Evita a fila de segurança com uma via Fast Track dedicada')]")
    WebElement fastTrackText;

    @FindBy(xpath = "//div[contains(text(), 'Estacionamento no aeroporto Terceira Lajes')]")
    WebElement airportParking;

    @FindBy(xpath = "//h3[contains(text(), 'Planeia a tua viagem inteira no mesmo sítio')]")
    WebElement finishedBooking;

    public void openBrowser() throws IOException, InterruptedException {
        String url = null;
        String domain = null;
        url = ReadPropFile.ReadConfig("url.mainPortal");
        domain = ReadPropFile.ReadConfig("url.identityDomain");
        driver.get(url);
    }

    //in this way we can set opening browsers in other realms (Bank Employee, Identity, etc.)
    public void openBrowser_BEP() throws IOException, InterruptedException {
        String url = null;
        String domain = null;
        domain = ReadPropFile.ReadConfig("url.identityDomain");
        url = ReadPropFile.ReadConfig("url.employeePortal");
        driver.get(url);
    }

    public void fillIn(String fromTrip, String toTrip) {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(agreeButton)).click();

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(goTrip)).sendKeys(fromTrip);
        goTrip.clear();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(goTrip)).click();

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(returnTrip)).sendKeys(toTrip);
        returnTrip.clear();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(lisbonButton)).click();

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(dateDivFrom)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(dateDivUntil)).click();

        sharedDriver.getDriver().findElements(By.className(("counter__button-wrapper--enabled"))).get(0).click();

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(searchButton)).click();
    }

    public void selectTheTrips() {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(cardWrapper));
        sharedDriver.getDriver().findElements(By.className(("card-wrapper"))).get(0).click();
        sharedDriver.getDriver().findElements(By.className(("card-wrapper"))).get(1).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(lugaggeButton)).click();
    }

    public void valuePrice() {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(continueButton)).click();
    }

    public void smallLugage() {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(radioLuggageButton)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(continueLuggageButton)).click();
    }

    public void loginLater() {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(laterLink)).click();
    }

    public void paxNames() {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(dropDownMenu)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(dropDownMr)).click();

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(namePaxOne)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(namePaxOne)).sendKeys("Paulo");
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(namePaxTwo)).sendKeys("Lemos");

        sharedDriver.getDriver().findElements(By.className(("dropdown__toggle"))).get(1).click();
        sharedDriver.getDriver().findElements(By.className(("dropdown-item__label"))).get(1).click();

        sharedDriver.getDriver().findElements(By.id(("form.passengers.ADT-1.name"))).get(0).sendKeys("Frederico");
        sharedDriver.getDriver().findElements(By.id(("form.passengers.ADT-1.surname"))).get(0).sendKeys("Caravalho");

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(nextContinueButton)).click();
    }

    public void noMoreLuggage() {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(noThanks)).click();
    }

    public void selectSeatsLater() {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(seatsLater)).click();
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(continueLuggageButton)).click();
    }

    public void everythingOk()  {

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(fastTrackText));

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(continueLuggageButton)).click();

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(airportParking));

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(continueLuggageButton)).click();

        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(finishedBooking));
    }
}