package tests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ch.qos.logback.core.util.Duration;
import io.appium.java_client.AppiumBy;
import pages.FeedPage;
import pages.LoginPage;
import pages.PermissionPage;
import pages.TwoFactorPage;


public class LoginTest extends BaseClass {
	

   /* @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("mark@yopmail.com", "Test@123");
        System.out.println("---Login test executed---");
    }
    */
	
	
	@Test(priority = 1)
	public void testValidLogin() {

 // Permission allow 
		  // Permission allow
        // PermissionPage permission = new PermissionPage(driver);
        // permission.clickAllow();

        // Login page actions
        LoginPage login = new LoginPage(driver);
        login.login("mark@yopmail.com", "Test@123");

        // Two-factor 
        TwoFactorPage twoFactor = new TwoFactorPage(driver);
        String otpCode = "00000";   
        twoFactor.verifyOTP(otpCode);

        // Verify home page visible
        FeedPage feed = new FeedPage(driver);
        boolean homeVisible = feed.isHomeVisible();
        feed.openProfile();
        feed.openSideMenu();
        feed.logout();

        Assert.assertTrue(homeVisible, "Login failed, Feed page not visible!");
    }
		
	} 
