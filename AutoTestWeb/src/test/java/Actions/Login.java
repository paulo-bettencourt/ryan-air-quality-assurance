package Actions;

import config.ReadPropFile;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {
    private static WebDriver driver;
    //  private static WebDriverWait wait;

    public Login(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        //  wait = new WebDriverWait(driver, 1000);
    }


    @FindBy(how = How.ID, using = "username")
    WebElement txtBoxUsername;

    @FindBy(how = How.ID, using = "password")
    WebElement txtBoxPassword;

    @FindBy(how = How.ID, using = "kc-login")
    WebElement LoginButton;

    public void openBrowser() throws InterruptedException, IOException {

        String url = null;
        url = ReadPropFile.ReadConfig("urlTest");
        driver.get(url);
        System.out.println(driver.getCurrentUrl()+"*******************************************");

    }

    public void FillIn(String user, String pass) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl()+"*******************************************");
        driver.findElement(By.id("username")).sendKeys(user);
//        txtBoxUsername.sendKeys(user);
//        txtBoxPassword.sendKeys(pass);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("kc-login")).click();

    }
}
