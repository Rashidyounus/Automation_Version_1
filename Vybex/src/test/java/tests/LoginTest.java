package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelUtils;

public class LoginTest extends BaseClass {

    // DataProvider: Excel se data load karega
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        String excelPath = "src/test/resources/loginData.xlsx";
        String sheetName = "login_sheet";
        return ExcelUtils.getSheetData(excelPath, sheetName);
    }
    
    
    @Test(dataProvider = "loginData")
    public void testLoginFromExcel(String username, String password, String expectedResult) {
        LoginPage login = new LoginPage(driver);
        login.login(username, password);

        boolean userNotExist = login.isUserNotExistErrorVisible();
        boolean invalidPassword = login.isInvalidPasswordVisible();

        if (expectedResult.equalsIgnoreCase("Fail")) {
            if (userNotExist || invalidPassword) {
                System.out.println("Test Passed → Login failed as expected for: " + username);
            } else {
                System.out.println(" Test Failed → Expected Fail but login went ahead: " + username);
                org.testng.Assert.fail("Expected Fail, but user seems valid.");
            }
        } else if (expectedResult.equalsIgnoreCase("Pass")) {
            if (!userNotExist && !invalidPassword) {
                System.out.println(" Test Passed → Login successful for: " + username);
            } else {
                System.out.println("Test Failed → Expected Pass but got login error: " + username);
                org.testng.Assert.fail("Expected Pass, but login failed.");
            }
        } else {
            System.out.println(" Unknown ExpectedResult value in Excel: " + expectedResult);
        }
        
      
    }
    
    @AfterMethod
    public void backToLoginScreen() {
        String appPackage = "com.dignitestudios.vybex";
        driver.terminateApp(appPackage);
        driver.activateApp(appPackage);
        System.out.println("App restarted → Back to Login screen");
    }

/*
    @Test(dataProvider = "loginData")
    public void testLoginFromExcel(String username, String password, String expectedResult) {
        LoginPage login = new LoginPage(driver);
        login.login(username, password);

        boolean userNotExist = login.isUserNotExistErrorVisible();

        if (expectedResult.equalsIgnoreCase("Fail")) {
            if (userNotExist) {
                System.out.println(" Test Passed → User does not exist as expected: " + username);
            } else {
                System.out.println("❌ Test Failed → Expected Fail but login went ahead: " + username);
                org.testng.Assert.fail("Expected Fail, but user seems valid.");
            }
        } else if (expectedResult.equalsIgnoreCase("Pass")) {
            if (!userNotExist) {
                System.out.println(" Test Passed → Login successful for: " + username);
            } else {
                System.out.println(" Test Failed → Expected Pass but got user-not-exist error: " + username);
                org.testng.Assert.fail("Expected Pass, but user does not exist.");
            }
        } else {
            System.out.println("⚠ Unknown ExpectedResult value in Excel: " + expectedResult);
        }
    }

    // Har test ke baad wapas Login screen
    @AfterMethod
    public void backToLoginScreen() {
        String appPackage = "com.dignitestudios.vybex";
        driver.terminateApp(appPackage);
        driver.activateApp(appPackage);
        System.out.println("🔄 App restarted → Back to Login screen");
    }

*/

/*
@Test(dataProvider = "loginData")
public void testLoginFromExcel(String username, String password, String expectedResult) {
    LoginPage login = new LoginPage(driver);
    login.login(username, password);

    // Check if "User does not exist" error is visible
    if (login.isUserNotExistErrorVisible()) {
        System.out.println(" User does not exist → " + username);
    } else {
        System.out.println(" Login attempted with: " + username + " / " + password);
    }
}


    
    @AfterMethod
    public void backToLoginScreen() {
        String appPackage = "com.dignitestudios.vybex";
        driver.terminateApp(appPackage);
        driver.activateApp(appPackage);
        System.out.println("App restarted → Back to Login screen");
    }
    */
}

