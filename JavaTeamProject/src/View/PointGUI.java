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

import Controller.MemberManagementSystem;
import Controller.Reservation_1Controller;
import Model.GradeDAO;
import Model.GradeVO;
import Model.MainVO;
import Model.MemberDAO;

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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 320, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\uD3EC\uC778\uD2B8 \uCDA9\uC804\uD558\uAE30");
		btnNewButton.setFont(new Font("���� ����", Font.BOLD, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PointGUI2 reviews = new PointGUI2();
			}
		});
		btnNewButton.setBounds(60, 262, 209, 38);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uD3EC\uC778\uD2B8 \uAD00\uB9AC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("���� ����", Font.BOLD, 20));
		lblNewLabel.setBounds(56, 43, 192, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD604\uC7AC\uD3EC\uC778\uD2B8");
		lblNewLabel_1.setFont(new Font("���� ����", Font.BOLD, 16));
		lblNewLabel_1.setBounds(60, 150, 85, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uCDA9\uC804\uD3EC\uC778\uD2B8");
		lblNewLabel_2.setFont(new Font("���� ����", Font.BOLD, 16));
		lblNewLabel_2.setBounds(60, 191, 97, 31);
		panel.add(lblNewLabel_2);
		
		inputText = new JTextField();
		inputText.setBounds(153, 197, 116, 24);
		panel.add(inputText);
		inputText.setColumns(10);
		
//       int point=Integer.parseInt(inputText.getText());
		String point=inputText.getText();
		
		int cnt=con.insertpoint(point);
		if (cnt>0) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		JLabel nowPoint = new JLabel("New label");
		nowPoint.setBounds(153, 150, 116, 21);
		panel.add(nowPoint);

		
		nowPoint.setText(controller.getpoint()+"");
		
		
	}
}
