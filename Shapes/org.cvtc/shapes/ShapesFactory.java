package shapes;

public class ShapesFactory {
	
	Dialog messageBox = new MessageBox();

	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("Cuboid")){
			return new Cuboid(messageBox, 1, 1, 1);
		} else if (shapeType.equalsIgnoreCase("Sphere")){
			return new Sphere(messageBox, 1);
		} else if (shapeType.equalsIgnoreCase("Cylinder")){
			return new Cylinder(messageBox, 1, 1);
		}		
		return null;
	}
	
}
