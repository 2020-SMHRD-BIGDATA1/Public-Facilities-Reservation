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
import java.awt.SystemColor;

public class MainGUI {

	private JFrame frame;
	private JButton btnMyPage;
	private JButton btnteam;
	private JButton btnFutSal;
	private JButton btnbasketBall;
	private JButton btnjokgu;
	private JButton btnSoccer;

	private MemberManagementSystem controller = LoginGUI.controller;

	private FontMaker fm = new FontMaker();

	MainDAO dao = new MainDAO();

	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lb_id;
	private JButton btnBadMinton;
	private JButton btnBaseBall;
	private JLabel lblNewLabel_10;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainGUI.class.getResource("/img/frame.jpg")));

		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(panel);

		btnSoccer = new JButton("");
		btnSoccer.setBounds(77, 164, 68, 68);
		btnSoccer.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/soccer.jpg")));
		
		btnSoccer.setBorderPainted(false);
		btnSoccer.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ggggg gg = new ggggg("축구장");
			}
		});
		panel.setLayout(null);
		panel.add(btnSoccer);

		btnjokgu = new JButton("");
		btnjokgu.setBounds(172, 164, 68, 68);
		btnjokgu.setBackground(Color.WHITE);
		btnjokgu.setForeground(Color.WHITE);
		btnjokgu.setBorderPainted(false);
		btnjokgu.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/jokgu.jpg")));
		btnjokgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				ggggg gg = new ggggg("족구장");
			}
		});
		panel.add(btnjokgu);

		btnbasketBall = new JButton("");
		btnbasketBall.setBounds(269, 164, 68, 67);
		btnbasketBall.setBackground(Color.WHITE);
		btnbasketBall.setBorderPainted(false);
		btnbasketBall.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/basketball.jpg")));

		panel.add(btnbasketBall);
		panel.add(btnbasketBall);

		btnbasketBall.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
			
				
				ggggg gg = new ggggg("농구장");
			}
		});
		panel.add(btnbasketBall);

		btnFutSal = new JButton("");
		btnFutSal.setBounds(77, 263, 68, 68);
		btnFutSal.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/putsal.jpg")));
		btnFutSal.setBackground(Color.WHITE);
		btnFutSal.setBorderPainted(false);
		btnFutSal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				ggggg gg = new ggggg("풋살경기장");
			}
		});
		panel.add(btnFutSal);

		btnteam = new JButton("");
		btnteam.setBounds(165, 430, 100, 100);
		btnteam.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/matching2.png")));
		btnteam.setBackground(Color.WHITE);
		btnteam.setBorderPainted(false);
		btnteam.setContentAreaFilled(false);
		btnteam.setFocusPainted(false);
		btnteam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
		
//				MatchingGUI matching = new MatchingGUI();
				matchingupdateGUI matchingupdate= new matchingupdateGUI();
=======
				MatchingGUI matching = new MatchingGUI();
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git
			}
		});
		panel.add(btnteam);

		btnMyPage = new JButton("");
		btnMyPage.setBounds(348, 92, 60, 60);
		btnMyPage.setBackground(Color.WHITE);
		btnMyPage.setBorderPainted(false);
		btnMyPage.setContentAreaFilled(false);
		btnMyPage.setFocusPainted(false);
		btnMyPage.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/user.png")));
		btnMyPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 마이페이지 클릭시
			
				MyPageGUI MyPage = new MyPageGUI();

			}
		});
		panel.add(btnMyPage);

		lb_id = new JLabel("New label");
		lb_id.setHorizontalAlignment(SwingConstants.CENTER);
		lb_id.setBounds(201, 92, 136, 15);
		panel.add(lb_id);
		lb_id.setText(controller.getLoginUser().getId() + "님");
		lb_id.setFont(new Font("배달의민족 한나체 Air", Font.BOLD, 15));

		btnBadMinton = new JButton("");
		btnBadMinton.setBounds(172, 263, 68, 68);
		btnBadMinton.setBackground(Color.WHITE);
		btnBadMinton.setBorderPainted(false);
		btnBadMinton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ggggg gg = new ggggg("배드맨턴장");
			}
		});
		btnBadMinton.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/badminton.jpg")));
		panel.add(btnBadMinton);

		JButton btnbaseball = new JButton("");
		btnbaseball.setBounds(269, 263, 68, 68);
		btnbaseball.setIcon(new ImageIcon(MainGUI.class.getResource("/MainImages/baseball.jpg")));
		btnbaseball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ggggg gg = new ggggg("야구장");

			}
		});
		btnbaseball.setBorderPainted(false);
		btnbaseball.setBackground(Color.WHITE);
		panel.add(btnbaseball);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(0, 0, 434, 81);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("\uD558\uB791\uAED8");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 434, 81);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("배달의민족 주아", Font.BOLD, 42));
		panel_1.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(0, 394, 434, 167);
		panel.add(panel_2);

		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(MainGUI.class.getResource("/img/login.jpg")));
		lblNewLabel_10.setBounds(374, 66, 48, 422);

	}
}
