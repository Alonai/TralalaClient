package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginPanel extends JPanel {
	
	private SongPlayerGUI parent;
	private JTextField usernametf = new JTextField();
	private JPasswordField passwordpf = new JPasswordField();
	private JLabel usernamel = new JLabel("User");
	private JLabel passwordl = new JLabel("Password");
	private JButton validateb = new JButton("Validate");
	
	private int width = 800;
	private int height = 600;
	
	private int inset = 7;
	private int margin = 15;
	
	public LoginPanel(SongPlayerGUI parent) {
		this.parent = parent;
		
		this.setSize(width, height);
		this.setLayout(null);
		
		JPanel innerPanel = new JPanel();
		innerPanel.setLayout(null);
		innerPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		
		usernamel.setBounds(margin + 30, margin, 35, 25);
		passwordl.setBounds(margin, usernamel.getY() + usernamel.getHeight() + inset, 65, 25);
		
		usernametf.setBounds(usernamel.getX() + usernamel.getWidth(), usernamel.getY(), 150, 25);
		passwordpf.setBounds(passwordl.getX() + passwordl.getWidth(), passwordl.getY(), 150, 25);
		
		validateb.setBounds((passwordpf.getX() + passwordpf.getWidth() + margin) / 2 - 100 / 2,
				passwordl.getY() + passwordl.getHeight() +  2 * inset, 100, 25);
		
		innerPanel.setBounds(width / 2 - (passwordpf.getX() + passwordpf.getWidth() + margin) / 2, 
				height / 2 - validateb.getY() + validateb.getHeight() + margin / 2, 
				(passwordpf.getX() + passwordpf.getWidth() + margin), validateb.getY() + validateb.getHeight() + margin);
		
		innerPanel.add(usernamel);
		innerPanel.add(passwordl);
		innerPanel.add(usernametf);
		innerPanel.add(passwordpf);
		innerPanel.add(validateb);
		
		this.add(innerPanel);
		
		validateb.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				/* TODO hey model give me your validate method and I'll use you.
				 * if access is granted by the model adds the song player to the
				 * frame and disposes current panel*/
				if(LoginPanel.this.parent.getClient().signIn(usernametf.getText(), passwordpf.getText())) {
					LoginPanel.this.parent.username = usernametf.getText();
					LoginPanel.this.parent.remove(LoginPanel.this);
					LoginPanel.this.setVisible(false);
					LoginPanel.this.parent.getContentPane().add(new SongPlayerPanel(LoginPanel.this.parent));
					LoginPanel.this.parent.repaint();
					LoginPanel.this.invalidate();
				} else {
					/* TODO if access is denied shows a dialog with an error*/
					usernametf.setText("");
					passwordpf.setText("");
					JOptionPane.showMessageDialog(LoginPanel.this, "The username or the password is incorrect.", "Access denied", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
}
