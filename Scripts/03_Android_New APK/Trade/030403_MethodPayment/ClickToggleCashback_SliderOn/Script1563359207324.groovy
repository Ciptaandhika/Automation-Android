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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.scrollToText('Cashback')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0304_Trade/030402_OrderConfrim/sliderCashback (1)'), 0)

//Mobile.tap(findTestObject('0304_Trade/030403_MethodPayment/txtBoxSaldoCashback'), GlobalVariable.Timeout)
//Mobile.setText(findTestObject('0304_Trade/030403_MethodPayment/txtBoxSaldoCashback'), GlobalVariable.SaldoTerpakaiCashbackMethodPayment, 
    //GlobalVariable.Timeout)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//subTotal = Mobile.getText(findTestObject('0304_Trade/030403_MethodPayment/labelSubtotal'), 0)
//
GlobalVariable.TotalPembayaranMethodPayment = Mobile.getText(findTestObject('0304_Trade/030403_MethodPayment/labelTotalPembayaranUseCashback'), 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0304_Trade/030402_OrderConfrim/txtAreaCashback'), GlobalVariable.TotalPembayaranMethodPayment, 2)

