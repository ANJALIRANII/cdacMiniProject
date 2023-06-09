package com.hospital;

public enum roomType {

	// roomType GENERAL(2000),SPECIAL(5000),SEMI-SPECIAL(3000),ICU(7000)*/

	GENERAL(2000), SPECIAL(5000), SEMISPECIAL(3000), ICU(7000);

	private int noOfPatient;

	private roomType(int noOfPatient) {
		this.noOfPatient = noOfPatient;
	}

	public int getNoOfPatient() {
		return noOfPatient;
	}

}
