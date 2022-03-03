import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class LineObjectReader<T> {
	
	private File file;
	
	public LineObjectReader(File file) {
		this.file=file;
	}
	
	public List<T> read() throws FileNotFoundException {
		
		Scanner scanner = new Scanner(file);
		List<T> list = new ArrayList<>();
		
		while(scanner.hasNextLine()) {
			T obj = LineToObject(scanner.nextLine());
			if(obj != null)
				list.add(obj);
		}
		scanner.close();
		return list;
	}
	
	public abstract T LineToObject(String line);
	
//	{
//		Scanner scanner = new Scanner(line);
//		int numero = scanner.nextInt();
//		String nome = scanner.nextLine();
//		return new Aluno(nome,numero);
//	}

}
