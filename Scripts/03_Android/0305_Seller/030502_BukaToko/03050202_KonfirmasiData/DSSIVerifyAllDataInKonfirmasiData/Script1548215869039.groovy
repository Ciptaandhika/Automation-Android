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

namaPemilikToko = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSINamaPemilikToko'), GlobalVariable.Timeout)

assert namaPemilikToko == GlobalVariable.NamaPemilikTokoDSSILoginPage

nomorTelp = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSINomorTelp'), GlobalVariable.Timeout)

assert nomorTelp == GlobalVariable.NoTelpLoginPage

namaToko = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSINamaToko'), GlobalVariable.Timeout)

assert namaToko == GlobalVariable.NamaTokoDSSILoginPage

urlStore = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSIUrlStore'), GlobalVariable.Timeout)

assert urlStore == (GlobalVariable.BaseUrlDSSILoginPage +  GlobalVariable.UrlStoreDSSILoginPage)

descToko = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSIDeskripsiToko'), GlobalVariable.Timeout)

assert descToko == GlobalVariable.StoreDescDSSILoginPage

CustomKeywords.'com.metraplasa.Scrolling.scrollToDown'()

alamatToko = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSIAlamatToko'), GlobalVariable.Timeout)

assert alamatToko == GlobalVariable.AlamatStoreDSSILoginPage

provinsi = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSIProvinsi'), GlobalVariable.Timeout)

assert provinsi == GlobalVariable.ProvinsiDSSILoginPage

city = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSICity'), GlobalVariable.Timeout)

assert city == GlobalVariable.KotaDSSILoginPage

kecamatan = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSIKecamatan'), GlobalVariable.Timeout)

assert kecamatan == GlobalVariable.KecamatanDSSILoginPage

kodepos = Mobile.getText(findTestObject('0305_Seller/030501_LoginPage/labelVerifyDSSIKodePos'), GlobalVariable.Timeout)

assert kodepos == GlobalVariable.PostalCodeDSSILoginPage

Mobile.verifyElementExist(findTestObject('0305_Seller/030501_LoginPage/cbDSSIPersetujuan'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030501_LoginPage/btnSimpanDSSI'), GlobalVariable.Timeout)

