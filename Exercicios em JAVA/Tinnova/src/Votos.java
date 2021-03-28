
public class Votos {

	private int totalEleitores =1000;
	private int votosValidos = 800;
	private int votosBrancos = 150;
	private int votosNulos = 50;
	
	public void calculaPercentualVotosValidos(){
		
		 double calculavoto = (votosValidos * 100) / totalEleitores;
		 System.out.println("Total votos Válidos : " + calculavoto);
	
	}
	
	public void calculaPercentualVotosBrancos(){
		
		 double calculavoto = (votosBrancos * 100) / totalEleitores;
		 System.out.println("Total votos brancos : " + calculavoto);
	
	}
	
	public void calculaPercentualVotosNulos(){
		
		 double calculavoto = (votosNulos * 100) / totalEleitores;
		 System.out.println("Total votos nulos: " + calculavoto);
	
	}
	
}
