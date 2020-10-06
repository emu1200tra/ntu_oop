// Coding by b04902028 Hung Hao Hsiang
// This is Shape problem
// Circle shape extending from shape
public class Circle extends Shape{
	public Circle(double length) {	//init from parent
		super(length);
	}
	public void setLength(double length) {	//set length from specific value
		this.length = length;
	}
	public double getArea() {	//calculate the area of circle
		return Math.round(Math.pow(this.length/2, 2) * Math.PI * 100.0) / 100.0;
	}
	public double getPerimeter() {	//calculate the perimeter of circle
		return Math.round(this.length * Math.PI * 100.0) / 100.0;
	}
}
