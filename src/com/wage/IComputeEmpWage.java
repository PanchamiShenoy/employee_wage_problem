package com.wage;

public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int ratePerHour, int maxHours, int maxDays);

	public void computeEmpWage();
}
