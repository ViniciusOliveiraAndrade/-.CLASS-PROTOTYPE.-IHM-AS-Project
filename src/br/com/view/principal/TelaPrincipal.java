package br.com.view.principal;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TelaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;

	private PainelPrincipal painelPrincipal;
	
	public TelaPrincipal() {
		this.setSize(980,733);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setOpacity(0.0f);
		this.setIconImage(new ImageIcon(getClass().getResource("/Icon.png")).getImage());
		this.painelPrincipal = new PainelPrincipal(this.getSize());
		this.setContentPane(painelPrincipal);

		this.setVisible(true);
	}
}
