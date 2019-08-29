import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidKeyCode

Mobile.tap(findTestObject('0302_Member/030206_Notifikasi/iconSearch'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0302_Member/030206_Notifikasi/txtBoxCariPesan'), GlobalVariable.CariPesanNotifikasi, GlobalVariable.Timeout)

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

try {
    Mobile.verifyElementExist(findTestObject('0302_Member/030206_Notifikasi/labelTitleMesage'), GlobalVariable.Timeout)

    titleMessage = Mobile.getText(findTestObject('0302_Member/030206_Notifikasi/labelTitleMesage'), GlobalVariable.Timeout)
    assert titleMessage == GlobalVariable.CariPesanNotifikasi
}
catch (Exception e) {
    Mobile.verifyElementExist(findTestObject('0302_Member/030206_Notifikasi/labelPesanTidakDitemukan'), GlobalVariable.Timeout)
}

