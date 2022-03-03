package revisoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Playlist {

	private List<Musica> musicas;
	private final String nome;

	public Playlist(String nome) {
		this.nome = nome;
		musicas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	// TODO
	public void adicionar(Musica m) {
		musicas.add(m);
	}
	
	public void lerMusicas(String file) {
		
		try {
			Scanner scan = new Scanner(new File(file));
			while(scan.hasNextLine()) {
				String[] str = scan.nextLine().split(";");
				Musica m = null;
				if(scan.hasNextLine()) {
					String[] autor = scan.nextLine().split(";");
					if (autor.length > 1)
						m = new MusicaComVariosAutores(str[0], autor, new Time(str[1]));
					else
						m = new Musica(str[0], autor[0], new Time(str[1]));					
				}
				musicas.add(m);
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir o ficheiro " + file);
		}
	}
	
	public void ordenarMusicas() {
		musicas.sort(new ComparadorDeMusicas());
	}
	
	public List<Musica> musicasDoAutor(String nome) {
		List<Musica> musica_autor = new ArrayList<>(); 
		for(Musica m: musicas)
			if(m.contemAutor(nome))
				musica_autor.add(m);
		return musica_autor;
	}
	
	public void excluirMusicas(FiltroDeMusicas fm) {
		Iterator<Musica> it = musicas.iterator();
		while(it.hasNext())
			if(fm.excluir(it.next()))
				it.remove();
		
		/**
		 * Outro método:
		 * List<Musica> marcadasRemocao = new ArrayList<>();
		 * for(Musica m : musicas)
		 * 		if(fm.excluir(m))
		 * 			marcadasRemocao.add(m);
		 * musicas.removeAll(marcadasRemocao);
		 */
	}
	
	@Override
	public String toString() {
		String str = "Nome Playlist: " + nome + System.lineSeparator();
		for(Musica m:musicas)
			str += m + System.lineSeparator();
		return str;
	}
	
}
