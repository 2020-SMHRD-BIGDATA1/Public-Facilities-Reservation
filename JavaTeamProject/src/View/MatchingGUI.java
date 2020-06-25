package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import Model.MatchingDAO;
import Model.MatchingVO;
import Model.RoomMatchingVO;

public class MatchingGUI {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JComboBox comboBox;
	private JLabel lmg_lbl;

	public MatchingGUI() {
		initialize();
		frame.setVisible(true);
	}

	MyMatching matching = new MyMatching();
	MatchingDAO dao = new MatchingDAO();
	private JScrollPane scrollPane;
	ArrayList<MatchingVO> list;
	ArrayList<RoomMatchingVO> infolist;
	private JScrollPane scrollPane_1;
	private JPanel panel_1;

	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MatchingGUI.class.getResource("/img/frame.jpg")));
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(0, 0, 434, 54);
		panel.setLayout(null);

		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(MatchingGUI.class.getResource("/img/prev.jpg")));
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MainGUI main = new MainGUI();
			}
		});
		back_btn.setBounds(10, 10, 23, 23);
		panel.add(back_btn);

		JLabel lblNewLabel_3_1 = new JLabel("\uC885\uBAA9");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(89, 23, 57, 15);
		lblNewLabel_3_1.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		panel.add(lblNewLabel_3_1);
		lmg_lbl = new JLabel("");

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(175, 20, 90, 21);
		
		comboBox.addItem("축구장");
		comboBox.addItem("야구장");
		comboBox.addItem("풋살경기장");
		comboBox.addItem("족구장");
		comboBox.addItem("농구장");
		comboBox.addItem("배드맨턴장");
		panel.add(comboBox);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(22, 64, 387, 461);
		frame.getContentPane().add(scrollPane_1);
		
		panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		scrollPane_1.setViewportView(panel_1);
		frame.getContentPane().add(scrollPane_1);

	

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Component[] componentList = panel_1.getComponents();
				for (Component c : componentList) {
					if (c instanceof JPanel) {
						panel_1.remove(c);
					}
				}
				lmg_lbl.setBounds(0, 40, 100, 100);
				list = dao.divide(comboBox.getSelectedItem().toString());
				infolist = dao.roomInfo();

				if (comboBox.getSelectedItem().toString().equals("축구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							for (int j = 0; j < infolist.size(); j++) {
								addItem(i, j);
							}
						}
					}
				} 
				else if (comboBox.getSelectedItem().toString().equals("농구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							for (int j = 0; j < infolist.size(); j++) {
								addItem(i, j);
							}
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("야구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							for (int j = 0; j < infolist.size(); j++) {
								addItem(i, j);
							}
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("족구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							for (int j = 0; j < infolist.size(); j++) {
								addItem(i, j);
							}
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("배드맨턴장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							for (int j = 0; j < infolist.size(); j++) {
								addItem(i, j);
							}
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("풋살경기장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							for (int j = 0; j < infolist.size(); j++) {
								addItem(i, j);
							}
						}
					}
				}
			}
		});
	}

	public void addItem(int i, int j) {
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 250));

		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		Dimension size = new Dimension();// 사이즈를 지정하기 위한 객체 생성
		size.setSize(300, 300);// 객체의 사이즈를 지정
		panel_1.setPreferredSize(size);

		if (list.get(i).getFac_ID() == infolist.get(j).getFac_ID()) {
			JPanel jyp = matching.getMyMatching(list.get(i), infolist.get(j));
			panel_1.add(jyp);
			frame.setVisible(true);
		}
	}
}
