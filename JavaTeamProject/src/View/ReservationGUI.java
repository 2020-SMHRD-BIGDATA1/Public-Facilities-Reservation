package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReservationGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationGUI window = new ReservationGUI();
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
	public ReservationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC2DC\uC124\uBA85");
		lblNewLabel.setBounds(12, 10, 101, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0AC\uC9C4");
		lblNewLabel_1.setBounds(12, 79, 101, 47);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
