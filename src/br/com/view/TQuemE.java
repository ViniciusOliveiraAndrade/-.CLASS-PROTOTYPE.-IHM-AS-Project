package br.com.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class TQuemE extends JFrame{
	private static final long serialVersionUID = 1L;
	public TQuemE() {
		getContentPane().setBackground(Color.WHITE);
		setSize(720,480);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(24, 11, 200, 198);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(252, 11, 200, 198);
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(480, 11, 200, 198);
		getContentPane().add(panel_2);
		
		JLabel lblQuemO = new JLabel("Quem \u00E9 o : Lion");
		lblQuemO.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuemO.setBounds(270, 316, 163, 69);
		getContentPane().add(lblQuemO);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}


	public static void main(String[] args) {
		new TQuemE();
	}
}
