package View;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controller.GradeController;
import Controller.Reservation_1Controller;
import Model.GradeDAO;
import Model.GradeVO;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ReviewcheckGUI {

	private JFrame frame;
	private JLabel output;
	private Font userReview;
	private GradeController controller;
	private String gg = null; 
	
	Reservation_1Controller re_controller= new Reservation_1Controller();
	GradeDAO dao= new GradeDAO();
	public ReviewcheckGUI() {
		initialize();
		
		frame.setVisible(true);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ReviewcheckGUI.class.getResource("/img/frame.jpg")));
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		GradeDAO dao = new GradeDAO();
		String gg = "안녕";
		String gg2="안녕";
		String gg3="안녕";
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		lblNewLabel_1.setBounds(25, 132, 121, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_1.setText(LoginGUI.controller.getLoginUser().getId()+"님");
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ReviewcheckGUI.class.getResource("/img/prev.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyPageGUI my = new MyPageGUI();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 10, 23, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(0, 0, 434, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB0B4\uB9AC\uBDF0\uBCF4\uAE30");
		lblNewLabel.setBounds(132, 62, 201, 53);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD,30));
		
		
		JLabel output3 = new JLabel("New label");
		output3.setBounds(234, 148, 162, 206);
		panel.add(output3);
		output3.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		output3.setHorizontalAlignment(SwingConstants.CENTER);
		
		output3.setText("REVIEW");
		
		output3.setText(dao.select().getReview());
		
		JLabel output2 = new JLabel("New label");
		output2.setBounds(165, 154, 57, 194);
		panel.add(output2);
		output2.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		output2.setHorizontalAlignment(SwingConstants.CENTER);
		
		output2.setText("RATING");
		
		output2.setText(dao.select().getRating());
		
		JLabel output_1 = new JLabel("New label");
		output_1.setBounds(68, 151, 50, 201);
		panel.add(output_1);
		output_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		output_1.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
