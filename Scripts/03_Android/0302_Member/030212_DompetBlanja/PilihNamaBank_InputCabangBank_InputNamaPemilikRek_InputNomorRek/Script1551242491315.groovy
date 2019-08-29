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

try {
	Mobile.hideKeyboard()
} catch (Exception e) {
	e.printStackTrace()
}

Mobile.tap(findTestObject('0302_Member/030212_DompetBlanja/cmBxPilihNamaBank'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0302_Member/030212_DompetBlanja/checkedCmBxNamaBank'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('0302_Member/030212_DompetBlanja/txtboxMasukkanCabangBank'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0302_Member/030212_DompetBlanja/txtboxMasukkanCabangBank'), GlobalVariable.CabangBankDompetBlanja, 
    GlobalVariable.Timeout)

try {
	Mobile.hideKeyboard()
} catch (Exception e) {
	e.printStackTrace()
}

Mobile.tap(findTestObject('0302_Member/030212_DompetBlanja/tctboxMasukkanNamaPemilikRekening'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0302_Member/030212_DompetBlanja/tctboxMasukkanNamaPemilikRekening'), GlobalVariable.NamaPemilikRekDompetBlanja, 
    GlobalVariable.Timeout)

try {
	Mobile.hideKeyboard()
} catch (Exception e) {
	e.printStackTrace()
}

Mobile.tap(findTestObject('0302_Member/030212_DompetBlanja/txtboxMasukkanNomorRekening'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('0302_Member/030212_DompetBlanja/txtboxMasukkanNomorRekening'), GlobalVariable.NoRekDompetBlanja, 
    GlobalVariable.Timeout)

Mobile.tap(findTestObject('0302_Member/030212_DompetBlanja/btnSimpan (1)'), GlobalVariable.Timeout)

