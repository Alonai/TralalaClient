package remote;

public class SongPlayer {
	private Song song;
	private long secPaused;
	public boolean paused;
	
	public SongPlayer(Song song) {
		this.song = song;
	}
	
	public void playSong() {
		System.out.println("Now Playing: " + song.name);
	}
	
	public void pauseSong() {
		System.out.println("Song paused");
		secPaused = System.currentTimeMillis();
	}
	
	public void resumeSong() {
		secPaused = 0;
		System.out.println("Song resumed");
	}
	
	public void stopSong() {
		System.out.println("Song stopped");
		secPaused = 0;
	}
	
	public void setSong(Song song) {
		this.song = song;
	}
	
	public Song getSong() {
		return song;
	}

}
