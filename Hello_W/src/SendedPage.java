/**
 * 
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.epam.olga_eremkina.wdadvanced.pageobject.AnyMailPage;



/**
 * @author Olga_Eremkina
 *
 */
public class SendedPage extends AnyMailPage {

    /**
     * 
     */
    public SendedPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;	
    }
public WebDriver driver;
    
    @FindBy (xpath = "//div[contains(@class,\"mail-MessagesList\")]/*[last()]/descendant::span[@class = \"mail-MessageSnippet-FromText\"]")
    private WebElement fieldTo;
    
    @FindBy (xpath = "//div[contains(@class,\"mail-MessagesList\")]/*[last()]/descendant::span[contains(@class, \"Item_subject\")]")
    private WebElement fieldSubject;
    
    @FindBy (xpath = "//div[contains(@class,\"mail-MessagesList\")]/*[last()]/descendant::span[contains(@class, \"Item_firstline\")]")
    private WebElement textArea;
    
    @FindBy (xpath = "//div[contains(@class,\"mail-MessagesList\")]/*[last()]/descendant::span[contains(@class, \"nb-checkbox-flag\")]")
    public WebElement checkbox;
    
    @FindBy (xpath = "//div[contains(@class,'ns-view-toolbar-button-delete')]")
    public WebElement buttonDelete;
    
    @FindBy (xpath = "//a[contains(@class, 'mail-FolderList-Item_inbox')]")//a[@class= 'b-messages__placeholder-item__link']
    private WebElement inboxLink;
    
    public String getTo() {
	//waitVisibleElement(fieldTo);
	return fieldTo.getText();
    }
    
    public String getSubject() {
	return fieldSubject.getText();
    }
    
    public String getContent() {
	return textArea.getText();
    }
    
    public void deleteLetter() {
	new Actions(driver)
		.click(checkbox)
		.click(buttonDelete)
		.build().perform();
    }
    public void goToInbox() {
	new Actions(driver)
	.click(inboxLink)
	.build().perform();
    }

}
