/**
 * 
 * @author vishalkosaraju
 * Digital Album interface
 * contains 6 methods
 * Implemented by the CD class
 */
public interface DigitalAlbum {
	public String playFromBeginning();
	public String playSong(int num);
	public String prevSong();
	public String nextSong();
	public String stop();
	public String pause();

}
