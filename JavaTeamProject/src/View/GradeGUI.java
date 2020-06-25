package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Model.GradeDAO;
import Model.GradeVO;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class GradeGUI {

	private JFrame frame;
	private JTextField input2;
	private JTextField input1;

	static ArrayList<GradeVO> list = new ArrayList<GradeVO>();

	/**
	 * Launch the application.
	 */

	public GradeGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SMHRD\\Desktop\\image\\frame.jpg"));
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD3C9\uC810/\uB9AC\uBDF0");
		lblNewLabel.setBounds(106, 60, 205, 44);
		lblNewLabel.setFont(new Font("배달의민족 한나체", Font.BOLD,30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		input2 = new JTextField();
		input2.setBounds(65, 201, 303, 181);
		frame.getContentPane().add(input2);
		input2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\uC774\uC6A9\uD6C4\uAE30\uB97C \uB0A8\uACA8\uC8FC\uC138\uC694");
		lblNewLabel_1.setBounds(126, 172, 185, 21);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("배달의민족 한나체", Font.BOLD,15));
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("\uD655\uC778");
		btnNewButton_1.setBounds(94, 424, 110, 35);
		btnNewButton_1.setBackground(new Color(220, 220, 220));
		btnNewButton_1.setFont(new Font("배달의민족 한나체 ", Font.BOLD,15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String rating = input1.getText();
				String review = input2.getText();
				String id = LoginGUI.controller.getLoginUser().getId();
				System.out.println(id);
				String name = "fcname";

				GradeVO userReview = new GradeVO(id, name, rating, review);

				GradeDAO dao = new GradeDAO();
				dao.insert(userReview);

				ReviewcheckGUI reviews = new ReviewcheckGUI();
				frame.setVisible(false);
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uCDE8\uC18C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyPageGUI my =new MyPageGUI();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(216, 424, 110, 35);
		btnNewButton_2.setBackground(new Color(220, 220, 220));
		btnNewButton_2.setFont(new Font("배달의민족 한나체", Font.BOLD,15));
		frame.getContentPane().add(btnNewButton_2);

		input1 = new JTextField();
		input1.setBounds(141, 141, 170, 21);
		frame.getContentPane().add(input1);
		input1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\uD3C9\uC810");
		lblNewLabel_2.setBounds(72, 142, 57, 15);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("배달의민족 한나체", Font.BOLD,15));
		frame.getContentPane().add(lblNewLabel_2);
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(12, 10, 23, 23);
		btnNewButton.setIcon(new ImageIcon(GradeGUI.class.getResource("/img/prev.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyPageGUI my= new MyPageGUI();
				frame.setVisible(false);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 434, 561);
		lblNewLabel_3.setIcon(new ImageIcon(GradeGUI.class.getResource("/img/celebration.png")));
		frame.getContentPane().add(lblNewLabel_3);

	}
}
