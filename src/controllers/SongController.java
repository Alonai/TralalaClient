package controllers;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

import data.dto.SongDTO;
import remote.SongSessionFacade;

public class SongController extends ConexionController{

	SongSessionFacade reServer;
	
	public SongController(String name) throws Exception {
		super();
		reServer= (SongSessionFacade) Naming.lookup(name);
	}

	public SongDTO askSong(String name, String nick) {
		try {
			return reServer.downloadSong(name, nick);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<String> getListSongs(){
		try {
			return reServer.getListSongs();
		} catch (RemoteException e) {
			return null;
		}
	}
}
