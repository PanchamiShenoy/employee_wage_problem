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
    for(int day=0;day<noWorkingDay;day++)
    {
    int empCheck=(int) (Math.floor(Math.random()*10)%3);
    switch (empCheck) {
    case  IS_FULL_TIME: empHour=16;break;
    case IS_PART_TIME: empHour=8;break;
    default: empHour=0;
    }
    
    empWage=empHour*ratePerHour ;
    totalWage+=empWage;
    }		
    System.out.println("Employee wage is "+totalWage);
    
}
 }

 

