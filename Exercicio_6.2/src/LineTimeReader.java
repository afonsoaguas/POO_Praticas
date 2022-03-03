import java.io.File;

public class LineTimeReader extends LineObjectReader<Time> {

	public LineTimeReader(File file) {
		super(file);
	}

	@Override
	public Time LineToObject(String line) {
		return new Time(line);
	}

}
