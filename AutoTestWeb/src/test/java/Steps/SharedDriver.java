package Steps;

import config.ReadPropFile;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
                options.addArguments("--headless");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-gpu");
                options.addArguments("--window-size=1366,768");


                System.setProperty("webdriver.chrome.driver", ReadPropFile.ReadConfig("chrome.driver"));
                driver = new ChromeDriver(options);
                // System.out.println("driver:"  + driver);


            } else if (browser.equalsIgnoreCase("chrome") && headLess.equalsIgnoreCase("false")) {

                System.setProperty("webdriver.chrome.driver", ReadPropFile.ReadConfig("chrome.driver"));
                driver = new ChromeDriver();

//            } else if (browser.equalsIgnoreCase("firefox")) {
//
//                System.setProperty("webdriver.gecko.driver", ReadPropFile.ReadConfig("firefox.driver"));
//                driver = new FirefoxDriver();

            }/* else if (browser.equalsIgnoreCase("iexplorer")) {

                System.setProperty("webdriver.ie.driver", ReadPropertyFile.readConfigProperties("iexplorer.driver"));
                driver = new InternetExplorerDriver();
            }*/

            initialized = true;
            wait = new WebDriverWait(driver, 60);
            driver.manage().window().maximize();
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
        // Thread.sleep(5000);
        initialized = false;
        driver.quit();
    }


}
