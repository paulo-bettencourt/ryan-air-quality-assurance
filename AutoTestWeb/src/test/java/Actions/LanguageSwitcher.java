package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LanguageSwitcher {
    private static WebDriver driver;
   // private static WebDriverWait wait;

    public LanguageSwitcher(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
      //  wait = new WebDriverWait(driver, 1000);
    }

    public void ChangeLang() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("dropdownMenuButton")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/a")).click();
        //   driver.findElement(By.className("branch-link")).click();
        Thread.sleep(3000);
    }

    public boolean isEN() throws InterruptedException {
        if (driver.findElement(By.id("dropdownMenuButton")).getText().equalsIgnoreCase("English (UK)")){
            System.out.println(driver.findElement(By.id("dropdownMenuButton")).getText());
            return true;
        }
        else {
            System.out.println(driver.findElement(By.id("dropdownMenuButton")).getText());
            return false;
        }
    }

}
