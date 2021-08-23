package com.wage;

public class wage_probllem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("welcome to employee program");
    final int IS_FULL_TIME =1;
    final int IS_PART_TIME=2;
    int ratePerHour =20;
    int empHour=0;
    int empWage=0;
    int noWorkingDay=20;
    int totalWage=0;
    while(total_emp_hrs<max_hrs &&total_emp_days<max_days)
    {
    	total_emp_days+=1;
    int empCheck=(int) (Math.floor(Math.random()*10)%3);
    switch (empCheck) {
    case  IS_FULL_TIME: empHour=16;break;
    case IS_PART_TIME: empHour=8;break;
    default: empHour=0;
    }
    total_emp_hrs+=emp_hrs;
    empWage=empHour*ratePerHour;
    totalWage+=empWage;
    }		
    System.out.println("Employee wage is "+total_wage);
    System.out.println("Total working hours is "+total_emp_hrs);
    System.out.println("Total working days is "+total_emp_days);
    
}
 }

 

