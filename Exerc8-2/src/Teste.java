
public class Teste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(1, "Ana");
		Aluno a2 = new Aluno(2, "Rui");
		Aluno a3 = new Aluno(3, "Maria");
		Aluno a4 = new Aluno(4, "Rita");
		Aluno a5 = new Aluno(5, "Joao");
		Aluno a6 = new Aluno(6, "Luis");
		Aluno a7 = new Aluno(7, "Antonio");
		
		
		HorarioDuvidas hd = new HorarioDuvidas();
		
		hd.marcar(a7);
		hd.marcar(a1);
		hd.marcar(a4);
		
		hd.chegada(a5);
		hd.chegada(a4);
		hd.chegada(a7);
		hd.chegada(a2);
		hd.chegada(a6);
		hd.chegada(a3);
		hd.chegada(a1);
		
		while (!hd.filaVazia()) {
			System.out.println(hd.proximo());
		}
		
		
		
		
		

	}

}
