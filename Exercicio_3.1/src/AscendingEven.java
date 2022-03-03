
public class AscendingEven implements SortingPolicy{

	@Override
	public boolean isBefore(int a, int b) {
		if(isEven(a) == isEven(b))
			return a<b;
		else if(isEven(a) && !isEven(b))
			return true;
		else
			return false;
	}
	
	private static boolean isEven(int n) {
		return n%2==0;
	}

}
