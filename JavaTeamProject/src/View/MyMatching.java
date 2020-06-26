package View;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Model.MatchingDAO;
import Model.MatchingVO;
import Model.RoomMatchingVO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

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
	
	MatchingDAO dao = new MatchingDAO();
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel panel_1;
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
		
		panel_1 = new JPanel();
		panel_1.setBounds(162, 74, 250, 154);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("\uC608\uC57D\uC790 : ");
		lblNewLabel.setBounds(0, 1, 69, 38);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		reservation_name_lbl = new JLabel("\uBAA8\uC9D1\uC790(\uC608\uC57D\uC790)");
		reservation_name_lbl.setBounds(68, 1, 182, 38);
		panel_1.add(reservation_name_lbl);
		reservation_name_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblNewLabel_2 = new JLabel("\uC8FC\uC18C : ");
		lblNewLabel_2.setBounds(0, 39, 69, 38);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		address = new JLabel("\uC8FC\uC18C");
		address.setHorizontalAlignment(SwingConstants.LEFT);
		address.setBounds(68, 39, 182, 38);
		panel_1.add(address);
		
		lblNewLabel_3 = new JLabel("\uC2DC\uAC04 : ");
		lblNewLabel_3.setBounds(0, 77, 69, 38);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		
		time_lbl = new JLabel("\uC2DC\uAC04");
		time_lbl.setBounds(68, 77, 182, 38);
		panel_1.add(time_lbl);
		
		lblNewLabel_1 = new JLabel("\uBAA8\uC9D1 \uC778\uC6D0 : ");
		lblNewLabel_1.setBounds(0, 115, 94, 38);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(lblNewLabel_1);
		
		count_lbl = new JLabel("\uBAA8\uC9D1\uC218");
		count_lbl.setBounds(94, 115, 156, 38);
		panel_1.add(count_lbl);
		count_lbl.setFont(new Font("굴림", Font.BOLD, 16));
		count_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		
		contents_lbl = new JLabel("\uC124\uBA85");
		contents_lbl.setBounds(0, 225, 302, 75);
		panel.add(contents_lbl);
		
		apply_btn = new JButton("\uC2E0\uCCAD");
		apply_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RoomMatchingVO vo1 = new RoomMatchingVO(7, "2", "나와라");
				int cnt = dao.minusnum(vo1);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(panel, "신청 성공!", "팀매칭 신청결과", JOptionPane.PLAIN_MESSAGE);
					
					panel.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(panel, "신청 성공!", "팀매칭 신청결과", JOptionPane.PLAIN_MESSAGE);
					panel.setVisible(false);
				}
			}
		});
		apply_btn.setBounds(266, 225, 146, 75);
		apply_btn.setFont(new Font("HY목각파임B", Font.PLAIN, 12));
		panel.add(apply_btn);
		
		img_lbl = new JLabel("");
		img_lbl.setBounds(0, 74, 150, 150);
		img_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(img_lbl);
		
		title_lbl = new JLabel("\uBC29\uC81C\uBAA9");
		title_lbl.setBounds(0, 0, 227, 27);
		panel.add(title_lbl);

	}

}