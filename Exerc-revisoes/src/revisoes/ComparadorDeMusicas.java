package revisoes;

import java.util.Comparator;

public class ComparadorDeMusicas implements Comparator<Musica>{

	@Override
	public int compare(Musica o1, Musica o2) {
		return o2.getDuracao().totalSeconds()-o1.getDuracao().totalSeconds() == 0 ? String.CASE_INSENSITIVE_ORDER.compare(o1.getAutor(), o2.getAutor())
			: o1.getDuracao().totalSeconds() - o2.getDuracao().totalSeconds(); //Ordem Crescente
	}

}
