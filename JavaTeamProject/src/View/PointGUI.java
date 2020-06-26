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
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

import Controller.MemberManagementSystem;
import Controller.Reservation_1Controller;
import Model.GradeDAO;
import Model.GradeVO;
import Model.MainVO;
import Model.MemberDAO;
import javax.swing.ImageIcon;

public class PointGUI {

	private static final String Point = null;
	private JFrame frame;
	private JTextField inputText;

	MemberDAO dao = new MemberDAO();
	
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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(PointGUI.class.getResource("/img/frame.jpg")));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 500, 450, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		inputText = new JTextField();
		inputText.setBounds(225, 188, 97, 24);
		panel.add(inputText);
		inputText.setColumns(10);
		
//       int point=Integer.parseInt(inputText.getText());
		
		JButton btnNewButton = new JButton("\uD3EC\uC778\uD2B8 \uCDA9\uC804\uD558\uAE30");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("����ǹ��� �ѳ�ü Air", Font.BOLD,15));
		
		btnNewButton.setForeground(new Color(255, 215, 0));
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
				frame.setVisible(false);
			
			}
		});
		btnNewButton.setBounds(113, 308, 203, 56);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uD3EC\uC778\uD2B8 \uAD00\uB9AC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.BOLD,30));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(113, 0, 192, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD604\uC7AC\uD3EC\uC778\uD2B8");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("����ǹ��� �ѳ�ü Air", Font.BOLD,15));
		lblNewLabel_1.setBounds(80, 140, 97, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uCDA9\uC804\uD3EC\uC778\uD2B8");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("����ǹ��� �ѳ�ü Air", Font.BOLD,15));
		lblNewLabel_2.setBounds(80, 188, 97, 24);
		panel.add(lblNewLabel_2);
		
//		inputText = new JTextField();
//		inputText.setBounds(225, 188, 97, 24);
//		panel.add(inputText);
//		inputText.setColumns(10);
//		
//       int point=Integer.parseInt(inputText.getText());
	
		
		JLabel nowPoint = new JLabel("New label");
		nowPoint.setHorizontalAlignment(SwingConstants.CENTER);
		nowPoint.setBounds(225, 140, 97, 24);
		panel.add(nowPoint);

		
		nowPoint.setText(controller.getpoint()+"");
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(PointGUI.class.getResource("/MainImages/go to prev.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(12, 10, 16, 18);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(PointGUI.class.getResource("/MainImages/image1.png")));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(0, 0, 434, 68);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(PointGUI.class.getResource("/MainImages/image1.png")));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(0, 492, 434, 69);
		panel.add(lblNewLabel_3_1);
		
		
	}
}
