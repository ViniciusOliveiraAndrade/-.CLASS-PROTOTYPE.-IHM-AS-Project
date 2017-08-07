package br.com.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TQualNome extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextField textField;

	public TQualNome() {
		getContentPane().setBackground(Color.WHITE);
		setSize(720,480);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(236, 11, 200, 198);
		getContentPane().add(panel);
		
		JLabel lblQuaO = new JLabel("Qua \u00E9 o nome do animal: ");
		lblQuaO.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuaO.setBounds(24, 315, 265, 82);
		getContentPane().add(lblQuaO);
		
		textField = new JTextField();
		textField.setBounds(256, 339, 180, 41);
		getContentPane().add(textField);
		textField.setColumns(10);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}


	public static void main(String[] args) {
		new TQualNome();
	}
}
