import java.util.Iterator;

public class Interval implements Iterable<Integer>{
	
	private final int min;
	private final int max;
	public static final Interval EMPTY = new Interval(0,-1);
	
	Interval(int min, int max) {
		this.min=min;
		this.max=max;
	}
	
	public boolean isEmpty() {
		return max<min;
	}
	
	public int sizeInterval() {
		return isEmpty() ? 0 : max-min+1;
	}
	
	public static Interval naturals(int max) {
		return max<1 ? EMPTY : new Interval(1,max);
	}
	
	public static Interval vectorInterval(int[] v) {
		return v==null? EMPTY : new Interval(v[0],v[v.length-1]);
	}
	
	public static Interval empty() {
		return EMPTY;
	}
	
	@Override
	public String toString() {
		return "[" + min + ", " + max + "]";
	}

	@Override
	public Iterator<Integer> iterator() {
		
		return new IntervalIterator();
	}
	
	private class IntervalIterator implements Iterator<Integer> {
		
		private int count;
		
		public IntervalIterator() {
			count = 0;
		}
		
		@Override
		public boolean hasNext() {
			return count >= sizeInterval() ? false : true;
		}

		@Override
		public Integer next() {
			return min+count++;
		}
		
	}

}
