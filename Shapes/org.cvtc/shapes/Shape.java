/**
 * 
 */
package shapes;

/**
 * @author Matthew M Marx
 *
 */

public abstract class Shape {
	protected Dialog messageBox;
	public abstract float getSurfaceArea();
	public abstract float getVolume();
	
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	protected Shape(Dialog messageBox) {
		this.messageBox = messageBox;
	}
}
