package com.wage;

import java.util.List;

public class CompanyEmpWage {
	public final String company;
	public final int ratePerHour;
	public final int maxDays;
	public final int maxHours;
	public List<Integer> dailyWages;
	public int totalWage;

	/**
	 * parameterised constructor to initialise member of class
	 * 
	 * @param company
	 * @param ratePerHour
	 * @param maxHours
	 * @param maxDays
	 */
	public CompanyEmpWage(String company, int ratePerHour, int maxHours, int maxDays) {
		this.company = company;
		this.ratePerHour = ratePerHour;
		this.maxDays = maxDays;
		this.maxHours = maxHours;
	}

	/**
	 * method to set total employee wage
	 * 
	 * @param totalWage
	 */
	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public void setDailyWage(List<Integer> dailyWages) {
		this.dailyWages = dailyWages;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for compay: " + company + "is: " + totalWage;
	}

}
