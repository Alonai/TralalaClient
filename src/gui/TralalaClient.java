package gui;

import remote.SongPlayer;
import controllers.MemberController;
import controllers.PaymentController;
import controllers.SongController;
import data.Member;
import data.Song;
import data.dto.SongDTO;

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
	
	public SongDTO askSong(String name) {
		return songController.askSong(name);
	}
	
	public void checkAmount(Member m) {
		paymentController.checkAmount(m);
	}
	
	public boolean signIn(String user, String pass) {
		return memberController.signIn(user, pass);
	}

	public void playSong(Song song) {
			songPlayer.stopSong();
			songPlayer.setSong(song);
			songPlayer.playSong();
<<<<<<< HEAD
=======
		} else {
			songPlayer = new SongPlayer(songController);
			songPlayer.setSong(song);
			songPlayer.playSong();
		}
>>>>>>> 8f6483aed34d6b5815c326cc45f8180e88959629
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