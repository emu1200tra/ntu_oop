// Coding by b04902028 Hung Hao Hsiang
// This is shape problem
// Triangle shape extending from shape

public class Triangle extends Shape{
	public Triangle(double length) {	//init from parent
		super(length);
	}
	public void setLength(double length) {	//set length with required value
		this.length = length;
	}
	public double getArea() {	//calculate the area of triangle
		return Math.round((Math.sqrt(3) / 4) * Math.pow(this.length, 2) * 100.0) / 100.0;
	}
	public double getPerimeter() {	//calculate the perimeter of triangle
		return Math.round(this.length * 3 * 100.0) / 100.0;
	}
	
}
