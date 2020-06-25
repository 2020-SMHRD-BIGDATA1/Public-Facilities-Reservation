package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
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
import java.awt.Toolkit;
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

	MatchingDAO dao = new MatchingDAO();
	private JScrollPane scrollPane;
	private JPanel panel1;

	private void initialize() {

		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MatchingGUI.class.getResource("/img/frame.jpg")));
		frame.setBounds(500, 500, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(0, 0, 434, 561);
		panel.setLayout(null);

		JButton back_btn = new JButton("");
		back_btn.setIcon(new ImageIcon(MatchingGUI.class.getResource("/img/prev.jpg")));
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		back_btn.setBounds(10, 10, 23, 23);
		panel.add(back_btn);

		JLabel lblNewLabel_3_1 = new JLabel("\uC885\uBAA9");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(89, 23, 57, 15);
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

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 62, 412, 476);

		panel1 = new JPanel();
		panel1.setBackground(new Color(255, 250, 250));

		panel1.setLayout(new GridLayout(0, 1, 0, 0));

		Dimension size = new Dimension();// 사이즈를 지정하기 위한 객체 생성
		size.setSize(300, 300);// 객체의 사이즈를 지정
		panel1.setPreferredSize(size);
		scrollPane.setViewportView(panel1);
		panel.add(scrollPane);

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Component[] componentList = panel1.getComponents();

				// Loop through the components
				for (Component c : componentList) {
					// Find the components you want to remove
					if (c instanceof JPanel) {
						// Remove it
						panel1.remove(c);
					}
				}
				ArrayList<MatchingVO> list = dao.divide(comboBox.getSelectedItem().toString());
				ArrayList<RoomMatchingVO> infolist = dao.roomInfo();
				lmg_lbl.setBounds(0, 40, 100, 100);
				
				MyMatching matching = new MyMatching();
				if (comboBox.getSelectedItem().toString().equals("축구장")) {
					for (int i = 0; i < list.size(); i++) {
						for (int j = 0; j < infolist.size(); j++) {
							if (e.getStateChange() == ItemEvent.SELECTED) {
								if (list.get(i).getFac_ID() == infolist.get(j).getFac_ID()) {
									JPanel jyp = matching.getMyMatching(list.get(i), infolist.get(j));
									System.out.println(list.get(i).getAddress());
									panel1.add(jyp);
									frame.setVisible(true);
								}
							}
						}
					}
				}
				

				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < infolist.size(); j++) {
						if (comboBox.getSelectedItem().toString().equals("야구장")) {
							if (e.getStateChange() == ItemEvent.SELECTED) {
								if (list.get(i).getFac_ID() == infolist.get(j).getFac_ID()) {
									JPanel jyp = matching.getMyMatching(list.get(i), infolist.get(j));
									panel1.add(jyp);
									frame.setVisible(true);
								}
							}
						}
					}
				}

				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < infolist.size(); j++) {
						if (comboBox.getSelectedItem().toString().equals("농구장")) {
							if (e.getStateChange() == ItemEvent.SELECTED) {
								if (list.get(i).getFac_ID() == infolist.get(j).getFac_ID()) {
									JPanel jyp = matching.getMyMatching(list.get(i), infolist.get(j));
									panel1.add(jyp);
									frame.setVisible(true);

								}
							}
						}
					}
				}
				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < infolist.size(); j++) {
						if (comboBox.getSelectedItem().toString().equals("배드맨턴장")) {
							if (e.getStateChange() == ItemEvent.SELECTED) {
								if (list.get(i).getFac_ID() == infolist.get(j).getFac_ID()) {
									JPanel jyp = matching.getMyMatching(list.get(i), infolist.get(j));
									panel1.add(jyp);
									frame.setVisible(true);
								}
							}
						}
					}
				}
				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < infolist.size(); j++) {
						if (comboBox.getSelectedItem().toString().equals("풋살경기장")) {
							if (e.getStateChange() == ItemEvent.SELECTED) {
								if (list.get(i).getFac_ID() == infolist.get(j).getFac_ID()) {
									JPanel jyp = matching.getMyMatching(list.get(i), infolist.get(j));
									panel1.add(jyp);
									frame.setVisible(true);
								}
							}
						}
					}
				}
				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < infolist.size(); j++) {
						if (comboBox.getSelectedItem().toString().equals("족구장")) {
							if (e.getStateChange() == ItemEvent.SELECTED) {
								if (list.get(i).getFac_ID() == infolist.get(j).getFac_ID()) {
									JPanel jyp = matching.getMyMatching(list.get(i), infolist.get(j));
									panel1.add(jyp);
									frame.setVisible(true);
								}
							}
						}
					}
				}

			}

		});

	}
}
