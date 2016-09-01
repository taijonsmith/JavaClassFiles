package assignment3package;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StyleOptionsPanel extends JPanel {
	private JLabel saying;
	private JCheckBox bold, italic;
	
	private JTextField font; //font = the text of the font
	int fontSize;
	//style of java font is plain
	int style = Font.PLAIN; //Font = class which represents a particular char font
	
	public StyleOptionsPanel() {
		
		font = new JTextField(10); //allows editing of text
		font.setText("36"); //font size of text
		saying = new JLabel ("Say it with style!");
		//method that detects selected font by number enetered by user
		saying.setFont(new Font("Helvetica", style,
				Integer.parseInt(font.getText())));
		//text listener class
		TextListener textListener = new TextListener();
		font.addActionListener(textListener);
		//option boxes constructors
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		bold = new JCheckBox ("Bold");
		bold.setBackground(Color.cyan);

		StyleListener listener = new StyleListener();
		italic.addItemListener(listener);
		bold.addItemListener(listener);
		add(font);
		add(bold);
		add(italic);
		add(saying);
		//label for user to enter in font size
		add(new JLabel("Enter text font size"));
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 100));
	}

	class TextListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			if (italic.isSelected())
				style += Font.ITALIC;
			
			if (bold.isSelected())
				style = Font.BOLD;
			
			fontSize = Integer.parseInt(font.getText()); //user's selected font size
			saying.setFont(new Font("Helvetica", style, fontSize));
		}
	}
	private class StyleListener implements ItemListener
	{
		//when style of text changes
		public void itemStateChanged(ItemEvent event) {
			if (italic.isSelected())
				style += Font.ITALIC;
			
			if (bold.isSelected())
				style = Font.BOLD;

			fontSize = Integer.parseInt(font.getText());
			saying.setFont(new Font("Helvetica", style, fontSize));
		}
	}
}