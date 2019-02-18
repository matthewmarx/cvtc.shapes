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
		
		Dialog messageBox = new MessageBox();
		
		Cuboid cuboid = new Cuboid(messageBox, 1, 1, 1);
		cuboid.render();
		
		Cylinder cylinder = new Cylinder(messageBox, 1, 1);
		cylinder.render();
		
		Sphere sphere = new Sphere(messageBox, 1);
		sphere.render();
	}
}
