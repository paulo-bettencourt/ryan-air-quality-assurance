package Actions;

import config.ReadPropFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Identity {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public Identity(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        //wait = new WebDriverWait(driver, 1000);
    }


    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div[2]/div[1]/div/div/h3/a/text()")
    WebElement adminButton;

    @FindBy(how = How.ID, using = "username")
    WebElement userInput;

    @FindBy(how = How.ID, using = "password")
    WebElement passInput;

    @FindBy(how = How.ID, using = "kc-login")
    WebElement loginButton;


    public void openIdentity() throws IOException, InterruptedException {

        String url = ReadPropFile.ReadConfig("urlTest");
        System.out.println(url);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        adminButton.click();
    }

    public void LoginIdentity() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        userInput.sendKeys("admin");
        passInput.sendKeys("admin");
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}
