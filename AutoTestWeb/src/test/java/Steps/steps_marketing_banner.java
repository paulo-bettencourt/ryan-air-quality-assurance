package Steps;

import Actions.LanguageSwitcher;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class steps_marketing_banner {
    WebDriver driver;
    LanguageSwitcher languageSwitcher;
    SharedDriver sharedDriver;

    public steps_marketing_banner(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        languageSwitcher = new LanguageSwitcher(driver);

    }

    @And("^click on banner$")
    public void clickOnBanner() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("banner-url")).click();
    }


    @And("^redirect successfully$")
    public void redirectSuccessfully() {
        boolean found = false;
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().contains("http://uazi.net/heroisdeazul/")) {
                found = true;
            }
        }
        if (!found) {
            driver.findElement(By.id("123"));
        }
    }

}
