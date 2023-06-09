package tester;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import static utils.IOUtils.*;
import com.hospital.Patient;
import com.hospital.roomType;

import static utils.PatientValidationRules.*;

public class TestPatient {

	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String fileName = sc.next();
			Map<Integer, Patient> pmap = restorePatientDetails(fileName);
			System.out.println("restored map" + pmap);
			boolean exit = false;
			while (!exit) {
				System.out.println("1.add patient 2.display patient details 3.sort the patient based  on gender"
						+ " 4.remove all the patient who has disease \"diabetes\". 5. display all the patient details of room type choosen from the user 0.exit");
				try {
					switch (sc.nextInt())

//					private int SerialNo;
//					private String PatientName;
//					private int age;
//					private String gender;
//					private String address;
//					private String phoneMunber;
//					private String disease;
//					private LocalDate admitDate;
//					private double annualIncome;
//					private roomType room;
					{
					case 1:
						System.out.println(
								"Enter patient details : serialno patientname age gender adress phonenumber disease admitdate annualIncome room ");
						Patient valiDateInput = vallidateAllInput(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(),
								sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), pmap);
						pmap.put(valiDateInput.getSerialNo(), valiDateInput);
						System.out.println("patient added");
						break;
					case 2:
						System.out.println("details of patient are ");
						pmap.values().forEach(System.out::println);
						break;
					case 3:
						System.out.println("enter the gender you want to sort");
						String gender = sc.next();
						pmap.values().stream().filter(a -> a.getGender().equals(gender))
								.forEach(a -> System.out.println(a));

						break;
					case 4:
						System.out.println("enter the disease diabetes");
						String disease = sc.next();
						pmap.values().removeIf(a -> a.getDisease().equals(disease));
						System.out.println("patient who has diabetes removed ");
						break;
					case 5:
						System.out.println("choose room type");
						String room = sc.next();
						roomType r = parseAndVallidateroom(room);
						pmap.values().stream().filter(s -> s.getRoom().equals(r)).forEach(s -> System.out.println(s));
						break;
					case 0:
						exit = true;
						storePatientDetails(pmap, fileName);
						System.out.println("patient details stored");
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
