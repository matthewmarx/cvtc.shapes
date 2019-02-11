package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTest {
	
	Sphere sphere = new Sphere(1.0f);
	Sphere sphereBig = new Sphere(10.0f);
	Sphere sphereNeg = new Sphere(-1.0f);

	@Test
	public void testSurfaceArea() {
		assertEquals(12.57f, sphere.surfaceArea(), 0.1f);
		assertEquals(1256.64f, sphereBig.surfaceArea(), 0.1f);
		assertEquals(12.57f, sphere.surfaceArea(), 0.1f);
	}

	@Test
	public void testVolume() {
		assertEquals(4.19f, sphere.volume(), 0.1f);
		assertEquals(4188.79f, sphereBig.volume(), 0.1f);
		assertEquals(-4.19f, sphereNeg.volume(), 0.1f);
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
