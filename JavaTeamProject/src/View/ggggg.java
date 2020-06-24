package View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ggggg {

	private JFrame frame;
	private JTable table;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lb_date;
	private JLabel lb_day;
	private JTable table_1;
	private JPanel panel_3;
	private JTable table_3;
	private String format_time1 ;
	int day;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lb_date1;
	private JLabel lb_day1;
	private JTable table_2;
	String ddate ;
	/**
	 * Launch the application.
	 */

	public  ggggg () {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 48, 320, 478);
		frame.getContentPane().add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		for (int i = 0; i < 5; i++) {
		
			addItem();

		}
		

		
	}
	
	public void addItem() {
		panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		lb_date1 = new JLabel("New label");
		panel_4.add(lb_date1);
//		lb_date.setText(format_time1);
//		ddate = format_time1;
		String[] dddate = ddate.split("-");
		int month = Integer.parseInt(dddate[1]);
		day = Integer.parseInt(dddate[2]);
		String date1 = dddate[0]+"-"+dddate[1]+"-"+day;
		day++;
		lb_date1.setText(date1);
	
	  System.out.println(day);
	
		
		lb_day1 = new JLabel("New label");
		panel_4.add(lb_day1);
		lb_day1.setText(getDate(date1));
	
		
        String[] colummn= new String[]{""};
		
		Object[][] rows= new Object[][]{{"    "},{"08:00~10:00"},{"10:00~12:00"},{"12:00~14:00"},{"14:00~16:00"},{"16:00~18:00"}};
		
		JTable table_2 = new JTable(rows,colummn);
		panel_4.add(table_2);

	
		
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
}}
