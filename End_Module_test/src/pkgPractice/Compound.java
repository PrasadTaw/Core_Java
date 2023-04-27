package pkgPractice;

import java.util.Scanner;

public class Compound{

public static void main(String[] args){
	
	int op;	
	
	
	double principal, rate, freq = 0, time, amnt =1, CI, bterm;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principal amount: ");
	principal= sc.nextDouble();	
	System.out.println("Enter the rate of interest: ");
	rate = sc.nextDouble();
	System.out.println("Enter the time in number of years: ");
	time = sc.nextDouble();
	
	System.out.println("Your entered details are: Principal= "+ principal+ " Rate: "+ rate +" Number of years: " + time);	

	System.out.println("Choose the option, how do you want to compute interest: ");
	System.out.println("1.Annually 2.Halfly 3.Quarterly");
	
	op = sc.nextInt();
	switch(op){
	case 1: freq = 1;
		System.out.println("Frequency for annual computation is selected.");
		break;
	case 2: freq = 1/2.0;
		System.out.println("Frequency for half yearly computation is selected.");
		break;
	case 3: freq = 1/4.0;
		System.out.println("Frequency for Quarterly computation is selected.");
		break;
	default: System.out.println("Invalid choice");
	}	
	System.out.println("Frequency: "+freq);
	bterm = (1 + (freq*rate)/100);
	System.out.println("Amount check: " + amnt);
	System.out.println("check:"+(time/freq));
	for(int i=1; i<=(time/freq); i++){
	
	amnt = amnt * bterm; 	
	}
	System.out.println("Amount check 2: " + amnt);
	amnt= amnt * principal;
	
	System.out.println("Amount calculated");

	CI = amnt - principal;
	System.out.println("Compound interest is : "+ CI+ "AMount is: "+ amnt);
	}

}