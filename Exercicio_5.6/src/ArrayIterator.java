import java.util.Iterator;

public class ArrayIterator <T> implements Iterator<T>{
	
	private T[] array;
	private int count = 0;
	
	public ArrayIterator(T[] array) {
		this.array=array;
	}

	@Override
	public boolean hasNext() {
		return count<array.length;
	}

	@Override
	public T next() {
		return array[count++];
	}

}
