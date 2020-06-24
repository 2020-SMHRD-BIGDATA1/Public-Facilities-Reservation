package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import Controller.Reservation_1Controller;
import Model.MatchingDAO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventoryGUI {
	MatchingDAO dao = new MatchingDAO();
	private JFrame frame;
	private JComboBox comboBox;

	Reservation_1Controller con = new Reservation_1Controller();
	private JScrollPane scrollPane;

	public InventoryGUI() {
		initialize();
		frame.setVisible(true);
	}
	

	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 93, 410, 458);
		frame.getContentPane().add(scrollPane);

		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel item = new JPanel();
		item.setLayout(null);
		panel_1.add(item);

		JLabel name_lbl = new JLabel("\uC2DC\uC124 \uBA85");
		name_lbl.setBounds(0, 0, 302, 27);
		item.add(name_lbl);

		JLabel time_lbl = new JLabel("\uC2DC\uAC04");
		time_lbl.setBounds(247, 127, 161, 27);
		item.add(time_lbl);

		JLabel address = new JLabel("\uC8FC\uC18C");
		address.setBounds(185, 37, 227, 27);
		item.add(address);

		JLabel img_lbl = new JLabel("");
		img_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		img_lbl.setBounds(0, 37, 150, 150);
		item.add(img_lbl);

		JButton resrveation_btn = new JButton("\uB354\uBCF4\uAE30");
		resrveation_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FCdetailGUI detail= new FCdetailGUI();
				frame.dispose();
			}
		});
		resrveation_btn.setBounds(325, 164, 71, 52);
		item.add(resrveation_btn);

		JLabel charge_lbl = new JLabel("<dynamic>");
		charge_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		charge_lbl.setBounds(185, 77, 98, 15);
		item.add(charge_lbl);

		JLabel closure_lbl = new JLabel("\uC5F0\uC911\uBB34\uD734");
		closure_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		closure_lbl.setBounds(185, 102, 98, 15);
		item.add(closure_lbl);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 37, 150, 150);
		item.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 78);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(158, 20, 113, 21);
		comboBox_2.addItem("축구장");
		comboBox_2.addItem("야구장");
		comboBox_2.addItem("풋살경기장");
		comboBox_2.addItem("족구장");
		comboBox_2.addItem("농구장");
		comboBox_2.addItem("배드맨턴장");
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uC885\uBAA9");
		lblNewLabel_3_1.setBounds(95, 23, 63, 15);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3_1);

		JButton back_btn = new JButton("");
		back_btn.setBounds(12, 20, 24, 21);
		panel.add(back_btn);

		char yn = con.getcharge();
		System.out.println(yn);
		String str;

		if (yn == 'Y') {
			str = "유료";
		} else {
			str = "유료";
		}
	}
}