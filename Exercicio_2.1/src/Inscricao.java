
public class Inscricao {

	public static final int NA = -1;
	private int nota;
	private Aluno aluno;

	public Inscricao(Aluno aluno) {
		nota = NA;
		this.aluno = aluno;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		if ( (nota<0 || nota>20) && nota!=NA) {
			System.err.println("Nota Inválida");
			return;
		}	
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public boolean temNota() {
		return nota!=NA;
	}

	@Override
	public String toString() {
		return aluno + " - " + (nota==NA? "NA" : nota + " val.");
	}

}
