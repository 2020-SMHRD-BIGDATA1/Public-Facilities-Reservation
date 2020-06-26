package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import Controller.Reservation_1Controller;
import Model.MemberDAO;

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
	private int point;
	MemberDAO dao = new MemberDAO();
	JLabel lb_charge;
	Reservation_1Controller re_controller =new Reservation_1Controller();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	public  PointGUI2(int point2) {
		initialize(point2);
		frame.setVisible(true);
		
		lb_charge.setText(point2+"가 충전이 되었습니다~ ");
		
		JButton btnback = new JButton("");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			
			}
		});
		btnback.setIcon(new ImageIcon(PointGUI2.class.getResource("/MainImages/go to prev.png")));
		btnback.setFont(new Font("굴림", Font.BOLD, 12));
		btnback.setBorderPainted(false);
		btnback.setBackground(Color.WHITE);
		btnback.setBounds(12, 10, 16, 19);
		frame.getContentPane().add(btnback);
		
		point=re_controller.getpoint()+point2;
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		btnNewButton.setForeground(new Color(0, 0, 139));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dao.updatepoint(point);
				
				PointGUI pt = new PointGUI();
				
				frame.setVisible(false);
     	
			}
		});
		btnNewButton.setBounds(147, 382, 141, 38);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PointGUI2.class.getResource("/MainImages/image1.png")));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(0, 0, 434, 68);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 492, 434, 69);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(PointGUI2.class.getResource("/MainImages/image1.png")));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(0, 492, 434, 69);
		frame.getContentPane().add(lblNewLabel_3_1);
		

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int point2) {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(PointGUI2.class.getResource("/img/frame.jpg")));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb_now = new JLabel("\uD604\uC7AC \uD68C\uC6D0\uB2D8\uC758 \uD3EC\uC778\uD2B8\uB294 \"2000p\"\uC785\uB2C8\uB2E4");
		lb_now.setHorizontalAlignment(SwingConstants.CENTER);
		lb_now.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		lb_now.setBounds(71, 188, 301, 52);
		frame.getContentPane().add(lb_now);
		
		point=re_controller.getpoint()+point2;
		lb_now.setText("현재 포인트는 "+point+"입니다");
		
		lb_charge = new JLabel("\"100p\"\uC801\uB9BD\uB418\uC5C8\uC2B5\uB2C8\uB2E4. ");
		lb_charge.setHorizontalAlignment(SwingConstants.CENTER);
		lb_charge.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		lb_charge.setBounds(71, 129, 301, 52);
		frame.getContentPane().add(lb_charge);
		

		
	}
}
