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
		Cuboid cuboid = new Cuboid(10, 10, 10);
		cuboid.render();
		Cylinder cylinder = new Cylinder(10, 10);
		cylinder.render();
		Sphere sphere = new Sphere(10);
		sphere.render();
	}
}
