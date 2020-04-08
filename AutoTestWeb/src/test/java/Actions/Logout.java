package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Logout {

    private static WebDriver driver;

    public Logout(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void findDropdownLogout() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"048c95c6-a194-4cc1-8168-6f180cd40924\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[1]/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-column-container/div/bb-column[2]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-context-menu-widget-extended/bb-user-context-menu-widget/bb-user-context-menu-container/div/bb-dropdown-menu-ui/div/button/div/div/bb-user-context-menu-info/div/div/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"048c95c6-a194-4cc1-8168-6f180cd40924\"]/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[1]/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-column-container/div/bb-column[2]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-context-menu-widget-extended/bb-user-context-menu-widget/bb-user-context-menu-container/div/bb-dropdown-menu-ui/div/div/div/bb-user-context-menu-dropdown/button[2]")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[1]/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-column-container/div/bb-column[2]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-context-menu-widget-extended/bb-user-context-menu-widget/bb-user-context-menu-container/div/bb-dropdown-menu-ui/div/div/div/bb-user-context-menu-dropdown/button[2]/div")).click();
   //     Thread.sleep(2000);
    }

}
