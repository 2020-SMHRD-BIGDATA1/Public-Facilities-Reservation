package View;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(tableUpdateGUI.class.getResource("/img/frame.jpg")));
		frame.setBounds(500, 500, 450, 600);
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
		table.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		table.setPreferredScrollableViewportSize(new Dimension(360,300));
		
		table.setFillsViewportHeight(true);
		
		panel.add(table);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyPageGUI my =new MyPageGUI();
				frame.setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(tableUpdateGUI.class.getResource("/img/prev.jpg")));
		btnNewButton.setBounds(12, 10, 23, 23);
		frame.getContentPane().add(btnNewButton);
	
	
	}
}
