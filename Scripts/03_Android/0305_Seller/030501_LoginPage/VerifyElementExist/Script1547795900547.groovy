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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//Mobile.hideKeyboard()

username = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/txtBoxUsernameLogin'), GlobalVariable.Timeout)

Mobile.verifyEqual(username, GlobalVariable.labelusernameSellerLoginPage)

password = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPasswordSeller'), GlobalVariable.Timeout)

Mobile.verifyEqual(password, GlobalVariable.labelpasswordSellerLoginPage)

masuk = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/btnMasuk'), GlobalVariable.Timeout)

Mobile.verifyEqual(masuk, GlobalVariable.masukSellerLoginPage)

lupaPassword = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/hrefLupaPassword'), GlobalVariable.Timeout)

Mobile.verifyEqual(lupaPassword, GlobalVariable.lupaPasswordSellerLoginPage)

belumPunyaAkunBlanja = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/txtBelumPunyaAkunBlanja'), GlobalVariable.Timeout)

Mobile.verifyEqual(belumPunyaAkunBlanja, GlobalVariable.belumPunyaAkunSellerLoginPage)

daftarDisini = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/hrefDaftarDiSini'), GlobalVariable.Timeout)

Mobile.verifyEqual(daftarDisini, GlobalVariable.daftarDisiniSellerLoginPage)

