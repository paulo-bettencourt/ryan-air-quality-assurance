package Actions;

import config.ReadPropFile;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {
    private static WebDriver driver;
    private WebDriverWait wait;

    public Login(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        // wait = new WebDriverWait(driver, 1000);
    }


    @FindBy(how = How.ID, using = "username")
    WebElement txtBoxUsername;

    @FindBy(how = How.ID, using = "password")
    WebElement txtBoxPassword;

    @FindBy(how = How.ID, using = "kc-login")
    WebElement LoginButton;

    public void openBrowser() throws IOException {
        String url = null;
        url = ReadPropFile.ReadConfig("urlTest");
        driver.get(url);
    }

    public void FillIn(String user, String pass) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        txtBoxUsername.sendKeys(user);
        txtBoxPassword.sendKeys(pass);
        LoginButton.click();
    }
}
