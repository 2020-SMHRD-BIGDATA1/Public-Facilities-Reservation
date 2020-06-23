package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MatchingGUI {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchingGUI window = new MatchingGUI();
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
	public MatchingGUI() {
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
		panel.setBounds(0, 0, 344, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton back_btn = new JButton("");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		back_btn.setSelectedIcon(new ImageIcon(MatchingGUI.class.getResource("/View/back.png")));
		back_btn.setBounds(10, 10, 24, 23);
		panel.add(back_btn);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 111, 308, 74);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 59, 52);
		panel_4.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(98, 10, 158, 52);
		panel_4.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 195, 308, 74);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(12, 10, 59, 52);
		panel_5.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(98, 10, 158, 52);
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 279, 308, 74);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBounds(12, 10, 59, 52);
		panel_6.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(98, 10, 158, 52);
		panel_6.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(122, 52, 99, 23);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("\uC9C0\uC5ED");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(65, 56, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uC885\uBAA9");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(65, 23, 57, 15);
		panel.add(lblNewLabel_3_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(122, 19, 99, 23);
		panel.add(comboBox_1);

		
	}
}
