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

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxNamaPemilikTokoDSSI'), GlobalVariable.NamaPemilikTokoDSSILoginPage, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxPhoneNumberDSSI'), GlobalVariable.NoTelpLoginPage, GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxNamaTokoDSSI'), GlobalVariable.NamaTokoDSSILoginPage, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxDomainTokoDSSI'), GlobalVariable.UrlStoreDSSILoginPage, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

CustomKeywords.'com.metraplasa.Scrolling.scrollToDown'()

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxDeskripsiTokoDSSI'), GlobalVariable.StoreDescDSSILoginPage, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxAlamatTokoDSSI'), GlobalVariable.AlamatStoreDSSILoginPage, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/cmbbxProvinsiDSSI'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/cmbbxProvinsiBaliDSSI'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/cmbbxKotaKabupatesDSSI'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/cmbbxKotaKabupatenDenpasarDSSI'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/cmbbxKecamatanDSSI'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/cmbbxKecamatanDenpasarDSSI'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030501_LoginPage/txtBoxKodePosDSSI'), GlobalVariable.PostalCodeDSSILoginPage, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('0305_Seller/030501_LoginPage/btnLanjutkanDSSI'), GlobalVariable.Timeout)

