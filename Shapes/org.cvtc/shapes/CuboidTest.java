package shapes;

import static org.junit.Assert.*; 
import org.junit.Test;

public class CuboidTest {

	Cuboid cuboid = new Cuboid(1.0f, 1.0f, 1.0f);
	Cuboid cuboidZero = new Cuboid(0.0f, 0.0f, 0.0f);
	Cuboid cuboidNeg = new Cuboid(-1.0f, -1.0f, -1.0f);
	
	@Test
	public void testSurfaceArea() {		
		assertEquals(6.0f, cuboid.surfaceArea(), 0.0f);
		assertEquals(0.0f, cuboidZero.surfaceArea(), 0.0f);
		assertEquals(6.0f, cuboidNeg.surfaceArea(), 0.0f);
	}

	@Test
	public void testVolume() {
		assertEquals(1.0f, cuboid.volume(), 0.0f);
		assertEquals(0.0f, cuboidZero.volume(), 0.0f);
		assertEquals(-1.0f, cuboidNeg.volume(), 0.0f);
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
