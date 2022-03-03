
public class Cliente {

	public static void main(String[] args) {

		Matrix m1 = new Matrix(2,3);
		m1.set(0, 0, 1);
		m1.set(0, 1, 2);
		m1.set(0, 2, 3);
		m1.set(1, 0, 4);
		m1.set(1, 1, 5);
		m1.set(1, 2, 6);


		Matrix m2 = new Matrix(2,3);
		m2.set(0, 0, 1);
		m2.set(0, 1, 2);
		m2.set(0, 2, 3);
		m2.set(1, 0, 3);
		m2.set(1, 1, 2);
		m2.set(1, 2, 1);


		Matrix m3 = sumAndScale(m1, m2, 2);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}

	public static Matrix sumAndScale(Matrix a, Matrix b, int scalar) {

		if (!a.hasSameSize(b))
			return null;

		Matrix aux = new Matrix(a.getLines(),a.getColumns());

		for (int i=0; i!=a.getLines(); i++)
			for (int j=0; j!=a.getColumns(); j++)
				aux.set(i, j, a.get(i, j) + b.get(i,j));

		aux.scale(scalar);

		return aux;

	}
}
