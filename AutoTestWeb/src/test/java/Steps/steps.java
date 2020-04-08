package Steps;

import Actions.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class steps {

    WebDriver driver;
    Login login;
    Logout logout;
    LanguageSwitcher languageSwitcher;
    SharedDriver sharedDriver;
  //  Base base;
  //  Identity identity;

    public steps(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
    }


//    @Given("^i have created a new user$")
//    public void iHaveCreatedANewUser() throws IOException, InterruptedException {
//        identity = new Identity(driver);
//        identity.openIdentity();
//        identity.LoginIdentity();
//    }

    // SCENARIO 1**************************************************
//
//    @Then("^i want to login with \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void i_want_to_login_with_and(String user, String pass) throws Throwable {
//
//        login = new Login(driver);
//        //login.openBrowser();
//        login.FillIn(user, pass);
//        //Thread.sleep(5000);
//    }
//
//    @Given("^i am in login page$")
//    public void i_am_in_login_page() throws Throwable {
//        driver = sharedDriver.getDriver();
//        login = new Login(driver);
//        login.openBrowser();
//    }
//
//    @And("^i logged in successfully$")
//    public void iLoggedInSuccessfully() throws InterruptedException {
//        Thread.sleep(10000);
//        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[1]/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-column-container/div/bb-column[2]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-context-menu-widget-extended/bb-user-context-menu-widget/bb-user-context-menu-container/div/bb-dropdown-menu-ui/div/button/div/div/div/bb-icon-ui"));
//
//        //    driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[1]/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-column-container/div/bb-column[2]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-user-context-menu-widget-extended/bb-user-context-menu-widget/bb-user-context-menu-container/div/bb-dropdown-menu-ui/div/button/div/div"));
//        //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Thread.sleep(3000);
//
//    }

//    // SCENARIO ***DO LOGOUT***
//    @And("^want to logout$")
//    public void want_to_logout() throws Throwable {
//        logout = new Logout(driver);
//        logout.findDropdownLogout();
//    }
//
//    @And("^logout successfully$")
//    public void logoutSuccessfully() {
//
//        driver.findElement(By.id("username")).click();
//    }


    // SCENARIO ***CHANGE LANGUAGE***
//    @Then("^want to change language$")
//    public void want_to_change_language() throws Throwable {
//        login = new Login(driver);
//        login.openBrowser();
//        languageSwitcher = new LanguageSwitcher(driver);
//        languageSwitcher.ChangeLang();
//
//    }
//
//    @And("^change language successfully$")
//    public void changeLanguageSuccessfully() throws InterruptedException {
//        boolean x = languageSwitcher.isEN();
//        if (x == false) {
//            logout.findDropdownLogout();
//        }
//    }

    // SCENARIO ***FIND BRANCHES***
//    @Then("^want to find nearest branches$")
////    public void want_to_find_nearest_branches() throws Throwable {
////        Thread.sleep(5000);
////        driver.findElement(By.className("branch-link")).click();
////    }
////
////    @And("^found branches successfully$")
////    public void foundBranchesSuccessfully() throws InterruptedException {
////        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);   //Thread.sleep(3000);
////        boolean found = false;
////        for (String handle : driver.getWindowHandles()) {
////            driver.switchTo().window(handle);
////            if (driver.getCurrentUrl().contains("https://www.google.com/maps/search/standard+bank+angola")) {
////                found = true;
////            }
////        }
////        if (!found) {
////            System.exit(1);
////        }
////    }

    // SCENARIO ***MARKETING BANNER***
//    @And("^click on banner$")
//    public void clickOnBanner() throws InterruptedException {
//        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);        // Thread.sleep(8000);
//        Thread.sleep(3000);
//        driver.findElement(By.id("banner-url")).click();
//        // driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/sba-sba-custom-content-widget/div/a/bb-content/span/img")).click();
//        Thread.sleep(3000);//  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// Thread.sleep(3000);
//    }
//
//
//    @And("^redirect successfully$")
//    public void redirectSuccessfully() {
//        boolean found = false;
//        for (String handle : driver.getWindowHandles()) {
//            driver.switchTo().window(handle);
//            if (driver.getCurrentUrl().contains("http://uazi.net/heroisdeazul/")) {
//                found = true;
//            }
//        }
//        if (!found) {
//            System.exit(1);
//        }
//    }

//    @Then("^Dashboard is loaded$")
//    public void dashboardIsLoaded() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[1]/div[2]"));
//        // driver.findElement(By.className("account-name"));
//
//    }


//
//    @Then("^select current account from dashboard$")
//    public void selectCurrentAccountFromDashboard() {
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[1]/div[2]/div/button/bb-product-kind/div")).click();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//    }
//
//    @Then("^select loan account from account selector$")
//    public void selectLoanAccountFromAccountSelector() throws InterruptedException {
//        Thread.sleep(5000);//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        //  WebElement as = driver.findElement(By.className("bb-stack bb-stack--wrap product-item-content"));
//        WebElement as = driver.findElement(By.className("ng-arrow-wrapper"));
//        as.click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-selector-extended-widget/bb-product-summary-account-selector-widget/bb-account-selector-ui/ng-select/ng-dropdown-panel/div[2]/div[2]/div[3]/bb-product-item-basic-account-ui/div/div/div[1]/div/div[1]/bb-ellipsis-ui/div")).click();
//        //        Select s = new Select(as);
////        s.selectByVisibleText("Loan Account");
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//    }
//
//    @And("^click account details tab$")
//    public void clickAccountDetailsTab() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[1]/div[2]/a")).click();
//        //  Thread.sleep(2000);// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//    }
//
//    @And("^account details are loaded$")
//    public void accountDetailsAreLoaded() throws InterruptedException {
//        Thread.sleep(6000);
//        WebElement detail = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/sba-sba-retail-app/bb-root/bb-area/bb-chrome/bb-layout-container/bb-layout-rendering-container-ui/bb-page-layout-theme1-ui/div/div[2]/div/div/div/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-details-widget-extended/bb-product-summary-details-widget/bb-product-summary-details/bb-loan-details/div/div[1]/div[1]/div[1]/div"));
//        System.out.println(detail.getText());
//        if (!detail.getText().contains("Basic Loan Account")) {
//            System.exit(1);
//        }
//    }
}
