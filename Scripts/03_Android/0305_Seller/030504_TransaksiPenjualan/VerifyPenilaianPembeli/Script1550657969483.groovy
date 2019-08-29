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

Mobile.scrollToText('Penilaian Pembeli', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.checkElement(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelPenilaianPembeli'), GlobalVariable.Timeout)

try {
    Mobile.checkElement(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelBelumDinilaiOlehPembeli'), GlobalVariable.Timeout)
}
catch (Exception e) {
    e.printStackTrace()
} 

try {
    Mobile.checkElement(findTestObject('0305_Seller/030504_TransaksiPenjualan/layoutRatingProduk'), GlobalVariable.Timeout)
}
catch (Exception e) {
    e.printStackTrace()
} 

try {
    Mobile.checkElement(findTestObject('0305_Seller/030504_TransaksiPenjualan/layoutRatingPelayanan'), GlobalVariable.Timeout)
}
catch (Exception e) {
    e.printStackTrace()
} 

try {
    Mobile.checkElement(findTestObject('0305_Seller/030504_TransaksiPenjualan/layoutRatingPengiriman'), GlobalVariable.Timeout)
}
catch (Exception e) {
    e.printStackTrace()
} 

try {
    Mobile.checkElement(findTestObject('0305_Seller/030504_TransaksiPenjualan/labelKomentarRating'), GlobalVariable.Timeout)
}
catch (Exception e) {
    e.printStackTrace()
} 

