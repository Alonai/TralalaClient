package launcher;

import gui.SongPlayerGUI;

public class ApplicationController {

	public static void main(String[] argv){
		// Datos para hacer rebind en facades
		String namePayFac= "//" + argv[0] + ":" + argv[1] + "/" + argv[2];
		String nameSongFac = "//" + argv[3] + ":" + argv[4] + "/" + argv[5];
		String nameManageFac = "//" + argv[6] + ":" + argv[7] + "/" + argv[8];
		//TODO que el song player gui tenga estos 3 strings
		new SongPlayerGUI("//" + argv[0] + ":" + argv[1] + "/" + argv[2]);
		
	}
}
