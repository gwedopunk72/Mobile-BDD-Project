import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ViewResep_MieCakalang {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Tap kategori mie")
	def Tap_kategori_mie() {
		Mobile.swipe(52, 768, 395, 768, FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(3)
		Mobile.tap(findTestObject('Kategori/Kategori_Mie'), 0)
	}

	@When("Tap mie cakalang")
	def Tap_mie_cakalang() {
		Mobile.tap(findTestObject('Resep/Resep_MieCakalang'), 0)
	}

	@And("Tap cara memasak3")
	def Tap_cara_memasak3() {
		Mobile.tap(findTestObject('Resep/SubMenu/SubMenu_CaraMemasak'), 0)
	}

	@Then("Kembali ke menu utama3")
	def Kembali_ke_menu_utama1() {
		Mobile.pressBack()
		Mobile.pressBack()
	}
}

