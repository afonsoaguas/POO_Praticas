
public class Square implements Drawable {
	private int side;
	
	public Square(int side) {
		this.side=side;
	}

	@Override
	public void draw() {
		System.out.println("Vou desenhar um quadrado de lado " + side);
		
	}

}
