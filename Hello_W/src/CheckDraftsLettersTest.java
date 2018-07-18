/**
 * 
 *//*
package com.epam.olga_eremkina.wdadvanced.alltests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.olga_eremkina.wdadvanced.BaseClass;
import com.epam.olga_eremkina.wdadvanced.actions.MainAction;
import com.epam.olga_eremkina.wdadvanced.mailprovider.DataPorviderClass;
import com.epam.olga_eremkina.wdadvanced.pageobject.AnyMailPage;
import com.epam.olga_eremkina.wdadvanced.pageobject.DraftPage;
import com.epam.olga_eremkina.wdadvanced.pageobject.InboxPage;


*//**
 * @author Olga_Eremkina
 *
 *//*
public class CheckDraftsLettersTest extends BaseClass {

   
    
    public static InboxPage inboxPage;
    public static DraftPage draftPage;

    @BeforeClass
    public void drafts() {
	inboxPage = new InboxPage(driver);
	draftPage = new DraftPage(driver);
	inboxPage.draftsClick();
	//mainAction.clickElement(inboxPage.draftsLink);
	
    }

    @Test(groups = { "letter" }, dataProvider = "test_data", dataProviderClass = DataPorviderClass.class, priority = 2)

    public void checkDraft(String subject, String content, String to) throws InterruptedException {
	
	//Thread.sleep(500);
	//mainAction.waitVisibleElement(draftPage.fieldTo);
	String toField = draftPage.getTo();
	Assert.assertTrue(to.contains(toField), "Check field To");
	
	//Thread.sleep(500);
	String subjectField = draftPage.getSubject();
	Assert.assertTrue(subjectField.contains(subjectField), "Check field Subject");
	
	//Thread.sleep(500);
	String textField = draftPage.getContent();
	Assert.assertTrue(textField.contains(content), "Check Textarea of letter");

    }

    @AfterMethod
    public void deleteMails() {
	//mainAction.deleteLetter(draftPage.checkbox, draftPage.buttonDelete);
	
	draftPage.deleteLetter();
	
    }

}
*/