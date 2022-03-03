
public class Rectangle extends AbstractFigure {

	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return width*2 + height*2;
	}


}
