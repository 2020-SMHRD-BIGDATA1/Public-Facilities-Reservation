package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
<<<<<<< HEAD
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
=======

import Controller.MemberManagementSystem;
import Controller.Reservation_1Controller;
import Model.GradeDAO;
import Model.GradeVO;
import Model.MainVO;
import Model.MemberDAO;
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA1/Public-Facilities-Reservation.git
import javax.swing.ImageIcon;

public class PointGUI {

	private static final String Point = null;
	private JFrame frame;
	private JTextField inputText;

	
	public PointGUI() {
		initialize();
		frame.setVisible(true);
		
	}

	Reservation_1Controller controller =new Reservation_1Controller();
	
	MemberManagementSystem con= new MemberManagementSystem();
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SMHRD\\Desktop\\image\\frame.jpg"));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\uD3EC\uC778\uD2B8 \uCDA9\uC804\uD558\uAE30");
		btnNewButton.setFont(new Font("���� ����", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int point=Integer.parseInt(inputText.getText());
			
				int cnt=con.insertpoint(point);
				if (cnt>0) {
					System.out.println("����");
				}else {
					System.out.println("����");
				}
				
				
				PointGUI2 reviews = new PointGUI2(point);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(60, 244, 209, 38);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uD3EC\uC778\uD2B8 \uAD00\uB9AC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("���� ����", Font.BOLD, 20));
		lblNewLabel.setBounds(56, 43, 192, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD604\uC7AC\uD3EC\uC778\uD2B8");
		lblNewLabel_1.setFont(new Font("���� ����", Font.BOLD, 16));
		lblNewLabel_1.setBounds(60, 121, 85, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uCDA9\uC804\uD3EC\uC778\uD2B8");
		lblNewLabel_2.setFont(new Font("���� ����", Font.BOLD, 16));
		lblNewLabel_2.setBounds(60, 162, 97, 31);
		panel.add(lblNewLabel_2);
		
		inputText = new JTextField();
		inputText.setBounds(153, 168, 116, 24);
		panel.add(inputText);
		inputText.setColumns(10);
		
//       int point=Integer.parseInt(inputText.getText());
	
		
		JLabel nowPoint = new JLabel("New label");
		nowPoint.setBounds(157, 128, 116, 21);
		panel.add(nowPoint);

		
		nowPoint.setText(controller.getpoint()+"");
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\public_background1.png"));
		lblNewLabel_3.setBounds(0, 0, 344, 561);
		panel.add(lblNewLabel_3);
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(0, 10, 64, 38);
		panel.add(btnNewButton_1);
		
		
	}
}
