package View;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import Model.timevo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Reservation_1updateGUI implements MouseListener{

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
	int month=6;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lb_date1;
	private JLabel lb_day1;
	private JTable table_2;
	String ddate ;
	private String time;
	private String date1;
	String name;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 * @param fcname 
	 */
	
//	public static void main(String[] args) {
//EventQueue.invokeLater(new Runnable() {
//	public void run() {
//		try {
//			Reservation_1updateGUI window = new Reservation_1updateGUI();
//			window.frame.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//});
//}

	public Reservation_1updateGUI(String fcname) {
		initialize(fcname);
		frame.setVisible(true);
		name=fcname;
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String fcname) {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Reservation_1updateGUI.class.getResource("/img/frame.jpg")));
		frame.setBounds(500, 500, 450, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 48, 320, 478);
		frame.getContentPane().add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		


//		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd");
//		format_time1 = format1.format (System.currentTimeMillis());
//		lb_date.setText(format_time1);

		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd");
		format_time1 = format1.format (System.currentTimeMillis());
		ddate = format_time1;
		
		panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		panel_4.setLayout(null);
		lb_date1 = new JLabel("New label");
		lb_date1.setBounds(0, 0, 144, 559);
		panel_4.add(lb_date1);
//		lb_date.setText(format_time1);
//		ddate = format_time1;
		String[] dddate = ddate.split("-");
		int month = Integer.parseInt(dddate[1]);
	    month++;
	    System.out.println(month);
		day = Integer.parseInt(dddate[2]);
		String date1 = dddate[0]+"-"+dddate[1]+"-"+day;
		day++;
		lb_date1.setText(date1);
	
		lb_day1 = new JLabel("New label");
		lb_day1.setBounds(144, 0, 144, 559);
		panel_4.add(lb_day1);
		lb_day1.setText(getDate(date1));
	
		
        String[] colummn= new String[]{""};
		
		Object[][] rows= new Object[][]{{"    "},{"08:00~10:00"},{"10:00~12:00"},{"12:00~14:00"},{"14:00~16:00"},{"16:00~18:00"}};
		
		JTable table_2 = new JTable(rows,colummn);
		table_2.setBounds(288, 0, 144, 559);
		table_2.setFont(new Font("배달의민족 한나체 Air", Font.BOLD,15));
		panel_4.add(table_2);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					fcupdateGUI fcup = new fcupdateGUI(fcname);
					frame.setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Reservation_1updateGUI.class.getResource("/img/prev.jpg")));
		btnNewButton.setBounds(12, 10, 23, 23);
		
		panel_4.add(btnNewButton);
		
		
		table = new JTable();
	
		
		for (int i = 0; i < 20; i++) {
		
			addItem();
//			day=day+i;

		}
		
		table.addMouseListener(this);
		System.out.println("df"+fcname);
		System.out.println("df"+date1);
		
	}
	
	public void addItem() {
		
		panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		lb_date1 = new JLabel("New label");
		panel_4.add(lb_date1);
		String[] dddate = ddate.split("-");
		
		date1 = dddate[0]+"-"+month+"-"+day;
//	    month = Integer.parseInt(dddate[1]);
//	day = Integer.parseInt(dddate[2]);
//		lb_date.setText(format_time1);
//		ddate = format_time1;

	 
		  if(day<30) {
			  day++;	
			}else {
			 day=1;
			 month++;
			}

		lb_date1.setText(date1);
	
	
		
		lb_day1 = new JLabel("New label");
		panel_4.add(lb_day1);
		lb_day1.setText(getDate(date1));
	
		
        String[] colummn= new String[]{""};
		
		Object[][] rows= new Object[][]{{"    "},{"08:00~10:00"},{"10:00~12:00"},{"12:00~14:00"},{"14:00~16:00"},{"16:00~18:00"}};
		
		JTable table_2 = new JTable(rows,colummn);
		table_2.addMouseListener(this);
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
}

	





	@Override
	public void mouseClicked(MouseEvent e) {
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		JTable table = (JTable)e.getSource();
		time = (String) table.getValueAt(table.getSelectedRow(), table.getSelectedColumn());
		// 클릭한 데이터
	
		
		timevo timevo= new timevo(name, date1, time);
		Reservation_2GUI re2= new Reservation_2GUI(timevo);
		frame.setVisible(false);
//		System.out.println(time);
//		System.out.println("df"+name);
//		System.out.println("df"+date1);
		
//		System.out.println(time);
	
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}}
