import java.util.ArrayList;
import java.util.List;

public class TestFilter {

	public static void main(String[] args) {
		
		List<String> str = new ArrayList<>();
		str.add("Adeus");
		str.add("");
		str.add("Bem-vindo");
		str.add("Boa-tarde");
		str.add("Adios");
		
		
		Iterable<String> ans = StringFilter.select(str, p -> { 
			return p.startsWith("a") || p.startsWith("A");
			});
		
		System.out.println(ans);

	}

}
