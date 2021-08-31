package com.wage;

public class wage_probllem {
	final int IS_FULL_TIME = 1;
	final int IS_PART_TIME = 2;
	int ratePerHour = 20;
	int empHour = 0;
	int empWage = 0;
	int noWorkingDay = 20;
	int totalWage = 0;
	int totalEmpHours = 0;
	int maxHours = 100;
	int maxDays = 20;
	int totalEmpDays = 0;

	wage_probllem() {

	}

	public void checkAttendance() {
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empCheck) {
		case IS_FULL_TIME:
			empHour = 16;
			break;
		case IS_PART_TIME:
			empHour = 8;
			break;
		default:
			empHour = 0;
		}
	}

	public void computeWage() {
		while (totalEmpHours < maxHours && totalEmpDays < maxDays) {
			totalEmpDays += 1;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case IS_FULL_TIME:
				empHour = 16;
				break;
			case IS_PART_TIME:
				empHour = 8;
				break;
			default:
				empHour = 0;
			}
			totalEmpHours += empHour;
			empWage = empHour * ratePerHour;
			totalWage += empWage;
		}
		System.out.println("Employee wage is " + totalWage);
		System.out.println("Total working hours is " + totalEmpHours);
		System.out.println("Total working days is " + totalEmpDays);
	}
}
