import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HorarioDuvidas {

	private List<Aluno> marcacoes = new LinkedList<>();
	private Queue<Aluno> filaAtendimento = new PriorityQueue<>(new ComparadorAlunos());
	
	private boolean temMarcacao(Aluno a) {
		return marcacoes.contains(a);
	}
	
	public void marcar(Aluno a) {
		marcacoes.add(a);
	}
	
	public void chegada(Aluno a) {
		filaAtendimento.offer(a);
	}

	public Aluno proximo() {
		return filaAtendimento.poll();
	}
	
	public boolean filaVazia() {
		return filaAtendimento.isEmpty();
	}
	
	// Definicao de um comparador, neste caso Comparator, que 
	// define a ordem de atendimento com base nas regras
	public class ComparadorAlunos implements Comparator<Aluno> {

		@Override
		public int compare(Aluno a1, Aluno a2) {
			
			// quando ambos os alunos tem marcacao, tem prioridade quem 
			// marcou primeiro
			if (temMarcacao(a1) && temMarcacao(a2) )
				return marcacoes.indexOf(a1) - marcacoes.indexOf(a2);
			
			// casos em que so' um deles tem marcacao  
			// o que tiver marcacao fica 'a frente do que nao tem
			if (temMarcacao(a1))
				return -1;
			
			if (temMarcacao(a2))
				return 1;
			
			// caso em que nenhum deles tem marcacao
			// fica 'a frente o que tiver numero mais baixo
			return a1.getNumero() - a2.getNumero();
		}
		
	}
}
