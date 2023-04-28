
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BookList implements ActionListener {
	
	JFrame frame;
	JPanel bookPanel;
	JLabel remainingLabel;
	
	public BookList() {
		 
		JFrame frame = new JFrame();

		// Create an array of books
		Book[] books = { new Book("Atomic Habits", "James Clear", 3),
				new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 2),
				new Book("It's start with us", "Colleen Hoover", 1), };

		// Create a panel to hold the list of books and checkboxes
		JPanel bookPanel = new JPanel();
		bookPanel.setLayout(new GridLayout(books.length, 2));

		// Add each book and checkbox to the panel
		for (int i = 0; i < books.length; i++) {
			Book book = books[i];
			JLabel bookLabel = new JLabel(
			book.getTitle() + " by " + book.getAuthor() + " (" + book.getNumCopies() + " copies)");
			bookPanel.add(bookLabel);
			
			remainingLabel = new JLabel("Remaining copies: " + book.getNumCopies());
			bookPanel.add(remainingLabel);
			
		}

		ButtonGroup group = new ButtonGroup();

		JCheckBox rentCheckBox = new JCheckBox("Rent");
		rentCheckBox.setBounds(280, 2, 100, 15);
		frame.add(rentCheckBox);

		JCheckBox rentCheckBox2 = new JCheckBox("Rent");
		rentCheckBox2.setBounds(280, 18, 100, 15);
		frame.add(rentCheckBox2);

		JCheckBox rentCheckBox3 = new JCheckBox("Rent");
		rentCheckBox3.setBounds(280, 34, 100, 15);
		frame.add(rentCheckBox3);

		group.add(rentCheckBox);
		group.add(rentCheckBox2);
		group.add(rentCheckBox3);

		JButton submitButton = new JButton("Submit"); 
		
		submitButton.setBounds(110, 90, 150, 20); // Set location
		frame.add(submitButton);
		submitButton.setVisible(true);

		// Add the book panel to the main frame
		frame.getContentPane().add(bookPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		submitButton.addActionListener(e -> { // Action Listener ng Button
			if (rentCheckBox.isSelected()) {
				books[0].rentCopy();
				JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				remainingLabel.setText("Remaining copies: " + books[0].getNumCopies());
			} else if (rentCheckBox2.isSelected()) {
				books[1].rentCopy();
				JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				remainingLabel.setText("Remaining copies: " + books[1].getNumCopies());
			} else if (rentCheckBox3.isSelected()) {
				 books[2].rentCopy();
				JOptionPane.showMessageDialog(null, "Book Rented Succesfully", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				remainingLabel.setText("Remaining copies: " + books[2].getNumCopies());
			} else {
				JOptionPane.showMessageDialog(null, "Please select a book", "Error", JOptionPane.INFORMATION_MESSAGE);
			}

		});
	}

	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	    
	}
	 


	


    
	
