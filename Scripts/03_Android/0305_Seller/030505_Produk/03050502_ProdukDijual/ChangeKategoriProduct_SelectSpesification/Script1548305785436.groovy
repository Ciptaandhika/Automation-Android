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

Mobile.scrollToText(GlobalVariable.ScrollToKategoriProdukDijual, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/menuKategori'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/menuKategoriFashion'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/subMenuFashion'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/subMenuFashion'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/subMenuFashion'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/subMenuFashion'), GlobalVariable.Timeout)

Mobile.scrollToText(GlobalVariable.ScrollToPengirimanProdukDijual, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/menuSpesifikasi'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/menuJenisPakaian'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/subMenuSpesifikasi'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/menuUkuran'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/subMenuSpesifikasi'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/menuBahan'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/subMenuSpesifikasi'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/btnSimpanSpesifikasi'), GlobalVariable.Timeout)

Mobile.scrollToText(GlobalVariable.ScrollToPengirimanProdukDijual, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('0305_Seller/030505_Produk/03050502_ProdukDijual/btnSimpanProduk'), GlobalVariable.Timeout)

