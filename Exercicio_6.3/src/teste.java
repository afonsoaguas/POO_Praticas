import java.util.ArrayList;
import java.util.List;

public class teste {

	public static void main(String[] args) {
		
		List<Funcionario> staff = new ArrayList<>();
		
		staff.add(new Funcionario("Sr. Zé", 1));
		staff.add(new Funcionario("Sr. João", 2));
		staff.add(new Gerente("Sr. Manuel", 3, true));
		staff.add(new Diretor("Dr. Mula Russa", 4, "Marketing"));
		
		for (Funcionario f : staff)
			System.out.println(f);
	}

}