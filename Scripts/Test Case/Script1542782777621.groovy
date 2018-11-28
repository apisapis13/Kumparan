import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open Browser'
WebUI.openBrowser('www.kumparan.com')
WebUI.waitForPageLoad(30)
WebUI.maximizeWindow()
WebUI.delay(3)

'Dismiss Popup'
if (WebUI.verifyElementVisible(findTestObject('kumparan/dismisspopUP'))){
	WebUI.click(findTestObject('kumparan/dismisspopUP'))
	WebUI.delay(3)
}

'Login Using Facebook'
WebUI.click(findTestObject('Object Repository/kumparan/btnProfile'))
WebUI.click(findTestObject('Object Repository/kumparan/btnFB'))
WebUI.switchToWindowIndex(2)
WebUI.setText(findTestObject('Object Repository/kumparan/facebook/InputEmail'), 'apis_aditya@yahoo.com')
WebUI.setText(findTestObject('Object Repository/kumparan/facebook/InputPass'), '130493')
WebUI.click(findTestObject('Object Repository/kumparan/facebook/btnLogin'))
WebUI.delay(3)
WebUI.switchToWindowIndex(0)
WebUI.verifyElementPresent(findTestObject('Object Repository/kumparan/gravatarIcon'), 30)//Verify Login Success
WebUI.click(findTestObject('kumparan/logout/logout_1'))
WebUI.delay(3)
WebUI.scrollToElement(findTestObject('Object Repository/kumparan/logout/scrollToElement'), 10)
WebUI.click(findTestObject('Object Repository/kumparan/logout/btnLogout'))
WebUI.navigateToUrl('www.kumparan.com')

'Login Using Google'
WebUI.click(findTestObject('Object Repository/kumparan/btnProfile'))
WebUI.click(findTestObject('Object Repository/kumparan/btnGoogle'))
WebUI.switchToWindowIndex(2)
WebUI.setText(findTestObject('Object Repository/kumparan/google/InputEmail'), 'aditya.hafizh@mataharimall.com')
WebUI.click(findTestObject('Object Repository/kumparan/google/btnNextEmail'))
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/kumparan/google/InputPass'), 'beli4j4444')
WebUI.click(findTestObject('Object Repository/kumparan/google/btnNextPass'))
WebUI.delay(3)
/*WebUI.click(findTestObject('Object Repository/kumparan/google/btnDeny'))
WebUI.delay(3)*/
WebUI.switchToWindowIndex(0)
WebUI.verifyElementPresent(findTestObject('Object Repository/kumparan/gravatarIcon'), 30)//Verify Login Success

'See News'
WebUI.click(findTestObject('Object Repository/kumparan/news/btnNews'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/kumparan/news/hitNews'))
WebUI.delay(5)

'Put Comment'
WebUI.scrollToElement(findTestObject('Object Repository/kumparan/news/scrollToText'), 30)
WebUI.verifyElementVisible(findTestObject('Object Repository/kumparan/news/putComment'))
WebUI.setText(findTestObject('Object Repository/kumparan/news/putComment'), ' testistastus')
WebUI.verifyElementClickable(findTestObject('Object Repository/kumparan/news/btnComment'))
WebUI.click(findTestObject('Object Repository/kumparan/news/btnComment'))
WebUI.delay(5)

'Close Browser'
WebUI.closeBrowser()