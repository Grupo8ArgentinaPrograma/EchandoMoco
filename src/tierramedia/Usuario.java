package tierramedia;

public class Usuario {
	
	private double presupuesto;
	private double tiempoDisponible;
	private TipoAtraccion atraccionPreferida;
	
	public Usuario(double presupuesto, double tiempoDisponible, TipoAtraccion atraccionPreferida) {
		super();
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.atraccionPreferida = atraccionPreferida;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public double getTiempoDisponible() {
		return tiempoDisponible;
	}

	public void setTiempoDisponible(double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}

	public TipoAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}

	public void setAtraccionPreferida(TipoAtraccion atraccionPreferida) {
		this.atraccionPreferida = atraccionPreferida;
	}

}
