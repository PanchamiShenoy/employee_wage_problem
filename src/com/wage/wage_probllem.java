package com.wage;

public class wage_probllem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("welcome to employee program");
    int IS_FULL_TIME =1;
    int ratePerHour =20;
    int empHour=0;
    int empWage=0;
    double empCheck=Math.floor(Math.random()*10)%2;
    if (empCheck==IS_FULL_TIME)
    	empHour=8;
    	empWage=empHour*ratePerHour ;
    			
    	System.out.println("Employee wage is "+empWage);
    
    	
    	}

    

	}

