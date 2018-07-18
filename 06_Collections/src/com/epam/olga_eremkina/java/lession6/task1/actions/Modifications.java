/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task1.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Olga_Eremkina
 *
 */
public class Modifications {

    public static List<String> RemoveDups(List<String> tempList) {
	Set<String> set = new LinkedHashSet<>(tempList);
	List<String> listWithoutDups = new ArrayList<>(set);
	return listWithoutDups;
    }

    public static List<String> CompareList(List<String> tempList) {
	Collections.sort(tempList, new Comparator<String>() {

	    @Override
	    public int compare(String o1, String o2) {
		return o1.hashCode() - o2.hashCode();
	    }
	});

	return tempList;
    }

}
