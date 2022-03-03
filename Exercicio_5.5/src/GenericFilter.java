import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {
	
	static <T> Iterable<T> select(Iterable<T> it, Predicate<T> pred) {
		List<T> ans = new ArrayList<>();
		for(T element : it)
			if(pred.test(element))
				ans.add(element);
		return ans;
	}
	
}
