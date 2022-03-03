
public class Barco extends Veiculo {
	
	private String nome;

	public Barco(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Barco [nome=" + nome + "]";
	}

}
