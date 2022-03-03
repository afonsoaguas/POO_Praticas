import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Album {
	
	private String name;
	private int year;
	private List<String> authors;
	private List<Song> songs;
	
	public Album(String name, int year, List<String> authors, List<Song> songs) {
		
		this.name=name;
		this.year=year;
		this.authors=authors;
		this.songs=songs;
		
	}
	
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
	
	public Time getDuration() {
		Time duration = new Time(0,0);
		for(Song s: songs)
			duration.add(s.getDuration());
		return duration;
	}

	@Override
	public String toString() {
		return "Album " + name + ", year=" + year + ", authors=" + authors + ", songs=" + songs;
	}
	
	public static Album load(String nomeFicheiro) {
		
		
		
		try {
			
			List<String> authors = new ArrayList<>();
			List<Song> songs = new ArrayList<>();
			String name = null;
			int year = 0;
			
			Scanner scanner = new Scanner(new File(nomeFicheiro));
			
			while(scanner.hasNextLine()) {
				name = scanner.nextLine();
				year = scanner.nextInt();
				authors.add(scanner.nextLine());
			}
			scanner.nextLine();
			while(scanner.hasNextLine()) {
				String frase = scanner.nextLine();
				frase.split(" ", 2);
				
			}
			
			Album album = new Album(name, year, authors, songs);
			scanner.close();
			return album;
			
		} catch (FileNotFoundException e) {
			System.err.println("Não foi possivel abrir o ficheiro " + nomeFicheiro);
			return null;
		}
		
	}

	class Song{
		
		private String name;
		private Time duration;
		private int trackNumber;
		
		public Song(String name, Time duration, int trackNumber) {
			
			this.name=name;
			this.duration=duration;
			this.trackNumber=trackNumber;
			
		}

		public String getName() {
			return name;
		}

		public Time getDuration() {
			return duration;
		}

		public int getTrackNumber() {
			return trackNumber;
		}

		@Override
		public String toString() {
			return "Song " + name + ", duration=" + duration + ", trackNumber=" + trackNumber;
		}
		
		
	}
}
