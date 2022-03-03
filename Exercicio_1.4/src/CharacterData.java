
public class CharacterData {
	
	public int total;
	public int[] count;
	
	CharacterData(){
		this.total = 0;
		this.count = new int[26];
	}
	
	public void addWord(String word) {
		for (int i=0; i<word.length(); i++) {
			count[word.charAt(i)-'a']++;
			total++;
		}
	}

}
