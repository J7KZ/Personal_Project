/**
 * 
 */
package com.epam.olga_eremkina.java.lession6.task1.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Olga_Eremkina
 *
 */
public class Reader {
    BufferedReader reader;

    public Reader(String path) {
	try {
	    reader = new BufferedReader(new FileReader(new File(path)));

	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}

    }

    public List<String> getLines() {
	String currentLine;
	List<String> lines = new ArrayList<String>();
	try {
	    while ((currentLine = reader.readLine()) != null) {
		lines.add(currentLine);
	    }
	    return lines;
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return null;
    }
    
    

}
