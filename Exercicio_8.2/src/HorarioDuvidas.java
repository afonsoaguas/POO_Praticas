import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HorarioDuvidas {
	
	private List<Aluno> marcacoes = new LinkedList<>();
	private Queue<Aluno> filaAtendimento = new PriorityQueue<>(new ComapradorAlunos());
	
	private boolean temMarcacao(Aluno a) {
		return marcacoes.contains(a);
	}
	
	
	public class ComapradorAlunos implements Comparator<Aluno> {

		@Override
		public int compare(Aluno a1, Aluno a2) {
			if(temMarcacao(a1) && temMarcacao(a2))
				return marcacoes.indexOf(a1) - marcacoes.indexOf(a2);
			if(temMarcacao(a1))
				return -1;
			if(temMarcacao(a2))
				return 1;
//			if()
//				return 0;
			return 0;
		}
		
	}

}
