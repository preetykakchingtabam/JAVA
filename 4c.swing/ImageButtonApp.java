// 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
// Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
// pressed by implementing the event handling mechanism with addActionListener( ).

package swing4c;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonApp extends JFrame implements ActionListener{

	    JButton btnDigitalClock;
	    JButton btnHourGlass;
	    JLabel label;

	    public ImageButtonApp() {
	        setTitle("Image Button Example");
	        setSize(400, 300);
	        setLayout(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Load and scale images
	        
	        ImageIcon digitalClockRaw = new ImageIcon("C:\\Users\\Preety\\eclipse-workspace11\\swing4c\\src\\digital_clock.jpeg");
	        ImageIcon hourGlassRaw = new ImageIcon("C:\\Users\\Preety\\eclipse-workspace11\\swing4c\\src\\hourglass.jpg");


	        Image digitalClockImg = digitalClockRaw.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        Image hourGlassImg = hourGlassRaw.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

	        // Set scaled icons
	        ImageIcon digitalClockIcon = new ImageIcon(digitalClockImg);
	        ImageIcon hourGlassIcon = new ImageIcon(hourGlassImg);

	        // Create buttons with resized icons
	        btnDigitalClock = new JButton(digitalClockIcon);
	        btnHourGlass = new JButton(hourGlassIcon);

	        // Set button positions and size
	        btnDigitalClock.setBounds(50, 50, 100, 100);
	        btnHourGlass.setBounds(200, 50, 100, 100);

	        // Add action listeners
	        btnDigitalClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Label to display messages
	        label = new JLabel("");
	        label.setBounds(100, 200, 250, 30);

	        // Add to frame
	        add(btnDigitalClock);
	        add(btnHourGlass);
	        add(label);

	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnDigitalClock) {
	            label.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourGlass) {
	            label.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new ImageButtonApp();
	    }
	}


