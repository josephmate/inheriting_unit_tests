import java.util.*;

public class SortedMap<K,V> implements Map<K,V> {

	private java.util.SortedMap<K,V> internalMap = new TreeMap<>();

	public SortedMap() { }
	
	public void put(K key, V value) {
		internalMap.put(key, value);
	}

	public V get(K key) {
		return internalMap.get(key);
	}

	public List<K> getKeys() {
		return new ArrayList(internalMap.keySet());
	}

}
