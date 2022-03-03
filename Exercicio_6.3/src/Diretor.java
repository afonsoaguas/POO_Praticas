
public class Diretor extends Funcionario{
	
	private String departamento;
	private double lucroMensal;
	
	public Diretor(String nome, int id, String departamento) {
		super(nome, id);
		this.departamento=departamento;
		this.lucroMensal=0;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setLucroMensal(double value) {
		lucroMensal+=value;
	}
	
	@Override
	public double salario() {
		return super.salario() * 2.0 + 0.01*lucroMensal;
	}


	@Override
	public String toString() {
		return  super.toString() + " - dep. de " + departamento;
	}
	

}