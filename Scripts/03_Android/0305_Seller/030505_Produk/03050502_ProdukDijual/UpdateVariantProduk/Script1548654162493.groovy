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

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxEditVariantHarga'), GlobalVariable.InputHargaProdukProdukDijual, 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxEditVairantstok'), GlobalVariable.InputStokProdukDijual, 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxEditVairantSKU'), GlobalVariable.InputSKUProdukDijual, 
    GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/cmbbxEditVariantWarna'), GlobalVariable.Timeout)

Mobile.checkElement(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/optionEditVariantWarnaPertama'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/cmbbxEditVariantUkuran'), GlobalVariable.Timeout)

Mobile.checkElement(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/optionEditVariantBahanPertama'), GlobalVariable.Timeout)

try {
	Mobile.hideKeyboard()
} catch(Exception e) {
	Mobile.delay(1)
}

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/btnSimpanDetailEditVariant'), GlobalVariable.Timeout)

