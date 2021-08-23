package com.wage;

public class wage_probllem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("welcome to employee program");
    int IS_FULL_TIME =1;
    int IS_PART_TIME=2;
    int ratePerHour =20;
    int empHour=0;
    int empWage=0;
    double empCheck=Math.floor(Math.random()*10)%3;
    if (empCheck==IS_FULL_TIME)
    	empHour=16;
    else if (empCheck==IS_PART_TIME)
    	empHour=8;
    	empWage=empHour*ratePerHour ;
    			
    System.out.println("Employee wage is "+empWage);
    
    	
    	}

    

	}

