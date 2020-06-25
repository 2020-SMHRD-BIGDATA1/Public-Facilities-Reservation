package View;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controller.MemberManagementSystem;
import Model.MainDAO;
import java.awt.Toolkit;


public class MainGUI {

	private JFrame frame;
	private JButton btnMyPage;
	private JButton btnteam;
	private JButton btnFutSal;
	private JButton btnBaseBall;
	private JButton btnjokgu;
	private JButton btnSoccer;

	private MemberManagementSystem controller= LoginGUI.controller;



	MainDAO dao = new MainDAO();
	
	
	
	

	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lb_id;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnBadMinton;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MainGUI window = new MainGUI();
	 * window.frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); }
	 * } }); }
	 */

	/**
	 * Create the application.
	 */

	public MainGUI() {
		initialize();

		frame.setVisible(true); // »õ·Î¿îÃ¢À¸·Î ¶ç¿ï½Ã Àû¾î¾ßÇÏ´Â ÄÚµå
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SMHRD\\Desktop\\image\\frame.jpg"));
		
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 422, 551);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		
		btnSoccer = new JButton("");
		btnSoccer.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/soccer.jpg")));
		btnSoccer.setSelectedIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\\uCD95\uAD6C.PNG"));
		btnSoccer.setBorderPainted(false);
		btnSoccer.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSoccer.setBounds(77, 164, 68, 67);
		panel.add(btnSoccer);
		
		btnjokgu = new JButton("");
		btnjokgu.setBackground(Color.WHITE);
		btnjokgu.setForeground(Color.WHITE);
		btnjokgu.setBorderPainted(false);
		btnjokgu.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/jokgu.jpg")));
		btnjokgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				InventoryGUI inventory = new InventoryGUI();
				
				ggggg gg=new ggggg();
			}
		});
		btnjokgu.setBounds(172, 164, 68, 67);
		panel.add(btnjokgu);
		
		btnBaseBall = new JButton("");
		btnBaseBall.setBackground(Color.WHITE);
		btnBaseBall.setBorderPainted(false);
		btnBaseBall.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/basket.jpg")));
		btnBaseBall.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			

			
			}
		});
		btnBaseBall.setBounds(280, 164, 68, 67);
		panel.add(btnBaseBall);
		
		btnFutSal = new JButton("");
		btnFutSal.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/futsal1.jpg")));
		btnFutSal.setBackground(Color.WHITE);
		btnFutSal.setBorderPainted(false);
		btnFutSal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFutSal.setBounds(77, 264, 68, 67);
		panel.add(btnFutSal);
		
		btnteam = new JButton("");
		btnteam.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/teamhope.png")));
		btnteam.setBackground(Color.WHITE);
		btnteam.setBorderPainted(false);
		btnteam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MatchingGUI matching = new MatchingGUI();
			}
		});
		btnteam.setBounds(145, 391, 138, 67);
		panel.add(btnteam);
		
		btnMyPage = new JButton("");
		btnMyPage.setBackground(Color.WHITE);
		btnMyPage.setBorderPainted(false);
		btnMyPage.setIcon(new ImageIcon(MainGUI.class.getResource("/img/mypage.jpg")));
		btnMyPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//¸¶ÀÌÆäÀÌÁö Å¬¸¯½Ã
				MyPageGUI MyPage = new MyPageGUI();
			
			}
		});
		btnMyPage.setBounds(278, 107, 48, 38);
		panel.add(btnMyPage);
		
		
		
		lb_id = new JLabel("New label");
		lb_id.setBounds(226, 122, 57, 15);
		panel.add(lb_id);
		lb_id.setText(controller.getLoginUser().getId()+"´Ô");
		
		JLabel lblNewLabel = new JLabel("\uCD95\uAD6C");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(88, 241, 57, 15);
		panel.add(lblNewLabel);
		
		
		lblNewLabel_8 = new JLabel("\uD558\uB791\uAED8!!!!!");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("±¼¸²", Font.BOLD, 16));
		lblNewLabel_8.setBounds(12, 18, 410, 38);
		panel.add(lblNewLabel_8);
		
		
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/mainup.png")));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setBounds(-15, 0, 437, 67);
		panel.add(lblNewLabel_7);
		
		
		
		lblNewLabel_1 = new JLabel("\uC871\uAD6C");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(182, 239, 57, 15);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uB18D\uAD6C");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(290, 241, 57, 15);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\uD48B\uC0B4");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(77, 340, 57, 15);
		panel.add(lblNewLabel_3);
		
		btnBadMinton = new JButton("");
		btnBadMinton.setBackground(Color.WHITE);
		btnBadMinton.setBorderPainted(false);
		btnBadMinton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBadMinton.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/badminturn.jpg")));
		btnBadMinton.setBounds(172, 264, 68, 67);
		panel.add(btnBadMinton);
		
		lblNewLabel_4 = new JLabel("\uBC30\uB4DC\uBBFC\uD134");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_4.setBounds(174, 340, 57, 15);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\uD300 \uB9E4\uCE6D\uD558\uAE30");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblNewLabel_5.setBounds(155, 454, 112, 23);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/maindown.png")));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(-15, 487, 437, 67);
		panel.add(lblNewLabel_6);
		
		JButton btnbaseball = new JButton("");
		btnbaseball.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/baseball1.jpg")));
		btnbaseball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			
			}
		});
		btnbaseball.setBorderPainted(false);
		btnbaseball.setBackground(Color.WHITE);
		btnbaseball.setBounds(280, 264, 68, 67);
		panel.add(btnbaseball);
		
		JLabel lblNewLabel_4_1 = new JLabel("\uC57C\uAD6C");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(280, 340, 57, 15);
		panel.add(lblNewLabel_4_1);
		
		


	}
	}

	
	

