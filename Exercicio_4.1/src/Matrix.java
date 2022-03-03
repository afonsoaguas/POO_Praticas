
public class Matrix {
	
	private int[] mat;
	private int columns;
	
	public Matrix(int lines, int columns) {
		if (lines <= 0 || columns <= 0)
			throw new IllegalArgumentException();
		mat = new int[lines*columns];
		this.columns = columns;
	}
	
	public Matrix(int size) {
		if (size <= 0)
			throw new IllegalArgumentException();
		mat = new int[size*size];
		this.columns = size;
	}

	public int getLines() {
		return mat.length / columns;
	}

	public int getColumns() {
		return columns;
	}
	
	public int get(int i, int j) {
		return mat[i*columns+j];
	}

	public void set(int i, int j, int value) {
		mat[i*columns+j] = value;
	}
	
	@Override
	public String toString() {
		String aux = "";
		for (int i=0; i!=getLines(); i++) {
			for (int j=0; j!=getColumns(); j++)
				aux += mat[i*getColumns()+j] + " ";
			aux += System.lineSeparator();
		}
		return aux;	
	}
	
	public void scale(int scalar) {
		for (int i=0; i!=mat.length; i++) 
				mat[i] = mat[i] * scalar; 
	}
	
	public boolean hasSameSize(Matrix other) {
		return (getLines()==other.getLines() && getColumns()==other.getColumns());
	}
}
