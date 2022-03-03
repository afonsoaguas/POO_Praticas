import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

// Codigo base para os exs 8.4 a 8.7
// Parte do principio que se usa uma classe Wordstats onde estao 
// implementados os algoritmos. 

// Se preferir pode ignorar este codigo e seguir uma abordagem diferente

public class Test {

	private static String filename = "OsMaias-Cap1-ansi.txt";
	private static int MINWORDLENGTH = 3;
	private static int NTOP = 5;
	
	public static void main(String[] args) {
		
		WordStats ws = new WordStats(new File(filename));
		
		try {
			
			// Ex 8.4
			System.out.println("Different words on " + filename + ": " + ws.countDifferentWords());
			
			System.out.println("=============================================================");
			
			// Ex 8.5
			ws.wordInterval(3, "lisboa", "livre").forEach(s -> System.out.println(s));
			
			System.out.println("=============================================================");
			
			// Ex 8.6
			showMap(ws.topWords(MINWORDLENGTH, NTOP));
			
			System.out.println("=============================================================");
			
			// Ex 8.7
			showMap(ws.wordCountInInterval(1, "0", "lisboas"));
			
		} catch (FileNotFoundException e) {
			System.err.println("File " + filename + "not found ");
		}
	}

	
	static void showMap(Map<String, Integer> map) {
		for (String word : map.keySet())
			System.out.println(word + ": " + map.get(word));
		
	}
}
