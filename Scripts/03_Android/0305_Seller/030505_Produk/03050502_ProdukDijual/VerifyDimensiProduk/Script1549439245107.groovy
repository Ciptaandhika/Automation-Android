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

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxPanjangProduk'), '', GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxLebarProduk'), '', GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxTinggiProduk'), '', GlobalVariable.Timeout)

try {
	Mobile.hideKeyboard()
} catch (Exception e) {
	Mobile.delay(1)
}

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/btnSimpanPengiriman'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/btnSimpanProduk'), GlobalVariable.Timeout)

WebUI.callTestCase(findTestCase('03_Android/0305_Seller/030505_Produk/03050502_ProdukDijual/ClickSelectedProductTest'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('03_Android/0305_Seller/030505_Produk/03050502_ProdukDijual/ClickMenuPengiriman'), [:], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxPanjangProduk'), GlobalVariable.DefaultPanjangProdukProdukDijual)

Mobile.verifyElementText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxLebarProduk'), GlobalVariable.DefaultLebarProdukProdukDijual)

Mobile.verifyElementText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxTinggiProduk'), GlobalVariable.DefaultTinggiProdukProdukDijual)

