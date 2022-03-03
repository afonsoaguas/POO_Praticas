/** 
 * INPUT:  Vetor de string args
 * OOUTPUT: -Imprime nr inteiros
 * 			-Imprime nr de não inteiros
 * 			-Imprime soma dos inteiros
 */
public class CheckIntegers {
	
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i=0; i< args.length; i++) {
			if ( isInt(args[i]) ) {
				count++;
				sum += stringToInteger(args[i]);
			}
		}
		
		System.out.println("Encontrei " + count + " inteiros");
		System.out.println("Encontrei " + (args.length - count) + " termos não inteiros");
		System.out.println("Somatório dos inteiros: " + sum );
		
	}
	
	/**
	 * 
	 *  Verifica se uma String é um numero inteiro
	 *  Inteiro positivo (sem sinal) "1234" é inteiro
	 *  "+1234" "12.4" não é inteiro
	 *  Input: String
	 *  Output: boolean
	 *  
	 */
	
	public static boolean isInt(String str) {
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if ( c < '0' || c > '9' ) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * Conversao de String para inteiros
	 * Input: String
	 * Output: int
	 * Inteiros positivos -> Contem caracteres '0' ao '9'
	 * 
	 */
	
	public static int stringToInteger(String str) {
		int val = 0;
		int power = 1;
		for (int i=str.length()-1; i>=0; i--) {
			int digit = str.charAt(i) - '0'; //Conversão de char para int
			val += digit * power;
			power *= 10;
		}
		return val;
	}

}
