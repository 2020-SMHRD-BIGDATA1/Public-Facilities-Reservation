package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;

import Controller.Reservation_1Controller;
import Model.RatingVO;

import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class fcupdateGUI extends JFrame {

	private JFrame frame;
	JPanel panel;

<<<<<<< HEAD
	
=======
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git
	private JLabel lb_fcname;
	JLabel lb_division;
	private JLabel lb_closure;
	private JLabel lb_weekday;
	private JLabel lb_weekend_1;
	private JLabel lb_people;
	private JLabel lb_phone;
	private JLabel lb_homepage;

	Reservation_1Controller con = new Reservation_1Controller();
	private JTable table1;
	private String fcname;
	private JButton btnNewButton;
	private JTable table;
<<<<<<< HEAD
	private JTable table_1;
	
	
	
=======
	private JLabel lblNewLabel;
	private JPanel panel_1;

>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git
	public fcupdateGUI(String name) {
		initialize(name);
		frame.setVisible(true);
		
		
		lb_division.setText(con.getdvision(name));
		lb_closure.setText(con.getclosure(name));
		lb_weekday.setText("����: " + con.getweekday(name));
		lb_weekend_1.setText("�ָ�: " + con.getweekend(name));
		lb_people.setText(con.getpeople(name));
		lb_phone.setText(con.getphone(name));
		lb_homepage.setText(con.gethomepage(name));
		lb_fcname.setText(name);
		System.out.println(con.getImg(name));
		String path = con.getImg(name);
		lblNewLabel.setIcon(new ImageIcon(path));
		panel_1.add(lblNewLabel);
				btnNewButton = new JButton("\uC608\uC57D");
				
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Reservation_1updateGUI re1upgui = new Reservation_1updateGUI(name);
								frame.setVisible(false);
							}
						});
						btnNewButton.setBounds(276, 502, 97, 23);
						frame.getContentPane().add(btnNewButton);
		
		lb_fcname = new JLabel("<dynamic>");
		lb_fcname.setBounds(25, 10, 277, 15);
		frame.getContentPane().add(lb_fcname);
		lb_fcname.setHorizontalAlignment(SwingConstants.CENTER);
		lb_fcname.setFont(new Font("����", Font.BOLD, 12));
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ggggg gg= new ggggg(name);
				frame.setVisible(false);
			}
		
		});
		btnNewButton_1.setIcon(new ImageIcon(fcupdateGUI.class.getResource("/img/prev.jpg")));
		btnNewButton_1.setBounds(12, 6, 23, 23);
		frame.getContentPane().add(btnNewButton_1);
		

	}

	private void initialize(String name) {

		frame = new JFrame();
		frame.setBounds(500, 500, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 27, 320, 518);
		frame.getContentPane().add(scrollPane);

		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setPreferredSize(new Dimension(0, 500));

		lblNewLabel = new JLabel("\uC0AC\uC9C4");
		lblNewLabel.setFont(new Font("HY�߸���", Font.PLAIN, 12));
		lblNewLabel.setBounds(0, 29, 294, 165);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_5 = new JLabel("\uC2DC\uC124\uC124\uBA85");
		lblNewLabel_5.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_5.setBounds(0, 204, 52, 15);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("\uB9AC\uBDF0");
		lblNewLabel_5_1.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(0, 405, 26, 15);
		panel_1.add(lblNewLabel_5_1);
		String myString = "shdflksjdfklsjdfljsdlkfjlk sdjflksjdlkfjslkdfjlksdjflksjd";

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(0, 228, 294, 167);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new GridLayout(8, 2, 0, 0));

		JLabel lblNewLabel_2 = new JLabel(" \uC2DC\uC124\uAD6C\uBD84");
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 12));
		panel_2_1.add(lblNewLabel_2);

		lb_division = new JLabel((String) null);
		panel_2_1.add(lb_division);

		JLabel lblNewLabel_4 = new JLabel(" \uC774\uC6A9\uC2DC\uAC04");
		lblNewLabel_4.setFont(new Font("����", Font.BOLD, 12));
		panel_2_1.add(lblNewLabel_4);

		lb_closure = new JLabel((String) null);
		panel_2_1.add(lb_closure);

		JLabel lb_weekday_1 = new JLabel("");
		panel_2_1.add(lb_weekday_1);

		lb_weekday = new JLabel("\uD3C9\uC77C null");
		panel_2_1.add(lb_weekday);

		JLabel lb_weekend = new JLabel("");
		panel_2_1.add(lb_weekend);

		lb_weekend_1 = new JLabel("\uC8FC\uB9D0 null");
		panel_2_1.add(lb_weekend_1);

		JLabel lb_1 = new JLabel(" \uCD5C\uB300 \uC218\uC6A9\uC778\uC6D0");
		lb_1.setFont(new Font("����", Font.BOLD, 12));
		panel_2_1.add(lb_1);

		lb_people = new JLabel((String) null);
		panel_2_1.add(lb_people);

		JLabel lblNewLabel_1_1_1 = new JLabel(" \uC804\uD654\uBC88\uD638");
		lblNewLabel_1_1_1.setFont(new Font("����", Font.BOLD, 12));
		panel_2_1.add(lblNewLabel_1_1_1);

		lb_phone = new JLabel("\uC804\uBC88");
		panel_2_1.add(lb_phone);

		JLabel lblNewLabel_1_1_3_1 = new JLabel(" \uD648\uD398\uC774\uC9C0");
		lblNewLabel_1_1_3_1.setFont(new Font("����", Font.BOLD, 12));
		panel_2_1.add(lblNewLabel_1_1_3_1);

		lb_homepage = new JLabel((String) null);
		panel_2_1.add(lb_homepage);

		JLabel lblNewLabel_1_1_2 = new JLabel(" \uCDE8\uC18C/\uD658\uBD88\uADDC\uC815");
		lblNewLabel_1_1_2.setFont(new Font("����", Font.BOLD, 12));
		panel_2_1.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("\uB2F9\uC77C \uCDE8\uC18C \uBC0F \uD658\uBD88 \uBD88\uAC00");
		panel_2_1.add(lblNewLabel_1_1_3_1_1_1);
<<<<<<< HEAD
		
=======

//		ArrayList<RatingVO> myarr= con.getrating(name);
//		for (int i = 0; i < myarr.size(); i++) {
//			System.out.println(myarr.get(i));
//		}	
//     	String[][] data = new String[myarr.size()][3];
//     	for (int i = 0; i < data.length; i++) {
//			data[i][0] = myarr.get(i).getId();
//			data[i][1] = myarr.get(i).getRating();
//			data[i][2] = myarr.get(i).getReview();
//		};
// 
		String[] headings = new String[] { "����� ���̵�", "����", "����" };
//		table = new JTable(data, headings);
//		table.setPreferredScrollableViewportSize(new Dimension(320, 300));
//		table.setBounds(12, 435, 294, 100);
//
////      	table.setFillsViewportHeight(true);
//
//		table = new JTable();
//		table.setBounds(0, 430, 294, 26);
//		panel_1.add(table);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git

		lb_fcname = new JLabel("<dynamic>");
		lb_fcname.setBounds(17, 10, 277, 15);
		panel_1.add(lb_fcname);
		lb_fcname.setHorizontalAlignment(SwingConstants.CENTER);
		lb_fcname.setFont(new Font("����", Font.BOLD, 12));
		fcname = name;
		
<<<<<<< HEAD
		

		
		JPanel panel2 = new JPanel();
		panel.setBounds(12, 52, 410, 199);
		frame.getContentPane().add(panel2);
		
		
		
//		String[] headings ={"����� ���̵�", "����","����"};
//		ArrayList<RatingVO> myarr= con.getrating(name);
//		System.out.println("ddsf"+name);
//		
//		for (int i = 0; i < myarr.size(); i++) {
//			System.out.println(myarr.get(i));
//		}
//		
//     	String[][] data = new String[myarr.size()][3];
//     	
//     	for (int i = 0; i < data.length; i++) {
//			data[i][0] = myarr.get(i).getId();
//			data[i][1] = myarr.get(i).getRating();
//			data[i][2] = myarr.get(i).getReview();
//		};
//		
//		
//
//		JTable table_3 = new JTable(data,headings);
//		table_3.setBounds(0, 430, 294, 48);
////		panel_1.add(table_3);
//     	panel_1.add (table_3, BorderLayout.CENTER ) ;
////		panel_1.add (new JScrollPane( table_3 )  , BorderLayout.CENTER) ; 
//		table_3.setBackground(Color.LIGHT_GRAY);
//		table_3.setPreferredScrollableViewportSize(new Dimension(360,300));
//		table_3.setFillsViewportHeight(true);
		
		

		
//		ArrayList<RatingVO> myarr= con.getrating(name);
//		
//		for (int i = 0; i < myarr.size(); i++) {
//			System.out.println(myarr.get(i));
//		}
//		
//     	String[][] data = new String[myarr.size()][3];
//     	
//     	for (int i = 0; i < data.length; i++) {
//			data[i][0] = myarr.get(i).getId();
//			data[i][1] = myarr.get(i).getRating();
//			data[i][2] = myarr.get(i).getReview();
//		};
// 
//	String[] headings = new String[]{"����� ���̵�", "����","����"};
		
//       String[] headings = new String[]{"����� ���̵�", "����","����"};
//    	Object[][] data = new Object[][]	{
//    		{"������","5","����������������������������"}
//    	};
////		
//		table_2 = new JTable(data,headings);
//		table_2.setBackground(Color.LIGHT_GRAY);
//		table1.setPreferredScrollableViewportSize(new Dimension(250,50));
//		table_2.setBounds(0, 471, 289, -40);
//		panel_1.add(table_2);
    	
  
	
		btnNewButton = new JButton("\uC608\uC57D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Reservation_1updateGUI re1upgui= new Reservation_1updateGUI(name);
			}
		});
		btnNewButton.setBounds(235, 555, 97, 23);
		frame.getContentPane().add(btnNewButton);
		fcname=name;
     	

		
	}
	

	
	
}
