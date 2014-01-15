package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import data.SongDTO;


@SuppressWarnings("serial")
public class SongPlayerPanel extends JPanel {
	
	private JButton playSongb = new JButton("Play Song");
	
	private int width = 800;
	private int height = 600;
	private SongPlayerGUI parent;
	
	public SongPlayerPanel(SongPlayerGUI parent) {
		this.parent = parent;
		this.setSize(width, height);
		this.setLayout(null);
		playSongb.setBounds(width / 2 - 100 / 2, height / 2 - 25 / 2, 100, 25);
		
		this.add(playSongb);
		
		playSongb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* TODO Ask model for the play method and display the song that is being played*/
				ArrayList<String> songList = SongPlayerPanel.this.parent.client.retreiveSongs();
				SongDTO song = SongPlayerPanel.this.parent.client.askSong(songList.get(0).split(" ")[4]);
				SongPlayerPanel.this.parent.client.playSong(song);
				JOptionPane.showMessageDialog(SongPlayerPanel.this, song.getArtistName() + " - " + song.getTitle() + " is being played.", 
						"Player Notification", JOptionPane.OK_OPTION);
			}
		});
	}
}
