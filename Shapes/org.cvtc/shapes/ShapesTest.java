/**
 * 
 */
package shapes;

/**
 * @author Matthew M Marx
 *
 */

public class ShapesTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ShapesFactory shapeFactory = new ShapesFactory();

		Shape shape1 = shapeFactory.getShape("Cuboid");
		shape1.render();
		Shape shape2 = shapeFactory.getShape("Cylinder");
		shape2.render();
		Shape shape3 = shapeFactory.getShape("Sphere");
		shape3.render();
		
		//Cuboid cuboid = new Cuboid(messageBox, 1, 1, 1);
		//cuboid.render();		
		//Cylinder cylinder = new Cylinder(messageBox, 1, 1);
		//cylinder.render();		
		//Sphere sphere = new Sphere(messageBox, 1);
		//sphere.render();
	}
}
