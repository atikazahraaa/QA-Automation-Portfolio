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
//import com.kms.katalon.configuration.RunConfiguration

//buka web dan masuk ke url-nya
WebUI.openBrowser('')
		
WebUI.maximizeWindow()
		
WebUI.navigateToUrl('https://techstore-sandy.vercel.app/')
		
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Log in'), 120)

//login
WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Log in'))
		
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/input_Username_input-login-username'), 120)
		
WebUI.setText(findTestObject('Object Repository/Page_TechStore  Premium Electronics/input_Username_input-login-username'), username)
		
WebUI.setText(findTestObject('Object Repository/Page_TechStore  Premium Electronics/input_Password_input-login-password'), password)
		
WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Log in_Window login'))
		
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_Aadmin'), 120)

//pilih object yg mau dicheckout
WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/a_Phones'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_iPhone 16 Pro Max'), 0)

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_iPhone 16 Pro Max'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/span_Hitam'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Add to Cart'))

WebUI.acceptAlert() //klik "OK" di alert

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/a_Laptops'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_MacBook Pro 14 M4'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/span_Hitam'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Add to Cart'))

WebUI.acceptAlert() //klik "OK" di alert

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/a_Monitors'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_LG 34 UltraWide OLED'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/span_Hitam'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Add to Cart'))

WebUI.acceptAlert() //klik "OK" di alert

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Cart'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_iPhone 16 Pro Max (Hitam)'), 0)

//verify objectnya udah masuk cart semua
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_iPhone 16 Pro Max (Hitam)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_LG 34 UltraWide OLED (Hitam)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_MacBook Pro 14 M4 (Hitam)'))

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Place Order'))

//masukkin data payment
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/select_Select Country'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TechStore  Premium Electronics/select_Select Country'), 'Indonesia', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TechStore  Premium Electronics/select_Select City'), 'Jakarta', false)

WebUI.setText(findTestObject('Object Repository/Page_TechStore  Premium Electronics/input__order-card'), ordercard)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TechStore  Premium Electronics/select_Month'), '01', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TechStore  Premium Electronics/select_Year'), '2029', false)

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Pay Now'))

WebUI.acceptAlert()

//logout
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Log out'), 0)

WebUI.click(findTestObject('Object Repository/Page_TechStore  Premium Electronics/button_Log out'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_TechStore  Premium Electronics/div_Berhasil logout'), 0)