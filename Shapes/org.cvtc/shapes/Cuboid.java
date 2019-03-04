package shapes;

/**
 * @author Matthew M Marx
 *
 */


public class Cuboid extends Shape implements Renderer{

	// Attributes
	private float width = 0f;
	private float height = 0f;
	private float depth = 0f;
	
	// Constructor
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
		super(messageBox);
		if (width < 0 || height < 0 || depth < 0) {
			this.width = 1;
			this.height = 1;
			this.depth = 1;
			System.out.println("Negative Cuboid values detected: Defaulting all values to 1");
		} else {
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
	}	

	// Getter/Setter
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	// Overrides/Methods
	@Override
	public float getSurfaceArea() {
		return 6 * (width*width);		
	}

	@Override
	public float getVolume() {	
		return depth * width * height;
	}

	@Override
	public void render() {		
		messageBox.show("Cuboid: Width = " + this.getWidth() +
								 " Height = " + this.getHeight() +
								 " Depth = " + this.getDepth() +
								 " Surface Area = " + this.getSurfaceArea() +
								 " Volume = " + this.getVolume(), "Cuboid");
	}

}
