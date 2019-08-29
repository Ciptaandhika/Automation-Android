import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/Pembayaran_Baru/sliderDompetBlanja'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/Pembayaran_Baru/textboxSaldoDompetNew'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/Pembayaran_Baru/textboxSaldoDompetNew'), '500', 
    GlobalVariable.Timeout)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/Pembayaran_Baru/textboxPasswordDompet'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/Pembayaran_Baru/textboxPasswordDompet'), GlobalVariable.passwordDompetBlanjaMethodPayment, 
    GlobalVariable.Timeout)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH)

Mobile.delay(2)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.delay(5)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0304_Trade/030403_MethodPayment/switchCashback'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/txbSaldoCashBack'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/txbSaldoCashBack'), '500', GlobalVariable.Timeout)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH)

Mobile.delay(2)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.delay(5)

driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/switchLinkAja'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/btnOKLinkAja'), 0)

WebUI.delay(3)

Mobile.scrollToText(GlobalVariable.scrollToBtnBayarMethodPayment, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/btnBAYAR1'), 0)

WebUI.delay(3)

