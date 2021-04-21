import java.util.ArrayList;

public class CD implements DigitalAlbum{
	private ArrayList<String> songs = new ArrayList<>();
	private int currentIndex=0;
	
	public CD(String song1, String song2,String song3,String song4, String song5) {
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}

	@Override
	public String playFromBeginning() {
		// TODO Auto-generated method stub
		System.out.println("Playing song 1: " +songs.get(currentIndex));
		currentIndex++;
		return null;
	}

	@Override
	public String playSong(int num) {
		// TODO Auto-generated method stub
		if(num<6) {
			System.out.println("Playing: " +songs.get(num)+ " "+ songs.get(num));
			currentIndex=num;
			currentIndex++;
		}
		else {
			System.out.println("Not a valid song number");
		}
		return "";
	}

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

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		//code
		System.out.println("Stop CD");
		playFromBeginning();
		
		return "";
	}

	@Override
	public String pause() {
		// TODO Auto-generated method stub
		//code
		System.out.println("Pausing...");
		return null;
	}

}
