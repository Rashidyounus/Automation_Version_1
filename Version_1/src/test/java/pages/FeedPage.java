package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FeedPage {
    private AppiumDriver driver;
    private WebDriverWait wait;

    // Locators
    private String feedLabelXpath = "//android.widget.ImageView[@content-desc='Feed']";
    private String profileBtnXpath = "//android.widget.ImageView[@content-desc='Profile']";
    private String sideBtnXpath = "//android.widget.ScrollView/android.view.View[1]/android.widget.Button"; 
    private String logoutBtnXpath = "//android.widget.ImageView[@content-desc='Logout']"; 
    private String logoutNowBtnXpath = "//android.widget.Button[@content-desc='Logout Now']";

    // Constructor
    public FeedPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Verify Home screen
    public boolean isHomeVisible() {
        try {
            WebElement homeLabel = wait.until(
                ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath(feedLabelXpath))
            );
            return homeLabel.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    // Open Profile
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
    // Open Side Menu
    public void openSideMenu() {
        WebElement sideMenu = wait.until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath(sideBtnXpath))
        );
        sideMenu.click();
        System.out.println("Side menu opened...");
    }

    // Tap Logout
    public void tapLogout() {
        WebElement logoutBtn = wait.until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath(logoutBtnXpath))
        );
        logoutBtn.click();
        System.out.println("Logout tapped...");
    }

    // Confirm Logout
    public void confirmLogout() {
        WebElement logoutNow = wait.until(
            ExpectedConditions.elementToBeClickable(AppiumBy.xpath(logoutNowBtnXpath))
        );
        logoutNow.click();
        System.out.println("Logout confirmed...");
    }

    // Full Logout Flow
    public void logout() {
        // openProfile();
         //openSideMenu();
        tapLogout();
        confirmLogout();
    }
}
