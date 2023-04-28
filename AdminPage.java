import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminPage implements ActionListener {
	JFrame frame = new JFrame("Admin Page");
	JButton loginButton = new JButton ("Login");
	JButton resetButton = new JButton ("Reset");
	JTextField userField = new JTextField ();
	JPasswordField passField = new JPasswordField ();
	JLabel usernameLabel = new JLabel("Username: ");
	JLabel passwordLabel = new JLabel("Password: ");
	
	AdminPage(){
		
		ImageIcon image = new ImageIcon("NU.png");
		frame.setIconImage(image.getImage());
		
		usernameLabel.setBounds(50,100,75,25);
		passwordLabel.setBounds(50,150,75,25);
		
		userField.setBounds(125,100,200,25);
		passField.setBounds(125,150,200,25);

		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);	
		
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(userField);
		frame.add(passField);
		frame.add(usernameLabel);
		frame.add(passwordLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible (true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String username = userField.getText();
		String password = new String(passField.getPassword());
		
		String[] adminUsernames = {"Admin_01", "Admin_02", "Admin_03"};
		String[] adminPasswords = {"AdminOne", "AdminTwo", "AdminThree"};

		boolean isAdmin = false;
		int userIndex = -1;

		for (int i = 0; i < adminUsernames.length; i++) {
			if (username.equals(adminUsernames[i]) && password.equals(adminPasswords[i])) {
				isAdmin = true;
				userIndex = i;
				
				break;
			}
		}

		if (isAdmin) {
			JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN");
			WelcomeMessage welcomemessage = new WelcomeMessage();
			
		} else if ( e.getSource()== resetButton) {
			userField.setText("");
			passField.setText("");
		 } else if (username.isEmpty() || password.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "PLEASE ENTER A USERNAME AND PASSWORD");
	     } else if (username.equals(adminUsernames)) {
	            JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
	     } else if (password.equals(adminPasswords)) {
	            JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
	     } else {
	            JOptionPane.showMessageDialog(null, "INCORRECT USERNAME AND PASSWORD");
	        }
			
	}}
			
	