/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task1;

import java.util.ArrayList;
import java.util.List;

import com.epam.olga_eremkina.java.lession6.task1.actions.Modifications;
import com.epam.olga_eremkina.java.lession6.task1.actions.Output;
import com.epam.olga_eremkina.java.lession6.task1.readfile.Reader;

/**
 * @author Olga_Eremkina
 *
 */
public class Runner {
    private static final String WITHOUT_DUPLICATE_MESSAGE = "List without duplicate objects";
    private static final String SORTED_LIST_MESSAGE = "Sorted list";
    private static final String UNSORTED_LIST_MESSAGE = "Unsorted list containing %d objects \n";
    private String path = "file/testFile.txt";
    private List<String> stringList;
    private List<String> tempStringList;

    public static void main(String[] args) {

	Runner runner = new Runner();
	runner.startRunner();
    }

    public void startRunner() {

	Reader reader = new Reader(path);
	Output printLines = new Output();
	stringList = new ArrayList<String>();
	stringList.addAll(reader.getLines());
	System.out.printf(UNSORTED_LIST_MESSAGE, stringList.size());
	printLines.output(stringList);

	System.out.println(SORTED_LIST_MESSAGE);
	tempStringList = Modifications.CompareList(stringList);
	printLines.output(tempStringList);

	System.out.println(WITHOUT_DUPLICATE_MESSAGE);
	tempStringList = Modifications.RemoveDups(stringList);
	printLines.output(tempStringList);
    }

}
