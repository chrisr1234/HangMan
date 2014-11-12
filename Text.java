import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class Text {
	static int x = 0;

	public static void addText() {
		Main c = new Main();

		Main.text1 = new JTextField(Strings.str());

		Main.text1.setVisible(true);
		Main.text1.setSize(10, 10);
		Main.text1.setEditable(false);

		Main.text2 = new JTextField("Guess letters Here");
		Main.text2.setVisible(true);
		Main.text2.setFocusable(true);
		Main.text2.setFocusCycleRoot(true);
		Main.text2.setDocument(new JTextFieldLimit(1));

		
		
		Main.text2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 images.draw();
			}

		});
		
		Main.text3 = new JTextField("Letters you have tried");
		Main.text3.setVisible(true);
		Main.text3.setFocusable(true);
		Main.text3.setEditable(false);
	

		Main.pane.add(Main.text1);
		Main.pane.add(Main.text2);
		Main.pane.add(Main.text3);
	}
}
