package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserProfile {

    WebDriver driver;

    public UserProfile(WebDriver driver){
        this.driver = driver;

    }


   // @FindBy(how = How.XPATH, using = "//*[@id=\"bb-page-layout-sidebar\"]/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul/li[2]/nav/ul/li/a/span")
    //    //WebElement UserProfile;

    public void clickonUS() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-navigation-link-widget-ang/nav/ul/li[2]/nav/ul/li/a")).click();
        Thread.sleep(7000);
    }
}
