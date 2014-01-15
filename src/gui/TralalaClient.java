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
	
	public TralalaClient(String name) {
		try {
			songController  = new SongController(name);
			paymentController = new PaymentController(name);
			memberController = new MemberController(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void retreiveSong() {
	}
	
	public void askSong(String name) {
		songController.askSong(name);
	}
	
	public void checkAmount(Member m) {
		paymentController.checkAmount(m);
	}
	
	public boolean signIn(String user, String pass) {
		return memberController.signIn(user, pass);
	}

	public void playSong(Song song) {
		if (songPlayer != null) {
			songPlayer.stopSong();
			songPlayer.setSong(song);
			songPlayer.playSong();
		} else {
			songPlayer = new SongPlayer(songController);
			songPlayer.setSong(song);
			songPlayer.playSong();
		}
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