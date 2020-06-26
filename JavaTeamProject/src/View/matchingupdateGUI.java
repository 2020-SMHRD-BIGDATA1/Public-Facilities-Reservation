package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Controller.MemberManagementSystem;
import Controller.Reservation_1Controller;
import Model.MatchingDAO;
import Model.ReserVO;
import Model.RoomMatchingVO;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class matchingupdateGUI {

	private JFrame frame;
	MatchingDAO dao = new MatchingDAO();
	private JLabel title_lbl;
	private JLabel name_lbl;

	Reservation_1Controller con = new Reservation_1Controller();
	private JLabel contents_lbl_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_3;
	private JPanel panel_2;
	ArrayList<RoomMatchingVO> list;
	private JPanel panel;
	private ArrayList<ReserVO> reservo;

	public matchingupdateGUI() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(500, 500, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 37, 410, 524);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));

		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(137, 6, 129, 21);
		frame.getContentPane().add(comboBox);
		comboBox = new JComboBox<String>();
		comboBox.setBounds(156, 17, 106, 21);
		comboBox.setBackground(new Color(255, 250, 250));
		
		
		JLabel lblNewLabel_1 = new JLabel("\uC885\uB958");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(68, 9, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		list = dao.roomInfo();

//		for (int i = 0; i < list.size(); i++) {
//		
//			reservo=con.getreservation2(list.get(i).getFac_ID());
//		}
//		
		reservo = con.getreservation2(1);

		for (int i = 0; i < reservo.size(); i++) {
			additem(i);
		}
		System.out.println(list.size());
		System.out.println(reservo.size());

	}

	private void additem(int i) {

		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel.add(panel_2);
		panel_2.setPreferredSize(new Dimension(0, 200));

		name_lbl = new JLabel("\uC2DC\uC124 \uBA85");
		name_lbl.setBounds(0, 25, 209, 27);
		panel_2.add(name_lbl);

//		JButton apply_btn = new JButton("\uC2E0\uCCAD");
//		apply_btn.setFont(new Font("HY목각파임B", Font.PLAIN, 12));
//		apply_btn.setBounds(338, 104, 70, 62);
//		panel_2.add(apply_btn);

		JLabel img_lbl = new JLabel("\uC0AC\uC9C4");
		img_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		img_lbl.setBounds(0, 61, 180, 52);
		panel_2.add(img_lbl);

		title_lbl = new JLabel("\uBC29\uC81C\uBAA9");
		title_lbl.setBounds(0, 0, 209, 27);
		panel_2.add(title_lbl);

		JLabel contents_lbl_1 = new JLabel("\uC124\uBA85");
		contents_lbl_1.setBounds(0, 104, 302, 62);
		panel_2.add(contents_lbl_1);

		JButton apply_btn_1 = new JButton("\uC2E0\uCCAD");
		apply_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomMatchingVO vo1 = new RoomMatchingVO(7, "2", "나와라");
				int cnt = dao.minusnum(vo1);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(frame, "신청 성공", "팀매칭 신청결과", JOptionPane.PLAIN_MESSAGE);
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(frame, "신청실패", "팀매칭 신청결과", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		apply_btn_1.setFont(new Font("HY목각파임B", Font.PLAIN, 12));
		apply_btn_1.setBounds(314, 104, 92, 62);
		panel_2.add(apply_btn_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(192, 3, 216, 103);
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 2, 0, 0));

		JLabel lblNewLabel_2 = new JLabel("\uBAA8\uC9D1\uC778\uC6D0");
		panel_3.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_3.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("\uBAA8\uC9D1\uB0A0\uC9DC");
		panel_3.add(lblNewLabel_5);

		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel = new JLabel("\uBAA8\uC9D1\uC2DC\uAC04");
		panel_3.add(lblNewLabel);

		JLabel lblNewLabel_6 = new JLabel("New label");
		panel_3.add(lblNewLabel_6);

		title_lbl.setText(list.get(i).getTitle());
		contents_lbl_1.setText(list.get(i).getBody());
		lblNewLabel_4.setText(list.get(i).getAddnum());

		name_lbl.setText(reservo.get(i).getFac_name());
		lblNewLabel_6.setText(reservo.get(i).getUsetime());
		lblNewLabel_3.setText(reservo.get(i).getUsedate());

	}
}
