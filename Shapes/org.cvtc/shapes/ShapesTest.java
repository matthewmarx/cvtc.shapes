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
		Cuboid cuboid = new Cuboid(1, 1, 1);
		cuboid.render();
		Cylinder cylinder = new Cylinder(1, 1);
		cylinder.render();
		Sphere sphere = new Sphere(1);
		sphere.render();
	}
}
