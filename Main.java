import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Todo-list");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(600, 200, 400, 500);
		mainFrame.setResizable(false);
		mainFrame.setLayout(null);
		mainFrame.getContentPane().setBackground(new Color(122, 118, 118));
		mainFrame.setVisible(true);
		
		JLabel headerText = new JLabel("-- Todo list --");
		headerText.setBounds(110, 0, 300, 100);
		headerText.setFont(new Font("sans-serif", Font.ITALIC, 30));
		headerText.setForeground(Color.WHITE);
		
		JTextField textField = new JTextField();
		textField.setBounds(20, 100, 225, 25);
		textField.setFont(new Font("sans-serif", Font.PLAIN, 14));
		textField.setBackground(new Color(153, 148, 148));
		textField.setForeground(Color.WHITE);
		
		JButton addButton = new JButton("Add");
		addButton.setBounds(265, 90, 100, 50);
		addButton.setFont(new Font("sans-serif", Font.BOLD, 14));
		addButton.setBackground(new Color(153, 148, 148));
		addButton.setForeground(Color.WHITE);
		
		JButton settingsButton = new JButton("Settings");
		settingsButton.setBounds(10, 435, 100, 20);
		settingsButton.setFont(new Font("sans-serif", Font.PLAIN, 14));
		settingsButton.setBackground(new Color(153, 148, 148));
		settingsButton.setForeground(Color.WHITE);
		
		JFrame settingsFrame = new JFrame("Settings");
		settingsFrame.setBounds(mainFrame.getX() + 35, mainFrame.getY() + 35, 380, 480);
		settingsFrame.setResizable(false);
		settingsFrame.setLayout(null);
		settingsFrame.getContentPane().setBackground(new Color(122, 118, 118));
		settingsFrame.setVisible(false);
		
		JLabel headerText2 = new JLabel("-- Settings --");
		headerText2.setBounds(100, 0, 300, 100);
		headerText2.setFont(new Font("sans-serif", Font.ITALIC, 30));
		headerText2.setForeground(Color.WHITE);
		
		JButton darkThemeButton = new JButton("Dark theme");
		darkThemeButton.setBounds(40, 90, 125, 30);
		darkThemeButton.setFont(new Font("sans-serif", Font.PLAIN, 14));
		darkThemeButton.setBackground(new Color(153, 148, 148));
		darkThemeButton.setForeground(Color.WHITE);
		
		JButton lightThemeButton = new JButton("Light theme");
		lightThemeButton.setBounds(215, 90, 125, 30);
		lightThemeButton.setFont(new Font("sans-serif", Font.PLAIN, 14));
		lightThemeButton.setBackground(new Color(153, 148, 148));
		lightThemeButton.setForeground(Color.WHITE);
		
		mainFrame.add(headerText);
		mainFrame.add(textField);
		mainFrame.add(addButton);
		mainFrame.add(settingsButton);
		
		settingsFrame.add(headerText2);
		settingsFrame.add(darkThemeButton);
		settingsFrame.add(lightThemeButton);
		
		mainFrame.repaint();
		settingsFrame.repaint();
		
		addButton.addActionListener(new ActionListener() {

			int noteCount = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (noteCount < 7) {
					String note = textField.getText();
					
					// create note and checkBox
					JLabel noteLabel = new JLabel(note);
					noteLabel.setBounds(50, 140 + noteCount * 40, 400, 50);
					noteLabel.setFont(new Font("sans-serif", Font.PLAIN, 18));
					noteLabel.setForeground(Color.WHITE);
					
					JCheckBox checkBox = new JCheckBox();
					checkBox.setBounds(20, 150 + noteCount * 40, 25, 25);
					checkBox.setContentAreaFilled(false);
					
					// add note and CheckBox
					mainFrame.add(noteLabel);
					mainFrame.add(checkBox);
					mainFrame.repaint();
					
					// clear textField
					textField.setText("");
					
					noteCount ++;
				}
			}
			
		});

		settingsButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				settingsFrame.setBounds(mainFrame.getX() + 35, mainFrame.getY() + 35, 380, 480);
				settingsFrame.setVisible(true);
			}
			
		});
		
		darkThemeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.getContentPane().setBackground(new Color(122, 118, 118));
				headerText.setForeground(Color.WHITE);
				textField.setBackground(new Color(153, 148, 148));
				textField.setForeground(Color.WHITE);
				addButton.setBackground(new Color(153, 148, 148));
				addButton.setForeground(Color.WHITE);
				settingsButton.setBackground(new Color(153, 148, 148));
				settingsButton.setForeground(Color.WHITE);
				settingsFrame.getContentPane().setBackground(new Color(122, 118, 118));
				headerText2.setForeground(Color.WHITE);
				darkThemeButton.setBackground(new Color(153, 148, 148));
				darkThemeButton.setForeground(Color.WHITE);
				lightThemeButton.setBackground(new Color(153, 148, 148));
				lightThemeButton.setForeground(Color.WHITE);
				
				mainFrame.repaint();
				settingsFrame.repaint();
			}
			
		});
		
		lightThemeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.getContentPane().setBackground(new Color(237, 242, 239));
				headerText.setForeground(Color.BLACK);
				textField.setBackground(new Color(213, 219, 215));
				textField.setForeground(Color.BLACK);
				addButton.setBackground(new Color(213, 219, 215));
				addButton.setForeground(Color.BLACK);
				settingsButton.setBackground(new Color(213, 219, 215));
				settingsButton.setForeground(Color.BLACK);
				settingsFrame.getContentPane().setBackground(new Color(237, 242, 239));
				headerText2.setForeground(Color.BLACK);
				darkThemeButton.setBackground(new Color(213, 219, 215));
				darkThemeButton.setForeground(Color.BLACK);
				lightThemeButton.setBackground(new Color(213, 219, 215));
				lightThemeButton.setForeground(Color.BLACK);
				
				mainFrame.repaint();
				settingsFrame.repaint();
			}
			
		});
		
	}
	
}
