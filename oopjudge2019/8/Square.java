// Coding by b04902028 Hung Hao Hsiang
// This is Shape problem
// Square shape extending from shape object
public class Square extends Shape{
	public Square(double length) {	//init from parent
		super(length);
	}
	public void setLength(double length) { //set the length with required value
		this.length = length;
	}
	public double getArea() {	//calculate the area of the square
		return Math.round(this.length * this.length * 100.0) / 100.0;
	}
	public double getPerimeter() {	//calculate the perimeter of the square
		return Math.round(this.length * 4 * 100.0) / 100.0;
	}
}
