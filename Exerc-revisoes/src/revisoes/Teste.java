package revisoes;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		Musica m1 = new Musica("Jolas e Bola", "Serafim", new Time("3:35"));
		Musica m2 = new Musica("Amor de Mae", "Rubi", new Time("4:35"));
		
		String[] autores_m3= {"Quim da Bairrada", "Nando"};
		Musica m3 = new MusicaComVariosAutores("De Burrico para Lisboa", autores_m3, new Time("6:05"));
		
		Playlist p1 = new Playlist("Pimbalhada");
		
		// Testar o codigo desenvolvido em todas as questoes
		
		// Exerc 1
		Playlist p2 = new Playlist("Summer");
		p2.adicionar(m1);
		p2.adicionar(m2);
		System.out.println(p2);
		// TODO
		
		// Exerc 2
		System.out.println(m3);
		// TODO
		
		// Exerc 3
		p1.lerMusicas("musicas.txt");
		System.out.println(p1);
		// TODO
		
		// Exerc 4
		p1.ordenarMusicas();
		System.out.println(p1);
		// TODO
		
		// Exerc 5
		List<Musica> lista = p1.musicasDoAutor("Toino");
		lista.forEach(m -> System.out.println(m));
		// TODO
		
		// Exerc 6
		p1.excluirMusicas(m -> m.getDuracao().getMinutos() >= 6);
		System.out.println(p1);
		p1.excluirMusicas(m -> m.getTitulo().contains("em"));
		System.out.println(p1);
		// TODO
	}	
}
