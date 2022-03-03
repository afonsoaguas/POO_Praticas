import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		Time t1 = new Time(5,30);
		Time t2 = new Time(2,20);
		Time t3 = new Time(5,10);
		Time t4 = new Time(4,30);
		
		List<Time> tempos = new ArrayList<>();
		tempos.add(t1);
		tempos.add(t2);
		tempos.add(t3);
		tempos.add(t4);
		
		tempos.sort(null); // Com o argumento do sort(...) a null, 
		                   // sera' usado o Comparable que estiver definido
		                   // na classe dos elementos da lista, neste caso
						   // a implementacao de Comparable na classe Time
		
		tempos.forEach(t -> System.out.println(t));
		
		// Definir um Time repetido, para testar a igualdade
		Time tr = new Time(5,30);
		
		// Como Time foi implementado como objeto de valor
		// tr será considerado igual a t1, pelo que o contains(...)
		// irá devolver true
		System.out.println(tempos.contains(tr));
		
	}

}
