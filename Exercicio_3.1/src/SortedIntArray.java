import java.util.ArrayList;

public class SortedIntArray {
	
	private ArrayList<Integer> array;
	private SortingPolicy policy;
	
	public SortedIntArray(SortingPolicy policy) {
		array = new ArrayList<>();
		this.policy = policy;
	}
	
	public int size() {
		return array.size();
	}
	
	public void add(int element) {
		int index = array.size();
		for(int i = 0; i<array.size(); i++)
			if(policy.isBefore(element, array.get(i))) {
				index = i;
				break;
			}
		array.add(index, element);
	}
	
	public int get(int index) {
		return array.get(index);
	}

	@Override
	public String toString() {
		return array.toString();
	}
	
}
