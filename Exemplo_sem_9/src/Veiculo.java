
public abstract class Veiculo {
	
	public static Veiculo create(String type, String info) {
		
		switch(type) {
		
		case "Carro" : return new Carro(info);
		case "Barco" : return new Barco(info);
		case "Aviao" : return new Aviao(info);
		
		default: throw new IllegalArgumentException();
		}
	}

}
