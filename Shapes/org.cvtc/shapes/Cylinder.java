package shapes;

import javax.swing.JOptionPane;

/**
 * @author Matthew M Marx
 *
 */


public class Cylinder extends Shape{

	//Attributes
	private float radius = 0f;
	private float height = 0f;
	
	// Constructor
	public Cylinder(float radius, float height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	
	// Getter/Setter
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	// Overrides/Methods
	@Override
	public float surfaceArea() {		
		return (float) ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
	}
	
	@Override
	public float volume() {		
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}
	
	@Override
	public void render() {
		String message = "Cylinder Dimensions: Radius = " + radius + ". Height = " + height + ". Surface area = " + surfaceArea() + ". Volume = " + volume();
		JOptionPane.showMessageDialog(null, message);		
	}	
		
}
