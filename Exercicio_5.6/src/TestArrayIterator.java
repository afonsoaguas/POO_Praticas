
public class TestArrayIterator <T> {

	public static <T> void main(String[] args) {
		
		String[] array = {"Ol�", "Adeus", "Bye"};
		Integer[] array2 = {1,2,3,4};
		ArrayIterator<T> arrIt = new ArrayIterator(array2);
		while (arrIt.hasNext()) {
			System.out.println(arrIt.next());
		}

	}

}
