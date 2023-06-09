package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.hospital.Patient;

public interface IOUtils {

	static void storePatientDetails(Map<Integer, Patient> pats, String fileName) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(pats);
		}
	}

	@SuppressWarnings("unchecked")
	static Map<Integer, Patient> restorePatientDetails(String fileName) throws IOException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return (Map<Integer, Patient>) in.readObject();
		} catch (Exception e) {
			System.out.println("error during ser" + e);
			return new HashMap<>();

		}
	}

}
