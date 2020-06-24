package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import Controller.Reservation_1Controller;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PointGUI2 {

	private JFrame frame;
	private String point;

	JLabel lb_charge;
	Reservation_1Controller re_controller =new Reservation_1Controller();
	public  PointGUI2(int point2) {
		initialize();
		frame.setVisible(true);
		
		lb_charge.setText(point2+"가 충전이 되었습니다~ ");
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(35, 289, 183, 52);
		frame.getContentPane().add(btnNewButton);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb_now = new JLabel("\uD604\uC7AC \uD68C\uC6D0\uB2D8\uC758 \uD3EC\uC778\uD2B8\uB294 \"2000p\"\uC785\uB2C8\uB2E4");
		lb_now.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lb_now.setBounds(60, 157, 301, 52);
		frame.getContentPane().add(lb_now);
		
		
		lb_now.setText("현재 포인트는 "+re_controller.getpoint()+"입니다");
		
		lb_charge = new JLabel("\"100p\"\uC801\uB9BD\uB418\uC5C8\uC2B5\uB2C8\uB2E4. ");
		lb_charge.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lb_charge.setBounds(71, 114, 204, 47);
		frame.getContentPane().add(lb_charge);
		

		
	}
}
