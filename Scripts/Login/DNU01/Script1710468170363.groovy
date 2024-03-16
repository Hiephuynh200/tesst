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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Login/Page_30 Shines Super Fake/a_LoginPage'))

WebUI.setText(findTestObject('Login/Page_30 Shines Super Fake/input_Username'), 'Lmao')

WebUI.setEncryptedText(findTestObject('Login/Page_30 Shines Super Fake/input_Password'), 'Fxhl16jxOP4V8Hno4gPx3g==')

WebUI.click(findTestObject('Login/Page_30 Shines Super Fake/button_Login'))

WebUI.verifyElementPresent(findTestObject('Login/Page_30 Shines Super Fake/div_LoginSuccess'), 5)

WebUI.verifyElementText(findTestObject('Login/Page_30 Shines Super Fake/div_LoginSuccess'), 'Đăng nhập thành công!')

WebUI.closeBrowser()

