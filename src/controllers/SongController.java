package controllers;

import java.util.ArrayList;

import data.dto.SongDTO;
import remote.SongSessionFacade;

public class SongController extends ConexionController{

	public SongController(String name) throws Exception {
		super(name);
		
	}

	public SongDTO askSong(String name) {
		return ((SongSessionFacade)reServer).downloadSong(name);
	}
	public ArrayList<String> getListSongs(){
		return ((SongSessionFacade)reServer).getListSongs();
	}
}
