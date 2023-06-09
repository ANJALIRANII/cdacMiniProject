package com.hospital;

import java.io.Serializable;
import java.time.LocalDate;

/*Patient details : SerialNo(int),PatientName(String),age(int),gender(String),address(String),phoneNumber(String),disease(String)
,admitDate(LocalDate)
annualIncome(double)
roomType GENERAL(2000),SPECIAL(5000),SEMI-SPECIAL(3000),ICU(7000)*/
public class Patient implements Serializable{

	private int SerialNo;
	private String PatientName;
	private int age;
	private String gender;
	private String address;
	private String phoneMunber;
	private String disease;
	private LocalDate admitDate;
	private double annualIncome;
	private roomType room;

	public Patient(int serialNo, String patientName, int age, String gender, String address, String phoneMunber,
			String disease, LocalDate admitDate, double annualIncome, roomType room) {
		super();
		this.SerialNo = serialNo;
		this.PatientName = patientName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneMunber = phoneMunber;
		this.disease = disease;
		this.admitDate = admitDate;
		this.annualIncome = annualIncome;
		this.room = room;

	}

	@Override
	public String toString() {
		return "Patient [SerialNo=" + SerialNo + ", PatientName=" + PatientName + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", phoneMunber=" + phoneMunber + ", disease=" + disease + ", admitDate="
				+ admitDate + ", annualIncome=" + annualIncome + ", room=" + room + "]";
	}

	public int getSerialNo() {
		return SerialNo;
	}

	public String getPatientName() {
		return PatientName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneMunber() {
		return phoneMunber;
	}

	public String getDisease() {
		return disease;
	}

	public LocalDate getAdmitDate() {
		return admitDate;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public roomType getRoom() {
		return room;
	}
	

}
