import java.util.List;

public class StringToText {
	
	public static String separatedBy(List<String> lista, String separator) {
		String ans= lista.get(0);
		for(int i=1; i<lista.size(); i++) {
			ans += separator + lista.get(i);
		}
		
		return ans;
	}
}
