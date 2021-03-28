import algoritimodeordenacao.BubbleSort;
import factorial.Factorial;
import multiplos.CalculaMultiplos;

public class VotosTotalEleitores {

	public static void main(String[] args) {

		Votos votos = new Votos();
		votos.calculaPercentualVotosValidos();
		votos.calculaPercentualVotosBrancos();
		votos.calculaPercentualVotosNulos();
		
		CalculaMultiplos calculaMultiplos = new CalculaMultiplos();
		calculaMultiplos.CalculaSomaDosMultiplos(10);
		
		Factorial factorial = new Factorial();
		factorial.calcularFactorial(5);
		
		int[] v = { 5, 3, 2, 4, 7, 1, 0, 6 };
		BubbleSort bs = new BubbleSort();
		bs.ordenar(v);
		for (int num : v) {
			System.out.println("Segue a ordenação do vetor: " + "[" + num + "]" + " ");
		}

		
		
		
	
		

	}

}
