package View;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

import Controller.Reservation_1Controller;
import java.text.SimpleDateFormat;


public class Reservation_2GUI {

	private JFrame frame;
	int point=0;
	JLabel lb_remainpoint;
	private int remainpoint;
	
	Reservation_1Controller con= new Reservation_1Controller();
	public Reservation_2GUI() {
		initialize();
		frame.setVisible(true);
	
	}

	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("±¼¸²", Font.BOLD, 12));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC608\uC57D\uC2E0\uCCAD");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 22, 193, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 102, 320, 77);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 4, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uC2DC\uC124\uBA85");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel.add(lblNewLabel_2);

		JLabel lb_name = new JLabel("New label");
		panel.add(lb_name);
		
	
		JLabel lblNewLabel_7 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_7.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel.add(lblNewLabel_7);
		
		JLabel lb_phone = new JLabel("New label");
		panel.add(lb_phone);
		
		lb_phone.setText(con.getphone());
		
		
		
		JLabel lblNewLabel_8 = new JLabel("\uC811\uC218\uC77C");
		lblNewLabel_8.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel.add(lblNewLabel_8);
		
		JLabel lb_sysdate = new JLabel("New label");
		panel.add(lb_sysdate);
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd");
		String format_time1 = format1.format (System.currentTimeMillis());
		System.out.println(format_time1);
		lb_sysdate.setText(format_time1+"");
		
		JLabel lblNewLabel_5 = new JLabel("\uC0AC\uC6A9\uC77C");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("\uC774\uC6A9\uC2DC\uAC04");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		panel.add(lblNewLabel_10);
		
		JLabel lb_charge = new JLabel("\uC774\uC6A9\uB8CC");
		lb_charge.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel.add(lb_charge);
		
		JLabel lb_fee = new JLabel("New label");
		panel.add(lb_fee);
		int fee = con.getfee();
		lb_fee.setText(fee+"");
		
		JLabel lblNewLabel_13 = new JLabel("\uC608\uC57D\uC2E0\uCCAD");
		lblNewLabel_13.setBounds(12, 84, 57, 15);
		frame.getContentPane().add(lblNewLabel_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 297, 320, 77);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC774\uB984");
		lblNewLabel_2_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_7_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("\uC774\uBA54\uC77C ");
		lblNewLabel_8_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("\uACB0\uC81C");
		lblNewLabel_13_1.setBounds(12, 189, 57, 15);
		frame.getContentPane().add(lblNewLabel_13_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 205, 320, 63);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_14 = new JLabel("\uBCF4\uC720\uD3EC\uC778\uD2B8");
		lblNewLabel_14.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel_2.add(lblNewLabel_14);
		
		JLabel lb_point = new JLabel("New label");
		lb_point.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lb_point);
		
		point = con.getpoint();


		//lb_point.setText(String.valueOf(point));
		lb_point.setText(point+"");

		
		JButton btn_use = new JButton("\uC0AC\uC6A9\uD558\uAE30 ");
		btn_use.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_use.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			   remainpoint= point-fee;
				
				if (remainpoint>0) {

				lb_remainpoint.setText(remainpoint+"");
				
				}else {
					
					lb_remainpoint.setText("ÃæÀüÇØÁÖ¼¼¿ä");
				}
				
				
				
				
			}
		});
		panel_2.add(btn_use);
		
		JLabel lblNewLabel_16 = new JLabel("\uC794\uC5EC\uD3EC\uC778\uD2B8");
		lblNewLabel_16.setFont(new Font("±¼¸²", Font.BOLD, 12));
		panel_2.add(lblNewLabel_16);
		
		lb_remainpoint = new JLabel("New label");
		lb_remainpoint.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lb_remainpoint);
		
		lb_remainpoint.setText(0+"");
		
		
		JButton btn_charge = new JButton("\uCDA9\uC804\uD558\uAE30");
		btn_charge.setFont(new Font("±¼¸²", Font.BOLD, 12));
		btn_charge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		panel_2.add(btn_charge);
		
		JLabel lblNewLabel_13_2 = new JLabel("\uC2E0\uCCAD\uC790\uC815\uBCF4");
		lblNewLabel_13_2.setBounds(12, 278, 85, 15);
		frame.getContentPane().add(lblNewLabel_13_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 399, 320, 30);
		frame.getContentPane().add(panel_3);
		
		JLabel label = new JLabel("? \uD300\uC6D0\uC774 \uBD80\uC871\uD558\uC2ED\uB2C8\uAE4C?");
		panel_3.add(label);
		
		JButton btnNewButton_3 = new JButton("\uB124");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Reservation_3GUI re3= new Reservation_3GUI();
			}
		});
		panel_3.add(btnNewButton_3);
		

		JButton btnNewButton_2 = new JButton("\uC608\uC57D\uD558\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				
					if (remainpoint>0) {
						JOptionPane.showMessageDialog(frame, "¿¹¾à ¼º°ø","¿¹¾à½ÅÃ»°á°ú",JOptionPane.PLAIN_MESSAGE);
						
//						main main= new main();
						
						System.out.println("¿¹¾à ¼º°ø");
					
					}else {
						JOptionPane.showMessageDialog(frame, "¿¹¾à ½ÇÆÐ","¿¹¾à½ÅÃ»°á°ú",JOptionPane.PLAIN_MESSAGE);
						System.out.println("¿¹¾à ½ÇÆÐ");
					}
					
				}
				
		});
		btnNewButton_2.setBounds(235, 499, 97, 23);
		frame.getContentPane().add(btnNewButton_2);
		frame.setBounds(100, 100, 360 , 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
