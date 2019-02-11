package shapes;

import javax.swing.JOptionPane;

/**
 * @author Matthew M Marx
 *
 */


public class Sphere extends Shape {

	// Attributes
	private float radius = 0f;
	private String message = "";
	
	// Constructor
	public Sphere(float radius) {
		super();
		this.radius = radius;
	}

	// Getter/Setter
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	// Overrides/Methods
	@Override
	public float surfaceArea() {		
		return (float) (4 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float volume() {		
		return (float) (4 * Math.PI * Math.pow(radius, 3)) / 3;
	}

	@Override
	public void render() {
		if (radius <= 0) {
			message = "Sphere error! Cannot use negative values!";
		} else {
		message = "Sphere Dimensions: Radius = " + radius + ". Surface area = " + surfaceArea() + ". Volume = " + volume();
		}
		JOptionPane.showMessageDialog(null, message);	
	}
	
	
}
