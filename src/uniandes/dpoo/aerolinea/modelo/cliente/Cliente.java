package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	private List<Tiquete> tiquetesSinUsar;
	private List <Tiquete> tiquetesUsados;
	
	public Cliente() {
		this.tiquetesSinUsar = new ArrayList<Tiquete>();
		this.tiquetesUsados = new ArrayList<Tiquete>();
	}
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes(){
		int valorTotal = 0;
		for ( Tiquete tiquete : tiquetesUsados) {
			valorTotal = valorTotal + tiquete.getTarifa(); 
		}
		return valorTotal;
	}
	 
	public void usarTiquetes (Vuelo vuelo) {
		int i = 0;
		for (Tiquete tiquete : tiquetesSinUsar) {
			if (tiquete.getVuelo().equals(vuelo)) {
				tiquetesSinUsar.remove(i);
				tiquetesUsados.add(tiquete);
			}
			i++;
		}
	}
}
