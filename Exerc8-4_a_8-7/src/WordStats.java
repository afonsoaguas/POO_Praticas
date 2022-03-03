import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class WordStats {
	
	private static final String REGEX = "[,\\.;:\\-\\?!»«\\(\\)0-9\\s]+";
	
	private File file;
	private SortedMap<String,Integer> wordOcurrences = new TreeMap<>(); 
	
	
	public WordStats(File file) {
		this.file = file;
	}
		
	// Ex. 8.4 
	public int countDifferentWords() throws FileNotFoundException{

		Set<String> palavras = new HashSet<>();
		
		Scanner s = new Scanner(file);
		s.useDelimiter(REGEX);
		
		while(s.hasNext())
			palavras.add(s.next().toLowerCase());
		
		return palavras.size();
	}

	// Ex 8.5
	public SortedSet<String> wordInterval(int minWordLength, String word1, String word2) throws FileNotFoundException{

		SortedSet<String> wordSet = new TreeSet<>();
		
		Scanner s = new Scanner(file);
		s.useDelimiter(REGEX);
		
		while(s.hasNext()) {
			String word = s.next().toLowerCase();
			if(word.length() >= minWordLength)
				wordSet.add(word);
		}
		
		s.close();
		
		return wordSet.subSet(word1, word2);
	}
	
	// Ex. 8.6 e 8.7
	public void countWordOcurrences(int minWordLength) throws FileNotFoundException {
		
		wordOcurrences = new TreeMap<>();
		
		Scanner s = new Scanner(file);
		s.useDelimiter(REGEX);
		
		while(s.hasNext()) {
			String word = s.next().toLowerCase();
			if(word.length() >= minWordLength)
				if(wordOcurrences.containsKey(word))
					wordOcurrences.put(word, wordOcurrences.get(word) + 1);
				else
					wordOcurrences.put(word, 1);
		}
		
		s.close();
	}
	
	// Ex. 8.6
	public Map<String,Integer> topWords(int minWordLength, int NTop) throws FileNotFoundException {
		
		Map<String,Integer> topWords = new TreeMap<>();
		
		// TODO		
		return topWords;	
	}
	
	// Ex 8.7
	public Map<String,Integer> wordCountInInterval(final int minWordLength, String word1, String word2) throws FileNotFoundException {
		
		countWordOcurrences(minWordLength);
		return wordOcurrences.subMap(word1, word2);
	}
}
