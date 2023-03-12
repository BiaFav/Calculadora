import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(161, 11, 111, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o valor 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 42, 175, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Digite o valor 2:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 84, 175, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Resultado:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(10, 131, 175, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(171, 47, 253, 20);
		contentPane.add(txtValor1);
		txtValor1.setColumns(10);
		
		txtValor2 = new JTextField();
		txtValor2.setColumns(10);
		txtValor2.setBounds(171, 90, 253, 20);
		contentPane.add(txtValor2);
		
		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(171, 137, 253, 20);
		contentPane.add(txtResultado);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtValor1.setText(null);
					txtValor2.setText(null);
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBounds(167, 227, 117, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(txtValor1.getText());
				int s2 = Integer.parseInt(txtValor2.getText());
				
				int soma = (s1+s2);
				
				txtResultado.setText(String.valueOf(soma));
			}
		});
		btnSoma.setBounds(32, 182, 89, 23);
		contentPane.add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sub1 = Integer.parseInt(txtValor1.getText());
				int sub2 = Integer.parseInt(txtValor1.getText());
				
				int subtracao = (sub1-sub2);
				
				txtResultado.setText(String.valueOf(subtracao));
			}
		});
		btnSubtracao.setBounds(131, 182, 89, 23);
		contentPane.add(btnSubtracao);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int mult1 = Integer.parseInt(txtValor1.getText());
				int mult2 = Integer.parseInt(txtValor2.getText());
				
				int multiplica = (mult1*mult2);
				
				txtResultado.setText(String.valueOf(multiplica));
			}
		});
		btnMult.setBounds(230, 182, 89, 23);
		contentPane.add(btnMult);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int div1 = Integer.parseInt(txtValor1.getText());
				int div2 = Integer.parseInt(txtValor2.getText());
				
				int divisao = (div1/div2);
				
				txtResultado.setText(String.valueOf(divisao));
			}
		});
		btnDivisao.setBounds(329, 182, 89, 23);
		contentPane.add(btnDivisao);
	}
}
