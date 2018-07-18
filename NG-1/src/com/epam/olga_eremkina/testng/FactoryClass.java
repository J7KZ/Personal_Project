/**
 * 
 */
package com.epam.olga_eremkina.testng;

import org.testng.annotations.Factory;

/**
 * @author Olga_Eremkina
 *
 */
public class FactoryClass {

    @Factory
    public  Object[] createRadius() {
	int a = 10;
	Object[] len = new Object[a];
	for (int i = 0; i < a; i++)  {
	    
	    len[i] = new CircleTest(i);
	    
	}
	
	return len;
    }
}
