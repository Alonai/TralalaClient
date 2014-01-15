package remote;

public interface ISongPlayer {
	
	public boolean playSong();
	
	public void pauseSong();
	
	public void resumeSong();
	
	public void stopSong();
	
	public void setSong(Song song);
	
	public Song getSong();
	
	public void getListSongs();
	
	public void downloadSong(String name);

}
