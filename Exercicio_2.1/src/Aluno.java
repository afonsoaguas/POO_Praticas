import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

	private int numero;
	private String nome;

	public Aluno(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	/**
	 * Cria uma lista de alunos a partir de um ficheiro
	 * @param nomeFicheiro String
	 * @return listaAlunos ArrayList<Aluno>
	 */
	public static ArrayList<Aluno> criaListaAlunos(String nomeFicheiro) {
		ArrayList<Aluno> lista = new ArrayList<>();
		
		try {
			Scanner scanner = new Scanner(new File(nomeFicheiro));
			
			while(scanner.hasNextLine()) {
				int numero = scanner.nextInt();
				String nome = scanner.nextLine().trim(); //Ignora o espaço no inicio
				
				lista.add(new Aluno(numero, nome));
			}
			scanner.close();
			return lista;
			
		} catch (FileNotFoundException e) {
			System.err.println("Erro na abertura do ficheiro " + nomeFicheiro);
			return null;
		}
	}
	
	/**
	 * Salva uma lista de Aluno em ficheiro
	 * @param listaAlunos ArrayList<Aluno>
	 * @param nomeFicheiro String
	 */
	public static void salvaListaAlunos(String nomeFicheiro, ArrayList<Aluno> listaAlunos) {
		
		try {
			PrintWriter writer = new PrintWriter(new File(nomeFicheiro));
			
			for (Aluno aluno : listaAlunos) {
				writer.println(aluno.getNumero() + " " + aluno.getNome());
			}
			
			writer.close();
		} catch (FileNotFoundException e) {
			System.err.println("Erro na abertura do ficheiro " + nomeFicheiro);
		}
	}

	@Override
	public String toString() {
		return numero + " - " + nome;
	}

}
