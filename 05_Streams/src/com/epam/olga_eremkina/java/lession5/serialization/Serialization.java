package com.epam.olga_eremkina.java.lession5.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.epam.olga_eremkina.java.lession5.salad.Salad;

public class Serialization implements Serializable {

    private static final String ACCESS_ERROR = "Access error!";
    private static final String FILE_NOT_FOUND = "File not found!";
    private static final String CLASS_DOESN_T_EXIST = "Class doesn't exist!";
    private static final String FILE_NAME = "file.txt";
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public static void serialization(Salad salad) {
	File fw = new File(FILE_NAME);
	
	try {
	    if (!(fw.exists())) {
	    fw.createNewFile();
	    }
	    ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
	    ostream.writeObject(salad);
	    ostream.close();

	} catch (IOException e) {
	    e.printStackTrace();

	}
	
    }

    public static void deserialization(Salad salad) {
	File fr = new File(FILE_NAME);
	try {
	    ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
	    salad = (Salad) istream.readObject();
	    istream.close();
	    System.out.println(salad);
	} catch (ClassNotFoundException ce) {
	    System.err.println(ce);
	    System.out.println(CLASS_DOESN_T_EXIST);

	} catch (FileNotFoundException fe) {
	    System.err.println(fe);
	    System.out.println(FILE_NOT_FOUND);
	} catch (IOException ioe) {
	    System.err.println(ioe);
	    System.out.println(ACCESS_ERROR);
	}

	

    }

    
}

