package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.Reservation_1Controller;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Reservation_1GUI {
	
	Reservation_1Controller con= new Reservation_1Controller();

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_1GUI window = new Reservation_1GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Reservation_1GUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 78, 83, 421);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(5, 3, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uB0A0\uC9DC ");
		panel.add(lblNewLabel_2);
		
		JLabel lb_date = new JLabel("000");
		lb_date.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lb_date);
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd");
	    SimpleDateFormat format2 = new SimpleDateFormat ( "EEE",Locale.KOREAN);

	    String format_time2 = format2.format (System.currentTimeMillis());
			
		System.out.println(format_time2);
			
		String format_time1 = format1.format (System.currentTimeMillis());
			
		System.out.println(format_time1);
		
		lb_date.setText(format_time1);
		
		JLabel lb_date1 = new JLabel("New label");
		lb_date1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lb_date1);
		
		String ddate = format_time1;
		String[] dddate = ddate.split("-");
		
		int month = Integer.parseInt(dddate[1]);
		int day = Integer.parseInt(dddate[2]);
		
		
		day = day+1;
		String date1 = dddate[0]+"-"+dddate[1]+"-"+day;
		lb_date1.setText(date1);
		

		
		JLabel lb_date2 = new JLabel("New label");
		lb_date2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lb_date2);
		
		day = day+1;
		String date2  = dddate[0]+"-"+dddate[1]+"-"+day;
		lb_date2.setText(date2);

		
		
		JLabel lb_date3 = new JLabel("New label");
		lb_date3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lb_date3);
		
		day = day+1;
		String date3 = dddate[0]+"-"+dddate[1]+"-"+day;
		lb_date3.setText(date3);
		
		
	
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 22, 193, 37);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC608\uC57D\uC815\uBCF4");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(94, 78, 97, 421);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(5, 0, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("\uC694\uC77C");
		panel_2.add(lblNewLabel_5);
		
		JLabel lb_day = new JLabel("New label");
		lb_day.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lb_day);
		
		
		lb_day.setText(format_time2);
		
		JLabel lb_day1 = new JLabel("New label");
		lb_day1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lb_day1);
		lb_day1.setText(getDate(date1));
		
		JLabel lb_day2 = new JLabel("New label");
		lb_day2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lb_day2);
		lb_day2.setText(getDate(date2));
		
		JLabel lb_day3 = new JLabel("New label");
		lb_day3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lb_day3);
		lb_day3.setText(getDate(date3));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(189, 78, 143, 421);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(5, 0, 0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("\uC2DC\uAC04 ");
		panel_3.add(lblNewLabel_10);
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Reservation_2GUI RE2= new Reservation_2GUI();
			frame.dispose();	
			
			}
		});
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_4.add(btnNewButton_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_3.add(panel_4_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_4_1.add(btnNewButton_2);
		
		
		
		JButton btnNewButton_1_1 = new JButton("New button");
		panel_4_1.add(btnNewButton_1_1);
		
		JPanel panel_4_2_1 = new JPanel();
		panel_3.add(panel_4_2_1);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		panel_4_2_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("New button");
		panel_4_2_1.add(btnNewButton_1_2_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_3.add(panel_4_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_4_2.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		panel_4_2.add(btnNewButton_1_2);
		frame.setBounds(100, 100,360,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public String getDate(String date) {
		
		Calendar cal = Calendar.getInstance(); 
		 
		 
		SimpleDateFormat formatter =new SimpleDateFormat ( "yyyy-MM-dd", Locale.KOREA );
		 
		//현재 일자의 요일
	
		
		try {
			cal.setTime(formatter.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int dayNum = cal.get(Calendar.DAY_OF_WEEK);
		 
		String day = "";
		switch(dayNum){
		    case 1:
		        day = "일";
		        break ;
		    case 2:
		        day = "월";
		        break ;
		    case 3:
		        day = "화";
		        break ;
		    case 4:
		        day = "수";
		        break ;
		    case 5:
		        day = "목";
		        break ;    
		    case 6:
		        day = "금";
		        break ;
		    case 7:
		        day = "토";
		        break ;


		       
	}
		
		return day;
	}
}
