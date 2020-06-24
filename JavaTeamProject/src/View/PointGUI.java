package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class PointGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	
	public PointGUI() {
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
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(12, 10, 320, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setText("\uD3EC\uC778\uD2B8\uAD00\uB9AC");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(94, 51, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC\uD3EC\uC778\uD2B8");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 164, 70, 15);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setText("10000");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(94, 161, 116, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCDA9\uC804\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(107, 270, 97, 23);
		panel.add(btnNewButton);
	}
}
