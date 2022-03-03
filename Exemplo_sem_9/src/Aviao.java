
public class Aviao extends Veiculo {
	
	private String companhia;

	public Aviao(String companhia) {
		this.companhia = companhia;
	}

	@Override
	public String toString() {
		return "Aviao [companhia=" + companhia + "]";
	}
	
}
