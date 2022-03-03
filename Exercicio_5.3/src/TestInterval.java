
public class TestInterval {

	public static void main(String args[]) {
		Interval test1 = new Interval(3,5);
		Interval test2 = Interval.naturals(10);
		int v[] = {1, 2, 3, 4};
		Interval test3 = Interval.vectorInterval(v);
		Interval test4 = Interval.empty();
		
		Interval test5 = Interval.naturals(0);
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		
		for(Integer i : test2)
			System.out.println(i);
	}
}
