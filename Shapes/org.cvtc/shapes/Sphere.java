package shapes;

/**
 * @author Matthew M Marx
 *
 */

public class Sphere extends Shape implements Renderer {

	// Attributes
	private float radius = 0f;
	
	// Constructor
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		if (radius < 0) {
			this.radius = 1;
			System.out.println("Negative Sphere values detected: Defaulting all values to 1");
		} else {
		this.radius = radius;
		}
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
	public float getSurfaceArea() {	
		return (float) (4 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float getVolume() {		
		return (float) (4 * Math.PI * Math.pow(radius, 3)) / 3;
	}

	@Override
	public void render() {
		messageBox.show("Sphere: Radius = " + this.getRadius() +
				 " Surface Area = " + this.getSurfaceArea() +
				 " Volume = " + this.getVolume(), "Sphere");
	}	
}
