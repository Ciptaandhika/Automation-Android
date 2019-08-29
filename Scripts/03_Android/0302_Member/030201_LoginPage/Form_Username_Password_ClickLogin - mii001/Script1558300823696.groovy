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

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

try {
    Mobile.tap(findTestObject('0302_Member/030201_LoginPage/btnNoneOfTheAbove'), GlobalVariable.Timeout)
}
catch (Exception e) {
    e.printStackTrace()
} 

Mobile.setText(findTestObject('0302_Member/030201_LoginPage/txtBoxUsernameEmailNoTelepon'), 'mii003', GlobalVariable.Timeout)

Mobile.setText(findTestObject('0302_Member/030201_LoginPage/txtPassword'), '123qwe', GlobalVariable.Timeout)

Mobile.tap(findTestObject('0302_Member/030201_LoginPage/btnMasuk (2)'), GlobalVariable.Timeout)

