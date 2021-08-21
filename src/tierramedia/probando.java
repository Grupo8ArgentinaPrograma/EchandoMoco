package tierramedia;

public class probando {

	public static void main(String[] args) {

		Usuario u1 = new Usuario(70, 10, TipoAtraccion.AVENTURA);
		Atracciones[] primera = Sugerencias.hacerSugerencia(u1);
		
	}

}
