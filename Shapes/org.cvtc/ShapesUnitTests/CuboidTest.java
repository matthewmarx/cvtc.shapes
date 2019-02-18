package ShapesUnitTests;

import static org.junit.Assert.*; 
import org.junit.Test;

import shapes.Cuboid;
import shapes.Dialog;
import shapes.MessageBox;

public class CuboidTest {

	Dialog messageBox = new MessageBox();
	Cuboid cuboid = new Cuboid(messageBox, 1.0f, 1.0f, 1.0f);
	Cuboid cuboidZero = new Cuboid(messageBox, 0.0f, 0.0f, 0.0f);
	Cuboid cuboidNeg = new Cuboid(messageBox, -1.0f, -1.0f, -1.0f);
	
	@Test
	public void testSurfaceArea() {		
		assertEquals(6.0f, cuboid.getSurfaceArea(), 0.0f);
		assertEquals(0.0f, cuboidZero.getSurfaceArea(), 0.0f);
		assertEquals(6.0f, cuboidNeg.getSurfaceArea(), 0.0f);
	}

	@Test
	public void testVolume() {
		assertEquals(1.0f, cuboid.getVolume(), 0.0f);
		assertEquals(0.0f, cuboidZero.getVolume(), 0.0f);
		assertEquals(-1.0f, cuboidNeg.getVolume(), 0.0f);
	}

	@Test
	public void testCuboid() {
		assertSame(Cuboid.class, cuboid.getClass());
	}

	@Test
	public void testGetWidth() {
		assertEquals(1.0f, cuboid.getWidth(), 0.0f);
	}

	@Test
	public void testGetHeight() {
		assertEquals(1.0f, cuboid.getHeight(), 0.0f);
	}

	@Test
	public void testGetDepth() {
		assertEquals(1.0f, cuboid.getDepth(), 0.0f);
	}

}
