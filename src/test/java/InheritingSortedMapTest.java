import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class InheritingSortedMapTest extends InheritingMapTest {
	
	protected Map<Integer,Integer> makeMap() {
		return new SortedMap<>();
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
