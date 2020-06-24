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

import Model.MatchingDAO;
import Model.MatchingVO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.Font;

public class MatchingGUI {

	private JFrame frame;
	private final JPanel panel = new JPanel();

	private JPanel panel1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel title_lbl;
	private JLabel name_lbl;
	private JLabel address;
	private JLabel contents_lbl;
	private JLabel reservation_name_lbl;
	private JLabel count_lbl;
	private JLabel time_lbl;
	private JButton apply_btn;
	private MatchingDAO dao = new MatchingDAO();
	private JLabel lmg_lbl;
	private JPanel panel1_1;
	private JLabel title_lbl_1;
	private JLabel name_lbl_1;
	private JLabel time_lbl_1;
	private JLabel reservation_name_lbl_1;
	private JLabel address_1;
	private JLabel contents_lbl_1;
	private JButton apply_btn_1;
	private JLabel count_lbl_1;

	public MatchingGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBackground(Color.WHITE);
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

		panel1 = new JPanel();
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});
		panel1.setBounds(12, 111, 308, 111);
		panel.add(panel1);
		panel1.setLayout(null);

		title_lbl = new JLabel("\uBC29 \uC81C\uBAA9");
		title_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		title_lbl.setBounds(0, 0, 128, 21);
		panel1.add(title_lbl);

		name_lbl = new JLabel("\uC2DC\uC124 \uBA85");
		name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		name_lbl.setBounds(70, 22, 180, 21);
		panel1.add(name_lbl);

		time_lbl = new JLabel("\uC2DC\uAC04");
		time_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		time_lbl.setBounds(70, 58, 180, 15);
		panel1.add(time_lbl);

		reservation_name_lbl = new JLabel("\uBAA8\uC9D1\uC790(\uC608\uC57D\uC790)");
		reservation_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		reservation_name_lbl.setBounds(140, 0, 98, 21);
		panel1.add(reservation_name_lbl);

		address = new JLabel("\uC8FC\uC18C");
		address.setHorizontalAlignment(SwingConstants.CENTER);
		address.setBounds(70, 41, 180, 15);
		panel1.add(address);

		contents_lbl = new JLabel("\uC124\uBA85");
		contents_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		contents_lbl.setBounds(70, 80, 180, 31);
		panel1.add(contents_lbl);

		apply_btn = new JButton("\uC2E0\uCCAD");
		apply_btn.setFont(new Font("굴림", Font.PLAIN, 10));
		apply_btn.setBounds(249, 40, 59, 52);
		panel1.add(apply_btn);

		count_lbl = new JLabel("\uBAA8\uC9D1\uC218");
		count_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		count_lbl.setBounds(250, 0, 58, 21);
		panel1.add(count_lbl);

		JLabel lblNewLabel_3 = new JLabel("\uC9C0\uC5ED");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(65, 56, 57, 15);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_3_1 = new JLabel("\uC885\uBAA9");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(65, 23, 57, 15);
		panel.add(lblNewLabel_3_1);
		lmg_lbl = new JLabel("");
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lmg_lbl.setBounds(10, 25, 70, 70);
				lmg_lbl.setHorizontalAlignment(SwingConstants.CENTER);
				if (comboBox.getSelectedItem().toString().equals("축구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						name_lbl.setText(dao.division("축구장"));
						address.setText(dao.addr("축구장"));
						time_lbl.setText(dao.time("축구장"));
						String path = dao.img("축구장");
						lmg_lbl.setIcon(new ImageIcon(path));
						panel1.add(lmg_lbl);
					}
				} else if (comboBox.getSelectedItem().toString().equals("농구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						name_lbl.setText(dao.division("농구장"));
						address.setText(dao.addr("농구장"));
						time_lbl.setText(dao.time("농구장"));
						String path = dao.img("농구장");
						lmg_lbl.setIcon(new ImageIcon(path));
						panel1.add(lmg_lbl);
					}
				} else if (comboBox.getSelectedItem().toString().equals("족구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						name_lbl.setText(dao.division("족구장"));
						address.setText(dao.addr("족구장"));
						time_lbl.setText(dao.time("족구장"));
						String path = dao.img("족구장");
						lmg_lbl.setIcon(new ImageIcon(path));
						panel1.add(lmg_lbl);
					}
				} else if (comboBox.getSelectedItem().toString().equals("야구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						name_lbl.setText(dao.division("야구장"));
						address.setText(dao.addr("야구장"));
						time_lbl.setText(dao.time("야구장"));
						String path = dao.img("야구장");
						lmg_lbl.setIcon(new ImageIcon(path));
						panel1.add(lmg_lbl);
					}
				} else if (comboBox.getSelectedItem().toString().equals("배드민턴장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						name_lbl.setText(dao.division("배드맨턴장"));
						address.setText(dao.addr("배드맨턴장"));
						time_lbl.setText(dao.time("배드맨턴장"));
						String path = dao.img("배드맨턴장");
						lmg_lbl.setIcon(new ImageIcon(path));
						panel1.add(lmg_lbl);
					}
				} else if (comboBox.getSelectedItem().toString().equals("풋살장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						name_lbl.setText(dao.division("풋살경기장"));
						address.setText(dao.addr("풋살경기장"));
						time_lbl.setText(dao.time("풋살경기장"));
						String path = dao.img("풋살경기장");
						lmg_lbl.setIcon(new ImageIcon(path));
						panel1.add(lmg_lbl);
					}
				}
			}
		});
		comboBox.setBounds(134, 20, 90, 21);
		panel.add(comboBox);
		comboBox.addItem("축구장");
		comboBox.addItem("야구장");
		comboBox.addItem("풋살장");
		comboBox.addItem("족구장");
		comboBox.addItem("농구장");
		comboBox.addItem("배드민턴장");

		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (comboBox_1.getSelectedItem().toString().equals("서구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						System.out.println("서구선택");
					}
				} else if (comboBox_1.getSelectedItem().toString().equals("동구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						System.out.println("동구선택");
					}
				} else if (comboBox_1.getSelectedItem().toString().equals("북구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						System.out.println("북구선택");
					}
				} else if (comboBox_1.getSelectedItem().toString().equals("남구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						System.out.println("남구선택");
					}
				} else if (comboBox_1.getSelectedItem().toString().equals("광산구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						System.out.println("광산구");
					}
				}
			}
		});
		comboBox_1.setBounds(134, 53, 90, 21);
		panel.add(comboBox_1);
		
		panel1_1 = new JPanel();
		panel1_1.setLayout(null);
		panel1_1.setBounds(10, 232, 308, 111);
		panel.add(panel1_1);
		
		title_lbl_1 = new JLabel("\uBC29 \uC81C\uBAA9");
		title_lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		title_lbl_1.setBounds(0, 0, 128, 21);
		panel1_1.add(title_lbl_1);
		
		name_lbl_1 = new JLabel("\uC2DC\uC124 \uBA85");
		name_lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		name_lbl_1.setBounds(70, 22, 180, 21);
		panel1_1.add(name_lbl_1);
		
		time_lbl_1 = new JLabel("\uC2DC\uAC04");
		time_lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		time_lbl_1.setBounds(70, 58, 180, 15);
		panel1_1.add(time_lbl_1);
		
		reservation_name_lbl_1 = new JLabel("\uBAA8\uC9D1\uC790(\uC608\uC57D\uC790)");
		reservation_name_lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		reservation_name_lbl_1.setBounds(140, 0, 98, 21);
		panel1_1.add(reservation_name_lbl_1);
		
		address_1 = new JLabel("\uC8FC\uC18C");
		address_1.setHorizontalAlignment(SwingConstants.CENTER);
		address_1.setBounds(70, 41, 180, 15);
		panel1_1.add(address_1);
		
		contents_lbl_1 = new JLabel("\uC124\uBA85");
		contents_lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		contents_lbl_1.setBounds(70, 80, 180, 31);
		panel1_1.add(contents_lbl_1);
		
		apply_btn_1 = new JButton("\uC2E0\uCCAD");
		apply_btn_1.setFont(new Font("굴림", Font.PLAIN, 10));
		apply_btn_1.setBounds(249, 40, 59, 52);
		panel1_1.add(apply_btn_1);
		
		count_lbl_1 = new JLabel("\uBAA8\uC9D1\uC218");
		count_lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		count_lbl_1.setBounds(250, 0, 58, 21);
		panel1_1.add(count_lbl_1);
		comboBox_1.addItem("동구");
		comboBox_1.addItem("서구");
		comboBox_1.addItem("남구");
		comboBox_1.addItem("북구");
		comboBox_1.addItem("광산구");

	}
}
