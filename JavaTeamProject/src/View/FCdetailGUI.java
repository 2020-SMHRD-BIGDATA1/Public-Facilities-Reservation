package View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Controller.Reservation_1Controller;
import Model.GradeDAO;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JTabbedPane;

import javax.swing.ScrollPaneConstants;

public class FCdetailGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */

	JLabel lb_fcname;
	GradeDAO dao = new GradeDAO();
	private String fc_name;

	public FCdetailGUI(String fcname) {
		initialize();
		frame.setVisible(true);
		lb_fcname.setText(fcname);
		fc_name = fcname;

		JPanel panel_table = new JPanel();
		panel_table.setBounds(12, 433, 320, 61);
		frame.getContentPane().add(panel_table);

		String[] headings = new String[] { "æ∆¿Ãµ", "∆Ú¡°", "∏Æ∫‰" };
		Object[][] data = new Object[][] {
				{ "sdf", dao.search(fc_name).getRating(), dao.search(fc_name).getReview() } };

		JTable table = new JTable(data, headings);
		table.setPreferredScrollableViewportSize(new Dimension(360, 61));

		table.setFillsViewportHeight(true);

		panel_table.add(new JScrollPane(table));

		JLabel lblNewLabel_5 = new JLabel("\uB9AC\uBDF0");
		lblNewLabel_5.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_5.setBounds(12, 408, 132, 27);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(12, 18, 38, 23);
		frame.getContentPane().add(btnNewButton_1);

	}

	Reservation_1Controller con = new Reservation_1Controller();

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SMHRD\\Desktop\\image\\frame.jpg"));
		frame.setBounds(100, 100, 360, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

//	    JScrollPane scrollPane = new JScrollPane();
//	    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//	    scrollPane.setBounds(0, 10, 300, 600);
//	    frame.getContentPane().add(scrollPane);

		lb_fcname = new JLabel("\uC2DC\uC124\uBA85");
		lb_fcname.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lb_fcname.setBounds(85, 10, 167, 38);
		frame.getContentPane().add(lb_fcname);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(12, 152, 320, 223);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(8, 2, 0, 0));

		JLabel lblNewLabel_2 = new JLabel(" \uC2DC\uC124\uAD6C\uBD84");
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_2);

		JLabel lb_division = new JLabel("New label");
		panel.add(lb_division);

		lb_division.setText(con.getdvision(fc_name));

		JLabel lblNewLabel_4 = new JLabel(" \uC774\uC6A9\uC2DC\uAC04");
		lblNewLabel_4.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_4);

		JLabel lb_closure = new JLabel("New label");
		panel.add(lb_closure);

		lb_closure.setText(con.getclosure(fc_name));

		JLabel lb_weekday_1 = new JLabel("");
		panel.add(lb_weekday_1);

		JLabel lb_weekday = new JLabel("New label");
		panel.add(lb_weekday);

		lb_weekday.setText("∆Ú¿œ " + con.getweekday(fc_name));

		JLabel lb_weekend = new JLabel("New label");
		panel.add(lb_weekend);

		lb_weekend.setText("");

		JLabel lb_weekend_1 = new JLabel("\uC8FC\uB9D0 8:00~23:00");
		panel.add(lb_weekend_1);
		lb_weekend_1.setText("¡÷∏ª " + con.getweekend(fc_name));

		JLabel lb_1 = new JLabel(" \uCD5C\uB300 \uC218\uC6A9\uC778\uC6D0");
		lb_1.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lb_1);

		JLabel lb_people = new JLabel("New label");
		panel.add(lb_people);

		lb_people.setText(con.getpeople(fc_name));

		JLabel lblNewLabel_1_1_1 = new JLabel(" \uC804\uD654\uBC88\uD638");
		lblNewLabel_1_1_1.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_1_1_1);

		JLabel lb_phone = new JLabel("¿¸π¯");
		panel.add(lb_phone);
		lb_people.setText(con.getphone(fc_name));

		JLabel lblNewLabel_1_1_3_1 = new JLabel(" \uD648\uD398\uC774\uC9C0");
		lblNewLabel_1_1_3_1.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_1_1_3_1);

		JLabel lb_homepage = new JLabel("New label");
		panel.add(lb_homepage);

		lb_homepage.setText(con.gethomepage(fc_name));

		JLabel lblNewLabel_1_1_2 = new JLabel(" \uCDE8\uC18C/\uD658\uBD88\uADDC\uC815");
		lblNewLabel_1_1_2.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("\uB2F9\uC77C \uCDE8\uC18C \uBC0F \uD658\uBD88 \uBD88\uAC00");
		panel.add(lblNewLabel_1_1_3_1_1_1);

		JLabel lblNewLabel_5 = new JLabel("\uC2DC\uC124\uC124\uBA85");
		lblNewLabel_5.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_5.setBounds(12, 126, 132, 27);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnNewButton = new JButton("\uC608\uC57D");
		btnNewButton.setFont(new Font("HY∞ﬂ∞ÌµÒ", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(123, 104, 238));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Reservation_1GUI re1 = new Reservation_1GUI();
//        	Reservation_1updateGUI re1test=new Reservation_1updateGUI();

			}
		});
		btnNewButton.setBounds(235, 517, 97, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("\uC0AC\uC9C4");
		lblNewLabel_1.setFont(new Font("HY∞ﬂ∏Ì¡∂", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(12, 58, 320, 61);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
