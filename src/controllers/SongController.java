package controllers;

import java.util.ArrayList;

public class SongController extends ConexionController{

	public SongController(String name) throws Exception {
		super(name);
		
	}

	public SongDTO askSong(String name) {
		reServer.downloadSong(name);
	}
	public ArrayList<String> getListSongs(){
		reServer.getListSongs();
	}
}
