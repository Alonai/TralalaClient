package controllers;

import java.rmi.Naming;
import java.util.ArrayList;

import data.dto.SongDTO;
import remote.SongSessionFacade;

public class SongController extends ConexionController{

	SongSessionFacade reServer;
	
	public SongController(String name) throws Exception {
		super();
		reServer= (SongSessionFacade) Naming.lookup(name);
	}

	public SongDTO askSong(String name) {
		return reServer.downloadSong(name);
	}
	public ArrayList<String> getListSongs(){
		return reServer.getListSongs();
	}
}
