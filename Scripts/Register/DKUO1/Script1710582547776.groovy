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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Register/DangKiThanhCong/a_ng k'))

WebUI.setText(findTestObject('Object Repository/Register/DangKiThanhCong/input_NG K_username'), 'PhatHuynh123@')

WebUI.setText(findTestObject('Object Repository/Register/DangKiThanhCong/input_Tn ti khon_name'), 'Phathuynh')

WebUI.setText(findTestObject('Object Repository/Register/DangKiThanhCong/input_Tn ngi dng_phone'), '0903500016')

WebUI.setText(findTestObject('Object Repository/Register/DangKiThanhCong/input_S in thoi_email'), 'huynhphatminh1998@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/DangKiThanhCong/input_Email_password'), 'aC8biWcl5L8ssNJ4eRiFpA==')

WebUI.setText(findTestObject('Object Repository/Register/DangKiThanhCong/input_Mt khu_address'), 'NhaTrang')

WebUI.click(findTestObject('Object Repository/Register/DangKiThanhCong/button_NG K'))

