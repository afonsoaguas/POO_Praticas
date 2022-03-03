
public class Aluno {
	
	private int numero;
	private String nome;
	private int anoMatricula;
	private int anoNascimento;
	
	public Aluno(int numero, String nome, int anoMatricula, int anoNascimento) {
		this.numero = numero;
		this.nome = nome;
		this.anoMatricula = anoMatricula;
		this.anoNascimento = anoNascimento;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoMatricula() {
		return anoMatricula;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Numero: " + numero + " Ano Matricula: " + anoMatricula + " Ano Nascimento: " + anoNascimento + "\n" ;
	}
	
	
	
}
