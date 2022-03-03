import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {

	private String nome;
	private String sigla;
	private int cap;
	private ArrayList<Inscricao> inscricoes;

	public Disciplina(String nome, String sigla, int cap) {
		this.nome = nome;
		this.sigla = sigla;
		this.cap = cap;
		inscricoes = new ArrayList<>();
	}

	public static Disciplina criaDisciplina(String nome, int cap, ArrayList<Aluno> Alunos) {
		String sigla = determinarSigla(nome);
		Disciplina disciplina = new Disciplina(nome, sigla, cap);
		disciplina.inscreverAlunos(Alunos);
		return disciplina;
	}

	public void inscrever(Aluno a) {
		if (inscricoes.size()<cap) {
			inscricoes.add(new Inscricao(a));
		}
		else
			System.err.println("A disciplina já está cheia");
	}

	public void desinscreverAluno (int numero) {
		Inscricao insc = procurar(numero);
		inscricoes.remove(insc);
	}

	private Inscricao procurar(int numero) {
		for (Inscricao insc : inscricoes)
			if (insc.getAluno().getNumero() == numero)
				return insc;
		System.err.println("Aluno " + numero + " não está inscrito");
		return null;
	}

	public void lancarNota(int numero, int nota) {
		Inscricao insc = procurar(numero);
		if (insc!=null)
			insc.setNota(nota);
	}

	public boolean temNota(int numero) {
		Inscricao insc = procurar(numero);
		if (insc!=null)
			return insc.temNota();
		return false;
	}

	public int obterNota(int numero) {
		Inscricao insc = procurar(numero);
		if (insc!=null)
			return insc.getNota();
		return Inscricao.NA;
	}

	public double notaMedia() {
		int count = 0;
		double aux = 0.0;
		for (Inscricao insc : inscricoes)
			if (insc.temNota()) {
				aux += insc.getNota();
				count++;
			}
		return aux/count;
	}

	public ArrayList<Aluno> melhoresAlunos() {
		ArrayList<Aluno> bestStudents = new ArrayList<>();
		for (Inscricao insc : inscricoes)
			if(insc.getNota()==20)
				bestStudents.add(insc.getAluno());
		//		Aluno[] ans = new Aluno[bestStudents.size()];
		//		int i=0;
		//		for (Aluno a: bestStudents)
		//			ans[i++]=a;
		return bestStudents;
	}

	public static String determinarSigla(String nome) {
		String sig = "";
		for(int i = 0; i<nome.length(); i++) {
			if(Character.isUpperCase(nome.charAt(i))) {
				sig+=nome.charAt(i);
			}
		}
		return sig;
	}

	public void inscreverAlunos(ArrayList<Aluno> aluno) {
		for (Aluno alunos : aluno) {
			inscrever(alunos);
		}
	}

	public void escreveDisciplina(String nomeFicheiro) {

		try {
			PrintWriter writer = new PrintWriter(new File(nomeFicheiro));

			writer.println(nome);
			writer.println(cap);

			for (Inscricao inscricao : inscricoes) {
				writer.println(inscricao.getAluno().getNumero() + " " + inscricao.getNota());
			}

			writer.close();

		} catch (FileNotFoundException e) {
			System.err.println("Erro na abertura do ficheiro " + nomeFicheiro);
		}
	}

	public static Disciplina twoFiles(String nomeFicheiroAlunos, String nomeFicheiroDisciplina) {

		ArrayList<Aluno> Alunos = new ArrayList<>();

		try {
			Scanner scannerAlunos = new Scanner(new File(nomeFicheiroAlunos));

			while(scannerAlunos.hasNextLine()) {
				int numeroAluno = scannerAlunos.nextInt();
				String nomeAluno = scannerAlunos.nextLine().trim();
				Alunos.add(new Aluno(numeroAluno, nomeAluno));
			}

			scannerAlunos.close();

		} catch (FileNotFoundException e) {
			System.err.println("Erro na abertura do ficheiro " + nomeFicheiroAlunos);
		}

		try {
			Scanner scanner = new Scanner(new File(nomeFicheiroDisciplina));

			String nome_Disciplina = scanner.nextLine();
			int capacidade = Integer.parseInt(scanner.nextLine());

			Disciplina disciplina = new Disciplina(nome_Disciplina, determinarSigla(nome_Disciplina), capacidade);

			disciplina.inscreverAlunos(Alunos);

			while(scanner.hasNextLine()) { //Separar numero da nota
				String aluno = scanner.nextLine();
				String[] dados = aluno.split(" ");
				int numero = Integer.parseInt(dados[0].trim());
				int nota = (dados[1].trim().equals("NA") ? -1 : Integer.parseInt(dados[1].trim()));
				disciplina.lancarNota(numero, nota);
			}

			scanner.close();
			return disciplina;

		} catch (FileNotFoundException e) {
			System.err.println("Erro na abertura do ficheiro " + nomeFicheiroDisciplina);
			return null;
		}
	}

	@Override
	public String toString() {
		String aux = nome + " (" + sigla + ") cap: " + cap + '\n';

		for (Inscricao insc : inscricoes)
			aux = aux + insc + '\n';

		return aux;
	}

}
