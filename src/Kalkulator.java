import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Kalkulator {
	
	private JFrame frame;
	private JButton btn6;
	
	public static int rez;
	public static int func;
	public static String temp = "";
	public static String display = "";
	
		
	public static int[] state = {-1,-1};
	
	//Metoda, za dodajanje st, ker se bo koda ponavljala
	public static void dodajStevilo(String func) {
		if(state[0]==-1) {
			state[0] = Integer.parseInt(temp);
			temp = "";
			display = func;
		}else if(state[1]==-1) {
			state[1] = Integer.parseInt(temp);
			temp = "";
			display = func;
		}
	}
	
	public static void preveriFunc() {
		if(display=="+" || display=="-" || display=="*" || display=="/") {
			display = "";
		}
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
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
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 295, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRez = new JLabel(display);
		lblRez.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblRez.setBounds(10, 11, 259, 100);
		frame.getContentPane().add(lblRez);		
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 0;
				display += "0";	
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn0.setBounds(10, 329, 194, 58);
		frame.getContentPane().add(btn0);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 7;
				display += "7";	
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn7.setBounds(10, 122, 58, 58);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 8;
				display += "8";	
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn8.setBounds(78, 122, 58, 58);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 9;
				display += "9";	
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn9.setBounds(146, 122, 58, 58);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 4;
				display += "4";				
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn4.setBounds(10, 191, 58, 58);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 5;
				display += "5";				
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn5.setBounds(78, 191, 58, 58);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 6;
				display += "6";	
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn6.setBounds(146, 191, 58, 58);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 1;
				display += "1";
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn1.setBounds(10, 260, 58, 58);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 2;
				display += "2";
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn2.setBounds(78, 260, 58, 58);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				preveriFunc();
				temp += 3;
				display += "3";
				lblRez.setText(display);
				System.out.println(temp);
			}
		});
		btn3.setBounds(146, 260, 58, 58);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dodajStevilo("+");
				func = 0;
				lblRez.setText(display);
			}
		});
		btnPlus.setBounds(211, 122, 58, 58);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dodajStevilo("-");
				func = 1;
				lblRez.setText(display);
			}
		});
		btnMinus.setBounds(211, 191, 58, 58);
		frame.getContentPane().add(btnMinus);
		
		JButton btnDeljenje = new JButton("/");
		btnDeljenje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dodajStevilo("/");
				func = 2;
				lblRez.setText(display);
			}
		});
		btnDeljenje.setBounds(211, 260, 58, 58);
		frame.getContentPane().add(btnDeljenje);
		
		JButton btnMnozenje = new JButton("*");
		btnMnozenje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dodajStevilo("*");
				func = 3;
				lblRez.setText(display);
			}
		});
		btnMnozenje.setBounds(211, 329, 58, 58);
		frame.getContentPane().add(btnMnozenje);
		
		JButton btnRez = new JButton("=");
		btnRez.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				state[1] = Integer.parseInt(temp);
				if(func==0) {
					rez = state[0] + state[1];	
					display = rez + "";
					rez = 0;
				}else if(func==1) {
					rez = state[0] - state[1];
					display = rez + "";
					rez = 0;
				}else if(func==2) {
					rez = state[0] / state[1];
					display = rez + "";
					rez = 0;
				}else if(func==3) {
					rez = state[0] * state[1];
					display = rez + "";
					rez = 0;
				}
				lblRez.setText(display);
			}
		});
		btnRez.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRez.setBounds(10, 398, 259, 58);
		frame.getContentPane().add(btnRez);
		
	}
}
