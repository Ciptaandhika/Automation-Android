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

Mobile.scrollToText('Subtotal', FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD
Mobile.tap(findTestObject('0304_Trade/030402_OrderConfrim/btnLinkAjaNew'), 0)
=======
Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/SwitchLINKAJA (1)'), 0)
>>>>>>> 2f88d7faee810fbd6ac66bc27b4567ee6a52303c

Mobile.tap(findTestObject('0304_Trade/030403_MethodPayment/LinkAjaPembayaran/BtnOKSayamengerti'), 0)

Mobile.scrollToText(GlobalVariable.scrollToBtnBayarMethodPayment, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('03_Android_New APK/Trade/030403_MethodPayment/btnBayarNewBaru'), 0)

