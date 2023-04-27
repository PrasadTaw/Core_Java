package pkgLab_3;

public class ComplexNumber {
	
	private int real;
	private int imag;
	
	public ComplexNumber() {
		super();
	}

	public ComplexNumber(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public void displayNumber() {
		
		System.out.println("Complex Number: " + this.real + " + " + this.imag + "i");
	}

}
