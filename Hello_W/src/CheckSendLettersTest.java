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
import com.epam.olga_eremkina.wdadvanced.pageobject.InboxPage;
import com.epam.olga_eremkina.wdadvanced.pageobject.SendedPage;


*//**
 * @author Olga_Eremkina
 *
 *//*
public class CheckSendLettersTest extends BaseClass {
    public static InboxPage inboxPage;
    public static SendedPage sendedPage;
    
    @BeforeClass
    public void sended() {
	inboxPage = new InboxPage(driver);
	sendedPage = new SendedPage(driver);
	//mainAction.clickElement(inboxPage.sendedLink);
	inboxPage.sendedClick();
    }
    
    @Test(groups = { "letter" }, dataProvider = "test_data", dataProviderClass = DataPorviderClass.class, priority = 4)
    public void checkSend (String subject, String content, String to) throws InterruptedException {
	
	Thread.sleep(500);
	String toField = sendedPage.getTo();
	Assert.assertTrue(to.contains(toField), "Check field To");

	
	String subjectField = sendedPage.getSubject();
	Assert.assertTrue(subject.contains(subjectField), "Check field Subject");

	
	String textField = sendedPage.getContent();
	Assert.assertTrue(textField.contains(content), "Check Textarea of letter");

    }
    
    @AfterMethod
    public void deleteMails() {
	//DeleteAction.deleteLetter();
	sendedPage.deleteLetter();
	//mainAction.deleteLetter(sendedPage.checkbox, sendedPage.buttonDelete);
    }

}
*/