package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.Random;

public class ClienteNatural extends Cliente {
	
	public static String NATURAL = "Natural";
	private String nombre;
	
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public String getTipoCliente() {
		return NATURAL;
	}
	
	@Override 
	public String getIdentificador() {
		Random rand = new Random();
    	return String.valueOf(rand.nextInt(1000));
	}

}
