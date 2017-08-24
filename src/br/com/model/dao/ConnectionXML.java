package br.com.model.dao;


public class ConnectionXML{

	private static ConnectionXML instancia = null;
	
	private ConnectionXML() {}
	
	
	
	public static synchronized ConnectionXML getConnectionXML() {
		if(instancia == null) {
			return instancia = new ConnectionXML();
		}else {return instancia;}
		
	}

}
