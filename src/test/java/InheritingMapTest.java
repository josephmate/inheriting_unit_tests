import static org.junit.Assert.*;
import org.junit.*;

public abstract class InheritingMapTest {
	
	/**
	 * Return a new instance of your implementation of Map<>
	 */
	protected abstract Map<Integer,Integer> makeMap() ;

	/**
	 * Getting a key that doesn't exist is null
	 */
	@Test
	public void testNonExistantKey() {
		Map<Integer,Integer> map = makeMap();
		assertEquals(null, map.get(0));
	}

	/**
	 * Getting a key that exist is returns the value
	 */
	@Test
	public void testExistantReturnsCorrect() {
		Map<Integer,Integer> map = makeMap();
		map.put(0, 10);
		assertEquals(Integer.valueOf(10), map.get(0));
	}

	/**
	 * Getting a key that was replaced is returns the new value.
	 */
	@Test
	public void testValueReplaced() {
		Map<Integer,Integer> map = makeMap();
		map.put(0, 10);
		map.put(0, 12);
		assertEquals(Integer.valueOf(12), map.get(0));
	}


}
