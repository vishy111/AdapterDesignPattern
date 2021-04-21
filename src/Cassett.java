import java.util.ArrayList;


public class Cassett implements AnalogAlbum{
	private ArrayList<String> songs = new ArrayList<>();
	private int currentIndex=0;

	public Cassett(String song1, String song2, String song3, String song4, String song5) {
		
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}

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

	@Override
	public String pause() {
		// TODO Auto-generated method stub
		System.out.println("Pausing...");
		return "";
	}

	@Override
	public String stopEject() {
		// TODO Auto-generated method stub
		System.out.println("Stopping cassett and ejecting");
		return "";
	}
}
