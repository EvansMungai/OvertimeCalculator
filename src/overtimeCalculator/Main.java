package overtimeCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmGeorgetownCleaningServices;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldHourlySalary;
	private JTextField textFieldFWMonday;
	private JTextField textFieldFWTuesday;
	private JTextField textFieldFWWednesday;
	private JTextField textFieldFWThursday;
	private JTextField textFieldFWFriday;
	private JTextField textFieldFWSaturday;
	private JTextField textFieldFWSunday;
	private JTextField textFieldSWMonday;
	private JTextField textFieldSWTuesday;
	private JTextField textFieldSWWednesday;
	private JTextField textFieldSWThursday;
	private JTextField textFieldSWFriday;
	private JTextField textFieldSWSaturday;
	private JTextField textFieldSWSunday;
	private JTextField textFieldRegularHours;
	private JTextField textFieldOvertimeHours;
	private JTextField textFieldRegularAmount;
	private JTextField textFieldOvertimeAmount;
	private JLabel lblNewLabel_15;
	private JTextField textFieldNetPay;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmGeorgetownCleaningServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServices = new JFrame();
		frmGeorgetownCleaningServices.setTitle("Georgetown Cleaning Services - Employee Payroll");
		frmGeorgetownCleaningServices.setBounds(100, 100, 841, 412);
		frmGeorgetownCleaningServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServices.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(20, 11, 790, 81);
		frmGeorgetownCleaningServices.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setBounds(37, 34, 97, 14);
		panel.add(lblNewLabel);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setBounds(136, 31, 197, 20);
		panel.add(textFieldEmployeeName);
		textFieldEmployeeName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Hourly Salary:");
		lblNewLabel_1.setBounds(365, 31, 97, 14);
		panel.add(lblNewLabel_1);
		
		textFieldHourlySalary = new JTextField();
		textFieldHourlySalary.setBounds(486, 28, 86, 20);
		panel.add(textFieldHourlySalary);
		textFieldHourlySalary.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 103, 790, 135);
		frmGeorgetownCleaningServices.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("First Week:");
		lblNewLabel_2.setBounds(10, 51, 72, 21);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Second Week:");
		lblNewLabel_3.setBounds(10, 88, 86, 21);
		panel_1.add(lblNewLabel_3);
		
		textFieldFWMonday = new JTextField();
		textFieldFWMonday.setBounds(106, 51, 86, 20);
		panel_1.add(textFieldFWMonday);
		textFieldFWMonday.setColumns(10);
		
		textFieldFWTuesday = new JTextField();
		textFieldFWTuesday.setBounds(202, 51, 86, 20);
		panel_1.add(textFieldFWTuesday);
		textFieldFWTuesday.setColumns(10);
		
		textFieldFWWednesday = new JTextField();
		textFieldFWWednesday.setBounds(298, 51, 86, 20);
		panel_1.add(textFieldFWWednesday);
		textFieldFWWednesday.setColumns(10);
		
		textFieldFWThursday = new JTextField();
		textFieldFWThursday.setBounds(394, 51, 86, 20);
		panel_1.add(textFieldFWThursday);
		textFieldFWThursday.setColumns(10);
		
		textFieldFWFriday = new JTextField();
		textFieldFWFriday.setBounds(490, 51, 86, 20);
		panel_1.add(textFieldFWFriday);
		textFieldFWFriday.setColumns(10);
		
		textFieldFWSaturday = new JTextField();
		textFieldFWSaturday.setBounds(586, 51, 86, 20);
		panel_1.add(textFieldFWSaturday);
		textFieldFWSaturday.setColumns(10);
		
		textFieldFWSunday = new JTextField();
		textFieldFWSunday.setBounds(682, 51, 86, 20);
		panel_1.add(textFieldFWSunday);
		textFieldFWSunday.setColumns(10);
		
		textFieldSWMonday = new JTextField();
		textFieldSWMonday.setBounds(106, 88, 86, 20);
		panel_1.add(textFieldSWMonday);
		textFieldSWMonday.setColumns(10);
		
		textFieldSWTuesday = new JTextField();
		textFieldSWTuesday.setBounds(202, 88, 86, 20);
		panel_1.add(textFieldSWTuesday);
		textFieldSWTuesday.setColumns(10);
		
		textFieldSWWednesday = new JTextField();
		textFieldSWWednesday.setBounds(298, 88, 86, 20);
		panel_1.add(textFieldSWWednesday);
		textFieldSWWednesday.setColumns(10);
		
		textFieldSWThursday = new JTextField();
		textFieldSWThursday.setBounds(394, 88, 86, 20);
		panel_1.add(textFieldSWThursday);
		textFieldSWThursday.setColumns(10);
		
		textFieldSWFriday = new JTextField();
		textFieldSWFriday.setBounds(490, 88, 86, 20);
		panel_1.add(textFieldSWFriday);
		textFieldSWFriday.setColumns(10);
		
		textFieldSWSaturday = new JTextField();
		textFieldSWSaturday.setBounds(586, 88, 86, 20);
		panel_1.add(textFieldSWSaturday);
		textFieldSWSaturday.setColumns(10);
		
		textFieldSWSunday = new JTextField();
		textFieldSWSunday.setBounds(682, 88, 86, 20);
		panel_1.add(textFieldSWSunday);
		textFieldSWSunday.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Monday");
		lblNewLabel_4.setBounds(127, 26, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tuesday");
		lblNewLabel_5.setBounds(214, 26, 55, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Wednesday");
		lblNewLabel_6.setBounds(319, 26, 72, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Thursday");
		lblNewLabel_7.setBounds(415, 26, 55, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Friday");
		lblNewLabel_8.setBounds(511, 26, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Saturday");
		lblNewLabel_9.setBounds(607, 26, 55, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Sunday");
		lblNewLabel_10.setBounds(703, 26, 46, 14);
		panel_1.add(lblNewLabel_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(20, 249, 795, 113);
		frmGeorgetownCleaningServices.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnProcessIt = new JButton("Process It");
		btnProcessIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String employeeName;
				employeeName=textFieldEmployeeName.getText();
				double [][]hoursWorked = new double [2][7];
				double hourlySalary, regularHours = 0 ,overtimeHours = 0,regularAmount,overtimeAmount,netPay;
				DecimalFormat df = new DecimalFormat("#.##");
				hoursWorked[0][0] = Double.parseDouble(textFieldFWMonday.getText());
				hoursWorked[0][1] = Double.parseDouble(textFieldFWTuesday.getText());
				hoursWorked[0][2] = Double.parseDouble(textFieldFWWednesday.getText());
				hoursWorked[0][3] = Double.parseDouble(textFieldFWThursday.getText());
				hoursWorked[0][4] = Double.parseDouble(textFieldFWFriday.getText());
				hoursWorked[0][5] = Double.parseDouble(textFieldFWSaturday.getText());
				hoursWorked[0][6] = Double.parseDouble(textFieldFWSunday.getText());
				hoursWorked[1][0] = Double.parseDouble(textFieldSWMonday.getText());
				hoursWorked[1][1] = Double.parseDouble(textFieldSWTuesday.getText());
				hoursWorked[1][2] = Double.parseDouble(textFieldSWWednesday.getText());
				hoursWorked[1][3] = Double.parseDouble(textFieldSWThursday.getText());
				hoursWorked[1][4] = Double.parseDouble(textFieldSWFriday.getText());
				hoursWorked[1][5] = Double.parseDouble(textFieldSWSaturday.getText());
				hoursWorked[1][6] = Double.parseDouble(textFieldSWSunday.getText());
				hourlySalary=Double.parseDouble(textFieldHourlySalary.getText());

				
			    for (int i = 0; i < hoursWorked.length; ++i) {
			        for(int j = 0; j < hoursWorked[i].length; ++j) {
			        	if(hoursWorked[i][j]>8) {
			        		double hours = hoursWorked[i][j]-8;
			        		overtimeHours += hours;
			        	}
			        }
			      }
				textFieldOvertimeHours.setText(String.valueOf(overtimeHours));
				for(int i= 0; i < hoursWorked.length; ++i) {
					for (int j = 0; j < hoursWorked[i].length; ++j) {
						regularHours += hoursWorked[i][j];
					}
				}
				regularHours -= overtimeHours;
				textFieldRegularHours.setText(String.valueOf(regularHours));
				regularAmount=regularHours*hourlySalary;
				textFieldRegularAmount.setText(String.valueOf(regularAmount));
				overtimeAmount=overtimeHours*27.78;
				overtimeAmount=Double.parseDouble(df.format(overtimeAmount));
				textFieldOvertimeAmount.setText(String.valueOf(overtimeAmount));
				netPay=regularAmount + overtimeAmount;
				textFieldNetPay.setText(String.valueOf(netPay));
			}
		});
		btnProcessIt.setBounds(10, 23, 98, 72);
		panel_2.add(btnProcessIt);
		
		JLabel lblNewLabel_11 = new JLabel("Regular");
		lblNewLabel_11.setBounds(125, 46, 56, 14);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Overtime");
		lblNewLabel_12.setBounds(125, 81, 56, 14);
		panel_2.add(lblNewLabel_12);
		
		textFieldRegularHours = new JTextField();
		textFieldRegularHours.setBounds(191, 43, 80, 20);
		panel_2.add(textFieldRegularHours);
		textFieldRegularHours.setColumns(10);
		
		textFieldOvertimeHours = new JTextField();
		textFieldOvertimeHours.setBounds(191, 78, 80, 20);
		panel_2.add(textFieldOvertimeHours);
		textFieldOvertimeHours.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Hours");
		lblNewLabel_13.setBounds(212, 23, 46, 14);
		panel_2.add(lblNewLabel_13);
		
		textFieldRegularAmount = new JTextField();
		textFieldRegularAmount.setBounds(281, 43, 79, 20);
		panel_2.add(textFieldRegularAmount);
		textFieldRegularAmount.setColumns(10);
		
		textFieldOvertimeAmount = new JTextField();
		textFieldOvertimeAmount.setBounds(281, 78, 79, 20);
		panel_2.add(textFieldOvertimeAmount);
		textFieldOvertimeAmount.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Amount");
		lblNewLabel_14.setBounds(310, 23, 46, 14);
		panel_2.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Net Pay");
		lblNewLabel_15.setBounds(402, 59, 46, 14);
		panel_2.add(lblNewLabel_15);
		
		textFieldNetPay = new JTextField();
		textFieldNetPay.setBounds(467, 56, 60, 20);
		panel_2.add(textFieldNetPay);
		textFieldNetPay.setColumns(10);
		
		btnClose = new JButton("Close");
		btnClose.setBounds(600, 23, 91, 60);
		panel_2.add(btnClose);
	}
}
