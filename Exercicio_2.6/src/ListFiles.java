import java.io.File;
import java.util.ArrayList;

public class ListFiles {
	
	public void listFile(File dir) {
		String[] files = dir.list();
		for(String file : files)
			System.out.println(file);
	}

	public static ArrayList<File> collectFiles(File dir) {
		ArrayList<File> list = new ArrayList<>();
		collectFilesRec(dir, list);
		return list;
	}
	
	private static void collectFilesRec(File f, ArrayList<File> list) {
		
	}

	public static void main(String[] args) {

	}
	


}
