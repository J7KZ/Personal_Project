/**
 * 
 */


import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.epam.olga_eremkina.wdadvanced.BaseClass;
import com.epam.olga_eremkina.wdadvanced.actions.MainAction;
import com.epam.olga_eremkina.wdadvanced.pageobject.AnyMailPage;
import com.epam.olga_eremkina.wdadvanced.pageobject.InboxPage;
import com.epam.olga_eremkina.wdadvanced.pageobject.SendedPage;

/**
 * @author Olga_Eremkina
 *
 */
public class LogOutTest extends MainAction {
    
    public static InboxPage inboxPage;
    public static SendedPage sendedPage;

    private static final String SEARCH_FIELD = "text";
    
    

    @BeforeClass
    public void inbox(){
	inboxPage = new InboxPage(driver);
	sendedPage = new SendedPage(driver);
	clickElement(AnyMailPage.INBOX);
	inboxPage.deleteLetters();
	clickElement(AnyMailPage.TRASH);
	deleteLetter(AnyMailPage.CHECKBOX_ALL, AnyMailPage.BUTTON_DELETE);
	//sendedPage.goToInbox();
	//inboxPage.trashClick();
	//deleteLetter(AnyMailPage.CHECKBOX_ALL, AnyMailPage.BUTTON_DELETE);
	//sendedPage.goToInbox();
	//inboxPage.deleteLetters();
		
    }

    @Test(alwaysRun=true, dependsOnGroups = { "letter" })
    public void logOutTest() {
	
	inboxPage.clickExit();
	Assert.assertEquals(isElementPresent(By.id(SEARCH_FIELD)), true,
		"Logout of the mail, field Search is displayed");
    }

}
