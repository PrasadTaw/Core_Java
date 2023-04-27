package interfaces;

public class Date implements Iprintable{
	
	private int day, month, year;

	public Date() {
		super();
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public void print() {
		
		System.out.println("The date is: "+this.day+" / "+this.month+" / "+this.year);
		
	}
	
	

}
