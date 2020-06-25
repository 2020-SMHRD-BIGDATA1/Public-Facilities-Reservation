package View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTable;

public class tableUpdateGUI {

	private JFrame frame;
	private JTable table;

	
	public tableUpdateGUI() {
		
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 52, 410, 199);
		frame.getContentPane().add(panel);
		
		
		
		String[] headings = new String[] {"Id", "Name","Location","Charge","Time"};
		Object[][] data = new Object[][] {
			{LoginGUI.controller.getLoginUser().getId(),"보라","체육관이름?","500won","10am"},
			{LoginGUI.controller.getLoginUser().getId(),"보라","체육관이름?","500won","10am"},
			{LoginGUI.controller.getLoginUser().getId(),"보라","체육관이름?","500won","10am"},
			
			
		};
		JTable table = new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(360,300));
		
		table.setFillsViewportHeight(true);
		
		panel.add(table);
	
	
	}
}
