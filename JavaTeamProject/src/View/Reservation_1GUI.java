package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Reservation_1Controller;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class Reservation_1GUI {
	
	Reservation_1Controller recon= new Reservation_1Controller();

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_1GUI window = new Reservation_1GUI();
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
	public Reservation_1GUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 78, 83, 421);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(5, 3, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uB0A0\uC9DC ");
		panel.add(lblNewLabel_2);
		
		JLabel label = new JLabel("000");
		panel.add(label);
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd");
	    SimpleDateFormat format2 = new SimpleDateFormat ( "EEE",Locale.KOREAN);

	     String format_time2 = format2.format (System.currentTimeMillis());
			
			System.out.println(format_time2);
			
		   String format_time1 = format1.format (System.currentTimeMillis());
			
			System.out.println(format_time1);
		
		label.setText(format_time1);
		
		JLabel lb_date = new JLabel("New label");
		panel.add(lb_date);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		panel.add(lblNewLabel_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 22, 193, 37);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC608\uC57D\uC815\uBCF4");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(94, 78, 97, 421);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(5, 0, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("\uC694\uC77C");
		panel_2.add(lblNewLabel_5);
		
		JLabel lb_day1 = new JLabel("New label");
		panel_2.add(lb_day1);
		
		
		lb_day1.setText(format_time2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		panel_2.add(lblNewLabel_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(189, 78, 143, 421);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(5, 0, 0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("\uC2DC\uAC04 ");
		panel_3.add(lblNewLabel_10);
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Reservation_2GUI RE2= new Reservation_2GUI();
				
				
			
			}
		});
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_4.add(btnNewButton_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_3.add(panel_4_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_4_1.add(btnNewButton_2);
		
		
		
		JButton btnNewButton_1_1 = new JButton("New button");
		panel_4_1.add(btnNewButton_1_1);
		
		JPanel panel_4_2_1 = new JPanel();
		panel_3.add(panel_4_2_1);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		panel_4_2_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("New button");
		panel_4_2_1.add(btnNewButton_1_2_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_3.add(panel_4_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_4_2.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		panel_4_2.add(btnNewButton_1_2);
		frame.setBounds(100, 100,360,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
