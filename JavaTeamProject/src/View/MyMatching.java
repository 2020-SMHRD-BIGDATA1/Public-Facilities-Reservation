package View;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Model.MatchingVO;
import Model.RoomMatchingVO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyMatching extends JPanel {
	private JPanel panel;
	private JLabel name_lbl;
	private JLabel time_lbl;
	private JLabel reservation_name_lbl;
	private JLabel address;
	private JLabel contents_lbl;
	private JButton apply_btn;
	private JLabel count_lbl;
	private JLabel img_lbl;
	private JLabel title_lbl;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public JPanel getMyMatching(MatchingVO mvo, RoomMatchingVO rvo) {
		
		title_lbl.setText(rvo.getTitle());
		name_lbl.setText(mvo.getName());
		time_lbl.setText(mvo.getWeekday());
		reservation_name_lbl.setText(rvo.getiD());
		address.setText(mvo.getAddress());
		count_lbl.setText(rvo.getAddnum());
		contents_lbl.setText(rvo.getBody());
		String path = mvo.getImg();
		img_lbl.setIcon(new ImageIcon(path));
		panel.add(img_lbl);
		
		
		
		return panel;
	}

	public MyMatching() {
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 412, 300);
		add(panel);
		panel.setLayout(null);
		
		name_lbl = new JLabel("\uC2DC\uC124 \uBA85");
		name_lbl.setBounds(0, 37, 302, 27);
		panel.add(name_lbl);
		
		time_lbl = new JLabel("\uC2DC\uAC04");
		time_lbl.setBounds(251, 163, 161, 27);
		panel.add(time_lbl);
		
		reservation_name_lbl = new JLabel("\uBAA8\uC9D1\uC790(\uC608\uC57D\uC790)");
		reservation_name_lbl.setBounds(318, 3, 94, 21);
		reservation_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(reservation_name_lbl);
		
		address = new JLabel("\uC8FC\uC18C");
		address.setBounds(185, 74, 227, 27);
		panel.add(address);
		
		contents_lbl = new JLabel("\uC124\uBA85");
		contents_lbl.setBounds(0, 238, 302, 62);
		panel.add(contents_lbl);
		
		apply_btn = new JButton("\uC2E0\uCCAD");
		apply_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		apply_btn.setBounds(342, 238, 70, 62);
		apply_btn.setFont(new Font("HY목각파임B", Font.PLAIN, 12));
		panel.add(apply_btn);
		
		count_lbl = new JLabel("\uBAA8\uC9D1\uC218");
		count_lbl.setBounds(342, 201, 70, 39);
		count_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(count_lbl);
		
		img_lbl = new JLabel("");
		img_lbl.setBounds(0, 74, 150, 150);
		img_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(img_lbl);
		
		title_lbl = new JLabel("\uBC29\uC81C\uBAA9");
		title_lbl.setBounds(0, 0, 227, 27);
		panel.add(title_lbl);
		
		lblNewLabel = new JLabel("\uC608\uC57D\uC790 : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(266, 6, 57, 15);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\uBAA8\uC9D1 \uC778\uC6D0 : ");
		lblNewLabel_1.setBounds(274, 213, 76, 15);
		panel.add(lblNewLabel_1);

	}

}