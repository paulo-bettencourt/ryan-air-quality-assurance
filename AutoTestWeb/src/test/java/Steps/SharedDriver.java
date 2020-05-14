package Steps;

import config.ReadPropFile;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedDriver {

    private static boolean initialized = false;

    private WebDriver driver;
    private static WebDriverWait wait;

    @Before
    public void setUp() throws Exception {

        if (!initialized) {

            String browser = ReadPropFile.ReadConfig("default.browser");
            String headLess = ReadPropFile.ReadConfig("headless.active");

            if (browser.equalsIgnoreCase("chrome") && headLess.equalsIgnoreCase("true")) {

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--no-sandbox");
                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
               // options.setBinary("/usr/bin/google-chrome");
                System.setProperty("webdriver.chrome.driver", ReadPropFile.ReadConfig("chrome.driver"));
                driver = new ChromeDriver(options);

            } else if (browser.equalsIgnoreCase("chrome") && headLess.equalsIgnoreCase("false")) {

                System.setProperty("webdriver.chrome.driver", ReadPropFile.ReadConfig("chrome.driver"));
                driver = new ChromeDriver();
                driver.manage().window().maximize();

            }

            initialized = true;
            wait = new WebDriverWait(driver, 60);
        }
    }

    @Before
    public static WebDriverWait getWait() {
        return wait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    @After
    public void afterScenario(Scenario scenario) {
        initialized = false;
        driver.quit();
    }


}
