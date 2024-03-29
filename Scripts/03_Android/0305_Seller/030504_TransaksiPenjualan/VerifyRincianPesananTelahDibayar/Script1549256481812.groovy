import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.scrollToText('Rincian Pesanan', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelNamaProdukTelahDibayar'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelHargaProdukTelahDibayar'), GlobalVariable.Timeout)

Mobile.verifyElementExist(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelKuantitiProdukTelahDibayar'), GlobalVariable.Timeout)

