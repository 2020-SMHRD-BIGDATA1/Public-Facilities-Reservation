package View;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

import Controller.MemberManagementSystem;
import Controller.Reservation_1Controller;
import Model.ReserVO;
import Model.timevo;

import java.text.SimpleDateFormat;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Reservation_2GUI {
	private JFrame frame;
	int point = 0;
	JLabel lb_remainpoint;
	private int remainpoint;
	MemberManagementSystem controller = new MemberManagementSystem();
	Reservation_1Controller con = new Reservation_1Controller();
	private JButton btnback_1;
	

	public Reservation_2GUI(timevo vo) {
		initialize(vo);
//	MemberManagementSystem controller = new MemberManagementSystem();
//	Reservation_1Controller con = new Reservation_1Controller();
//
//	public Reservation_2GUI() {
//		initialize();

		frame.setVisible(true);
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
	}

//	private MemberManagementSystem MMCON=LoginGUI.controller;
//	private final JButton btn_back = new JButton("");

	private void initialize(timevo vo) {
//	private MemberManagementSystem MMCON = LoginGUI.controller;
//	private final JButton btn_back = new JButton("");
//
//	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Reservation_2GUI.class.getResource("/img/frame.jpg")));
		frame.getContentPane().setFont(new Font("굴림", Font.BOLD, 12));
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC608\uC57D\uC2E0\uCCAD");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,30));
		lblNewLabel.setBounds(124, 22, 193, 37);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setBounds(12, 102, 410, 77);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 4, 0, 0));

		JLabel lblNewLabel_2 = new JLabel(" \uC2DC\uC124\uBA85");
		lblNewLabel_2.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel.add(lblNewLabel_2);

		JLabel lb_fcname = new JLabel("New label");
		panel.add(lb_fcname);
		String fac_name = vo.getFcname();
		lb_fcname.setText(fac_name);

//		lb_name.setText(MMCON.getLoginUser().getId());

		JLabel lblNewLabel_7 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_7.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel.add(lblNewLabel_7);

		JLabel lb_phone = new JLabel("New label");
		panel.add(lb_phone);

//		lb_phone.setText(con.getphone());

		lb_phone.setText(con.getphone(fac_name));

		JLabel lblNewLabel_8 = new JLabel(" \uC811\uC218\uC77C");
		lblNewLabel_8.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel.add(lblNewLabel_8);

		JLabel lb_sysdate = new JLabel("New label");
		panel.add(lb_sysdate);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String format_time1 = format1.format(System.currentTimeMillis());
		System.out.println(format_time1);
		lb_sysdate.setText(format_time1 + "");

		JLabel lblNewLabel_5 = new JLabel("\uC0AC\uC6A9\uC77C");
		lblNewLabel_5.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel.add(lblNewLabel_5);

		JLabel lb_usedate = new JLabel("New label");
		panel.add(lb_usedate);
		String usedate = vo.getDate();
		lb_usedate.setText(usedate);

		JLabel lblNewLabel_6 = new JLabel(" \uC774\uC6A9\uC2DC\uAC04");
		lblNewLabel_6.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));;
		panel.add(lblNewLabel_6);

		JLabel lb_usetime = new JLabel("New label");
		panel.add(lb_usetime);
		String usetime = vo.getTime();
		lb_usetime.setText(usetime);

		JLabel lb_charge = new JLabel("\uC774\uC6A9\uB8CC");
		lb_charge.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel.add(lb_charge);

		JLabel lb_fee = new JLabel("New label");
		panel.add(lb_fee);
		int fee = con.getfee(vo.getFcname());
		lb_fee.setText(fee + "");

		JLabel lblNewLabel_13 = new JLabel("\uC608\uC57D\uC2E0\uCCAD");
		lblNewLabel_13.setBounds(12, 84, 74, 15);
		lblNewLabel_13.setForeground(new Color(255, 215, 0));
		lblNewLabel_13.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		frame.getContentPane().add(lblNewLabel_13);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 250));
		panel_1.setBounds(12, 297, 410, 77);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel_2_1 = new JLabel(" \uC774\uB984");
		lblNewLabel_2_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel_1.add(lblNewLabel_2_1);

		JLabel lb_username = new JLabel("New label");
		panel_1.add(lb_username);

		lb_username.setText(LoginGUI.controller.getLoginUser().getId());

		JLabel lblNewLabel_7_1 = new JLabel(" \uC804\uD654\uBC88\uD638");
		lblNewLabel_7_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel_1.add(lblNewLabel_7_1);

		JLabel lb_userphone = new JLabel("New label");
		panel_1.add(lb_userphone);

		lb_userphone.setText(LoginGUI.controller.getLoginUser().getPhone());

		JLabel lblNewLabel_8_1 = new JLabel(" \uC774\uBA54\uC77C ");
		lblNewLabel_8_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel_1.add(lblNewLabel_8_1);

		JLabel lb_useremail = new JLabel("New label");
		panel_1.add(lb_useremail);
		lb_useremail.setText(LoginGUI.controller.getLoginUser().getMail());

		JLabel lblNewLabel_13_1 = new JLabel("\uACB0\uC81C");
		lblNewLabel_13_1.setBounds(12, 189, 57, 15);
		lblNewLabel_13_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_13_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		frame.getContentPane().add(lblNewLabel_13_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 250));
		panel_2.setBounds(12, 205, 410, 63);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel lblNewLabel_14 = new JLabel(" \uBCF4\uC720\uD3EC\uC778\uD2B8");
		lblNewLabel_14.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel_2.add(lblNewLabel_14);

		JLabel lb_point = new JLabel("New label");
		lb_point.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lb_point);

		point = con.getpoint();

		// lb_point.setText(String.valueOf(point));
		
		int cnt=controller.insertpoint(point);
		if(cnt>0) {
			lb_point.setText(point + "");
		}
		JButton btn_use = new JButton("\uC0AC\uC6A9\uD558\uAE30 ");
		btn_use.setBackground(new Color(255, 255, 255));
		btn_use.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		btn_use.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remainpoint = point - fee;
				if (remainpoint > 0) {
					lb_remainpoint.setText(remainpoint + "");
				} else {
					lb_remainpoint.setText("충전해주세요");
				}

			}
		});
		panel_2.add(btn_use);

		JLabel lblNewLabel_16 = new JLabel(" \uC794\uC5EC\uD3EC\uC778\uD2B8");
		lblNewLabel_16.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel_2.add(lblNewLabel_16);

		lb_remainpoint = new JLabel("New label");
		lb_remainpoint.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lb_remainpoint);

		lb_remainpoint.setText(0 + "");

		JButton btn_charge = new JButton("\uCDA9\uC804\uD558\uAE30");
		btn_charge.setBackground(new Color(255, 255, 255));
		btn_charge.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		btn_charge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				PointGUI pointgui = new PointGUI();
			}
		});
		panel_2.add(btn_charge);

		JLabel lblNewLabel_13_2 = new JLabel("\uC2E0\uCCAD\uC790\uC815\uBCF4");
		lblNewLabel_13_2.setForeground(Color.ORANGE);
		lblNewLabel_13_2.setBounds(12, 278, 85, 15);
		lblNewLabel_13_2.setForeground(new Color(255, 215, 0));
		lblNewLabel_13_2.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		frame.getContentPane().add(lblNewLabel_13_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 250, 250));
		panel_3.setBounds(12, 399, 410, 37);
		frame.getContentPane().add(panel_3);

		JLabel label = new JLabel("? \uD300\uC6D0\uC774 \uBD80\uC871\uD558\uC2ED\uB2C8\uAE4C?");
		label.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		panel_3.add(label);

		JButton btnNewButton_3 = new JButton("\uB124");
		btnNewButton_3.setBackground(new Color(211, 211, 211));
		btnNewButton_3.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservation_3GUI re3 = new Reservation_3GUI(fac_name);
			}
		});
		panel_3.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton("\uC608\uC57D\uD558\uAE30");
		btnNewButton_2.setBackground(new Color(123, 104, 238));
		
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,12));
		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

//				String fac_id=con.getfac_id(fac_name);
				int fac_id = con.getfac_id(fac_name);
				String user_id = LoginGUI.controller.getLoginUser().getId();

				ReserVO revo = new ReserVO(user_id, fac_id, fac_name, format_time1, usedate, usetime, (fee + ""));

				int cnt1 = con.insertreservation(revo);

				if (remainpoint > 0 && cnt1 > 0) {
					JOptionPane.showMessageDialog(frame, "예약 성공", "예약신청결과", JOptionPane.PLAIN_MESSAGE);
					System.out.println("예약 성공");
					frame.setVisible(false);
					MainGUI main = new MainGUI();
					int cnt = controller.updatepoint(remainpoint);
					if (cnt > 0) {
						System.out.println("포인트 업데이트 성공");
					} else {
						System.out.println("포인트 업데이트 실패");

					}

					frame.dispose();

				} else {
					JOptionPane.showMessageDialog(frame, "예약 실패", "예약신청결과", JOptionPane.PLAIN_MESSAGE);
					
					System.out.println("예약 실패");
				}

			}

		});
		btnNewButton_2.setBounds(325, 458, 97, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setIcon(new ImageIcon(Reservation_2GUI.class.getResource("/MainImages/go to prev.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 10, 19, 15);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Reservation_2GUI.class.getResource("/MainImages/image1.png")));
		lblNewLabel_1.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(lblNewLabel_1);
		
//		btn_back.setIcon(new ImageIcon(Reservation_2GUI.class.getResource("/img/prev.jpg")));
//		btn_back.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btn_back.setBounds(12, 10, 23, 23);
//		frame.getContentPane().add(btn_back);
//		frame.setBounds(100, 100, 360, 600);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
		JButton btnback;
		btnback_1 = new JButton("");
		btnback_1.setIcon(new ImageIcon(Reservation_2GUI.class.getResource("/img/prev.jpg")));
		btnback_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservation_1updateGUI re1 = new Reservation_1updateGUI(vo.getFcname());
			
			}		
		});
//		btnback.setBounds(12, 10, 39, 37);
//		frame.getContentPane().add(btnback);
		
//		btnback_1.setBounds(12, 10, 39, 37);
//		frame.getContentPane().add(btnback_1);
//		btn_back.setIcon(new ImageIcon(Reservation_2GUI.class.getResource("/img/prev.jpg")));
//		btn_back.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.setVisible(false);
//			}
//		});
//		btn_back.setBounds(12, 10, 23, 23);
//		frame.getContentPane().add(btn_back);
		frame.setBounds(500, 500, 450, 600);
//		btn_back.setBounds(12, 10, 23, 23);
//		frame.getContentPane().add(btn_back);
//		
//		JButton btnback = new JButton("");
//		btnback.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.setVisible(false);
//			}
//		});
//		btnback.setIcon(new ImageIcon(Reservation_2GUI.class.getResource("/img/prev.jpg")));
//		btnback.setFont(new Font("굴림", Font.BOLD, 12));
//		btnback.setBorderPainted(false);
//		btnback.setBackground(Color.WHITE);
//		btnback.setBounds(12, 10, 23, 23);
//		frame.getContentPane().add(btnback);
//		frame.setBounds(100, 100, 360, 600);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
