package controllers;

import java.rmi.RemoteException;
import java.util.ArrayList;

import data.dto.SongDTO;
import remote.SongSessionFacade;

public class SongController extends ConexionController{

	public SongController(String name) throws Exception {
		super(name);
		
	}

	public SongDTO askSong(String name, String nick) {
		try {
			return ((SongSessionFacade)reServer).downloadSong(name, nick);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<String> getListSongs() {
		try {
			return ((SongSessionFacade)reServer).getListSongs();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}