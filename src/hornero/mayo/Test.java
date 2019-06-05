package hornero.mayo;

public class Test {

	public static int fibo(int pos) {
		int valor;

		if (pos == 1) {
			valor = 1;
		} else if (pos == 2) {
			valor = 1;
		} else {
			valor = fibo(pos - 1) + fibo(pos - 2);
		}

		return valor;

	}

	public static void main(String[] args) {
		int num = 5;

		System.out.println(fibo(num));
	}
}
