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

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/btnWaktu1'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/btnWaktu2'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelWaktuPemesanan'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelNoPesanan'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/cardProdukImage'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelProdukName'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelProdukPrice'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelQuantity'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/btnInfoBatal'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelBatalOtomatis'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelCountdownTime'), GlobalVariable.Timeout)

