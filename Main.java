import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {
	static JLabel label1;
	public static JTextField text1,text2,text3;
	public static int let =0;
	public static JPanel pane = new JPanel();
	public static JPanel pane1 = new JPanel();
	public static JFrame frame = new JFrame();
	
	public static int hangState = 1;
	
	public void updatePic(int i) {
		pane.removeAll();
		pane.add(new JLabel(new ImageIcon(getClass().getResource(i + ".png"))));
		if(i >1){
		pane.add(text1);
		pane.add(text2);
		pane.add(text3);
		}
		
		
	}
	
	public void frame(){
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle(" Test ");
		frame.setResizable(true);
		frame.pack();
		frame.setLocationRelativeTo(null);
		pane1.setVisible(true);
		frame.add(pane1);
		
		pane.setVisible(true);
		pane.setLayout(new BoxLayout(pane,BoxLayout.PAGE_AXIS));
		frame.add(pane);
		
		//Make textField get the focus whenever frame is activated.
		frame.addWindowFocusListener(new WindowAdapter() {
		    public void windowGainedFocus(WindowEvent e) {
		        frame.requestFocusInWindow();
		    }
		});
	}
	public void pack(){
		frame.pack();
		Main m = new Main();

	
	}

	
	public static void main (String [] args){
		Main MainC = new Main();
		Strings.init();
		MainC.frame();	
	
		MainC.updatePic(hangState);
		Text.addText();
		frame.pack();
		Main c = new Main();
		

		
		
		
		
		
		
	}
	
	
}

