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

'1.1 Login screen displayed'
Mobile.verifyElementExist(findTestObject('0305_Seller/030501_LoginPage/entireLoginPage'), GlobalVariable.Timeout)

'2.1 Password field displayed'
Mobile.verifyElementExist(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), GlobalVariable.Timeout)

'2.2 User can enter this field'
Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), 'test', GlobalVariable.Timeout)

Mobile.clearText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), GlobalVariable.Timeout)

'2.3 This field is mandatory'
Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/btnMasuk'), GlobalVariable.Timeout)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

message = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelMohonMasukkanPasswordAnda'), GlobalVariable.Timeout)

Mobile.verifyEqual(message, GlobalVariable.mohonMasukkanPasswordAndaSellerLoginPage)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), GlobalVariable.labelpasswordSellerLoginPage, 
    GlobalVariable.Timeout)

'3.1 Eye icon will be displayed'
Mobile.verifyElementExist(findTestObject('0305_Seller/030501_LoginPage/imgShowPassword'), GlobalVariable.Timeout)

'4.1 Password show'
Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/imgShowPassword'), GlobalVariable.Timeout)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'5.2 Password hide'
Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/imgShowPassword'), GlobalVariable.Timeout)

