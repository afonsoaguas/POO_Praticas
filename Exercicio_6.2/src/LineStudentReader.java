import java.io.File;
import java.util.Scanner;

public class LineStudentReader extends LineObjectReader<Aluno> {
	
	public LineStudentReader(File file) {
		super(file);
	}

	@Override
	public Aluno LineToObject(String line) {
		Scanner scanner = new Scanner(line);
		int numero = scanner.nextInt();
		String nome = scanner.nextLine().trim();
		scanner.close();
		return new Aluno(nome,numero);
	}

}
