package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {
	
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	
	public Tiquete (String codigo, int tarifa,Vuelo vuelo,Cliente cliente) {
		this.cliente = cliente;
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.vuelo = vuelo;
		this.usado = false;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public boolean esUsado() {
		return usado;
	}
	
	public void marcarComoUsado() {
		usado = true;
	}
	
}
