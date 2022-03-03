
public class Teste {

	public static void main(String[] args) {
				
		Time t0 = new Time(45,30);
		Time t1 = new Time("30:45");

		System.out.println("t0: " + t0);
		System.out.println("t1: " + t1);
		System.out.println("t0+t1: " + t0.add(t1));
		System.out.println("t1-t0: " + t0.sub(t1));
		System.out.println("t1>t0?: " + t1.isGreaterThan(t0));
		System.out.println("t1<t0?: " + t1.isLessThan(t0));	
	}		
}
