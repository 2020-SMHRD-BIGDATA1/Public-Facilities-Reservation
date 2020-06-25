package View;


import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
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
	private JButton btnbasketBall;
	private JButton btnjokgu;
	private JButton btnSoccer;

	private MemberManagementSystem controller= LoginGUI.controller;

	private FontMaker fm = new FontMaker();

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
	private JButton btnBaseBall;
	private JButton btnBaseBall_1;
	private JLabel lblNewLabel_10;
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

		frame.setVisible(true); // 새로운창으로 띄울시 적어야하는 코드
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fm.FontChange(ge);
		
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
		
		
		
		
		btnSoccer = new JButton("");
		btnSoccer.setBounds(77, 164, 68, 67);
		btnSoccer.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/soccer.jpg")));
		btnSoccer.setSelectedIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\\uCD95\uAD6C.PNG"));
		btnSoccer.setBorderPainted(false);
		btnSoccer.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				
				ggggg gg=new ggggg("축구장");
			}
		});
		panel.setLayout(null);
		panel.add(btnSoccer);
		
		btnjokgu = new JButton("");
		btnjokgu.setBounds(172, 164, 68, 67);
		btnjokgu.setBackground(Color.WHITE);
		btnjokgu.setForeground(Color.WHITE);
		btnjokgu.setBorderPainted(false);
		btnjokgu.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/jokgu.jpg")));
		btnjokgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ggggg gg=new ggggg("족구장");
			}
		});
		panel.add(btnjokgu);
		

		btnBaseBall = new JButton("");
		btnBaseBall.setBounds(280, 164, 68, 67);
		btnBaseBall.setBackground(Color.WHITE);
		btnBaseBall.setBorderPainted(false);
		btnBaseBall.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/basket.jpg")));
		btnBaseBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ggggg gg=new ggggg("야구장");
			}
		});

		btnbasketBall = new JButton("");
		btnbasketBall.setBounds(280, 164, 68, 67);
		btnbasketBall.setBackground(Color.WHITE);
		btnbasketBall.setBorderPainted(false);
		btnbasketBall.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\\uC9C0\uD6C8\uC774\uC640\uBCF4\uB77C\uB124\\\uC0AC\uC9C4\\[\uD06C\uAE30\uBCC0\uD658]\uB18D\uAD6C\uD558\uB294\uC0AC\uB78C.jpg"));
		btnbasketBall.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent arg0) {
			
				ggggg gg=new ggggg("농구장");
			
			}
		});
		panel.add(btnBaseBall);
		panel.add(btnbasketBall);

		
		btnFutSal = new JButton("");
		btnFutSal.setBounds(77, 266, 68, 67);
		btnFutSal.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/futsal1.jpg")));
		btnFutSal.setBackground(Color.WHITE);
		btnFutSal.setBorderPainted(false);
		btnFutSal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ggggg gg=new ggggg("풋살경기장");
			}
		});

		

		panel.add(btnFutSal);
		
		btnteam = new JButton("");
		btnteam.setBounds(145, 391, 138, 67);
		btnteam.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/teamhope.png")));
		btnteam.setBackground(Color.WHITE);
		btnteam.setBorderPainted(false);
		btnteam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MatchingGUI matching = new MatchingGUI();
			}
		});
		panel.add(btnteam);
		
		btnMyPage = new JButton("");
		btnMyPage.setBounds(280, 79, 57, 51);
		btnMyPage.setBackground(Color.WHITE);
		btnMyPage.setBorderPainted(false);
		btnMyPage.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/mypareal.png")));
		btnMyPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//마이페이지 클릭시
				MyPageGUI MyPage = new MyPageGUI();
			
			}
		});
		panel.add(btnMyPage);
		
		
		
		lb_id = new JLabel("New label");
		lb_id.setBounds(242, 115, 57, 15);
		panel.add(lb_id);
		lb_id.setText(controller.getLoginUser().getId()+"님");
		lb_id.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		
		
		JLabel lblNewLabel = new JLabel("\uCD95\uAD6C");
		lblNewLabel.setBounds(88, 241, 57, 15);
		lblNewLabel.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		
		lblNewLabel_8 = new JLabel("\uD558\uB791\uAED8!!!!!");
		
		lblNewLabel_8.setBounds(12, 18, 410, 38);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD, 30));
		panel.add(lblNewLabel_8);
		
		
		
		
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(-15, 0, 437, 67);
		lblNewLabel_7.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/mainup.png")));
		lblNewLabel_7.setBackground(Color.WHITE);
		panel.add(lblNewLabel_7);
		
		
		
		lblNewLabel_1 = new JLabel("\uC871\uAD6C");
		lblNewLabel_1.setBounds(182, 239, 57, 15);
		lblNewLabel_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\uB18D\uAD6C");
		lblNewLabel_2.setBounds(290, 241, 57, 15);
		lblNewLabel_2.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\uD48B\uC0B4");
		lblNewLabel_3.setBounds(88, 343, 57, 15);
		lblNewLabel_3.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		panel.add(lblNewLabel_3);
		
		btnBadMinton = new JButton("");
		btnBadMinton.setBounds(172, 266, 68, 67);
		btnBadMinton.setBackground(Color.WHITE);
		btnBadMinton.setBorderPainted(false);
		btnBadMinton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ggggg gg=new ggggg("배드맨턴장");
			}
		});

		btnBadMinton.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/badminturn.jpg")));

		

		panel.add(btnBadMinton);
		
		lblNewLabel_4 = new JLabel("\uBC30\uB4DC\uBBFC\uD134");
		lblNewLabel_4.setBounds(182, 343, 68, 15);
		lblNewLabel_4.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,14));

		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\uD300 \uB9E4\uCE6D\uD558\uAE30");
		lblNewLabel_5.setBounds(155, 454, 112, 23);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,14));
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(-15, 487, 437, 67);
		lblNewLabel_6.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/maindown.png")));
		lblNewLabel_6.setBackground(Color.WHITE);
		panel.add(lblNewLabel_6);
		

		JButton btnbaseball = new JButton("");
		btnbaseball.setBounds(280, 264, 68, 67);
		btnbaseball.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/baseball1.jpg")));
		btnbaseball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			
			}
		});
		btnbaseball.setBorderPainted(false);
		btnbaseball.setBackground(Color.WHITE);
		panel.add(btnbaseball);
		
		JLabel lblNewLabel_4_1 = new JLabel("\uC57C\uAD6C");
		lblNewLabel_4_1.setBounds(280, 340, 57, 15);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,14));
		panel.add(lblNewLabel_4_1);

		btnBaseBall_1 = new JButton("");
		btnBaseBall_1.setBounds(280, 263, 68, 67);
		btnBaseBall_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBaseBall_1.setBorderPainted(false);
		btnBaseBall_1.setBackground(Color.WHITE);
		panel.add(btnBaseBall_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(MainGUI.class.getResource("/img/public_background3.png")));
		lblNewLabel_9.setBounds(0, 66, 48, 422);
		panel.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(MainGUI.class.getResource("/img/login.jpg")));
		lblNewLabel_10.setBounds(374, 66, 48, 422);
		panel.add(lblNewLabel_10);

		
		


	}
	}

	
	

