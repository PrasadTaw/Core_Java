package interfaces;

public class Shape implements Iprintable{
	
	private int radius;
	private double circleArea;
	private int length;
	private int breadth;
	private int rectArea;
	public Shape() {
		super();
	}
	public Shape(int radius, int length, int breadth) {
		super();
		this.radius = radius;
		this.circleArea = 3.14 * this.radius * this.radius;
		this.length = length;
		this.breadth = breadth;
		this.rectArea = this.length * this.breadth;
	}
	
	
	
	@Override
	public void print() {
		System.out.println("The Area of Circle is: " + this.circleArea);
		System.out.println("The area of rectangle is: "+this.rectArea);
		
	}
	@Override
	public String toString() {
		return "Shape [radius=" + radius + ", circleArea=" + circleArea + ", length=" + length + ", breadth=" + breadth
				+ ", rectArea=" + rectArea + "]";
	}
	
	
	

}
