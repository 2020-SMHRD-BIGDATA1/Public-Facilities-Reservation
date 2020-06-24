package View;

import java.awt.Dimension;
import java.awt.EventQueue;

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

public class ggggg {

	private JFrame frame;
	private JPanel panel_7;
	private JLabel lb_closure;
	private JLabel lb_charge;
	private JLabel lb_fcname;
	private JLabel lb_pic;
	private JButton btn;

	public ggggg() {
		initialize();
		frame.setVisible(true);
	}

	MatchingDAO dao = new MatchingDAO();
	ArrayList<MatchingVO> list;
	private JComboBox<String> comboBox;
	private String fc_name;
	private JPanel panel;

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		SpringLayout springLayout = new SpringLayout();
//		frame.getContentPane().setLayout(springLayout);
		frame.getContentPane().setLayout(null);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(99, 17, 106, 21);

		comboBox.addItem("축구장");
		comboBox.addItem("야구장");
		comboBox.addItem("풋살경기장");
		comboBox.addItem("족구장");
		comboBox.addItem("농구장");
		comboBox.addItem("배드맨턴장");
		frame.getContentPane().add(comboBox);
		list = dao.divide(comboBox.getSelectedItem().toString());

//		if (comboBox.getSelectedItem().toString().equals("축구장")) {
//			System.out.println(list.get(0).getName());
//		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 48, 700, 700);
		frame.getContentPane().add(scrollPane);

		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		for (int i = 0; i < list.size(); i++) {

			addItem(i);

		}

	}

	public void addItem(int i) {

		panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(null);

		lb_closure = new JLabel("\uD734\uBB34");
		lb_closure.setBounds(115, 72, 106, 39);
		panel_7.add(lb_closure);
		lb_closure.setText(list.get(i).getClosure());

		lb_charge = new JLabel("\uC720\uB8CC");
		lb_charge.setBounds(115, 39, 106, 39);
		panel_7.add(lb_charge);
//		System.out.println(list.get(i).getCharge());
		if (list.get(i).getCharge().equals("N")) {
			lb_charge.setText("무료");
		} else {
			lb_charge.setText("유료");
		}

		lb_fcname = new JLabel("\uC2DC\uC124\uBA85");
		lb_fcname.setBounds(0, 0, 106, 39);
		panel_7.add(lb_fcname);
		
		lb_fcname.setText(list.get(i).getName());

		lb_pic = new JLabel("fefe");
		lb_pic.setBounds(0, 39, 106, 72);
		panel_7.add(lb_pic);
		String path = list.get(i).getImg();
		lb_pic.setIcon(new ImageIcon(path));
		panel_7.add(lb_pic);

		btn = new JButton("\uB354\uBCF4\uAE30");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FCdetailGUI fcdetailgui = new FCdetailGUI(list.get(i).getName());

			}
		});
		btn.setBounds(212, 56, 106, 39);
		panel_7.add(btn);

	}
}