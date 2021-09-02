package com.wage;

public class EmployeeWageBuilder {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static void computeWage(String companyName,int ratePerHour,int maxHours,int maxDays) {
		int empHour = 0;
		int empWage = 0;
		int totalWage = 0;
		int totalEmpHours = 0;
		int totalEmpDays = 0;
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
		System.out.println("\ncompany name is"+companyName);
		System.out.println("Employee wage is " + totalWage);
		System.out.println("Total working hours is " + totalEmpHours);
		System.out.println("Total working days is " + totalEmpDays);
	}

	public static void main(String args[]) {
		computeWage("YML",30,160,20);
		computeWage("BridgeLabz",30,150,15);
	}
}
