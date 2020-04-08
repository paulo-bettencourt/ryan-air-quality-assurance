package Steps;

import Actions.LanguageSwitcher;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);        // Thread.sleep(8000);
        Thread.sleep(3000);
        driver.findElement(By.id("banner-url")).click();
        // driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/sba-sba-custom-content-widget/div/a/bb-content/span/img")).click();
        Thread.sleep(3000);//  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// Thread.sleep(3000);
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
            System.exit(1);
        }
    }

}
