package br.com.view.abstrato;

import java.util.Observer;

public abstract class PainelFase extends PainelCentral{
		
	private static final long serialVersionUID = 1L;

	public PainelFase(Observer o, boolean audio) {
		super(o,audio);
	}
}
