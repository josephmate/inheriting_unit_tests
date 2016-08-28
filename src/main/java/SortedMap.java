import java.util.*;

public class SortedMap<K,V> implements Map<K,V> {

	private final InefficientMap<K,V> internalMap = new InefficientMap<>();
	private final Comparator<K> order;

	public SortedMap(Comparator<K> order) {
		this.order = order;
	}
	
	public void put(K key, V value) {
		internalMap.put(key, value);
	}

	public V get(K key) {
		return internalMap.get(key);
	}

	public List<K> getKeys() {
		List<K> sortedResult = new ArrayList(internalMap.getKeys());
		Collections.sort(sortedResult, order);
		return sortedResult;
	}

}
