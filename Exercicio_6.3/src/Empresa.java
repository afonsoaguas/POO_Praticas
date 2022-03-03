import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Funcionario> list;
	
	public Empresa() {
		list = new ArrayList<>();
	}
	
	public double salarioApagar() {
		double total=0;
		for(Funcionario f : list)
			total += f.salario();
		return total;
	}
	
	public void add(Funcionario f) {
		list.add(f);
	}
	
	public void remove(Funcionario f) {
		list.remove(f);
	}
}
