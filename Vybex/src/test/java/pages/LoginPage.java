package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private AppiumDriver driver;

    // Locators
    private String usernameXpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]";
    private String passwordXpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]";
    private String loginBtnXpath = "//android.view.View[@content-desc=\"Log in\"]";
    private String errorMsg = "(//android.view.View[@content-desc=\"Enter your email\"])[2]";
    private String userNotExistXpath = "//android.widget.ImageView[@content-desc=\"User does not exist, Sign Up instead\"]";
    private String invalidPasswordXpath = "//android.widget.ImageView[@content-desc=\"Password must be at least 8 characters long\"]";

    // Constructor
    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        WebElement userField = driver.findElement(AppiumBy.xpath(usernameXpath));
        System.out.println("IsDisplayed: " + userField.isDisplayed());
        System.out.println("IsEnabled: " + userField.isEnabled());
        userField.click();
        userField.clear();
        userField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passField = driver.findElement(AppiumBy.xpath(passwordXpath));
        System.out.println("IsDisplayed: " + passField.isDisplayed());
        System.out.println("IsEnabled: " + passField.isEnabled());
        passField.click();
        passField.clear();
        passField.sendKeys(password);
    }

    public void tapLogin() {
        WebElement loginBtn = driver.findElement(AppiumBy.xpath(loginBtnXpath));
        loginBtn.click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        tapLogin();
    }



    public boolean isInvalidPasswordVisible() {
        try {
            WebElement errorMsg = driver.findElement(AppiumBy.xpath(invalidPasswordXpath));
            return errorMsg.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    

   
    // Method to check if user-not-exist error is visible
    public boolean isUserNotExistErrorVisible() {
        try {
            WebElement errorMsg = driver.findElement(AppiumBy.xpath(userNotExistXpath));
            return errorMsg.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
