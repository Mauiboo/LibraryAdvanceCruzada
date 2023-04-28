import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton AdminButton = new JButton ("Admin Login");
	JButton LibrarianButton = new JButton ("Librarian Login");
	
	HomePage(){
			
			ImageIcon image = new ImageIcon("NU.png");
			ImageIcon backgroundImage = new ImageIcon("Library.jpg");
			JLabel backgroundLabel = new JLabel(backgroundImage);
			backgroundLabel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		    
			backgroundLabel.setHorizontalAlignment(JLabel.CENTER);
			backgroundLabel.setVerticalAlignment(JLabel.CENTER);
			frame.setContentPane(backgroundLabel);
			frame.setVisible(true);
			frame.setIconImage(image.getImage());

			AdminButton.setBounds(650, 300, 200, 50);
			AdminButton.setFocusable(false);
			AdminButton.addActionListener(this);
			
			LibrarianButton.setBounds(650, 400, 200, 50);
			LibrarianButton.setFocusable(false);
			LibrarianButton.addActionListener(this);
		
			frame.add(AdminButton);
			frame.add(LibrarianButton);
			frame.setTitle("National University Library Management");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(2000,1000);
			frame.setLayout(null);
			frame.setVisible (true);	
			frame.setLocationRelativeTo(null);

		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==AdminButton) {
			frame.dispose();
			
			AdminPage adminpage = new AdminPage(); 
			
		}
		if(e.getSource()==LibrarianButton) {
			frame.dispose();
		
			LibrarianPage librarianpage = new LibrarianPage();
		
	}
}
}
