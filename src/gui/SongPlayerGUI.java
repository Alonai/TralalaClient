package gui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SongPlayerGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width = 800;
	private int height = 600;
	private int deviceWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	private int deviceHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	
	protected TralalaClient client;
	
	public SongPlayerGUI(String songContName, String paymentContName, String memberContName) {
		super("Tralala Cient");
		client = new TralalaClient(songContName, paymentContName, memberContName);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setPreferredSize(new Dimension(width, height));
		this.setLayout(null);
		this.add(new LoginPanel(this));
		this.pack();
		this.setLocation(deviceWidth / 2 - this.getWidth() / 2, deviceHeight / 2 - this.getHeight() / 2);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public TralalaClient getClient() {
		return client;
	}
	
}
