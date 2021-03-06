package gui;

import java.util.ArrayList;

import remote.SongPlayer;
import controllers.MemberController;
import controllers.PaymentController;
import controllers.SongController;
import data.dto.SongDTO;

public class TralalaClient {
	private SongController songController;
	private PaymentController paymentController;
	private MemberController memberController;
	private SongPlayer songPlayer;
	
	public TralalaClient(String songContName, String paymentContName, String memberContName) {
		try {
			songController  = new SongController(songContName);
			paymentController = new PaymentController(paymentContName);
			memberController = new MemberController(memberContName);
			songPlayer = new SongPlayer(songController);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> retreiveSongs() {
		return songController.getListSongs();
	}
	
	public SongDTO askSong(String name, String nick) {
		return songController.askSong(name, nick);
	}
	
	public void checkAmount(String m) {
		paymentController.checkAmount(m);
	}
	
	public boolean signIn(String user, String pass) {
		return memberController.signIn(user, pass);
	}

	public void playSong(SongDTO song) {	
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
	
	public void createUser(String name, String pass) {
		memberController.createUser(name, pass);
	}
	
}