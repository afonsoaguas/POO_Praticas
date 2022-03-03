import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(21, "Francisco Maria", 1998, 1950);
		Aluno a2 = new Aluno(18, "Dazer Maria", 1998, 1950);
		Aluno a3 = new Aluno(40, "GOUCHAaa Maria", 1700, 1640);
		Aluno a4 = new Aluno(67, "Maria Albertina", 1978, 1940);
		Aluno a5 = new Aluno(70, "Vanessa Maria", 1938, 1959);
		Aluno a6 = new Aluno(35, "Quim Barreiros", 2069, 1969);
		Aluno a7 = new Aluno(47, "Toy Story", 1750, 1834);
		
		List<Aluno> lista=new ArrayList<>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		lista.add(a6);
		lista.add(a7);
		
		lista.sort(new ComparadorMix());
		
		System.out.println(lista);
		
		lista.sort(new ComparadorNumero());
		
		System.out.println(lista);
		
		lista.sort(new ComparadorNome());
		
		System.out.println(lista);
		
	}

}
