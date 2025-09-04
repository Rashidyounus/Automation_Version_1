package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PermissionPage {
AppiumDriver driver;

private String allowBtnXpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]";
private String denyBtnXpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]";

public PermissionPage(AppiumDriver driver) {
    this.driver = driver;
}

public void clickAllow() {
    try {
        driver.findElement(By.xpath(allowBtnXpath)).click();
    } catch (Exception e) {
        System.out.println("Allow button not found, maybe popup already handled.");
    }
}
/*
public void clickDeny() {
    try {
        driver.findElement(By.xpath(denyBtnXpath)).click();
    } catch (Exception e) {
        System.out.println("Deny button not found, maybe popup already handled.");
    }
}
*/
}