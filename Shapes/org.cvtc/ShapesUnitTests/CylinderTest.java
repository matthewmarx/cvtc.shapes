package ShapesUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Cylinder;
import shapes.Dialog;
import shapes.MessageBox;

public class CylinderTest {
	
	Dialog messageBox = new MessageBox();
	Cylinder cylinder = new Cylinder(messageBox, 1.0f, 1.0f);
	Cylinder cylinderBig = new Cylinder(messageBox, 10.0f, 10.0f);
	Cylinder cylinderNeg = new Cylinder(messageBox, -1.0f, -1.0f);

	@Test
	public void testSurfaceArea() {
		assertEquals(12.57f, cylinder.getSurfaceArea(), 0.1f);
		assertEquals(1256.64f, cylinderBig.getSurfaceArea(), 0.1f);
		assertEquals(12.57f, cylinderNeg.getSurfaceArea(), 0.1f);
	}

	@Test
	public void testVolume() {
		assertEquals(3.14f, cylinder.getVolume(), 0.1f);
		assertEquals(3141.59f, cylinderBig.getVolume(), 0.1f);
		assertEquals(-3.14f, cylinderNeg.getVolume(), 0.1f);
	}

	@Test
	public void testCylinder() {
		assertSame(Cylinder.class, cylinder.getClass());
	}

	@Test
	public void testGetRadius() {
		assertEquals(1.0f, cylinder.getRadius(), 0.0f);
	}

	@Test
	public void testGetHeight() {
		assertEquals(1.0f, cylinder.getHeight(), 0.0f);
	}

}
