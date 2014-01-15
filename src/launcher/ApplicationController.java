package launcher;

import gui.SongPlayerGUI;

public class ApplicationController {

	public static void main(String[] argv){
		new SongPlayerGUI("//" + argv[0] + "/" + argv[1] + "/" + argv[2]);
		
	}
}
