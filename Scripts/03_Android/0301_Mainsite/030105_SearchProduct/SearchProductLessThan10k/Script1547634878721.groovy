import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

Mobile.tap(findTestObject('0301_Mainsite/030105_SearchProduct/txtBoxCariNamaAtauKategoriProduk'), GlobalVariable.Timeout)

Mobile.sendKeys(findTestObject('0301_Mainsite/030105_SearchProduct/txtBoxCariNamaAtauKategoriProduk'), GlobalVariable.Produk6000)

Mobile.delay(5)

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

