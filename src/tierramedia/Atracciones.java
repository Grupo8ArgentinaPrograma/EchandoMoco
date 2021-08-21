package tierramedia;

public enum Atracciones {

	MORIA(10, 2, 6, TipoAtraccion.AVENTURA), MINAS_TIRITH(5, 2.5, 25, TipoAtraccion.PAISAJE),
	LA_COMARCA(4, 6.5, 150, TipoAtraccion.DEGUSTACION), MORDOR(25, 3, 4, TipoAtraccion.AVENTURA),
	ABISMO_DE_HELM(5, 2, 15, TipoAtraccion.PAISAJE), LOTHORIEN(35, 1, 30, TipoAtraccion.DEGUSTACION),
	EREBOR(12, 3, 32, TipoAtraccion.PAISAJE), BOSQUE_NEGRO(3, 4, 12, TipoAtraccion.AVENTURA);

	private int costo;
	private double tiempo;
	private int cupo;
	private TipoAtraccion tipoAtraccion;

	private Atracciones(int costo, double tiempo, int cupo, TipoAtraccion tipo) {
		this.costo = costo;
		this.tiempo = tiempo;
		this.cupo = cupo;
		this.tipoAtraccion = tipo;
	}

	public int getCosto() {
		return costo;
	}

	public double getTiempo() {
		return tiempo;
	}

	public int getCupo() {
		return cupo;
	}

	public TipoAtraccion getTipoAtraccion() {
		return tipoAtraccion;
	}

	@Override
	public String toString() {
		return "Atraccion [ " + this.name() + " | Costo: " + costo + " | Tiempo recorrido: " + tiempo + " |"
				+ " Cupo diario: " + cupo + " | Tipo de atraccion: " + tipoAtraccion + " ]";

	}

}
