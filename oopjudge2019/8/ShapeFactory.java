// Coding by b04902028 Hung Hao Hsiang
// This is Shape problem
// ShapeFactory that manage all the shapes
public class ShapeFactory {
	public enum Type{	//enum all the shapes
		Square,
		Triangle,
		Circle
	}
	
	public Shape createShape(ShapeFactory.Type shapeType, double length) {
		//create required shape and return
		switch(shapeType) {
			case Square:
				return new Square(length);
			case Triangle:
				return new Triangle(length);
			case Circle:
				return new Circle(length);
			default:
				return new Square(length);
		}
		
	}
}
