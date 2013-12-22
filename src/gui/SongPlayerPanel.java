package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SongPlayerPanel extends JPanel {
	
	private JButton playSongb = new JButton("Play Song");
	
	private int width = 800;
	private int height = 600;
	
	public SongPlayerPanel() {
		this.setSize(width, height);
		this.setLayout(null);
		playSongb.setBounds(width / 2 - 100 / 2, height / 2 - 25 / 2, 100, 25);
		
		this.add(playSongb);
		
		playSongb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/* TODO Ask model for the play method and display the song that is being played*/
				System.out.println("Super, Fanta, m...YEah! OK!!");
			}
		});
	}
}
