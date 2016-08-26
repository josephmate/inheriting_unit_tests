import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CompositionInefficientMapTest {
	
	@Test
	public void testBasicRequirements() {
		CompositionMapTest basicTests = new CompositionMapTest(
			new CompositionMapTest.MapFactory() {
				public Map<Integer,Integer> make() {
					return new InefficientMap<>();
				}
			});
		basicTests.testAll();
	}

}
