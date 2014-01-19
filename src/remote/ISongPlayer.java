package remote;

import data.SongDTO;

public interface ISongPlayer {
	
	public boolean playSong();
	
	public void pauseSong();
	
	public void resumeSong();
	
	public void stopSong();
	
	public void setSong(SongDTO song);
	
	public SongDTO getSong();
	
	public void getListSongs();
	
	public void downloadSong(String name);

}
