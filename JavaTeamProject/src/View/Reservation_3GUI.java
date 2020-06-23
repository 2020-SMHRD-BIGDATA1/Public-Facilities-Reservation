package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reservation_3GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_3GUI window = new Reservation_3GUI();
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
	public Reservation_3GUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	int cnt=1;
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD300\uC6D0 \uAD6C\uD558\uAE30 \uBC29 \uAC1C\uC124 ");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 38, 164, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 88, 320, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uD544\uC694\uD55C \uC778\uC6D0\uC218 ");
		panel.add(lblNewLabel_1);
		
		JLabel lb_cnt = new JLabel("1");
		lb_cnt.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lb_cnt);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cnt++;
				lb_cnt.setText(cnt+"");
				
			}
		});
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("\uC778\uC6D0\uC218");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_3.setBounds(12, 73, 164, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uBC29 \uC81C\uBAA9 \uC124\uC815 ");
		lblNewLabel_3_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(12, 149, 164, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("\uBC29 \uC124\uBA85 \uC124\uC815 ");
		lblNewLabel_3_1_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(12, 260, 164, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1 = new JButton("\uD655\uC778");
		btnNewButton_1.setBounds(235, 487, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(12, 174, 320, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 292, 320, 103);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
