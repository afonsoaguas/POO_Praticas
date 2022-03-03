package revisoes;

// Acrescentar o que for necessario, incluindo atributos e codigo no construtor
//
public class MusicaComVariosAutores extends Musica {
	
	//TODO
	private String[] autores;
	
	public MusicaComVariosAutores(String titulo, String[] autores, Time duracao) {
		super(titulo, autores[0], duracao);
		// TODO
		this.autores = autores;
	}
	
	@Override
	public String getAutor() {
		return super.getAutor() + " et al.";
	}
	
	@Override
	public boolean contemAutor(String nome) {
		for(String autor : autores)
			if(nome.equals(autor))
				return true;
		return false;
	}
	// TODO
}
