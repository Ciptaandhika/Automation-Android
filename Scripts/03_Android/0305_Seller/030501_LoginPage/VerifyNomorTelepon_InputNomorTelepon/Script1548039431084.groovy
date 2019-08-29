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

txtBoxTelepon = Mobile.verifyElementExist(findTestObject('0305_Seller/030501_LoginPage/txtBoxNomorTeleponRegister'), GlobalVariable.Timeout)

assert txtBoxTelepon

labelPastikan = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelPastikanNomorTeleponAndaAktif'), GlobalVariable.Timeout)

System.out.print('<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<,,,' + labelPastikan)

assert labelPastikan == GlobalVariable.VerifiyPastikanLAbelLoginPage

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/txtBoxNomorTeleponRegister'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxNomorTeleponRegister'), GlobalVariable.NoTelpLoginPage, 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxNomorTeleponRegister'), GlobalVariable.NoTelpMore16LoginPage, 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxNomorTeleponRegister'), GlobalVariable.NoTelpLess8LoginPage, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.scrollToText('Dengan mendaftar', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/btnDaftar'), GlobalVariable.Timeout)

