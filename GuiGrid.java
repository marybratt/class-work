import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GuiGrid {
	// create the frame, panel and buttons for the grid
	JFrame frame = new JFrame("GUI Grid");
	JPanel panel = new JPanel();
	JButton btn1 = new JButton("(0,0)");
	JButton btn2 = new JButton("(1,0)");
	JButton btn3 = new JButton("(2,0)");
	JButton btn4 = new JButton("(0,1)");
	JButton btn5 = new JButton("(1,1)");
	JButton btn6 = new JButton("(2,1)");
	JButton btn7 = new JButton("(0,2)");
	JButton btn8 = new JButton("(1,2)");
	JButton btn9 = new JButton("(2,2)");

	public  GuiGrid() {
		//set the layout to 3 columns, 3 rows, with a vertical and horizontal gap
	        panel.setLayout(new GridLayout(3,3,3,3));
	    // add the buttons to the panel
	        panel.add(btn1);
	        panel.add(btn2);
	        panel.add(btn3);
	        panel.add(btn4);
	        panel.add(btn5);
	        panel.add(btn6);
	        panel.add(btn7);
	        panel.add(btn8);
	        panel.add(btn9);
	        //add the panel to the frame
	        frame.add(panel);
	         
	        // Set frame options
	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame.setSize(600,600);//600 width and 600 height  
	 		 frame.setVisible(true);//making the frame visible 
	     }
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GuiGrid();
			}
		});
	}
}
