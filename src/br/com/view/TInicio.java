package br.com.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class TInicio extends JFrame{
	private static final long serialVersionUID = 1L;
	public TInicio() {
		getContentPane().setBackground(Color.WHITE);
		setSize(720,480);
		getContentPane().setLayout(null);
		
//		JButton btnApontePara = new JButton("Aponte para");
//		btnApontePara.setBounds(247, 144, 169, 56);
//		btnApontePara.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		getContentPane().add(btnApontePara);
		
		JButton btnQue = new JButton("Qual desses \u00E9 o ");
		btnQue.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnQue.setBounds(247, 211, 169, 56);
		getContentPane().add(btnQue);
		
		JButton btnNewButton = new JButton("Qual \u00E9 o nome");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(247, 278, 169, 56);
		getContentPane().add(btnNewButton);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TInicio();
	}
}
