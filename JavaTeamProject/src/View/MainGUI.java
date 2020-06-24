package View;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import Controller.MemberManagementSystem;


import Model.MainDAO;
import javax.swing.JLabel;


public class MainGUI {

	private JFrame frame;
	private JTextField textField;
	private JButton btnMyPage;
	private JButton btnteam;
	private JButton btnBadMinton;
	private JButton btnFutSal;
	private JButton btnBaseBall;
	private JButton btnjokgu;
	private JButton btnSoccer;

	private MemberManagementSystem controller= LoginGUI.controller;



	MainDAO dao = new MainDAO();s

	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lb_id;
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
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 320, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		
		btnSoccer = new JButton("\uCD95\uAD6C");
		btnSoccer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSoccer.setBounds(38, 131, 68, 67);
		panel.add(btnSoccer);
		
		btnjokgu = new JButton("\uC871\uAD6C");
		btnjokgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventoryGUI inventory = new InventoryGUI();
			}
		});
		btnjokgu.setBounds(118, 131, 68, 67);
		panel.add(btnjokgu);
		
		btnBaseBall = new JButton("\uC57C\uAD6C");
		btnBaseBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			
			
			
			}
		});
		btnBaseBall.setBounds(198, 131, 68, 67);
		panel.add(btnBaseBall);
		
		btnFutSal = new JButton("\uD48B\uC0B4");
		btnFutSal.setBounds(78, 208, 68, 67);
		panel.add(btnFutSal);
		
		btnBadMinton = new JButton("\uBC30\uB4DC\uBBFC\uD134");
		btnBadMinton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBadMinton.setBounds(162, 208, 104, 67);
		panel.add(btnBadMinton);
		
		btnteam = new JButton("\uD300 \uAD6C\uD558\uAE30");
		btnteam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MatchingGUI matching = new MatchingGUI();
			}
		});
		btnteam.setBounds(103, 352, 112, 67);
		panel.add(btnteam);
		
		btnMyPage = new JButton("My Page");
		btnMyPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//마이페이지 클릭시
				MyPageGUI MyPage = new MyPageGUI();
			
			}
		});
		btnMyPage.setBounds(211, 98, 97, 23);
		panel.add(btnMyPage);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\uD558\uB791\uAED8");
		textField.setText("하랑께");
		textField.setBounds(12, 10, 296, 49);
		panel.add(textField);
		textField.setColumns(10);

		
		btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBounds(38, 454, 97, 23);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.setBounds(169, 454, 97, 23);
		panel.add(btnNewButton_1);
		
		lb_id = new JLabel("New label");
		lb_id.setBounds(142, 102, 57, 15);
		panel.add(lb_id);
		lb_id.setText(controller.getLoginUser().getID()+"님");

	}
}
