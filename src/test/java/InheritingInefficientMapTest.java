public class InheritingInefficientMapTest extends InheritingMapTest {
	
	protected Map<Integer,Integer> makeMap() {
		return new InefficientMap<>();
	}

}
