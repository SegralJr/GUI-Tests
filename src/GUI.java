import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
	
	private JFrame frame = new JFrame("Window");
	private JButton copy = new JButton("Copy");
	private JButton paste = new JButton("Paste");
	
	public void openWindow() {
		
		Container pane = frame.getContentPane();
		
		Font font = new Font("Dialog", Font.ITALIC, 24);
		
		frame.setSize(800, 450);
		frame.setLocation(25, 15);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JLabel northLabel = new JLabel("This window is lit yo");
		northLabel.setForeground(Color.magenta);
		northLabel.setOpaque(true);
		northLabel.setBackground(Color.orange);
		northLabel.setFont(font);
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.BLUE);
		northPanel.add(northLabel);
		
		JPanel center = new JPanel();
		
		center.setLayout(new GridLayout(2,2,20,40));
		center.add(northLabel);
		
		pane.add(northLabel, BorderLayout.NORTH);
		pane.add((new JPanel()).add(new JLabel(" MEMES ")), BorderLayout.EAST);
		pane.add((new JPanel()).add(new JLabel(" MEMES ")), BorderLayout.WEST);
		
		
		//JOptionPane.showMessageDialog(frame, "Test");
	}
}
 