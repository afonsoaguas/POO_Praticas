import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		Time t1 = new Time(5,30);
		Time t2 = new Time(5,30);
		
		List<Time> tempos = new ArrayList<>();
		
		tempos.add(t1);
		
		System.out.println(tempos.contains(t2));
	}
}
