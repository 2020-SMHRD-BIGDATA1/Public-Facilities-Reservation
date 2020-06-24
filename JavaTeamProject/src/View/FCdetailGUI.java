package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;

import Controller.Reservation_1Controller;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FCdetailGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FCdetailGUI window = new FCdetailGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FCdetailGUI() {
		initialize();
	}
	Reservation_1Controller con= new Reservation_1Controller();

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC2DC\uC124\uBA85");
		lblNewLabel.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 10, 167, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 184, 320, 223);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(8, 2, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uC2DC\uC124\uAD6C\uBD84");
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_2);
		
		JLabel lb_division = new JLabel("New label");
		panel.add(lb_division);
		
		lb_division.setText(con.getvision());
		
		JLabel lblNewLabel_4 = new JLabel("\uC774\uC6A9\uC2DC\uAC04");
		lblNewLabel_4.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_4);
		
		JLabel lb_closure = new JLabel("New label");
		panel.add(lb_closure);
		
		lb_closure.setText(con.getclosure());
		
		JLabel lb_weekday_1 = new JLabel("");
		panel.add(lb_weekday_1);
		
		JLabel lb_weekday = new JLabel("New label");
		panel.add(lb_weekday);
		
		lb_weekday.setText("∆Ú¿œ "+con.getweekday());
		
		JLabel lb_weekend = new JLabel("New label");
		panel.add(lb_weekend);
		
		lb_weekend.setText("");
		
		JLabel lb_weekend_1 = new JLabel("\uC8FC\uB9D0 8:00~23:00");
		panel.add(lb_weekend_1);
		
		JLabel lb_1 = new JLabel("\uCD5C\uB300 \uC218\uC6A9\uC778\uC6D0");
		lb_1.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lb_1);
		
		JLabel lb_people = new JLabel("New label");
		panel.add(lb_people);
		
		lb_people.setText(con.getpeople());
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_1_1_1.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lb_phone = new JLabel("062-960-8723");
		panel.add(lb_phone);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("\uD648\uD398\uC774\uC9C0");
		lblNewLabel_1_1_3_1.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_1_1_3_1);
		
		JLabel lb_homepage = new JLabel("New label");
		panel.add(lb_homepage);
		
		lb_homepage.setText(con.gethomepage());
		
		JLabel lblNewLabel_1_1_2 = new JLabel("\uCDE8\uC18C/\uD658\uBD88\uADDC\uC815");
		lblNewLabel_1_1_2.setFont(new Font("±º∏≤", Font.BOLD, 12));
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3_1_1_1 = new JLabel("\uB2F9\uC77C \uCDE8\uC18C \uBC0F \uD658\uBD88 \uBD88\uAC00");
		panel.add(lblNewLabel_1_1_3_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("\uC2DC\uC124\uC124\uBA85");
		lblNewLabel_5.setFont(new Font("±º∏≤", Font.BOLD, 12));
		lblNewLabel_5.setBounds(12, 158, 132, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("\uC608\uC57D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Reservation_1GUI re1=new Reservation_1GUI();
				
			}
		});
		btnNewButton.setBounds(235, 503, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0AC\uC9C4");
		lblNewLabel_1.setBounds(12, 47, 320, 101);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 417, 320, 61);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("\uB9AC\uBDF0");
		panel_1.add(lblNewLabel_3);
	}
}
