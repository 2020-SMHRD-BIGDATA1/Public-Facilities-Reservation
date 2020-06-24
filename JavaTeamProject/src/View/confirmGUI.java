package View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Controller.Reservation_1Controller;

public class confirmGUI {

	private JFrame frame;
	Reservation_1Controller controller = new Reservation_1Controller();
	
	public confirmGUI() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	}

	public void view(String name) {
		System.out.println("아이디 값"+name);
		
		JFrame frame = new JFrame("Table Prac.");
		JPanel panel = new JPanel();
		
		String[] headings = new String[] {"Id", "Name","Location","Charge","Time"};
		Object[][] data = new Object[][] {
			{controller.getVo().getId(),"보라","체육관이름?","500won","10am"},
			{controller.getVo().getId(),"Sunny","동네?","1000won","11am"},
			{controller.getVo().getId(),"John","??","1500won","12am"},
		};
		JTable table = new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		
		table.setFillsViewportHeight(true);
		
		panel.add(new JScrollPane(table));
		
		frame.getContentPane().add(panel);
		
		
		
		
		frame.setVisible(true);
		frame.setSize(800, 640);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		
	}
	
}
