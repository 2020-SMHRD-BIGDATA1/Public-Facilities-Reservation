package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class PointGUI2 {

	private JFrame frame;

	
	public PointGUI2() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC \uD68C\uC6D0\uB2D8\uC758 \uD3EC\uC778\uD2B8\uB294 \"2000p\"\uC785\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 157, 301, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\"100p\"\uC801\uB9BD\uB418\uC5C8\uC2B5\uB2C8\uB2E4. ");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		lblNewLabel_1.setBounds(60, 119, 204, 47);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
