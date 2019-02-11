package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {
	
	Cylinder cylinder = new Cylinder(1.0f, 1.0f);
	Cylinder cylinderBig = new Cylinder(10.0f, 10.0f);
	Cylinder cylinderNeg = new Cylinder(-1.0f, -1.0f);

	@Test
	public void testSurfaceArea() {
		assertEquals(12.57f, cylinder.surfaceArea(), 0.1f);
		assertEquals(1256.64f, cylinderBig.surfaceArea(), 0.1f);
		assertEquals(12.57f, cylinderNeg.surfaceArea(), 0.1f);
	}

	@Test
	public void testVolume() {
		assertEquals(3.14f, cylinder.volume(), 0.1f);
		assertEquals(3141.59f, cylinderBig.volume(), 0.1f);
		assertEquals(-3.14f, cylinderNeg.volume(), 0.1f);
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
