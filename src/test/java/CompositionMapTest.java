import static org.junit.Assert.*;
import org.junit.*;

public class CompositionMapTest {

	public interface MapFactory {
		/**
		 * Return a new instance of your implementation of Map<>
		 */
		Map<Integer,Integer> make() ;
	}

	private MapFactory mapFactory;

	public CompositionMapTest(MapFactory mapFactory) {
		this.mapFactory = mapFactory;
	}

	public void testAll() {
		testNonExistantKey();
		testExistantReturnsCorrect();
		testValueReplaced();
	}

	/**
	 * Getting a key that doesn't exist is null
	 */
	private void testNonExistantKey() {
		Map<Integer,Integer> map = mapFactory.make();
		assertEquals(null, map.get(0));
	}

	/**
	 * Getting a key that exist is returns the value
	 */
	private void testExistantReturnsCorrect() {
		Map<Integer,Integer> map = mapFactory.make();
		map.put(0, 10);
		assertEquals(Integer.valueOf(10), map.get(0));
	}

	/**
	 * Getting a key that was replaced is returns the new value.
	 */
	private void testValueReplaced() {
		Map<Integer,Integer> map = mapFactory.make();
		map.put(0, 10);
		map.put(0, 12);
		assertEquals(Integer.valueOf(12), map.get(0));
	}


}
