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
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class PointGUI2 {

	private JFrame frame;
	private String point;

	JLabel lb_charge;
	Reservation_1Controller re_controller =new Reservation_1Controller();
	private JLabel lblNewLabel;
	public  PointGUI2(int point2) {
		initialize();
		frame.setVisible(true);
		
		lb_charge.setText(point2+"°¡ ÃæÀüÀÌ µÇ¾ú½À´Ï´Ù~ ");
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(147, 382, 141, 38);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PointGUI2.class.getResource("/img/point.jpeg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(lblNewLabel);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(PointGUI2.class.getResource("/img/frame.jpg")));
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.setBounds(500, 500, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb_now = new JLabel("\uD604\uC7AC \uD68C\uC6D0\uB2D8\uC758 \uD3EC\uC778\uD2B8\uB294 \"2000p\"\uC785\uB2C8\uB2E4");
		lb_now.setHorizontalAlignment(SwingConstants.CENTER);
		lb_now.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		lb_now.setBounds(71, 188, 301, 52);
		frame.getContentPane().add(lb_now);
		
		
		lb_now.setText("ÇöÀç Æ÷ÀÎÆ®´Â "+re_controller.getpoint()+"ÀÔ´Ï´Ù");
		
		lb_charge = new JLabel("\"100p\"\uC801\uB9BD\uB418\uC5C8\uC2B5\uB2C8\uB2E4. ");
		lb_charge.setHorizontalAlignment(SwingConstants.CENTER);
		lb_charge.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		lb_charge.setBounds(71, 129, 301, 52);
		frame.getContentPane().add(lb_charge);
		

		
	}
}
