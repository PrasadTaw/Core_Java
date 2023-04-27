package pkgLab_3;

import java.util.Scanner;

public class TesterComplexNum {

	public static void main(String[] args) {
		
		System.out.println("---This is Tester for Complex Number---");
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Please enter the a complex number. (First real part and then imaginary part)");
		 ComplexNumber c = new ComplexNumber(sc.nextInt(), sc.nextInt());
		 
		 System.out.println("The entered Complex number is:");
		 c.displayNumber();
		 
		 ComplexNumber num = new ComplexNumber();
		 System.out.println("Please add another complex number:");
		 System.out.println("Real  part - ");
		 
		 num.setReal(sc.nextInt());
		 System.out.println("Imaginary part - ");
		 num.setImag(sc.nextInt());
		 
		 System.out.println("Entered number is: ");
		 num.displayNumber();
		 
		 System.out.println("---End of Main---");

	}

}
