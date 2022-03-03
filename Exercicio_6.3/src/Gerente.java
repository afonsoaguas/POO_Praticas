
public class Gerente extends Funcionario{
	
	private  boolean objetivoVendas; 
	
	public Gerente(String nome, int id, boolean objetivoVendas) {
		super(nome, id);
		this.objetivoVendas=objetivoVendas;
	}
	
	@Override
	public double salario() {
		return objetivoVendas? super.salario() + 200.0 : super.salario();
	}

}

