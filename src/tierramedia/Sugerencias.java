package tierramedia;

public class Sugerencias {
	
	
	static public Atracciones[] hacerSugerencia(Usuario usuario) {
		Atracciones[] todasLasAtracciones = Atracciones.values();
		for (Atracciones atraccion : todasLasAtracciones) {
			if (        usuario.getPresupuesto() >= atraccion.getCosto() 
					&& usuario.getAtraccionPreferida() == atraccion.getTipoAtraccion() 
					&& usuario.getTiempoDisponible() >= atraccion.getTiempo()) 
				System.out.println(atraccion);	
		}
		return null;
	}			
}
	

