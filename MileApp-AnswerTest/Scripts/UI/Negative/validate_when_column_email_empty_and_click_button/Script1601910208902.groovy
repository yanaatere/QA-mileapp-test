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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Open Browser'
WebUI.openBrowser('')

'Open Url\r\n'
WebUI.navigateToUrl('https://dev.mile.app/request-demo')

'Input Name'
WebUI.setText(findTestObject('Component/input_name'), 'retere')

'Input Phone Number'
WebUI.setText(findTestObject('Component/input_phone_number'), '89636743133')

'Input Company Name'
WebUI.setText(findTestObject('Component/input_company_name'), 'GOOGLE')

'Click Button'
WebUI.click(findTestObject('Component/button_request_demo'))

'Set Delay'
WebUI.delay(5)

'Verify Alert Text'
WebUI.verifyTextPresent('The email field is required.', true)

