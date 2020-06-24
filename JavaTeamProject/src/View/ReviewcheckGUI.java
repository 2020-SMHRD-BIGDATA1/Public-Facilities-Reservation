package View;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Controller.GradeController;
import Model.GradeDAO;
import Model.GradeVO;
import java.awt.Color;
import java.awt.Toolkit;

public class ReviewcheckGUI {

	private JFrame frame;
	private JLabel output;
	private Font userReview;
	private GradeController controller;
	private String gg = null; 
	

	
	public ReviewcheckGUI() {
		initialize();
		
		frame.setVisible(true);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SMHRD\\Desktop\\image\\frame.jpg"));
		frame.getContentPane().setBackground(new Color(255, 239, 213));
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB0B4\uB9AC\uBDF0\uBCF4\uAE30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 17));
		lblNewLabel.setBounds(85, 59, 153, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel output = new JLabel("New label");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setBounds(27, 150, 38, 201);
		
		GradeDAO dao = new GradeDAO();
		String gg = "¾È³ç";
		String gg2="¾È³ç";
		String gg3="¾È³ç";
		
		ArrayList<GradeVO> result = dao.search(gg);
		for (int i = 0; i < result.size(); i++) {
			gg += result.get(i).getName();
			gg2+=result.get(i).getRating();
			gg3+=result.get(i).getReview();
		}
		output.setText("<html>"+gg+"<br/></html>");
		
		
		
		
		frame.getContentPane().add(output);
		
		JLabel output2 = new JLabel("New label");
		output2.setHorizontalAlignment(SwingConstants.CENTER);
		output2.setBounds(85, 144, 43, 212);
				
		frame.getContentPane().add(output2);
		
		output2.setText("<html>"+gg2+"<br/></html>");
		
		
		
		JLabel output3 = new JLabel("New label");
		output3.setHorizontalAlignment(SwingConstants.CENTER);
		output3.setBounds(158, 147, 162, 206);
		frame.getContentPane().add(output3);
		
		output3.setText("<html>"+gg3+"<br/></html>");
		
		
	}
		
		
}
