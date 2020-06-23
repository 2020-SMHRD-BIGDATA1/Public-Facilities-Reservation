package View;

import java.awt.BorderLayout;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class MatchingGUI {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	

	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatchingGUI window = new MatchingGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MatchingGUI() {
		initialize();
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
		
		panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}
		});
		panel_4.setBounds(12, 111, 308, 74);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 59, 52);
		panel_4.add(panel_1);
		
		JLabel lbl_txt = new JLabel("");
		lbl_txt.setBounds(98, 10, 158, 52);
		panel_4.add(lbl_txt);
		
		panel_5 = new JPanel();
		panel_5.setBounds(12, 195, 308, 74);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(12, 10, 59, 52);
		panel_5.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(98, 10, 158, 52);
		panel_5.add(lblNewLabel_1);
		
		panel_6 = new JPanel();
		panel_6.setBounds(12, 279, 308, 74);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBounds(12, 10, 59, 52);
		panel_6.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(98, 10, 158, 52);
		panel_6.add(lblNewLabel_2);
		
	
	

		JLabel lblNewLabel_3 = new JLabel("\uC9C0\uC5ED");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(65, 56, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uC885\uBAA9");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(65, 23, 57, 15);
		panel.add(lblNewLabel_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem().toString().equals("�౸��")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("�౸�弱��");
				}
				}else if(comboBox.getSelectedItem().toString().equals("����")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("���弱��");
				}
				}else if(comboBox.getSelectedItem().toString().equals("������")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("�����弱��");
				}
				}else if(comboBox.getSelectedItem().toString().equals("�߱���")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("�߱��弱��");
				}
				}else if(comboBox.getSelectedItem().toString().equals("��������")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("�������弱��");
				}
				}else if(comboBox.getSelectedItem().toString().equals("ǲ����")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("ǲ���弱��");
				}
				}
			}
		});
		comboBox.setBounds(134, 20, 90, 21);
		panel.add(comboBox);
		comboBox.addItem("�౸��");
		comboBox.addItem("�߱���");
		comboBox.addItem("ǲ����");
		comboBox.addItem("������");
		comboBox.addItem("����");
		comboBox.addItem("��������");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_1.getSelectedItem().toString().equals("����")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("��������");
				}
				}else if(comboBox_1.getSelectedItem().toString().equals("����")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("��������");
				}
				}else if(comboBox_1.getSelectedItem().toString().equals("�ϱ�")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("�ϱ�����");
				}
				}else if(comboBox_1.getSelectedItem().toString().equals("����")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("��������");
				}
				}else if(comboBox_1.getSelectedItem().toString().equals("���걸")) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
				        System.out.println("���걸");
				}
				}
			}
		});
		comboBox_1.setBounds(134, 53, 90, 21);
		panel.add(comboBox_1);
		comboBox_1.addItem("����");
		comboBox_1.addItem("����");
		comboBox_1.addItem("����");
		comboBox_1.addItem("�ϱ�");
		comboBox_1.addItem("���걸");
		
	}
}
