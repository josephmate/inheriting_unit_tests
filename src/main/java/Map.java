import java.util.List;

public interface Map<K,V>  {

	void put(K key, V value);

	V get(K key);

	List<K> getKeys();

}
