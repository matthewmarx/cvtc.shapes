package shapes;

import javax.swing.JOptionPane;

/**
 * @author Matthew M Marx
 *
 */


public class Cuboid extends Shape {

	// Attributes
	private float width = 0f;
	private float height = 0f;
	private float depth = 0f;
	private String message = "";
	
	// Constructor
	public Cuboid(float width, float height, float depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
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
	public float surfaceArea() {
		return 6 * (width*width);
	}

	@Override
	public float volume() {		
		return depth * width * height;
	}

	@Override
	public void render() {
		if (width <= 0 || height <= 0 || depth <= 0) {
			message = "Cuboid error! Cannot use negative values!";
		} else {
		message = "Cuboid Dimensions: Width = " + width + ". Height = " + height + ". Depth = " + depth + ". Surface area = " + surfaceArea() + ". Volume = " + volume();
		}
		JOptionPane.showMessageDialog(null, message);		
	}	
}
