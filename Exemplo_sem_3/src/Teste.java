import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {

		Drawable l1 = new Line(0,0,2,2);
		
		
		Painting p1 = new Painting("Leonardo", "Mona Lisa");
		Circle c1 = new Circle(3);
		Square s1 = new Square(4);
		Painting p2=new Painting("Van Gogh", "Os girassóis");
		Square s2=new Square(2);
		
		ArrayList<Drawable> lista = new ArrayList<>();
		lista.add(l1);
		lista.add(p1);
		lista.add(c1);
		lista.add(s1);
		lista.add(p2);
		lista.add(s2);
		
		for(Drawable d : lista)
			d.draw();
		
	}

}
