/**
 * 
 * @author vishalkosaraju
 * Joins functionalities of independent interfaces
 */
public class AnalogAdapter implements AnalogAlbum{
	private DigitalAlbum album;
	/**
	 * Analog Adapter constructor
	 * @param album passes through an album
	 */
	public AnalogAdapter(DigitalAlbum album) {
		this.album=album;
	}
	/**
	 * execute and returns nextSong
	 */
	@Override
	/**
	 * execute and returns nextSong
	 */
	public String play() {
		// TODO Auto-generated method stub
		album.nextSong();
		return "";
	}
	/**
	 * execute and returns prevSong
	 */
	@Override
	public String rewind() {
		// TODO Auto-generated method stub
		album.prevSong();
		return "";
	}
	/**
	 * execute and returns nextSong
	 */
	@Override
	public String ffwd() {
		// TODO Auto-generated method stub
		album.nextSong();
		return "";
	}
	/**
	 * execute and return pause
	 */
	@Override
	public String pause() {
		// TODO Auto-generated method stub
		album.pause();
		return "";
	}
	/**
	 * execute and return stop
	 */
	@Override
	public String stopEject() {
		// TODO Auto-generated method stub
		album.stop();
		return "";
	}	
}