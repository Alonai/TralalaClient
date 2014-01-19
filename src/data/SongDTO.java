package data;

import java.io.Serializable;

public class SongDTO implements Serializable{

	private String id;
	private String title;
	private int duration;
	private double ppp;
	private String artistName;

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getDuration() {
		return duration;
	}

	public double getPpp() {
		return ppp;
	}

	public String getArtistName() {
		return artistName;
	}
	
}
