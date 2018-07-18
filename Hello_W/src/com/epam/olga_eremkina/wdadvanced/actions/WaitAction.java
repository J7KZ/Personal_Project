/**
 * 
 */
package com.epam.olga_eremkina.wdadvanced.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.olga_eremkina.wdadvanced.BaseClass;

/**
 * @author Olga_Eremkina
 *
 */
public class WaitAction extends BaseClass {

    /**
     * 
     */
    public WaitAction()  {
	
    }
    
    public void waitVisibleElement(WebElement element) {   //, String nameElement
	    try {   
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
	    }
	    catch (ElementNotVisibleException | TimeoutException e) {
	     e.printStackTrace();
	     
	    }
	   }
	
	
    public void waitElement (WebElement element) {
	boolean isNotFind = true;
	int timer = 0;
	//WebElement element;
	while (isNotFind && timer <= 5000) {
	     try {
	      Thread.sleep(200);
	      //element = driver.findElement(locator);
	      //element.getText();
	      element.isDisplayed();
	      isNotFind = false;
	     }
	     catch (StaleElementReferenceException | InterruptedException e) {
	      e.printStackTrace();
	      timer += 200;
	      
	     }
	    }
	   }
    }
	
	   /*private void click(By locator) {
	    boolean isNotFind = true;
	    int timer = 0;
	    WebElement element;

	    while (isNotFind && timer <= MAX_TIMER) {
	     try {
	      Thread.sleep(SLEEP_TIME);
	      element = driver.findElement(locator);
	      element.click();
	      isNotFind = false;
	     }
	     catch (StaleElementReferenceException | InterruptedException e) {
	      e.printStackTrace();
	      timer += SLEEP_TIME;
	      
	     }
	    }
	   }
*/
//}
