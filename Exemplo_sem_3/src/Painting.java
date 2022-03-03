
public class Painting implements Drawable{
	
	private String artist;
	private String title;
	
	public Painting(String artist, String title) {
		this.artist=artist;
		this.title=title;
	}

	@Override
	public void draw() {
		System.out.println("Vou pintar o quadro " + title + " do(a) " + artist);
		
	}

}
