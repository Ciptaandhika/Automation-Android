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

double panjang = Double.parseDouble(GlobalVariable.DimensiProdukPanjangProdukTersimpan)

double lebar = Double.parseDouble(GlobalVariable.DimensiProdukLebarProdukTersimpan)

double tinggi = Double.parseDouble(GlobalVariable.DimensiProdukTinggiProdukTersimpan)

double total = Double.parseDouble(GlobalVariable.DimensiProdukTotalProdukTersimpan)

System.out.print((('<<<<<<<<<<<<<<<<<<<<<<<<' + ((((panjang * lebar) * tinggi) / 6000) * 1)) + '=====') + total)

def totalberat = ((((panjang * lebar) * tinggi) / 6000) * 1)

if (totalberat <= 1) {
	totalberat = 1
}

assert  totalberat == total
