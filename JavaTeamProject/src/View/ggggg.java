package View;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.ArrayList;

import Model.MatchingDAO;
import Model.MatchingVO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ScrollPaneConstants;
import java.awt.Toolkit;
import java.awt.Color;

public class ggggg {

	private JFrame frame;
	private JPanel panel_7;
	private JLabel lb_closure;
	private JLabel lb_charge;
	private JLabel lb_fcname;
	private JLabel lb_pic;
	private JButton btn;

	MatchingDAO dao = new MatchingDAO();
	ArrayList<MatchingVO> list;
	private JComboBox<String> comboBox;
	private String fc_name;
	private JPanel panel;
	private String index;

	public ggggg(String string) {
		initialize();
		frame.setVisible(true);
		
	    list = dao.divide(string);
		for (int i = 0; i <list.size(); i++) {
			addItem(i);
		}
	
	}

	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ggggg.class.getResource("/img/frame.jpg")));
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(156, 17, 106, 21);
		comboBox.setBackground(new Color(255, 250, 250));
		comboBox.addItem("선택하기");
		comboBox.addItem("족구장");
		comboBox.addItem("야구장");
		comboBox.addItem("풋살경기장");
		comboBox.addItem("축구장");
		comboBox.addItem("농구장");
		comboBox.addItem("배드맨턴장");
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(comboBox);

//		   list = dao.divide(comboBox.getSelectedItem().toString());
//		   list = dao.divide(index);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 48, 410, 503);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(scrollPane);

		panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 10, 23, 23);
		btnNewButton.setIcon(new ImageIcon(ggggg.class.getResource("/img/prev.jpg")));
		frame.getContentPane().add(btnNewButton);

//		list= dao.divide("족구장");
//		for (int i = 0; i < list.size(); i++) {
//			addItem(i);
//		}
		

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Component[] componentList = panel.getComponents();
				for (Component c : componentList) {
					if (c instanceof JPanel) {
						panel.remove(c);
					}
				}
				list = dao.divide(comboBox.getSelectedItem().toString());
				if (comboBox.getSelectedItem().toString().equals("축구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							addItem(i);
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("야구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							addItem(i);
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("배드맨턴장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							addItem(i);
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("풋살경기장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							addItem(i);
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("족구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							addItem(i);
						}
					}
				} else if (comboBox.getSelectedItem().toString().equals("농구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						for (int i = 0; i < list.size(); i++) {
							addItem(i);
						}
					}
				}
			}
		});
		
	}
		

	public void addItem(int i) {

		panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(null);
		panel_7.setPreferredSize(new Dimension(0, 150));

		lb_closure = new JLabel("\uD734\uBB34");
		lb_closure.setBounds(115, 72, 106, 39);
		panel_7.add(lb_closure);

		lb_charge = new JLabel("\uC720\uB8CC");
		lb_charge.setBounds(115, 39, 106, 39);
		panel_7.add(lb_charge);

		lb_fcname = new JLabel("\uC2DC\uC124\uBA85");
		lb_fcname.setBounds(0, 0, 300, 39);
		panel_7.add(lb_fcname);
		
		lb_pic = new JLabel(" ");
		lb_pic.setBounds(0, 39, 106, 72);
		
		btn = new JButton("\uB354\uBCF4\uAE30");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				fcupdateGUI fcupgui = new fcupdateGUI(list.get(i).getName());
			}
		});
		btn.setBounds(212, 56, 106, 39);
		panel_7.add(btn);

		if (list.get(i).getCharge().equals("N")) {
			lb_charge.setText("무료");
		} else {
			lb_charge.setText("유료");
		}
		lb_closure.setText(list.get(i).getClosure());
		lb_fcname.setText(list.get(i).getName());
		String path = list.get(i).getImg();
		lb_pic.setIcon(new ImageIcon(path));
		panel_7.add(lb_pic);

	}
}