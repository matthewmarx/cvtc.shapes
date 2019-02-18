package shapes;

/**
 * @author Matthew M Marx
 *
 */


public class Cylinder extends Shape implements Renderer{

	//Attributes
	private float radius = 0.0f;
	private float height = 0.0f;
	
	// Constructor
	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
		if (radius < 0 || height < 0) {
			System.out.println("Negative Cylinder values detected: Defaulting all values to 1");
			this.radius = 1;
			this.height = 1;
		} else {
			this.radius = radius;
			this.height = height;
		}
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
	public float getSurfaceArea() {		
		return (float) ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
	}
	
	@Override
	public float getVolume() {		
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}
	
	@Override
	public void render() {
		messageBox.show("Cylinder: Radius = " + this.getRadius() +
				 " Height = " + this.getHeight() +
				 " Surface Area = " + this.getSurfaceArea() +
				 " Volume = " + this.getVolume(), "Cylinder");
	}
		
}
