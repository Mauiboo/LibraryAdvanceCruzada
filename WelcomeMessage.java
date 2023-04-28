import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeMessage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("WELCOME TO NU LIBRARY SYSTEM");
	
	WelcomeMessage() {
		
		welcomeLabel.setBounds(100, 100, 200, 50);
		welcomeLabel.setFont(new Font("Arial", Font.PLAIN,11));
		welcomeLabel.setForeground(Color.BLUE);
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		ImageIcon image = new ImageIcon("NU.png");
		frame.setIconImage(image.getImage());
	}
}
