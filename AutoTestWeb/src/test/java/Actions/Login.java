package Actions;

import Steps.SharedDriver;
import config.ReadPropFile;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Login {
    private static WebDriver driver;
    private WebDriverWait wait;
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

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Acesso encontra-se bloqueado por ter excedido o número máximo de tentativas de login. Por favor contacte-nos através dos números ')]")
    WebElement toManyWrongTriesErrorMessage;


    public void openBrowser() throws IOException, InterruptedException {
        String url = null;
        url = ReadPropFile.ReadConfig("urlTest");
        driver.get(url);
        //change locale cookie to EN
        driver.manage().deleteCookieNamed("KEYCLOAK_LOCALE");
        Thread.sleep(2000);
        driver.manage().addCookie(new Cookie("KEYCLOAK_LOCALE",
                "en",
                "identity-test.sbados.com",
                "/auth/realms/sbapb/",
                new Date(2020, 12, 30)));

    }

    public void openBrowser_BEP() throws IOException, InterruptedException {
        String url = null;
        url = ReadPropFile.ReadConfig("urlTestBEP");
        driver.get(url);
        //change locale cookie to EN
        driver.manage().deleteCookieNamed("KEYCLOAK_LOCALE");
        Thread.sleep(2000);
        driver.manage().addCookie(new Cookie("KEYCLOAK_LOCALE",
                "en",
                "identity-test.sbados.com",
                "/auth/realms/sbapb/",
                new Date(2020, 12, 30)));

    }

    public void openBrowser_business() throws IOException, InterruptedException {
        String url = null;
        url = ReadPropFile.ReadConfig("urlTestBusiness");
        driver.get(url);
        //change locale cookie to EN
        driver.manage().deleteCookieNamed("KEYCLOAK_LOCALE");
        Thread.sleep(2000);
        driver.manage().addCookie(new Cookie("KEYCLOAK_LOCALE",
                "en",
                "identity-test.sbados.com",
                "/auth/realms/sbapb/",
                new Date(2020, 12, 30)));

    }

    public void FillIn(String user, String pass) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        txtBoxUsername.sendKeys(user);
        txtBoxPassword.sendKeys(pass);
        LoginButton.click();
    }

    public void seeToManyWrongTriesErrorMessage() {
        sharedDriver.getWait().until(ExpectedConditions.visibilityOf(toManyWrongTriesErrorMessage));
    }

}
