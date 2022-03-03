
public class CharacterStats {
	
	/**
	 * Input: -Frase
	 * Output: -frequencia de cada letra da frase
	 */

	public static void main(String[] args) {
		//Percorrer todos os argumentos
		//Guardar a frequencia de cada letra das diferentes palavras
		//Imprimir a frequencia de cada letra
		CharacterData val = new CharacterData();
		//val.count.length=args.length;
		for(int i=0; i<args.length; i++) {
			val.addWord(args[i]);
		}
		for(int j=0; j<val.count.length; j++) {
			if (val.count[j] != 0) {
				System.out.println((char)(j+'a') + ": " + val.count[j] + " (" + ((100.0*val.count[j])/val.total) + "%)" );
			}
		}
	
	}
}
