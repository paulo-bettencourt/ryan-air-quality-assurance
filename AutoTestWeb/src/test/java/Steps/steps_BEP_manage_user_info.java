package Steps;

import Actions.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class steps_BEP_manage_user_info {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_BEP_manage_user_info(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
    }

    @Then("^i try to change the email and cancel$")
    public void iTryToChangeTheEmailAndCancel() throws InterruptedException {
        Thread.sleep(1000);
        //manage button
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[3]/div/button")).click();
        //cancel button
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[3]/bb-admin-user-details-email-form/form/div[3]/button")).click();

    }

    @And("^try to change the phone number and cancel$")
    public void tryToChangeThePhoneNumberAndCancel() throws InterruptedException {
        Thread.sleep(1000);
        //manage button
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[4]/div/button")).click();
        //cancel button
        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-admin-user-details-widget-extended/bb-admin-user-details-widget/div/div[4]/bb-admin-user-details-mobile-form/form/div[3]/button")).click();
    }


}
