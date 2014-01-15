package gui;

import remote.SongPlayer;
import controllers.MemberController;
import controllers.PaymentController;
import controllers.SongController;
import data.Member;
import data.Song;

public class TralalaClient {
	private SongController songController;
	private PaymentController paymentController;
	private MemberController memberController;
	private SongPlayer songPlayer;
	
	public void retreiveSong() {
	}
	
	public void askSong(String name) {
		songController.askSong(name);
	}
	
	public void checkAmount(Member m) {
		paymentController.checkAmount(m);
	}
	
	public void signIn(String user, String pass) {
		memberController.signIn(user, pass);
	}

	public void playSong(Song song) {
			songPlayer.stopSong();
			songPlayer.setSong(song);
			songPlayer.playSong();
	}

	public void pauseSong() {
		if (songPlayer != null) {
			songPlayer.pauseSong();
		}
	}
	
	public void resumeSong() {
		if (songPlayer != null) {
			songPlayer.resumeSong();
		}
	}
	
	public void stopSong() {
		if (songPlayer != null) {
			songPlayer.stopSong();
		}
	}
	
}