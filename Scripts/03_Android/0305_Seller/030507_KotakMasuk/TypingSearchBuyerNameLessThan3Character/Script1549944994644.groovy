import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode
import internal.GlobalVariable as GlobalVariable

Mobile.tap(findTestObject('0305_Seller/030507_KotakMasuk/txtBoxCariPesan'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030507_KotakMasuk/txtBoxCariPesan'), GlobalVariable.TypeSearchLess3, GlobalVariable.Timeout)

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

