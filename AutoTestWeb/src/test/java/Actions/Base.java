package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    WebDriver driver;
    WebDriverWait wait;

    public Base(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public WebElement waitForElement(WebDriver driver, WebElement element, int timeoutElement) {
        Integer timeoutLimitSeconds = timeoutElement;
        WebDriverWait wait = new WebDriverWait(driver, timeoutLimitSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

}
