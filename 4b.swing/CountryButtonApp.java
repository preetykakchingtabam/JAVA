package swing4b;
import javax.swing.*;
import java.awt.event.*;

public class CountryButtonApp extends JFrame implements ActionListener {

	    JButton btnSrilanka;
	    JButton btnIndia;
	    JLabel label;

	    public CountryButtonApp() {
	        // Frame settings
	        setTitle("Country Button App");
	        setSize(300, 200);
	        setLayout(null); // We'll manually set the layout
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create buttons
	        btnSrilanka = new JButton("Srilanka");
	        btnIndia = new JButton("India");

	        // Create label
	        label = new JLabel("");
	        label.setBounds(90, 120, 200, 30);

	        // Set button positions
	        btnSrilanka.setBounds(50, 50, 90, 30);
	        btnIndia.setBounds(150, 50, 90, 30);

	        // Add action listeners
	        btnSrilanka.addActionListener(this);
	        btnIndia.addActionListener(this);

	        // Add components to frame
	        add(btnSrilanka);
	        add(btnIndia);
	        add(label);

	        // Make frame visible
	        setVisible(true);
	    }

	    // Action event handler
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnSrilanka) {
	            label.setText("Srilanka is pressed");
	        } else if (e.getSource() == btnIndia) {
	            label.setText("India is pressed");
	        }
	    }

	    // Main method to run the app
	    public static void main(String[] args) {
	        new CountryButtonApp();
	    }
	}

