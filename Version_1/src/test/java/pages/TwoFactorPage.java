package pages;

	import io.appium.java_client.AppiumBy;
	import io.appium.java_client.AppiumDriver;
	import org.openqa.selenium.WebElement;

	public class TwoFactorPage {
	    private AppiumDriver driver;

	    // Locators for OTP fields (yahan tumhare UI ke hisaab se update karo)
	    private String otpFieldXpath = "//android.widget.EditText"; 
	    private String verifyBtnXpath = "//android.view.View[@content-desc=\"Verify\"]";

	    // Constructor
	    public TwoFactorPage(AppiumDriver driver) {
	        this.driver = driver;
	    }

	    // Actions
	    // Action: Enter OTP + Tap Verify
	    public void verifyOTP(String otpCode) {
	        WebElement otpField = driver.findElement(AppiumBy.xpath(otpFieldXpath));

	        // Debug info print
	        System.out.println("IsDisplayed: " + otpField.isDisplayed());
	        System.out.println("IsEnabled: " + otpField.isEnabled());
	        System.out.println("Content-desc: " + otpField.getAttribute("content-desc"));

	        otpField.click();
	        otpField.clear();
	        otpField.sendKeys(otpCode);
	        System.out.println("OTP field text after input: " + otpField.getText());

	        // Tap on Verify button
	        WebElement verifyBtn = driver.findElement(AppiumBy.xpath(verifyBtnXpath));
	        verifyBtn.click();
	        System.out.println("Verify button clicked!");
	    }
	}
	