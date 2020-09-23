package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LanguageSwitcher {
    private static WebDriver driver;

    public LanguageSwitcher(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ChangeLang() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("dropdownMenuButton")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.linkText("English (UK)")).click();
    }

    public boolean isEN() {
        if (driver.findElement(By.id("dropdownMenuButton")).getText().equalsIgnoreCase("English (UK)")) {
            return true;
        } else {
            return false;
        }
    }

}
