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

import Controller.Reservation_1Controller;
import Model.fcnamevo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class InventoryGUI {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JPanel img_panel;
	

	private JPanel panel1;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JLabel name_lbl;
	private JLabel charge_lbl;
	private JButton resrveation_btn;
	private JLabel closure_lbl;
	
	Reservation_1Controller con= new Reservation_1Controller();
	
	public InventoryGUI() {
		initialize();
		frame.setVisible(true);
	}


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
		
		panel1 = new JPanel();
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		panel1.setBounds(12, 107, 308, 111);
		panel.add(panel1);
		panel1.setLayout(null);
		
		img_panel = new JPanel();
		img_panel.setBounds(0, 22, 103, 70);
		panel1.add(img_panel);
		
		name_lbl = new JLabel("\uC2DC\uC124 \uBA85");
		name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		name_lbl.setBounds(0, 0, 70, 21);
		panel1.add(name_lbl);
		name_lbl.setText("각화풋살장");
		String fcname=name_lbl.getText();
	
		
		
		charge_lbl = new JLabel("\uC720\uB8CC/\uBB34\uB8CC");
		charge_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		charge_lbl.setBounds(115, 40, 98, 15);
		panel1.add(charge_lbl);
		
		char yn=con.getcharge();
		System.out.println(yn);
		String str;
		
		if(yn=='Y') {
			str="유료";
		}else {
			str="유료";
		}
		
		charge_lbl.setText(str);
		
		resrveation_btn = new JButton("\uB354\uBCF4\uAE30");
		resrveation_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FCdetailGUI fcgui= new FCdetailGUI();
				
			}
		});
		resrveation_btn.setBounds(225, 40, 83, 52);
		panel1.add(resrveation_btn);
		
		closure_lbl = new JLabel("\uD734\uAD00\uC77C");
		closure_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		closure_lbl.setBounds(115, 65, 98, 15);
		panel1.add(closure_lbl);
		
		closure_lbl.setText(con.getclosure());
	

		JLabel lblNewLabel_3 = new JLabel("\uC9C0\uC5ED");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(65, 56, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uC885\uBAA9");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(65, 23, 57, 15);
		panel.add(lblNewLabel_3_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem().toString().equals("축구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("축구장선택");
				}
				}else if(comboBox.getSelectedItem().toString().equals("농구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("농구장선택");
				}
				}else if(comboBox.getSelectedItem().toString().equals("족구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("족구장선택");
				}
				}else if(comboBox.getSelectedItem().toString().equals("야구장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("야구장선택");
				}
				}else if(comboBox.getSelectedItem().toString().equals("배드민턴장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("배드민턴장선택");
				}
				}else if(comboBox.getSelectedItem().toString().equals("풋살장")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("풋살장선택");
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
				if(comboBox_1.getSelectedItem().toString().equals("서구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("서구선택");
				}
				}else if(comboBox_1.getSelectedItem().toString().equals("동구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("동구선택");
				}
				}else if(comboBox_1.getSelectedItem().toString().equals("북구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("북구선택");
				}
				}else if(comboBox_1.getSelectedItem().toString().equals("남구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("남구선택");
				}
				}else if(comboBox_1.getSelectedItem().toString().equals("광산구")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("광산구");
				}
				}
			}
		});
		comboBox_1.setBounds(134, 53, 90, 21);
		panel.add(comboBox_1);
		comboBox_1.addItem("동구");
		comboBox_1.addItem("서구");
		comboBox_1.addItem("남구");
		comboBox_1.addItem("북구");
		comboBox_1.addItem("광산구");
		
	}
}
