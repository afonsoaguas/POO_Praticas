import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringFilter {

	static Iterable<String> select(Iterable<String> it, Predicate<String> pred) {
		List<String> ans = new ArrayList<>();
		for(String str : it)
			if(pred.test(str))
				ans.add(str);
		return ans;
	}

}
