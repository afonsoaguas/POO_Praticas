import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIteravel {	
	public static void main(String[] args) {

		List<Integer> numeros= new ArrayList<>();
		numeros.add(15);
		numeros.add(16);
		numeros.add(17);
		numeros.add(18);
		numeros.add(20);
		System.out.println("A média é: " + average(numeros));
		
	}
	
	public static double average(Iterable<Integer> iterable) {
		
		Iterator<Integer> it = iterable.iterator();
		
		int total = 0, nElems = 0;
		
		while(it.hasNext()) {
			total += it.next();
			nElems++;
		}
				
		return (double) total / nElems;
	}
}
