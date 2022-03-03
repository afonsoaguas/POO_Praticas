import java.util.Scanner;

public class FilterWords {

	/**
	 *  Input:	-Vetor args
	 *  		-Frase inseridas teclado (Scanner)
	 *  Output: Imprimir frase filtrada
	 */

	public static void main(String[] args) {
		//Ciclo para receber frases do utilizador
		//para quando encontra " "
		//Imprime frase
		//Recebe frase do Utilizador
		// filtra frase (FilterPhrase)
		//Apresenta frase filtrada
		Scanner scanner=new Scanner(System.in);
		while(true) {

			System.out.println("Insira a frase: ");
			String line = scanner.nextLine();
			if ("".equals(line)) {
				break;
			}
			String filtered = filterPhrase(line, args);
			System.out.println("Filtrada: " + filtered);

		}
		scanner.close();
	}

	/**
	 * Filtrar Frase
	 * Input: 	-frase (string)
	 * 			-forbidden (Vetor de string)
	 * Output:  -filtered (string)	 
	 */

	public static String filterPhrase(String phrase, String[] forbidden) {
		//Percorre string (Scanner)
		//Se token nao esta contido no vetor forbidden
		// Insere na frase filtrada
		String filtered = "";
		Scanner scanner = new Scanner(phrase);
		while(scanner.hasNext()) {
			String token = scanner.next();
			if( !contains(token, forbidden)) {
				filtered += token + " ";
			}
		}
		scanner.close();
		return filtered;
	}

	/*
	 * Verifica se token esta contido no vetor
	 * Input:	-Token (String)
	 * 			-Vector (String[])
	 * 
	 * Output: boolean
	 */

	public static boolean contains(String token, String[] vector) {
		for(int i=0; i<vector.length; i++) {
			if(token.equals(vector[i])) {
				return true;
			}
		}
		return false;
	}

}
