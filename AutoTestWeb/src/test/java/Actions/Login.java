package Actions;

import Steps.SharedDriver;
import Config.ReadPropFile;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.IOException;
import java.util.Date;

public class Login {
    private static WebDriver driver;
    private SharedDriver sharedDriver;

    public Login(WebDriver driver, SharedDriver sharedDriver) {
        this.driver = driver;
        this.sharedDriver = sharedDriver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.ID, using = "username")
    WebElement txtBoxUsername;

    @FindBy(how = How.ID, using = "password")
    WebElement txtBoxPassword;

    @FindBy(how = How.ID, using = "kc-login")
    WebElement LoginButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), \"Credenciais Inválidas!\")] | //span[contains(text(), \"Invalid Credentials!\")]")
    WebElement LoginError;


    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Acesso encontra-se bloqueado por ter excedido o número máximo de tentativas de login. Por favor contacte-nos através dos números ')]")
    WebElement toManyWrongTriesErrorMessage;

    @FindBy(how = How.ID, using = "banner-url")
    WebElement retailBanner;

    @FindBy(linkText = "Click Here")
    WebElement forgotPasswordLink;

    @FindBy(id = "kc-page-title")
    WebElement forgotPasswordLabel;

    public void openBrowser() throws IOException, InterruptedException {
        String url = null;
        String domain = null;
        url = ReadPropFile.ReadConfig("url.retailPortal");
        domain = ReadPropFile.ReadConfig("url.identityDomain");
        driver.get(url);
        //change locale cookie to EN
        driver.manage().deleteCookieNamed("KEYCLOAK_LOCALE");
        Thread.sleep(2000);
        driver.manage().addCookie(new Cookie("KEYCLOAK_LOCALE",
                "en",
                domain,
                "/auth/realms/sbapb/",
                new Date(2020, 12, 30)));

    }

    public void openBrowser_BEP() throws IOException, InterruptedException {
        String url = null;
        String domain = null;
        domain = ReadPropFile.ReadConfig("url.identityDomain");
        url = ReadPropFile.ReadConfig("url.employeePortal");
        driver.get(url);
        //change locale cookie to EN
        driver.manage().deleteCookieNamed("KEYCLOAK_LOCALE");
        Thread.sleep(2000);
        driver.manage().addCookie(new Cookie("KEYCLOAK_LOCALE",
                "en",
                domain,
                "/auth/realms/sbapb/",
                new Date(2020, 12, 30)));

    }

    public void openBrowser_business() throws IOException, InterruptedException {
        String url = null;
        String domain = null;
        url = ReadPropFile.ReadConfig("url.businessPortal");
        domain = ReadPropFile.ReadConfig("url.identityDomain");
        driver.get(url);
        //change locale cookie to EN
        driver.manage().deleteCookieNamed("KEYCLOAK_LOCALE");
        Thread.sleep(2000);
        driver.manage().addCookie(new Cookie("KEYCLOAK_LOCALE",
                "en",
                domain,
                "/auth/realms/sbapb/",
                new Date(2020, 12, 30)));

    }

    public void FillIn(String user, String pass) {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(txtBoxUsername)).sendKeys(user);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(txtBoxPassword)).sendKeys(pass);
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LoginButton)).click();
    }

    public boolean findBanner() {
        return sharedDriver.getWait().until(ExpectedConditions.visibilityOf(retailBanner)).isDisplayed();
    }

    public void clickBanner(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(retailBanner)).click();
    }

    public void seeToManyWrongTriesErrorMessage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(toManyWrongTriesErrorMessage));
    }

    public boolean failedLogin() {
        return sharedDriver.getWait().until(ExpectedConditions.visibilityOf(LoginError)).isDisplayed();
    }

    public void ClickForgotPassword(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(forgotPasswordLink)).click();
    }

    public void OnForgotPasswordPage(){
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(forgotPasswordLabel));
    }
}
