package remote;

import java.util.ArrayList;

import controllers.SongController;

public class SongPlayer {
	private Song song;
	private SongController controller;
	private long secPaused;
	private ArrayList<String> list;
	private SongDTO bufferedSong;
	public boolean paused;
	
	public SongPlayer(SongController con) {
		this.controller = con;
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
	
	public void getListSongs() {
		this.list = controller.getListSongs();
	}
	
	public void downloadSong(String name) {
		this.bufferedSong = controller.askSong(name);
	}

}
