package tests;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    public static AppiumDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("0N14411V22107C72");   // 0N14411V22107C72
        options.setPlatformVersion("14");           
        options.setAppPackage("com.dignitestudios.vybex");
        options.setAppActivity("com.dignitestudios.vybex.MainActivity");
        options.setNewCommandTimeout(Duration.ofSeconds(60));
        options.setNoReset(true);


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        /*
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("0N14411V22107C72"); 
        options.setPlatformVersion("12");
        options.setCapability("appPackage", "com.dignitestudios.vybex");
        options.setCapability("appActivity", "com.dignitestudios.vybex.MainActivity");
        options.setNewCommandTimeout(Duration.ofSeconds(60));
*/
        
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


