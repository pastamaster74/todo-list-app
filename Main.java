package todoListApp;
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
		
		mainFrame.add(headerText);
		mainFrame.add(textField);
		mainFrame.add(addButton);
		
		mainFrame.repaint();
		
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

	}

}