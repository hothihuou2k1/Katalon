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

WebUI.navigateToUrl('https://alada.vn/tai-khoan/dang-ky.html')

WebUI.setText(findTestObject('Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/input_H v tn_txtFirstname'), 'Ho Thi Huou')

WebUI.click(findTestObject('Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/div_Chat vi ALADAThng phn hi trong vng vi giXin cho Chng ti c th gip g cho bnng nhp vo MessengerTip tc vi vai tr khchBng cch tip tc vi vai tr khch, bn ng  vi iu khon, Chnh sch d liu v Chnh sch cookie ca Facebook'))

WebUI.click(findTestObject('Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/path'))

WebUI.setText(findTestObject('Object Repository/Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/input_a ch Email_txtEmail'), 
    'hothihuou2k1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/input_Nhp li Email_txtCEmail'), 
    'hothihuou2k1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/input_Mt khu_txtPassword'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/input_Nhp li Mt khu_txtCPassword'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setText(findTestObject('Object Repository/Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/input_in thoi_txtPhone'), 
    '0983257185')

WebUI.click(findTestObject('Object Repository/Page_Cng gio dc trc tuyn (E-Learning) Alada.VN/button_NG K'))

WebUI.closeBrowser()

