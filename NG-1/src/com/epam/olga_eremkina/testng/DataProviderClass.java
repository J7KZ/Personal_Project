/**
 * 
 */
package com.epam.olga_eremkina.testng;

import org.testng.annotations.DataProvider;

/**
 * @author Olga_Eremkina
 *
 */
public class DataProviderClass {
    @DataProvider(name = "dp_one")
    public static Object[] createLen() {
	int a = 10;
	Object[] len = new Object[a];
	for (int i = 0; i < a; i++) {

	    len[i] = i;

	}

	return len;
    }

}