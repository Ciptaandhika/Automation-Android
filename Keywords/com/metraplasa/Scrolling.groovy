package com.metraplasa

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidDriver

public class Scrolling {

	@Keyword
	private void scrollToDown(){
		//if pressX was zero it didn't work for me
		int pressX = Mobile.getDeviceWidth() / 2;
		// 4/5 of the screen as the bottom finger-press point
		int bottomY = Mobile.getDeviceHeight() * 4/5;
		// just non zero point, as it didn't scroll to zero normally
		int topY = Mobile.getDeviceHeight() / 8;
		//scroll with TouchAction by itself

		AndroidDriver<?> driver = MobileDriverFactory.getDriver()
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(pressX, bottomY).moveTo(pressX, topY).release().perform();
	}


	private void scrollToUp(){
		//if pressX was zero it didn't work for me
		int pressX = Mobile.getDeviceWidth() / 2;
		// 4/5 of the screen as the bottom finger-press point
		int bottomY = Mobile.getDeviceHeight() * 4/5;
		// just non zero point, as it didn't scroll to zero normally
		int topY = Mobile.getDeviceHeight() / 8;
		//scroll with TouchAction by itself

		AndroidDriver<?> driver = MobileDriverFactory.getDriver()
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(pressX, topY).moveTo(pressX, bottomY).release().perform();
	}
}
