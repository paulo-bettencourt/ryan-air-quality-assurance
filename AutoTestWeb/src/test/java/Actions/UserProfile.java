package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class UserProfile {

    WebDriver driver;

    public UserProfile(WebDriver driver) {
        this.driver = driver;

    }

    public void clickonUS() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"bb-page-layout-sidebar\"]/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul/li[2]/nav/ul/li/a/i")).click();

    }
}
