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

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxBeratProduk'), GlobalVariable.BeratProdukProdukDijual, 
    GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/cmbbxSatuanBerat'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/optionGr'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxPanjangProduk'), GlobalVariable.PanjangProdukProdukDijual, 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxLebarProduk'), GlobalVariable.LebarProdukProdukDijual, 
    GlobalVariable.Timeout)

Mobile.setText(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/txtBoxTinggiProduk'), GlobalVariable.TinggiProdukProdukDijual, 
    GlobalVariable.Timeout)

//double panjang = Double.parseDouble(GlobalVariable.PanjangProdukProdukDijual)
//
//double lebar = Double.parseDouble(GlobalVariable.LebarProdukProdukDijual)
//
//double tinggi = Double.parseDouble(GlobalVariable.TinggiProdukProdukDijual)
//
//double total = Double.parseDouble(GlobalVariable.TotalDimensiProdukDijual)
//
//System.out.print((('<<<<<<<<<<<<<<<<<<<<<<<<' + ((((panjang * lebar) * tinggi) / 6000) * 1)) + '=====') + total)
//
//assert ((((panjang * lebar) * tinggi) / 6000) * 1) == total

