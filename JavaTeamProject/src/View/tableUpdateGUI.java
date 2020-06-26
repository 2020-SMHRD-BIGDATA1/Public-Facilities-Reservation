package View;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTable;

import Controller.Reservation_1Controller;
import Model.ReserVO;
import Model.timevo;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class tableUpdateGUI implements MouseListener {

	private JFrame frame;
	private JTable table;

	Reservation_1Controller con= new Reservation_1Controller();
	private String time;
	
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
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 52, 410, 199);
		frame.getContentPane().add(panel);
		
//		create table reservation(
//				user_id varchar2(20),
//			    fac_id number,
//				Fac_Name varchar2(100) NOT NULL,
//				reserdate varchar2(30) NOT NULL,
//				usedate varchar2(30) NOT NULL,
//				usetime varchar2(30) NOT NULL,
//				fee varchar2(20) 
//			);
		
		String id= LoginGUI.controller.getLoginUser().getId();
		
		ArrayList<ReserVO> list =con.getreservation(id);
		String[] headings = new String[] {"Fac_Name", "reserdate","usedate","fee"};
		
		String[][] data = new String[list.size()][4] ;
	
		for (int i = 0; i < list.size(); i++) {
			data[i][0]=list.get(i).getFac_name();
			data[i][1]=list.get(i).getReserdate();
			data[i][2]=list.get(i).getUsedate();
			data[i][3]=list.get(i).getFee();
		};
		
		JTable table = new JTable(data,headings);
		table.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		table.setPreferredScrollableViewportSize(new Dimension(360,300));
		
		table.setFillsViewportHeight(true);
		
		panel.add(table);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MyPageGUI my =new MyPageGUI();
				frame.setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(tableUpdateGUI.class.getResource("/img/prev.jpg")));
		btnNewButton.setBounds(12, 10, 23, 23);
		frame.getContentPane().add(btnNewButton);
		

		table.addMouseListener(this);
	
	}



@Override
public void mouseClicked(MouseEvent e) {
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mousePressed(MouseEvent e) {
	JTable table = (JTable)e.getSource();
	String fcname = (String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
	// 클릭한 데이터

	GradeGUI gradegui= new GradeGUI(fcname);
	
	
	
	frame.setVisible(false);
//	System.out.println(time);
//	System.out.println("df"+name);
//	System.out.println("df"+date1);
	
//	System.out.println(time);

	
}


@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}