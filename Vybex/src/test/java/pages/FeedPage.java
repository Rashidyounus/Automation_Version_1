package pages;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeedPage {
	   private AppiumDriver driver;

    private String FeedLabelXpath = "//android.widget.ImageView[@content-desc='Feed']";
    private String profileBtnXpath = "//android.widget.ImageView[@content-desc='Profile']";
     private String sideBtn="//android.widget.ScrollView/android.view.View[1]/android.widget.Button"; 
    private String logoutBtnXpath = "//android.widget.ImageView[@content-desc='Logout']"; 
    private String logoutNowBtn="//android.widget.Button[@content-desc='Logout Now']";
  
    // Constructor
    public FeedPage(AppiumDriver driver) {
        this.driver = driver;
    }

    // Verify Home screen
    public boolean isHomeVisible() {
        WebElement homeLabel = driver.findElement(AppiumBy.xpath(FeedLabelXpath));
        return homeLabel.isDisplayed();
    }

    public void openProfile() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement profileBtn = wait.until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath(profileBtnXpath))
        );
        profileBtn.click();
        System.out.println("profile tap........");

        try {
            Thread.sleep(3000); // 3 seconds delay after tapping Profile
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void openSidemenu () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement side_element = wait.until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath(sideBtn))
        );
        side_element.click();
        System.out.println("Side Menu tap........");

        try {
            Thread.sleep(3000); // 3 seconds delay after tapping Profile
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // Tap Logout (open modal)
    public void tapLogout() {
        WebElement logoutBtn = driver.findElement(AppiumBy.xpath(logoutBtnXpath));
        logoutBtn.click();
    }

    // Confirm Logout from Modal
    public void confirmLogout() {
        WebElement logoutNow = driver.findElement(AppiumBy.xpath(logoutNowBtn));
        logoutNow.click();
    }


    
    // Full Logout Flow
    public void logout() {
    	//openProfile();
       // openSidemenu();
        tapLogout();
        confirmLogout();
    }
}