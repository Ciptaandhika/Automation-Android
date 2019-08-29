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

Mobile.verifyElementExist(findTestObject('0304_Trade/030404_ThankYouPage/labelPaymentNameBCAVA'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0304_Trade/030404_ThankYouPage/labelPaymentAmount'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0304_Trade/030404_ThankYouPage/labelPaymentNotes'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0304_Trade/030404_ThankYouPage/labelVirtualAccountNumber'), GlobalVariable.Timeout)

Mobile.scrollToText('ATM BCA', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0304_Trade/030404_ThankYouPage/parentLabelATMBCA'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0304_Trade/030404_ThankYouPage/labelPaymentStepDescription'), GlobalVariable.Timeout)

