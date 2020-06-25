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
import javax.swing.ScrollPaneConstants;
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
	MyMatching matching = new MyMatching();
	MatchingDAO dao = new MatchingDAO();
	private JScrollPane scrollPane;
	private JPanel panel1;
	ArrayList<MatchingVO> list ;
	ArrayList<RoomMatchingVO> infolist;
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
				frame.setVisible(false);
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
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(12, 48, 410, 503);
		
		

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Component[] componentList = panel1.getComponents();
				for (Component c : componentList) {
					if (c instanceof JPanel) {
						panel1.remove(c);
					}
				}
				
				lmg_lbl.setBounds(0, 40, 100, 100);
				
				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < infolist.size(); j++) {
						addItem(i, j);
					}
				}
			}

		});
	}
	public void addItem(int i, int j) {
		panel1 = new JPanel();
		panel1.setBackground(new Color(255, 250, 250));

		panel1.setLayout(new GridLayout(0, 1, 0, 0));

		Dimension size = new Dimension();// 사이즈를 지정하기 위한 객체 생성
		size.setSize(300, 300);// 객체의 사이즈를 지정
		panel1.setPreferredSize(size);
		scrollPane.setViewportView(panel1);
		panel.add(scrollPane);
		
		list = dao.divide(comboBox.getSelectedItem().toString());
		infolist = dao.roomInfo();
		
		if (list.get(i).getFac_ID() == infolist.get(j).getFac_ID()) {
			JPanel jyp = matching.getMyMatching(list.get(i), infolist.get(j));
			panel1.add(jyp);
			frame.setVisible(true);
}
	}
}
