package View;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import Controller.Reservation_1Controller;
import Model.MatchingDAO;
import Model.MatchingVO;
import Model.RoomMatchingVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;

public class InventoryGUI {
	MatchingDAO dao = new MatchingDAO();
	private JFrame frame;
	private JComboBox comboBox;

	Reservation_1Controller con = new Reservation_1Controller();
	private JScrollPane scrollPane;
	private JLabel charge_lbl;
	private JLabel closure_lbl;
	private JLabel time_lbl;
	private JLabel img_lbl;
	private JLabel name_lbl;
	private JButton resrveation_btn_1;
	private JLabel address;
	private JPanel panel_1;

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
		
		
		panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		


		addItem();

	}

	public void addItem() {
	

		JPanel item = new JPanel();
		item.setLayout(null);
		panel_1.add(item);

		name_lbl = new JLabel("\uC2DC\uC124 \uBA85");
		name_lbl.setBounds(0, 0, 302, 27);
		item.add(name_lbl);

		time_lbl = new JLabel("\uC2DC\uAC04");
		time_lbl.setBounds(247, 127, 161, 27);
		item.add(time_lbl);

		address = new JLabel("\uC8FC\uC18C");
		address.setBounds(185, 37, 227, 27);
		item.add(address);

		img_lbl = new JLabel("");
		img_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		img_lbl.setBounds(0, 37, 150, 150);
		item.add(img_lbl);

//		char yn=con.getcharge();
//		
//		System.out.println(yn);
//		String str;

		resrveation_btn_1 = new JButton("\uB354\uBCF4\uAE30");
		resrveation_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				FCdetailGUI detail = new FCdetailGUI();
				frame.dispose();
			}
		});
		resrveation_btn_1.setBounds(325, 164, 71, 52);
		item.add(resrveation_btn_1);

		charge_lbl = new JLabel("<dynamic>");
		charge_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		charge_lbl.setBounds(185, 77, 98, 15);
		item.add(charge_lbl);

		closure_lbl = new JLabel("\uC5F0\uC911\uBB34\uD734");
		closure_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		closure_lbl.setBounds(185, 102, 98, 15);
		item.add(closure_lbl);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 78);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		
	

		JLabel menu = new JLabel("\uC885\uBAA9");
		menu.setBounds(95, 23, 63, 15);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(menu);

		JButton back_btn = new JButton("");
		back_btn.setBounds(12, 20, 24, 21);
		panel.add(back_btn);
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {

				Component[] componentList = panel_1.getComponents();
				for (Component c : componentList) {
					if (c instanceof JPanel) {
						panel_1.remove(c);
					}
				}
				ArrayList<MatchingVO> list = dao.divide(comboBox_2.getSelectedItem().toString());
				ArrayList<RoomMatchingVO> infolist = dao.roomInfo();
				img_lbl.setBounds(0, 40, 100, 100);
				if (comboBox_2.getSelectedItem().toString().equals("�౸��")) {
					name_lbl.setText(list.get(0).getName());
					address.setText(list.get(0).getAddress());
					charge_lbl.setText("����");
					time_lbl.setText(list.get(0).getWeekday());
					String path = list.get(0).getImg();
					img_lbl.setIcon(new ImageIcon(path));
					item.add(img_lbl);
				} else if (comboBox_2.getSelectedItem().toString().equals("�߱���")) {
					name_lbl.setText(list.get(0).getName());
					address.setText(list.get(0).getAddress());
					charge_lbl.setText("����");
					time_lbl.setText(list.get(0).getWeekday());
					String path = list.get(0).getImg();
					img_lbl.setIcon(new ImageIcon(path));
					item.add(img_lbl);
				} else if (comboBox_2.getSelectedItem().toString().equals("����")) {
					name_lbl.setText(list.get(0).getName());
					address.setText(list.get(0).getAddress());
					charge_lbl.setText("����");
					time_lbl.setText(list.get(0).getWeekday());
					String path = list.get(0).getImg();
					img_lbl.setIcon(new ImageIcon(path));
					item.add(img_lbl);
				} else if (comboBox_2.getSelectedItem().toString().equals("��������")) {
					name_lbl.setText(list.get(0).getName());
					address.setText(list.get(0).getAddress());
					charge_lbl.setText("����");
					time_lbl.setText(list.get(0).getWeekday());
					String path = list.get(0).getImg();
					img_lbl.setIcon(new ImageIcon(path));
					item.add(img_lbl);
				} else if (comboBox_2.getSelectedItem().toString().equals("������")) {
					name_lbl.setText(list.get(0).getName());
					address.setText(list.get(0).getAddress());
					charge_lbl.setText("����");
					time_lbl.setText(list.get(0).getWeekday());
					String path = list.get(0).getImg();
					img_lbl.setIcon(new ImageIcon(path));
					item.add(img_lbl);
				} else if (comboBox_2.getSelectedItem().toString().equals("ǲ������")) {
					name_lbl.setText(list.get(0).getName());
					address.setText(list.get(0).getAddress());
					charge_lbl.setText("����");
					time_lbl.setText(list.get(0).getWeekday());
					String path = list.get(0).getImg();
					img_lbl.setIcon(new ImageIcon(path));
					item.add(img_lbl);
				}
			}
		});	
		comboBox_2.setBounds(158, 20, 113, 21);
		comboBox_2.addItem("�౸��");
		comboBox_2.addItem("�߱���");
		comboBox_2.addItem("ǲ������");
		comboBox_2.addItem("������");
		comboBox_2.addItem("����");
		comboBox_2.addItem("��������");
		panel.add(comboBox_2);
	}
}