
public class Matrix_original {

	private int[][] mat;

	public Matrix_original(int lines, int columns) {
		if (lines <= 0 || columns <= 0)
			throw new IllegalArgumentException();
		mat = new int[lines][columns];
	}

	public Matrix_original(int size) {
		if (size <= 0)
			throw new IllegalArgumentException();
		mat = new int[size][size];
	}

	public int getLines() {
		return mat.length;
	}

	public int getColumns() {
		return mat[0].length;
	}

	public int get(int i, int j) {
		return mat[i][j];
	}

	public void set(int i, int j, int value) {
		mat[i][j] = value;
	}

	@Override
	public String toString() {
		String aux = "";
		for (int i=0; i!=getLines(); i++) {
			for (int j=0; j!=getColumns(); j++)
				aux += mat[i][j] + " ";
			aux += System.lineSeparator();
		}
		return aux;	
	}

	public void scale(int scalar) {
		for (int i=0; i!=getLines(); i++) 
			for (int j=0; j!=getColumns(); j++) 
				mat[i][j] = mat[i][j] * scalar; 
	}

	public boolean hasSameSize(Matrix_original other) {
		return (getLines()==other.getLines() && getColumns()==other.getColumns());
	}

}
