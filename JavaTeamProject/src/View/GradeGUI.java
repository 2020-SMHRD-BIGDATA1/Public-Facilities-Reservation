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
import java.awt.Font;

public class GradeGUI {

	private JFrame frame;
	private JTextField input2;
	private JTextField input1;
	
	static ArrayList<GradeVO> list=new ArrayList<GradeVO>();

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
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD3C9\uC810/\uB9AC\uBDF0");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 55, 205, 44);
		frame.getContentPane().add(lblNewLabel);
		
		input2 = new JTextField();
		input2.setBounds(58, 233, 228, 108);
		frame.getContentPane().add(input2);
		input2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uC6A9\uD6C4\uAE30\uB97C \uB0A8\uACA8\uC8FC\uC138\uC694");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		lblNewLabel_1.setBounds(57, 202, 185, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uD655\uC778");
		btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String rating=input1.getText();
				String review=input2.getText();
				String id= LoginGUI.controller.getLoginUser().getId();
				System.out.println(id);
				String name= "fcname";
				
				GradeVO userReview= new GradeVO(id, name, rating, review);
				
				GradeDAO dao = new GradeDAO();
				dao.insert(userReview);
				
				ReviewcheckGUI reviews = new ReviewcheckGUI();
			}
		});

		btnNewButton_1.setBounds(65, 416, 102, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uCDE8\uC18C");
		btnNewButton_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		btnNewButton_2.setBounds(176, 371, 110, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		input1 = new JTextField();
		input1.setBounds(116, 139, 170, 21);
		frame.getContentPane().add(input1);
		input1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uD3C9\uC810");
		lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		lblNewLabel_2.setBounds(58, 142, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 10, 48, 50);
		frame.getContentPane().add(btnNewButton);

	}
	}
