package multiplos;

public class CalculaMultiplos {

	public void CalculaSomaDosMultiplos(int x) {

		int somaMult3 = 0;
		int somaMult5 = 0;

		for (int i = 0; i < x; i++) {
			if (i % 3 == 0) {
				somaMult3 = somaMult3 + i;
			}

			if (i % 5 == 0) {
				somaMult5 = somaMult5 + i;
			}

		}

		int total = somaMult3 + somaMult5;
		System.out.println("A soma dos multiplos de 3 e 5 são : " + total);
	}

}
