package hornero.mayo;

/*****************************************************************************
 * Esta es la clase que debe editar con la implementacion de su problema La
 * implementacion de su problema debe estar en: laImplementacion
 ********************************************/

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	/********************************************************************************************************************
	 * Este es el metodo que tiene que implementar En este caso los parametros
	 * son 2 y la operacion es la suman (OPERACION = 1)
	 * 
	 * *******/

	public static String laImplementacion(String[] losparametros) {
		System.err.println("Los parametros obtenidos son:" + losparametros[0]);
		String respuesta = "";
		int solucion = factorial(Integer.parseInt(losparametros[0]));
		respuesta = String.valueOf(solucion);

		return respuesta;
	}

	public static int factorial(int num) {
		int facto;

		if (num > 1) {
			facto = num * factorial(num - 1);

		} else if (num == 1) {
			facto = 1;
		} else {
			facto = 1;
		}
		return facto;
	}
	
	public static String laImplementacion1(String[] losparametros) {
		System.err.println("Los parametros obtenidos son:" + losparametros[0]);
		String respuesta = "";
		int solucion = tartamu(Integer.parseInt(losparametros[0]));
		respuesta = String.valueOf(solucion);

		return respuesta;
	}
	
	public static int tartamu(int num) {
		int tarta;
		if(num>10 && num%10==(num/10)%10) {
			tarta = 1;
		}else if (num<10) {
			tarta = 0;
		}else {
			tarta = tartamu(num/10);
		}
		return tarta;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Editar!: con el valor del token
		String elTokenTorneo = "c3444a8b9d90fdccb4ed6f546bfa6044";

		// Editar!: con el valor del problema
		String elNumeroProblema = "4";

		Torneo elTorneo = new Torneo(elTokenTorneo, elNumeroProblema);

		// Se recuperan los parametros para la implementacion
		String[] losParametros = elTorneo.recuperarParametrosProblema();

		// Se invoca a la implementacion que debe realizar para el torneo
		String resultado = Main.laImplementacion1(losParametros);

		System.err.println("Resultado de la implementacion:" + resultado);

		// La respuesta obtenida de su implementacion se envia al torneo
		String rta = elTorneo.recuperarRespuestaImplementacion(resultado);

		// Se visualizan los resultados de la solucion
		System.err.println("La respuesta del torneo es:" + rta);

	}

}
