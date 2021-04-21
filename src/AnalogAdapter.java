
public class AnalogAdapter implements AnalogAlbum{
	private DigitalAlbum album;
	
	public AnalogAdapter(DigitalAlbum album) {
		this.album=album;
		
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		album.nextSong();
		return "";
	}
	@Override
	public String rewind() {
		// TODO Auto-generated method stub
		album.prevSong();
		return "";
	}
	@Override
	public String ffwd() {
		// TODO Auto-generated method stub
		album.nextSong();
		return "";
	}
	@Override
	public String pause() {
		// TODO Auto-generated method stub
		album.pause();
		return "";
	}
	@Override
	public String stopEject() {
		// TODO Auto-generated method stub
		album.stop();
		return "";
	}
	
	/**
	@Override
	public String playFromBeginning() {
		// TODO Auto-generated method stub
		album.nextSong();
		return "";
	}
	@Override
	public String playSong(int num) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String prevSong() {
		// TODO Auto-generated method stub
		album.prevSong();
		return "";
	}
	@Override
	public String nextSong() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return null;
		*/
	

}
