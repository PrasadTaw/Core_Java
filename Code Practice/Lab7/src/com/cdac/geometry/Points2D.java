package com.cdac.geometry;

import java.lang.Math;

public class Points2D {
	
	private int x;
	private int y;
	public Points2D() {
		super();
	}
	
	public Points2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String show() {
		return "(x, y): ( "+this.x+" , "+this.y+" )";
	}
	
	public boolean isEqual(Points2D p) {
		if(this.x == p.x && this.y == p.y)
			return true;
		else
			return false;
	}
	
	public double calculateDistance(Points2D p) {
		double d = 0;
		d = Math.sqrt((double)((p.x - this.x)*(p.x - this.x) - (p.y - this.y)*(p.y - this.y)));
		return d;
	}

}
