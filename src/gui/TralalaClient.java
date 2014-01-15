package gui;

import java.util.ArrayList;

import remote.SongPlayer;
import controllers.MemberController;
import controllers.PaymentController;
import controllers.SongController;
import data.Member;
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
	
	public ArrayList<String> retreiveSongs() {
		return songController.getListSongs();
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
	
}