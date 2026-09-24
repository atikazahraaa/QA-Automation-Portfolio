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
import java.text.SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration

String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
String fileName = '/Screenshot/hasil_login_normal_' + timeStamp + '.png'

CustomKeywords.'webKeywords.CustomKeywords.login'(username, password)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_HRSV Dashboard/h5_Aplikasi HR SV Jakarta 2023'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HRSV Dashboard/h5_Aplikasi HR SV Jakarta 2023'))

WebUI.takeScreenshot(RunConfiguration.getProjectDir() + fileName)

WebUI.closeBrowser()