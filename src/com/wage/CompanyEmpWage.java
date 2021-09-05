package com.wage;

public class CompanyEmpWage {
	public final String company;
	public final int ratePerHour;
	public final int maxDays;
	public final int maxHours;
	public int totalWage;

	public CompanyEmpWage(String company, int ratePerHour, int maxHours, int maxDays) {
		this.company = company;
		this.ratePerHour = ratePerHour;
		this.maxDays = maxDays;
		this.maxHours = maxHours;
	}

	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for compay: " + company + "is: " + totalWage;
	}

}
