import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		String text = StringToText.separatedBy(list, ", ");
		System.out.println(text);
	}

}
