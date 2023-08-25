package scientificCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ScientificCalculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
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
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 335, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 302, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 39, 302, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 134, 58, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(10, 182, 58, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x^y");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(10, 230, 58, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("x^3");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Double.parseDouble(textField.getText());
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(10, 278, 58, 48);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("x^2");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Double.parseDouble(textField.getText());
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(10, 326, 58, 48);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("n!");
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(10, 374, 58, 48);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlusMinus.setBounds(10, 422, 58, 48);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.setBounds(71, 134, 58, 48);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_1 = new JButton("Log");
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(71, 182, 58, 48);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPercent.setBounds(71, 230, 58, 48);
		frame.getContentPane().add(btnPercent);
		
		final JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(71, 278, 58, 48);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);	
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(71, 326, 58, 48);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(71, 374, 58, 48);
		frame.getContentPane().add(btn1);
		
		JButton btnNewButton_8 = new JButton("Sin");
		btnNewButton_8.setEnabled(false);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_8.setBounds(132, 134, 58, 48);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_1_2 = new JButton("Sinh");
		btnNewButton_1_2.setEnabled(false);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_1_2.setBounds(132, 182, 58, 48);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(132, 230, 58, 48);
		frame.getContentPane().add(btnClear);
		
		final JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(132, 278, 58, 48);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(132, 326, 58, 48);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(132, 374, 58, 48);
		frame.getContentPane().add(btn2);
		
		final JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(71, 422, 119, 48);
		frame.getContentPane().add(btn0);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCos.setBounds(193, 134, 58, 48);
		frame.getContentPane().add(btnCos);
		
		JButton btnNewButton_1_3 = new JButton("Cosh");
		btnNewButton_1_3.setEnabled(false);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_1_3.setBounds(193, 182, 58, 48);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnBackSpace.setBounds(193, 230, 58, 48);
		frame.getContentPane().add(btnBackSpace);
		
		final JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(193, 278, 58, 48);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(193, 326, 58, 48);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(193, 374, 58, 48);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDot.setBounds(193, 422, 58, 48);
		frame.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTan.setBounds(254, 134, 58, 48);
		frame.getContentPane().add(btnTan);
		
		JButton btnNewButton_1_4 = new JButton("Tanh");
		btnNewButton_1_4.setEnabled(false);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1_4.setBounds(254, 182, 58, 48);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(254, 230, 58, 48);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSub.setBounds(254, 278, 58, 48);
		frame.getContentPane().add(btnSub);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setEnabled(false);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiply.setBounds(254, 326, 58, 48);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivide.setBounds(254, 374, 58, 48);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation=="+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result = (first/100) * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x^y") {
					double r = 1;
					for(int i=0; i<second; i++) {
						r = r*first;
					}
					result = r;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}



			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEqual.setBounds(254, 422, 58, 48);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnPercent.setEnabled(true);
				
				btnClear.setEnabled(true);
				btnBackSpace.setEnabled(true);
				
				btnEqual.setEnabled(true);
				
				btnPlusMinus.setEnabled(true);
				btnNewButton_5.setEnabled(true);
				btnNewButton_4.setEnabled(true);
				btnNewButton_3.setEnabled(true);
				btnNewButton_2.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnNewButton.setEnabled(true);
				
				btnNewButton_7.setEnabled(true);
				btnNewButton_8.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnNewButton_1_1.setEnabled(true);
				btnNewButton_1_2.setEnabled(true);
				btnNewButton_1_3.setEnabled(true);
				btnNewButton_1_4.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT) ;
		rdbtnNewRadioButton.setBounds(10, 107, 50, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnDivide.setEnabled(false);
				btnMultiply.setEnabled(false);
				btnPercent.setEnabled(false);
				
				btnClear.setEnabled(false);
				btnBackSpace.setEnabled(false);
				
				btnEqual.setEnabled(false);
				
				btnPlusMinus.setEnabled(false);
				btnNewButton_5.setEnabled(false);
				btnNewButton_4.setEnabled(false);
				btnNewButton_3.setEnabled(false);
				btnNewButton_2.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton.setEnabled(false);
				
				btnNewButton_7.setEnabled(false);
				btnNewButton_8.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnNewButton_1_1.setEnabled(false);
				btnNewButton_1_2.setEnabled(false);
				btnNewButton_1_3.setEnabled(false);
				btnNewButton_1_4.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnOff.setBounds(71, 107, 50, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}
