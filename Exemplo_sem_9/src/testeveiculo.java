import java.util.ArrayList;
import java.util.List;

public class testeveiculo {

	public static void main(String[] args) {
		
		List<Veiculo> lista = new ArrayList<>();
		
		lista.add(Veiculo.create("Carro", "Opel Corsa"));
		lista.add(Veiculo.create("Aviao", "TAP"));
		lista.add(Veiculo.create("Barco", "Rei dos 7 Mares"));
		lista.add(Veiculo.create("Carro", "Seat Leon"));
		
		for (Veiculo v : lista) {
			System.out.println(v);
		}
	}

}
