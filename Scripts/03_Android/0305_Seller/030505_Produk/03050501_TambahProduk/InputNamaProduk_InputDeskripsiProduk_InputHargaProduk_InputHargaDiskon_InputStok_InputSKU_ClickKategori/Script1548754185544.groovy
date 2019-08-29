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

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxNamaProduk'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxNamaProduk'), GlobalVariable.InputNamaProdukTambahProduk, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxDeskripsiProduk'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxDeskripsiProduk'), GlobalVariable.InputDeskripsiProdukTambahProduk, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

WebUI.callTestCase(findTestCase('03_Android/0305_Seller/030505_Produk/03050501_TambahProduk/ClickMenuKategori'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('03_Android/0305_Seller/030505_Produk/03050501_TambahProduk/ChangeKategoriAndSubKategori_VerifySpesifikasiNotExist'), 
    [:], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText(GlobalVariable.ScrollToPengirimanProdukDijual, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxHargaProduk'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxHargaProduk'), GlobalVariable.InputHargaProdukTambahProduk, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxHargaDiskon'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxHargaDiskon'), GlobalVariable.InputHargaDiskonTambahProduk2, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxStok'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxStok'), GlobalVariable.InputStokTambahProduk, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxSku'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/txtBoxSku'), GlobalVariable.InputSKUTambahProduk, 
    GlobalVariable.Timeout)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050501_TambahProduk/menuPengiriman'), GlobalVariable.Timeout)

