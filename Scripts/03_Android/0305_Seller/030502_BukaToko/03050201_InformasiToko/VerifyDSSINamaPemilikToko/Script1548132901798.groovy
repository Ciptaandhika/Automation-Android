import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.android.AndroidDriver as AndroidDriver

/*
 * don't forget that it's "natural scroll" where
 * fromY is the point where you press the and toY where you release it
 */

private void scroll(int fromX, int fromY, int toX, int toY) {
	AndroidDriver<?> driver = MobileDriverFactory.getDriver()
	TouchAction touchAction = new TouchAction(driver);
	touchAction.longPress(fromX, fromY).moveTo(toX, toY).release().perform();
}

private void scrollToDown(){
	//if pressX was zero it didn't work for me
	int pressX = Mobile.getDeviceWidth() / 2;
	// 4/5 of the screen as the bottom finger-press point
	int bottomY = Mobile.getDeviceHeight() * 4/5;
	// just non zero point, as it didn't scroll to zero normally
	int topY = Mobile.getDeviceHeight() / 8;
	//scroll with TouchAction by itself
	scroll(pressX, bottomY, pressX, topY);
}

Mobile.verifyElementExist(findTestObject('0305_Seller/030501_LoginPage/txtBoxNamaPemilikTokoDSSI'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxNamaPemilikTokoDSSI'), GlobalVariable.NamaPemilikTokoDSSILoginPage, 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxNamaPemilikTokoDSSI'), '', GlobalVariable.Timeout)

Mobile.hideKeyboard()

scrollToDown()

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/btnLanjutkanDSSI'), GlobalVariable.Timeout)

