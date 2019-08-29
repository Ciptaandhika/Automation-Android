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

'2.1 Username/Email/No. Telepon field displayed'
username = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/txtBoxUsernameLogin'), GlobalVariable.Timeout)

Mobile.verifyEqual(username, GlobalVariable.labelusernameSellerLoginPage)

'2.2 Password field displayed'
password = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), GlobalVariable.Timeout)

Mobile.verifyEqual(password, GlobalVariable.labelpasswordSellerLoginPage)

'2.3 User can enter this field'
Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxUsernameLogin'), GlobalVariable.usernameSellerLoginPage, 
    GlobalVariable.Timeout)

Mobile.clearText(findTestObject('0305_Seller/030501_LoginPage/txtBoxUsernameLogin'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), GlobalVariable.passwordSellerLoginPage, 
    GlobalVariable.Timeout)

Mobile.clearText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), GlobalVariable.Timeout)

'2.4 This field is mandatory'
Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/btnMasuk'), GlobalVariable.Timeout)

'3.1 Username and password entered'
Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxUsernameLogin'), GlobalVariable.usernameSellerUncompleteLoginPage, 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), GlobalVariable.passwordSellerUncompleteLoginPage, 
    GlobalVariable.Timeout)

'4.1 Button can be tap'
Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/btnMasuk'), GlobalVariable.Timeout)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

