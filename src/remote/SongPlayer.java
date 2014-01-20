package remote;

import java.util.ArrayList;

import controllers.SongController;
import data.dto.SongDTO;

public class SongPlayer {
	private SongController controller;
	private long secPaused;
	private ArrayList<String> list;
	private SongDTO song;
	public boolean paused;
	
	public SongPlayer(SongController song2) {
		this.controller = song2;
	}
	
	public void playSong() {
		System.out.println("Now Playing: " + song.getTitle());
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
	
	public void setSong(SongDTO song) {
		this.song = song;
	}
	
	public SongDTO getSong() {
		return song;
	}
	
	public void getListSongs() {
		this.list = controller.getListSongs();
	}
	
	public void downloadSong(String name, String nick) {
		this.song = controller.askSong(name, nick);
	}

}
