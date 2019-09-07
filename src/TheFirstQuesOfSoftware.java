

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.Font;

public class TheFirstQuesOfSoftware extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2480773511056607617L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheFirstQuesOfSoftware frame = new TheFirstQuesOfSoftware();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TheFirstQuesOfSoftware() {
		setResizable(false);
		setFont(new Font("华文行楷", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\34655\\Desktop\\My picture\\120357.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("The First Question of Software Enginering");
		setBounds(100, 100, 600, 513);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5E74\u4EFD");
		label.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label.setBounds(39, 48, 47, 18);
		contentPane.add(label);
		
		
		JLabel label_1 = new JLabel("\u5B57\u957F\u4F4D\u6570");
		label_1.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_1.setBounds(0, 99, 96, 18);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("华文行楷", Font.PLAIN, 15));
		textField.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				String s_number = textField.getText();
				try {
					@SuppressWarnings("unused")
					int number = Integer.parseInt(s_number);
				} catch (Exception e) {
					e.printStackTrace();
					textField.setText("请输入一个整数(字长)");
				}
			}
		});
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				String s_number = textField.getText();
				try {
					@SuppressWarnings("unused")
					int number = Integer.parseInt(s_number);
				} catch (Exception e1) {
					e1.printStackTrace();
					textField.setText("请输入一个整数(字长)");
				}
			}
		});
		textField.setBounds(110, 96, 193, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText("16");
		
		JLabel label_2 = new JLabel("\u4E00\u540D\u7A0B\u5E8F\u5458\u6BCF\u5929\u5199");
		label_2.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_2.setBounds(0, 156, 179, 18);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("华文行楷", Font.PLAIN, 15));
		textField_1.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				String s_order = textField_1.getText();
				try {
					@SuppressWarnings("unused")
					int order = Integer.parseInt(s_order);
				} catch (Exception e2) {
					e2.printStackTrace();
					textField_1.setText("请输入一个整数");
				}
			}
		});
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String s_order = textField_1.getText();
				try {
					@SuppressWarnings("unused")
					int order = Integer.parseInt(s_order);
				} catch (Exception e2) {
					e2.printStackTrace();
					textField_1.setText("请输入一个整数");
				}
			}
		});
		textField_1.setBounds(178, 153, 125, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText("10");
		
		JLabel label_3 = new JLabel("\u6761\u6307\u4EE4");
		label_3.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_3.setBounds(326, 156, 72, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u7A0B\u5E8F\u5458\u7684\u6708\u5DE5\u8D44");
		label_4.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_4.setBounds(14, 204, 156, 18);
		contentPane.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("华文行楷", Font.PLAIN, 15));
		textField_2.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				String s_salary = textField_2.getText();
				try {
					@SuppressWarnings("unused")
					int salary = Integer.parseInt(s_salary);
				} catch (Exception e2) {
					e2.printStackTrace();
					textField_2.setText("请输入一个整数");
				}
			}
		});
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				String s_salary = textField_2.getText();
				try {
					@SuppressWarnings("unused")
					int salary = Integer.parseInt(s_salary);
				} catch (Exception e2) {
					e2.printStackTrace();
					textField_2.setText("请输入一个整数");
				}
			}
		});
		textField_2.setBounds(178, 201, 125, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText("4000");
		
		JLabel label_5 = new JLabel("\u7F8E\u5143");
		label_5.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_5.setBounds(326, 204, 72, 18);
		contentPane.add(label_5);
		
		button = new JButton("\u8BA1\u7B97\u7ED3\u679C");
		button.setFont(new Font("华文行楷", Font.PLAIN, 24));
		button.setBackground(Color.ORANGE);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//获取输入数据
				String s_year = textField_6.getText();	
				String s_number = textField.getText();
				String s_order = textField_1.getText();
				String s_salary = textField_2.getText();
				
				if(s_year!=null && s_number!=null && s_order!=null && s_salary!=null) {
					int year=1985;
					int number=16;
					int order=10;
					double salary=4000;
					
					try {
						year = Integer.parseInt(s_year);
					} catch (Exception e) {
						e.printStackTrace();
						textField_6.setText("请输入一个整数(年份)");
					}
					
					try {
						number = Integer.parseInt(s_number);
					} catch (Exception e) {
						e.printStackTrace();
						textField.setText("请输入一个整数(字长)");
					}
					
					try {
						order = Integer.parseInt(s_order);
					} catch (Exception e2) {
						e2.printStackTrace();
						textField_1.setText("请输入一个整数");
					}
					
					try {
						salary = Integer.parseInt(s_salary);
					} catch (Exception e2) {
						e2.printStackTrace();
						textField_2.setText("请输入一个整数");
					}
					
					
					long need = (long) (4080*Math.pow(Math.E, 0.28*(year-1960)));
					long price = (long) (0.003*number*Math.pow(0.72, year-1974)*need);
					long cost = (long) (need*salary/(order*20));
					
					textField_3.setText(new Long(need).toString());
					textField_4.setText(new Long(price).toString());
					textField_5.setText(new Long(cost).toString());
				}
			}
		});
		button.setBounds(111, 249, 149, 45);
		contentPane.add(button);
		
		JLabel label_6 = new JLabel("\u9700\u6C42\u4F30\u8BA1");
		label_6.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_6.setBounds(0, 310, 96, 18);
		contentPane.add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("华文行楷", Font.PLAIN, 15));
		textField_3.setBounds(111, 307, 224, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText("4474263");
		
		JLabel label_7 = new JLabel("\u5B58\u50A8\u5668\u4EF7\u683C");
		label_7.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_7.setBounds(0, 367, 114, 18);
		contentPane.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("华文行楷", Font.PLAIN, 15));
		textField_4.setBounds(111, 364, 224, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);	
		textField_4.setText("5789");
		
		JLabel label_8 = new JLabel("\u6210\u672C");
		label_8.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_8.setBounds(14, 426, 72, 18);
		contentPane.add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("华文行楷", Font.PLAIN, 15));
		textField_5.setBounds(111, 423, 224, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setText("8948400");
		
		textField_6 = new JTextField();	
		textField_6.setToolTipText("");
		textField_6.setFont(new Font("华文行楷", Font.PLAIN, 15));
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				String s_year = textField_6.getText();
				try {
					@SuppressWarnings("unused")
					int year = Integer.parseInt(s_year);
				} catch (Exception e) {
					e.printStackTrace();
					textField_6.setText("请输入一个整数(年份)");
				}
			}
		});
		textField_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				String s_year = textField_6.getText();
				try {
					@SuppressWarnings("unused")
					int year = Integer.parseInt(s_year);
				} catch (Exception e) {
					e.printStackTrace();
					textField_6.setText("请输入一个整数(年份)");
				}
			}
		});
		textField_6.setBounds(110, 45, 193, 24);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setText("1985");
		
		JLabel label_9 = new JLabel("\u5B57");
		label_9.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_9.setBounds(349, 310, 72, 18);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u7F8E\u5143");
		label_10.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_10.setBounds(349, 367, 72, 18);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("\u7F8E\u5143");
		label_11.setFont(new Font("华文行楷", Font.PLAIN, 21));
		label_11.setBounds(349, 426, 72, 18);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\u8BD5");
		label_12.setForeground(Color.RED);
		label_12.setBackground(Color.WHITE);
		label_12.setFont(new Font("华文行楷", Font.PLAIN, 45));
		label_12.setBounds(496, 114, 72, 41);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("\u8BD5");
		label_13.setForeground(Color.ORANGE);
		label_13.setFont(new Font("华文行楷", Font.PLAIN, 45));
		label_13.setBounds(481, 168, 72, 41);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("\u4FEE");
		label_14.setForeground(Color.BLUE);
		label_14.setFont(new Font("华文行楷", Font.PLAIN, 45));
		label_14.setBounds(466, 215, 72, 50);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("\u6539");
		label_15.setForeground(Color.GREEN);
		label_15.setFont(new Font("华文行楷", Font.PLAIN, 45));
		label_15.setBounds(448, 266, 72, 50);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("\u6570");
		label_16.setForeground(Color.MAGENTA);
		label_16.setFont(new Font("华文行楷", Font.PLAIN, 45));
		label_16.setBounds(426, 313, 72, 52);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("\u636E");
		label_17.setForeground(Color.PINK);
		label_17.setFont(new Font("华文行楷", Font.PLAIN, 45));
		label_17.setBounds(400, 367, 72, 58);
		contentPane.add(label_17);
	}
}
