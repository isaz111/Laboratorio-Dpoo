package uniandes.dpoo.aerolinea.modelo;

import java.util.Map;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String, Tiquete> tiquete;
	
	
	public String getFecha() {
		return fecha;
	}
	public Avion getAvion() {
		return avion;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public Map<String, Tiquete> getTiquete() {
		return tiquete;
	}
	
}
