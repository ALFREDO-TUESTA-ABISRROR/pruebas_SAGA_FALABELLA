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

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/div_Search Bar_UserInfo-module_downArrowico_eb3f45'))

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/a_Inicia sesin'))

WebUI.setText(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/input_Correo electrnico_testId-cc-login-for_d0c7d1'), 
    'juan_perez@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/input_Contrasea_testId-cc-login-form-passwo_119030'), 
    '+c0sMoOgPhQ=')

WebUI.click(findTestObject('Object Repository/Page_Falabella.com  Celebra la Navidad 2025/svg_Contrasea_form-field-module_icon__OfORJ'))

WebUI.closeBrowser()

