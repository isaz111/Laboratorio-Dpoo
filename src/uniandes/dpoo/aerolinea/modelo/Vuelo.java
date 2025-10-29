package uniandes.dpoo.aerolinea.modelo;

import java.util.HashMap;
import java.util.Map;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String, Tiquete> tiquete;
	
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		super();
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
		this.tiquete = new HashMap<String, Tiquete>();;
	}
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
