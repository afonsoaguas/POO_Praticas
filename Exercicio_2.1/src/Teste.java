import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		//		
		//		Aluno a1 = new Aluno (1, "Zé");
		//		Aluno a2 = new Aluno (2, "Rui");
		//		Aluno a3 = new Aluno (3, "Ana");
		//		Aluno a4 = new Aluno (4, "João");
		//		Aluno a5 = new Aluno (5, "Lara");
		//		
		//		Disciplina bd = new Disciplina("Bases de dados", "BD", 4);
		//		
		//		bd.inscrever(a1);
		//		bd.inscrever(a2);
		//		bd.inscrever(a3);
		//		bd.inscrever(a4);
		//		//bd.inscrever(a5);
		//		//bd.desinscreverAluno(5);
		//		bd.desinscreverAluno(2);
		//		bd.lancarNota(1, 20);
		//		bd.lancarNota(3, 20);
		//bd.lancarNota(4, 17);
		//		System.out.println(bd.melhoresAlunos());	
		//		System.out.println(bd);
		//		
		//		Inscricao i1 = new Inscricao(a5);
		//		i1.setNota(30);
		//		i1.setNota(20);
		//		System.out.println(i1);
		//		
		//		ArrayList<Aluno> alunos = new ArrayList<>();
		//		
		//		alunos.add(a1);
		//		alunos.add(a2);
		//		alunos.add(a3);
		//		alunos.add(a4);
		//		alunos.add(a5);
		//		
		//		for(Aluno a : alunos)
		//			System.out.println(a);
		//		
		//ArrayList<Aluno> lista = Aluno.criaListaAlunos("Estudantes.txt");
		//		
		//		for (Aluno aluno : lista) {
		//			System.out.println(aluno);
		//		}
		//		
		//		Aluno.salvaListaAlunos("Alunos.txt", lista);
		//		
		//Disciplina disciplina = Disciplina.criaDisciplina("Programacao Orientada a Objetos", 10, lista);
		//System.out.println(disciplina);
		//bd.escreveDisciplina("Base_de_dados.txt");
		Disciplina disciplina = Disciplina.twoFiles("Estudantes.txt", "BD.txt");
		System.out.println(disciplina);
	}
}