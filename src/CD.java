import java.util.ArrayList;
/**
 * 
 * @author vishalkosaraju
 * Implememts Digital Album
 */
public class CD implements DigitalAlbum{
	private ArrayList<String> songs = new ArrayList<>();
	private int currentIndex=0;
	/**
	 * CD constructor
	 * @param song1 passes in 1 of 5 songs
	 * @param song2 passes in 2 of 5 songs
	 * @param song3 passes in 3 of 5 songs
	 * @param song4 passes in 4 of 5 songs
	 * @param song5 passes in 5 of 5 songs
	 */
	public CD(String song1, String song2,String song3,String song4, String song5) {
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}
	/**
	 * plays the first song on the CD
	 */
	@Override
	public String playFromBeginning() {
		// TODO Auto-generated method stub
		System.out.println("Playing song 1: " +songs.get(currentIndex));
		currentIndex++;
		return null;
	}
	/**
	 * As long as valid index is passed returns song
	 */
	@Override
	public String playSong(int num) {
		// TODO Auto-generated method stub
		if(num<6) {
			System.out.println("Playing: " +songs.get(num)+ ": "+ songs.get(num));
			currentIndex=num;
			currentIndex++;
		}
		else {
			System.out.println("Not a valid song number");
		}
		return "";
	}
	/**
	 * Goes back a song and returns it
	 */
	@Override
	public String prevSong() {
		// TODO Auto-generated method stub
		if(currentIndex==0) {
			System.out.println("Skipping back and playing:"+" "+ songs.get(currentIndex));
		}
		else if(currentIndex==5) {
			currentIndex-=2;
			System.out.println("Skipping back and playing:"+" "+ songs.get(currentIndex));
		}
		else {
		currentIndex--;
		System.out.println("Skipping back and playing:"+" "+ songs.get(currentIndex));
		}
		return null;
	}
	/**
	 * Returns the next song
	 */
	@Override
	public String nextSong() {
		// TODO Auto-generated method stub
		if(currentIndex==5)
			playFromBeginning();
		else
			System.out.println("Playing:"+" "+ (currentIndex+1)+ " "+ songs.get(currentIndex));
		currentIndex++;
	
		return "";
	}
	/**
	 * Goes back to the beginning of the cd and returns a stop and eject
	 */
	@Override
	public String stop() {
		// TODO Auto-generated method stub
		//code
		System.out.println("Stop CD");
		playFromBeginning();
		
		return "";
	}
	/**
	 * returns Pausing.
	 */
	@Override
	public String pause() {
		// TODO Auto-generated method stub
		//code
		System.out.println("Pausing...");
		return null;
	}

}
