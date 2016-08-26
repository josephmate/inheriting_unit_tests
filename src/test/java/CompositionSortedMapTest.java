import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CompositionSortedMapTest {
	
	@Test
	public void testBasicRequirements() {
		CompositionMapTest basicTests = new CompositionMapTest(
			new CompositionMapTest.MapFactory() {
				public Map<Integer,Integer> make() {
					return new SortedMap<>();
				}
			});
		basicTests.testAll();
	}

	/**
	 * Keys are returned in sorted order
	 */
	@Test
	public void testKeysSorted() {
		SortedMap<Integer,Integer> map = new SortedMap<>();
		map.put(2,12);
		map.put(1,11);
		map.put(3,13);
		List<Integer> keys = map.getKeys();
		for(int i = 0 ; i<3; i++) {
			assertEquals(Integer.valueOf(i+1),keys.get(i));
		}
	}

}
