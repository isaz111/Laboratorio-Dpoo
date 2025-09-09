package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    private String horaSalida;
    private String horaLlegada;
    private String codigoRuta;
    private Aeropuerto destino;
    private Aeropuerto origen;

    public Ruta(String horaSalida, String horaLlegada, String codigoRuta, Aeropuerto destino, Aeropuerto origen) {
		super();
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
		this.destino = destino;
		this.origen = origen;
	}

	public String getHoraSalida() {
		return horaSalida;
	}


	public String getHoraLlegada() {
		return horaLlegada;
	}


	public String getCodigoRuta() {
		return codigoRuta;
	}


	public Aeropuerto getDestino() {
		return destino;
	}


	public Aeropuerto getOrigen() {
		return origen;
	}
	
	public int getDuracion() {
		int hora1 = getHoras(horaSalida);
		int hora2 = getHoras(horaLlegada);
		
		int min1 = getMinutos(horaSalida);
		int min2 = getMinutos(horaLlegada);
		
		int horaDuracion = hora1 - hora2;
		int minDuracion = min1 - min2;
		
		return horaDuracion + (minDuracion/60);
	}


	/**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
