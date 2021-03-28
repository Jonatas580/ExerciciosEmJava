package factorial;

public class Factorial {

	public void calcularFactorial(int valor) {
		int factorial = 1;

		for (int i = 2; i <= valor; i++) {
			factorial = factorial * i;
		}

		System.out.println("Factorial de é : " + factorial);

	}

}
