import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class TestReader {
	
	public static void main(String[] args) throws FileNotFoundException {
		LineObjectReader<Aluno> reader = new LineStudentReader(new File("Estudantes.txt"));
		LineObjectReader<Time> reader2 = new LineTimeReader(new File("Tempos.txt"));
		
		List<Aluno> list = reader.read();
		list.forEach(o -> System.out.println(o));
		List<Time> list2 = reader2.read();
		list2.forEach(t -> System.out.println(t));
		
		
	}

}