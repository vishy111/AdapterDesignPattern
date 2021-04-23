import java.util.ArrayList;
/**
 * 
 * @author vishalkosaraju
 * Implements the Analog Album interface
 */
public class Cassett implements AnalogAlbum{
	private ArrayList<String> songs = new ArrayList<>();
	private int currentIndex=0;
	/**
	 * Cassett constructor
	 * @param song1 passes in 1 of 5 songs
	 * @param song2 passes in 2 of 5 songs
	 * @param song3 passes in 3 of 5 songs
	 * @param song4 passes in 4 of 5 songs
	 * @param song5 passes in 5 of 5 songs
	 */
	public Cassett(String song1, String song2, String song3, String song4, String song5) {
		
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}
	/**
	 * plays the current song and rewinds if at the end of the tape
	 */
	@Override
	public String play() {
		// TODO Auto-generated method stub
		if(currentIndex!=5) {
			System.out.println("Playing song number " +(currentIndex+1)+ ": "+songs.get(currentIndex));
		currentIndex++;
		}
		else
			System.out.println("At the end of the cassett you need to rewind");
		return "";
		}
	/**
	 * Attempts to rewind 1 song back
	 */
	@Override
	public String rewind() {
		// TODO Auto-generated method stub
			if(currentIndex!=0) {
				currentIndex--;
				System.out.println("Rewinding to song "+ (currentIndex+1));
			}
			else
				System.out.println("Fully Re-Wound");
			return "";
	}
	/**
	 * Attempts to go forward 1 song back
	 */
	@Override
	public String ffwd() {
		// TODO Auto-generated method stub
			if(currentIndex!=4) {
				currentIndex++;
			System.out.println("Forwarding to song "+ (currentIndex+1));
			}
			else
				System.out.println("At the end of the cassett you need to rewind");
			return "";
	}
	/**
	 * returns Pausing
	 */
	@Override
	public String pause() {
		// TODO Auto-generated method stub
		System.out.println("Pausing...");
		return "";
	}
	/**
	 * returns stop and eject
	 */
	@Override
	public String stopEject() {
		// TODO Auto-generated method stub
		System.out.println("Stopping cassett and ejecting");
		return "";
	}
}
