package pkgPractice;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double amount, principal, rate, factor = 0.0, mul = 1;
		int period, cycle, i = 0;
		
		System.out.println("Please enter principal, interest rate. example, 10000.00 4.5");
		principal = sc.nextDouble();
		rate = sc.nextDouble();
		
		System.out.println("Please enter the period in years example 1 or 2 or 3");
		period = sc.nextInt();
		System.out.println("Select a number for cycle: 1. Annually 2. Semi-annually 3. Quarterly");
		cycle = sc.nextInt();
		
		if(cycle == 1) {
			factor = 1;
			period = 1 * period;
			}
		
		else if(cycle == 2) {
			factor = 0.5;
			period = 2 * period;
		}
		else if(cycle == 3) {
			factor = 0.25;
			period = 4 * period;
		}
		
		for(i=1; i <= period; i++ ) {
			
			mul = mul * (1 + (factor * rate) / 100);
		}
		amount = principal * mul;
		
		System.out.println(" The Compund interest is: Rs."+amount+".");
		

	}

}
