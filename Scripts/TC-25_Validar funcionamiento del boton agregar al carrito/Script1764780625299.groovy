import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.falabella.com.pe/falabella-pe')

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/button_No, gracias-025-53c-f35'))

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/div_Men_MarketplaceHamburgerBtn-module_icon__r2oRR'))

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/svg'))

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/a_Apple'))

WebUI.click(findTestObject('Object Repository/Page_iPhone   falabella.com/div_Aceptar_testId-close-cookies-btn'))

WebUI.click(findTestObject('Object Repository/Page_iPhone   falabella.com/div_APPLEIPhone 13 128GBPor Falabella'))

WebUI.click(findTestObject('Object Repository/Page_iPhone 13 128GB APPLE  falabella.com/button_'))

WebUI.click(findTestObject('Object Repository/Page_iPhone 13 128GB APPLE  falabella.com/button_Agregar al Carro'))

WebUI.closeBrowser()

