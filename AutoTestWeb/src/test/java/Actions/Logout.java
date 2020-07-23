package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Logout {

    private static WebDriver driver;

    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void findDropdownLogout() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui/div/button/div/div/div/bb-icon-ui")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"context-menu-dropdown\"]/bb-dropdown-menu-ui/div/div/div/bb-user-context-menu-dropdown/button[2]")).click();

    }

}
