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

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/button_No, gracias-025-b68-cce'))

WebUI.setText(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/input_Search Bar_testId-SearchBar-Input'), 
    'celular')

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/a_celulares baratos'))

WebUI.click(findTestObject('Object Repository/Page_falabella.com/div_Aceptar_testId-close-cookies-btn'))

WebUI.click(findTestObject('Object Repository/Page_falabella.com/div_SAMSUNGGalaxy A56 5g 256gb BlackPor Fal_fe2df3'))

WebUI.click(findTestObject('Object Repository/Page_Galaxy A56 5g 256gb Black SAMSUNG  fal_0cd974/button_Agregar al Carro'))

WebUI.click(findTestObject('Object Repository/Page_Galaxy A56 5g 256gb Black SAMSUNG  fal_0cd974/a_Ir al Carro'))

WebUI.closeBrowser()

