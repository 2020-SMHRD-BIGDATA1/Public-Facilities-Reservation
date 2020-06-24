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

public class GradeGUI {

	private JFrame frame;
	private JTextField input2;
	private JTextField input1;
	
	static ArrayList<GradeVO> list=new ArrayList<GradeVO>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeGUI window = new GradeGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GradeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 235, 205));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SMHRD\\Desktop\\image\\frame.jpg"));
		frame.setBounds(100, 100, 360, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC885\uD569\uC6B4\uB3D9\uC7A5 \uB9AC\uBDF0/\uD3C9\uC810");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(65, 70, 205, 44);
		frame.getContentPane().add(lblNewLabel);
		
		input2 = new JTextField();
		input2.setBounds(58, 233, 228, 108);
		frame.getContentPane().add(input2);
		input2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uC6A9\uD6C4\uAE30\uB97C \uB0A8\uACA8\uC8FC\uC138\uC694");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(57, 202, 144, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uD655\uC778");
		btnNewButton_1.setBackground(new Color(220, 220, 220));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewcheckGUI reviews = new ReviewcheckGUI();
				
				String rating=input1.getText();
				String review=input2.getText();
				
				GradeVO userReview=new GradeVO("¾È³ç",rating, review);
				GradeDAO dao = new GradeDAO();
				dao.insert(userReview);
		}});
		btnNewButton_1.setBounds(65, 416, 102, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uCDE8\uC18C");
		btnNewButton_2.setBackground(new Color(220, 220, 220));
		btnNewButton_2.setBounds(179, 416, 107, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		input1 = new JTextField();
		input1.setBounds(116, 139, 116, 21);
		frame.getContentPane().add(input1);
		input1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uD3C9\uC810");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(58, 142, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\thumb_l_A4A5ADD9DF8C6A98D4C2ECB3416FEA8A.png"));
		lblNewLabel_3.setBounds(12, 10, 320, 541);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
