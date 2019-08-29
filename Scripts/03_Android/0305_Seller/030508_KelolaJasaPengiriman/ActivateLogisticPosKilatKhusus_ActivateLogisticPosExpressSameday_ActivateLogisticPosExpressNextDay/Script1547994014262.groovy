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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.metraplasa.Scrolling.scrollToDown'()

Mobile.tap(findTestObject('0305_Seller/030508_KelolaJasaPengiriman/switchPosKilatBiasa'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030508_KelolaJasaPengiriman/switchPosKilatKhusus'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030508_KelolaJasaPengiriman/switchPosExpressSameday'), GlobalVariable.Timeout)

CustomKeywords.'com.metraplasa.Scrolling.scrollToDown'()

Mobile.tap(findTestObject('0305_Seller/030508_KelolaJasaPengiriman/btnSimpan'), GlobalVariable.Timeout)

