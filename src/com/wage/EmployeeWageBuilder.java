package com.wage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeWageBuilder implements IComputeEmpWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyToEmpWageMap;

	EmployeeWageBuilder() {
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	/**
	 * method to add company detail to companyEmpWageArr
	 */
	public void addCompanyEmpWage(String company, int ratePerHour, int maxHours, int maxDays) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, ratePerHour, maxHours, maxDays);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}

	/**
	 * method to set total employee wage for each company
	 */
	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	/**
	 * method to compute total employee wage for each company
	 * 
	 * @param companyEmpWage
	 * @return totalWage
	 */
	public int computeWage(CompanyEmpWage companyEmpWage) {
		int empHour = 0;
		int dailyWage = 0;
		int totalWage = 0;
		int totalEmpHours = 0;
		int totalEmpDays = 0;
		while (totalEmpHours < companyEmpWage.maxHours && totalEmpDays < companyEmpWage.maxDays) {
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
			dailyWage = empHour * companyEmpWage.ratePerHour;
			System.out.println("\ndaily wage is "+dailyWage);
			totalWage += dailyWage;
		}
		System.out.println("\ncompany name is" + companyEmpWage.company);
		System.out.println("Employee wage is " + totalWage);
		System.out.println("Total working hours is " + totalEmpHours);
		System.out.println("Total working days is " + totalEmpDays);
		return totalWage;
	}

	public static void main(String args[]) {

		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();

		empWageBuilder.addCompanyEmpWage("YML", 30, 140, 20);
		empWageBuilder.addCompanyEmpWage("bridgelabz", 20, 100, 20);
		empWageBuilder.computeEmpWage();
	}

	@Override
	public int getTotalWage(String company) {
		// TODO Auto-generated method stub
		return 0;
	}
}
