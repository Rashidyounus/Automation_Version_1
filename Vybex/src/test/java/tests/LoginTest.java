package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelUtils;

public class LoginTest extends BaseClass {

    boolean waitBeforeRestart = false; // Flag banaya

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

        boolean loginFailed = userNotExist || invalidPassword;
        boolean loginSuccess = !loginFailed;

        if (expectedResult.equalsIgnoreCase("Fail")) {
            if (loginFailed) {
                System.out.println("✅ Test Passed → Login failed as expected for: " + username);
                waitBeforeRestart = false; // Fail case → no wait
            } else {
                System.out.println("⚠ Expected Fail, but login succeeded for: " + username);
                waitBeforeRestart = false;
            }
        } 
        else if (expectedResult.equalsIgnoreCase("Pass")) {
            if (loginSuccess) {
                System.out.println("✅ Test Passed → Login successful for: " + username);
                waitBeforeRestart = true; // Pass case → wait 5 sec
            } else {
                System.out.println("❌ Test Failed → Expected Pass but login failed for: " + username);
                waitBeforeRestart = false;
                org.testng.Assert.fail("Expected Pass, but got login error.");
            }
        } 
        else {
            System.out.println("⚠ Unknown ExpectedResult value in Excel: " + expectedResult);
            waitBeforeRestart = false;
        }
    }
/*
    @AfterMethod
    public void backToLoginScreen() throws InterruptedException {
        if (waitBeforeRestart) {
            System.out.println("⏳ Waiting 5 seconds before restarting app...");
            Thread.sleep(5000); // Sirf Pass case me wait karega
        }

        String appPackage = "com.dignitestudios.vybex";
        driver.terminateApp(appPackage);
        driver.activateApp(appPackage);
        System.out.println("🔄 App restarted → Back to Login screen");
    }
}
*/
    @AfterMethod public void backToLoginScreen() 
    { 
    	String appPackage = "com.dignitestudios.vybex";
    driver.terminateApp(appPackage); 
    driver.activateApp(appPackage);
    System.out.println("App restarted → Back to Login screen"); 
    } 
}