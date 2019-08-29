import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode

Mobile.tap(findTestObject('0303_Product/030302_Store/txtBoxClickCariProdukPageStore'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0303_Product/030302_Store/txtBoxClickCariProdukPageStore'), GlobalVariable.OneChar, 
    0)
//
//def height = Mobile.getDeviceHeight()
//
//def width = Mobile.getDeviceWidth()
//
//def m = height - 10
//
//def n = width - 40
//
//Mobile.tapAtPosition(n, m, FailureHandling.OPTIONAL)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()
driver.pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH)
Mobile.delay(2)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)
Mobile.delay(5)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

