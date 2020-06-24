package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.Reservation_1Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reservation_3GUI {

	private JFrame frame;
	private JTextField textField_title;
	private JTextField textField_body;

	Reservation_1Controller con = new Reservation_1Controller();

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

	int cnt = 1;

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD300\uC6D0 \uAD6C\uD558\uAE30 \uBC29 \uAC1C\uC124 ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setBounds(113, 38, 164, 15);
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
				lb_cnt.setText(cnt + "");

			}
		});
		panel.add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("\uC778\uC6D0\uC218");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_3.setBounds(12, 73, 164, 15);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("\uBC29 \uC81C\uBAA9 \uC124\uC815 ");
		lblNewLabel_3_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(12, 149, 164, 15);
		frame.getContentPane().add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("\uBC29 \uC124\uBA85 \uC124\uC815 ");
		lblNewLabel_3_1_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(12, 260, 164, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1);

		textField_title = new JTextField();
		textField_title.setBounds(12, 174, 320, 63);
		frame.getContentPane().add(textField_title);
		textField_title.setColumns(10);

		

		textField_body = new JTextField();
		textField_body.setBounds(12, 292, 320, 103);
		frame.getContentPane().add(textField_body);
		textField_body.setColumns(10);
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		JButton btnNewButton_1 = new JButton("\uD655\uC778");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String body = textField_body.getText();
				String title = textField_title.getText();
				if (title.equals("") && body.equals("")) {

					JOptionPane.showMessageDialog(frame, "제목과 설명이 올바르지 않습니다!", "매칭신청결과", JOptionPane.PLAIN_MESSAGE);

				} else {

					int count = con.insert(con.getVo().getId(), cnt, title, body);
					if (count > 0) {
						JOptionPane.showMessageDialog(frame, "신청 성공하셨습니다!", "매칭신청결과", JOptionPane.PLAIN_MESSAGE);
					}

					frame.dispose();

				}

			}
		});
		btnNewButton_1.setBounds(235, 487, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btn_back = new JButton("<");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btn_back.setBounds(4, 34, 97, 23);
		frame.getContentPane().add(btn_back);

	}
}