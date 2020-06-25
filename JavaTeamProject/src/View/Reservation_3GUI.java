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
import Model.fcnamevo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Reservation_3GUI {
	private JButton btnNewButton_1;
	private JFrame frame;
	private JTextField textField_title;
	private JTextField textField_body;

	Reservation_1Controller con = new Reservation_1Controller();
	

	public Reservation_3GUI(String fac_name) {
		initialize(fac_name);
		frame.setVisible(true);
	}

	int cnt = 1;

	private void initialize(String fac_name) {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Reservation_3GUI.class.getResource("/img/frame.jpg")));
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.getContentPane().setLayout(null);
		

		JLabel lblNewLabel = new JLabel("\uD300\uC6D0 \uAD6C\uD558\uAE30 \uBC29 \uAC1C\uC124 ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,30));
		lblNewLabel.setBounds(79, 18, 297, 35);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 248, 220));
		panel.setBounds(12, 87, 410, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblNewLabel_1 = new JLabel(" \uD544\uC694\uD55C \uC778\uC6D0\uC218 ");
		lblNewLabel_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel.add(lblNewLabel_1);

		JLabel lb_cnt = new JLabel("1");
		lb_cnt.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		lb_cnt.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lb_cnt);

		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(new Color(255, 160, 122));
		btnNewButton.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cnt++;
				lb_cnt.setText(cnt + "");

			}
		});
		panel.add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("\uC778\uC6D0\uC218");
		lblNewLabel_3.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		lblNewLabel_3.setBounds(12, 63, 164, 15);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("\uC81C\uBAA9 \uC124\uC815 ");
		lblNewLabel_3_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		lblNewLabel_3_1.setBounds(12, 149, 164, 15);
		frame.getContentPane().add(lblNewLabel_3_1);

		JLabel lblNewLabel_3_1_1 = new JLabel("\uB0B4\uC6A9 \uC124\uC815 ");
		lblNewLabel_3_1_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		lblNewLabel_3_1_1.setBounds(12, 260, 164, 15);
		frame.getContentPane().add(lblNewLabel_3_1_1);

		textField_title = new JTextField();
		textField_title.setBackground(new Color(255, 250, 250));
		textField_title.setBounds(12, 174, 410, 63);
		frame.getContentPane().add(textField_title);
		textField_title.setColumns(10);

		

		textField_body = new JTextField();
		textField_body.setBackground(new Color(255, 250, 250));
		textField_body.setBounds(12, 292, 410, 161);
		frame.getContentPane().add(textField_body);
		textField_body.setColumns(10);
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnNewButton_1 = new JButton("\uD655\uC778");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(123, 104, 238));
		btnNewButton_1.setVisible(true);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String body = textField_body.getText();
				String title = textField_title.getText();
				if (title.equals("") && body.equals("")) {

					JOptionPane.showMessageDialog(frame, "제목과 설명이 올바르지 않습니다!", "매칭신청결과", JOptionPane.PLAIN_MESSAGE);

				} else {

					int count = con.insert(con.getfac_id(fac_name),Reservation_1Controller.getVo().getId(), cnt, title, body);
					if (count > 0) {
						JOptionPane.showMessageDialog(frame, "신청 성공하셨습니다!", "매칭신청결과", JOptionPane.PLAIN_MESSAGE);
					}
					frame.dispose();

				}

			}
		});
		btnNewButton_1.setBounds(325, 463, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		JButton btn_back = new JButton("");
		btn_back.setIcon(new ImageIcon(Reservation_3GUI.class.getResource("/img/prev.jpg")));
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
			}
		});
		btn_back.setBounds(12, 10, 23, 23);
		frame.getContentPane().add(btn_back);

	}
}