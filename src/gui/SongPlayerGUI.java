package gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SongPlayerGUI {
	
	private JFrame frame;
	private String title = "SongPlayerGUI";

	private int width = 800;
	private int height = 600;
	private int deviceWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private int deviceHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	
	public SongPlayerGUI() {
		frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setLayout(null);
		frame.add(new LoginPanel(frame));
		frame.pack();
		frame.setLocation(deviceWidth / 2 - frame.getWidth() / 2, deviceHeight / 2 - frame.getHeight() / 2);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public static void main(String[] argv) {
		new SongPlayerGUI();
	}
}
