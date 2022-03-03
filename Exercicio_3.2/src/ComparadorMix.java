import java.util.Comparator;

public class ComparadorMix implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		if(o1.getAnoNascimento() - o2.getAnoNascimento() !=0)
			return o1.getAnoNascimento() - o2.getAnoNascimento();
		else if(o1.getAnoMatricula() - o2.getAnoMatricula() !=0)
			return o1.getAnoMatricula() - o2.getAnoMatricula();
		else
			return String.CASE_INSENSITIVE_ORDER.compare(o1.getNome(), o2.getNome());
			
	}

}
