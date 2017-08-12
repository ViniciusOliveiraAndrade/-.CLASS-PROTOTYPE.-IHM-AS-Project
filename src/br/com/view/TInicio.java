package br.com.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class TInicio extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton qualDesses;
	private JButton qualNome;
//	private JButton ;
	public TInicio() {
		getContentPane().setBackground(Color.WHITE);
		setSize(720,480);
		getContentPane().setLayout(null);
		
//		JButton btnApontePara = new JButton("Aponte para");
//		btnApontePara.setBounds(247, 144, 169, 56);
//		btnApontePara.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		getContentPane().add(btnApontePara);
		
		this.qualDesses = new JButton("Qual desses \u00E9 o ");
		this.qualDesses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.qualDesses.setBounds(247, 211, 169, 56);
		this.qualDesses.addKeyListener(this.getSair());
		getContentPane().add(this.qualDesses);
		
		this.qualNome = new JButton("Qual \u00E9 o nome");
		this.qualNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.qualNome.setBounds(247, 278, 169, 56);
		this.qualNome.addKeyListener(this.getSair());
		getContentPane().add(this.qualNome);
		
		addKeyListener(this.getSair());
		setUndecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TInicio();
	}
	
	public KeyAdapter getSair() {
		return new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
			}
		};
	}

}
