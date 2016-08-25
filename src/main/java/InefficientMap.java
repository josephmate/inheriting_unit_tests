import java.util.*;

public class InefficientMap<K,V> implements Map<K,V> {

	private List<K> keys = new ArrayList<>();

	private List<V> values = new ArrayList<>();

	public InefficientMap() { }
	
	public void put(K key, V value) {
		int index = keys.indexOf(key);
		if(index >=0) {
			values.set(index, value);
		} else {
			keys.add(key);
			values.add(value);
		}
	}

	public V get(K key) {
		int index = keys.indexOf(key);
		if(index >=0) {
			return values.get(index);
		}
		return null;
	}

	public List<K> getKeys() {
		return new ArrayList(keys);
	}

}
