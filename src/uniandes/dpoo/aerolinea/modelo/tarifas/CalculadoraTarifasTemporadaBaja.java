package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {

	protected int COSTO_POR_KM_CORPORATIVO = 600;
	
	protected int COSTO_POR_KM_NATURAL = 900;
	
	protected double DESCUENTO_GRANDES = 0.02;
	
	protected double DESCUENTO_MEDIANAS = 0.1;
	
	protected double DESCUENTO_PEQ = 0.2;
	
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		Ruta ruta = vuelo.getRuta();
		int costoBase = 0;
		int distancia = calcularDistanciaVuelo(ruta);
		if(cliente.getTipoCliente().contains("Natural")) {
			costoBase = COSTO_POR_KM_NATURAL*distancia;
		}
		else if(cliente.getTipoCliente().contains("Corporativo")) {
			 costoBase = COSTO_POR_KM_CORPORATIVO*distancia;
			
		}
		return costoBase;
	}

	@Override
	
	protected double calcularPorcentajeDescuento​(Cliente cliente) {
		double descuento = 0;
		if(cliente instanceof ClienteCorporativo) {
			ClienteCorporativo clienteComporativo = (ClienteCorporativo) cliente;
			if(clienteComporativo.getTipoCliente().equals("Grande")) {
				descuento = DESCUENTO_GRANDES;
			}
			if(clienteComporativo.getTipoCliente().equals("Mediana")) {
				descuento = DESCUENTO_MEDIANAS;
			}
			if(clienteComporativo.getTipoCliente().equals("Pequeña")) {
				descuento = DESCUENTO_PEQ;
			}
		}
		return descuento;
	}

}