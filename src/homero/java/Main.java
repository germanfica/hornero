package homero.java;

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

	public static String laImplementacion1(String[] losparametros) {
		System.err.println("Los parametros obtenidos son:" + losparametros[0]
				+ "," + losparametros[1]);
		String respuesta = "";
		int solucion = Integer.parseInt(losparametros[0])
				+ Integer.parseInt(losparametros[1]);
		respuesta = String.valueOf(solucion);

		return respuesta;
	}

	public static boolean esPar(int num) {
		return num % 2 == 0;
	}

	public static String laImplementacion2(String[] losparametros) {
		System.err.println("Los parametros obtenidos son:" + losparametros[0]
				+ "," + losparametros[1]);
		String respuesta = "";
		int solucion = 0;

		System.out.println("Longitud del arreglo" + losparametros.length);

		for (int i = 0; i < losparametros.length; i++) {
			int num = Integer.parseInt(losparametros[i].trim()); // Convierte el
																	// string a
																	// num

			if (!esPar(i)) {
				solucion = solucion + num;
			}
		}

		// int solucion = Integer.parseInt(losparametros[0])
		// +Integer.parseInt(losparametros[1]) ;
		respuesta = String.valueOf(solucion);

		return respuesta;
	}

	/*
	 * Verifica si un caracter es vocal
	 */
	public static boolean esVocal(char ch) {
		boolean respuesta;
		switch (Character.toLowerCase(ch)) {
		case 'a':
			respuesta = true;
			break;
		case 'e':
			respuesta = true;
			break;
		case 'i':
			respuesta = true;
			break;
		case 'o':
			respuesta = true;
			break;
		case 'u':
			respuesta = true;
			break;
		default:
			respuesta = false;
			break;
		}

		return respuesta;
	}

	/*
	 * Se tiene un arreglo de N caracteres y se necesita verificar si contiene
	 * alguna vocal, para ello deberá mostrar como respuesta el valor 1, si
	 * existe alguna vocal o cero en el caso contrario.Observación: se recibe un
	 * arreglo donde la posición 0 corresponde al N, las posiciones restantes
	 * corresponden a los elementos del arreglo.
	 */
	public static String laImplementacion3(String[] losparametros) {
		System.err.println("Los parametros obtenidos son:" + losparametros[0]
				+ "," + losparametros[1]);
		String respuesta = "";
		int i = 0;
		int solucion = 0;
		boolean salir = false;
		
		System.out.println("Longitud del arreglo" + losparametros.length);
		
		// Usar while
		while (!salir && i < losparametros.length) {
			char ch = losparametros[i].trim().charAt(0);
			if(esVocal(ch)){
				solucion = 1;
				salir = true;
			}
			i++;
		}
		
		respuesta = String.valueOf(solucion);

		return respuesta;
	}
	/*
	 * Se tiene un arreglo de N palabras y se necesita crear y mostrar una nueva palabra
	 * concatenando las iniciales de cada una de las palabras contenidas. Por ejemplo si
	 * el arreglo contiene: [“casa”,”automovil”, “día”] el resultado será la palabra “cad” .
	 * Observación: se recibe un arreglo donde la posición 0 corresponde al N, las posiciones
	 * restantes corresponden a los elementos del arreglo.
	 * */
	public static String laImplementacion4(String[] losparametros) {
		System.err.println("Los parametros obtenidos son:" + losparametros[0]
				+ "," + losparametros[1]);
		String respuesta = "";
		String solucion="";
		
		System.out.println("Longitud del arreglo" + losparametros.length);
		
		for (int i = 1; i < losparametros.length; i++) {
			solucion = solucion + losparametros[i].charAt(0);
		}
		
		respuesta = String.valueOf(solucion);

		return respuesta;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Editar!: con el valor del token
		String elTokenTorneo = "117f6dbd68ec604aa7a73bf4c13110ef";

		// Editar!: con el valor del problema
		String elNumeroProblema = "4";

		Torneo elTorneo = new Torneo(elTokenTorneo, elNumeroProblema);

		// Se recuperan los parametros para la implementacion
		String[] losParametros = elTorneo.recuperarParametrosProblema();

		// Se invoca a la implementacion que debe realizar para el torneo
		String resultado = Main.laImplementacion4(losParametros);

		System.err.println("Resultado de la implementacion:" + resultado);

		// La respuesta obtenida de su implementacion se envia al torneo
		String rta = elTorneo.recuperarRespuestaImplementacion(resultado);

		// Se visualizan los resultados de la solucion
		System.err.println("La respuesta del torneo es:" + rta);

	}

}
