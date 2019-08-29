import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling

import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050503_ProdukDisimpan/btnIconSearch'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050503_ProdukDisimpan/txtBoxCariNamaProduk'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050503_ProdukDisimpan/txtBoxCariNamaProduk'), GlobalVariable.DettolSearchProduct, 
    GlobalVariable.Timeout)

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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050503_ProdukDisimpan/btnX'), GlobalVariable.Timeout)

