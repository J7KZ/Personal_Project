package com.epam.artem_parfenov.java.lesson5.hierarchyhandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaladSerializer {

	private static final String SUCCESSFUL_SERIALIZATION_MESSAGE = "Serialization was successful!";
	private static final String NOT_SUCCESSFUL_SERIALIZATION_MESSAGE = "Serialization wasn't successful!";

	public static String serializeSalad(Salad salad, File file) {

		if (file.exists()) {

			try {

				serializeObject(salad, file);
				return SUCCESSFUL_SERIALIZATION_MESSAGE;
			} catch (IOException e) {

				e.printStackTrace();
			}
		} else {

			try {

				file.createNewFile();
				serializeObject(salad, file);
				return SUCCESSFUL_SERIALIZATION_MESSAGE;
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		return NOT_SUCCESSFUL_SERIALIZATION_MESSAGE;
	}

	private static void serializeObject(Salad salad, File file) throws IOException {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(salad);
		oos.close();
	}

	public static Salad deserializeSalad(Salad salad, File file) {

		ObjectInputStream ois;

		if (file.length() != 0) {

			try {
				ois = new ObjectInputStream(new FileInputStream(file));
				salad = (Salad) ois.readObject();
				ois.close();

				return salad;

			} catch (IOException | ClassNotFoundException e) {

				e.printStackTrace();
			}
		}

		return salad;
	}
}
