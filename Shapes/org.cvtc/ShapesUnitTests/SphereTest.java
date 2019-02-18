package ShapesUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Dialog;
import shapes.MessageBox;
import shapes.Sphere;

public class SphereTest {
	
	Dialog messageBox = new MessageBox();
	Sphere sphere = new Sphere(messageBox, 1.0f);
	Sphere sphereBig = new Sphere(messageBox, 10.0f);
	Sphere sphereNeg = new Sphere(messageBox, -1.0f);

	@Test
	public void testSurfaceArea() {
		assertEquals(12.57f, sphere.getSurfaceArea(), 0.1f);
		assertEquals(1256.64f, sphereBig.getSurfaceArea(), 0.1f);
		assertEquals(12.57f, sphere.getSurfaceArea(), 0.1f);
	}

	@Test
	public void testVolume() {
		assertEquals(4.19f, sphere.getVolume(), 0.1f);
		assertEquals(4188.79f, sphereBig.getVolume(), 0.1f);
		assertEquals(-4.19f, sphereNeg.getVolume(), 0.1f);
	}

	@Test
	public void testSphere() {
		assertSame(Sphere.class, sphere.getClass());
	}

	@Test
	public void testGetRadius() {
		assertEquals(1.0f, sphere.getRadius(), 0.0f);
	}

}
