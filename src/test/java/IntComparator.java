import java.util.*;

public class IntComparator {

	public static final Comparator<Integer> intComparator = new Comparator<Integer>() {
		public int compare(Integer a, Integer b) {
			if(a == b) return 0;
			if(a == null) return -1;
			return a.compareTo(b);
		}
	};

}
