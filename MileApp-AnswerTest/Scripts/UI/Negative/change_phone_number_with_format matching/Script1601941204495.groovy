import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Open Browser'
WebUI.openBrowser('')

'Navigate To Url'
WebUI.navigateToUrl('https://dev.mile.app/request-demo')

'Maximize Window'
WebUI.maximizeWindow()

'Input Name'
WebUI.setText(findTestObject('Component/input_name'), 'yana andika')

'Input Email'
WebUI.setText(findTestObject('Component/input_email'), 'yanaandika@gmail.com')

'input Phone Number'
WebUI.setText(findTestObject('Component/input_phone_number'), '+6289636743133')

WebUI.verifyElementText(findTestObject('Alert/span_phone_number'), 'The phone field may only contain numeric characters')

'Block All Words'
WebUI.sendKeys(findTestObject('Component/input_name'), Keys.chord(Keys.CONTROL, 'a'))

'input Phone Number'
WebUI.setText(findTestObject('Component/input_phone_number'), '6289636743133')

'Input New Name'
WebUI.setText(findTestObject('Component/input_name'), 'tere')

'Input Company Name'
WebUI.setText(findTestObject('Component/input_company_name'), 'google')

'Click Button'
WebUI.click(findTestObject('Component/button_request_demo'))

WebUI.click(findTestObject('Component/button_request_demo'))

WebUI.delay(5)

WebUI.verifyMatch(WebUI.getUrl(), 'https://dev.mile.app/request-success', false)


