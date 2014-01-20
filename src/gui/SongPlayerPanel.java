package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import data.dto.SongDTO;


@SuppressWarnings("serial")
public class SongPlayerPanel extends JPanel {
	
	private JButton playSongb = new JButton("Play Song");
	private JTable songTable;
	private DefaultTableModel model;
	
	private String[][] object;
	
	private int width = 800;
	private int height = 600;
	private SongPlayerGUI parent;
	
	public SongPlayerPanel(SongPlayerGUI parent) {
		this.parent = parent;
		this.setSize(width, height);
		this.setLayout(null);
		
		loadSongList();
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBounds(0, 0, 200, 600);
		
		JScrollPane scrollpane = new JScrollPane(songTable);
		scrollpane.setBounds(0, 0, 200, 600);
		
		panel.add(scrollpane);
		
		playSongb.setBounds(width / 2 - 100 / 2, height / 2 - 25 / 2, 100, 25);
		
		this.add(playSongb);
		this.add(panel);
		
		playSongb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* TODO Ask model for the play method and display the song that is being played*/
				if(songTable.getSelectedRow() != -1) {
					SongDTO song = SongPlayerPanel.this.parent.client.askSong(object[songTable.getSelectedRow()][0].split(" ")[0], SongPlayerPanel.this.parent.username);
					SongPlayerPanel.this.parent.client.playSong(song);
					JOptionPane.showMessageDialog(SongPlayerPanel.this, song.getArtistName() + " - " + song.getTitle() + " is being played.", 
							"Player Notification", JOptionPane.OK_OPTION);
				} else {
					JOptionPane.showMessageDialog(SongPlayerPanel.this, "Please select a song from the list.", 
							"Player Notification", JOptionPane.OK_OPTION);
				}
			}
		});
	}
	
	private void loadSongList() {
		ArrayList<String> songList = parent.client.retreiveSongs();
		object = new String[songList.size()][1];
		for(int i = 0; i < songList.size(); i++) {
			object[i][0] = songList.get(i);
		}
		
		model = new DefaultTableModel(object, new String[] {"Title - Artist"});
		songTable = new JTable(model);
		
	}
}
