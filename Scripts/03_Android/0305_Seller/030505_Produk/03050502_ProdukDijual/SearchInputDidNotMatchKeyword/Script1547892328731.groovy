import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtboxCariNamaProduk'), GlobalVariable.Timeout)

Mobile.sendKeys(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtboxCariNamaProduk'), GlobalVariable.SunsilkHijabSearchProduct)

//def height = Mobile.getDeviceHeight()
//def width = Mobile.getDeviceWidth()
//def m = height-10
//def n = width-40
//
//Mobile.tapAtPosition(n, m, FailureHandling.OPTIONAL)
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()
driver.pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH)
Mobile.delay(2)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)
Mobile.delay(5)
driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/btnX'), GlobalVariable.Timeout)

