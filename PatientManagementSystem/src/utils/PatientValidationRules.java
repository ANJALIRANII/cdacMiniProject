package utils;

import java.time.LocalDate;
import java.util.Map;

import com.hospital.Patient;
import com.hospital.roomType;

import custom_exception.PatientHandlingException;

public class PatientValidationRules {

	public static Patient vallidateAllInput(int serialNo, String patientName, int age, String gender, String address,
			String phoneMunber, String disease, String admitDate, double annualIncome, String room,
			Map<Integer, Patient> patients) throws PatientHandlingException {
		checkForDup(patients, serialNo);
		roomType validRoom = parseAndVallidateroom(room);
		LocalDate validDate = parseAndValidate(admitDate);

		return new Patient(
				serialNo, patientName, age, gender, address, phoneMunber, disease, validDate, annualIncome, validRoom);

	}

	public static roomType parseAndVallidateroom(String room) {
		return roomType.valueOf(room.toUpperCase());
	}

	public static LocalDate parseAndValidate(String date) throws PatientHandlingException {
		LocalDate d1 = LocalDate.parse(date);
		if (d1.equals(LocalDate.now()))
			return d1;
		throw new PatientHandlingException("invali date");
	}

	public static void checkForDup(Map<Integer, Patient> patients, int SerialNo) throws PatientHandlingException {
		if (patients.containsKey(SerialNo))
			throw new PatientHandlingException("duplicate");
		System.out.println("no duplicate");
	}

}
