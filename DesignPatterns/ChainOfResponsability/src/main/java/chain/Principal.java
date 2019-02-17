package chain;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CharHandler ch = new AHandler(new PointHandler(new SpaceHandler(null)));
		String frase = "aiiiia.  ";
		char letra = 'a';
		char letra2 = '.';
		char letra3 = ' ';
		System.out.println("Numero de A: " + ch.getStatistic(frase, letra));
		System.out.println("Numero de Pontos: "+ch.getStatistic(frase, letra2));
		System.out.println("Numero de Espaços: "+ch.getStatistic(frase, letra3));

		// System.out.println(ch.getStatistic("aaaa",'a'));
		

	}

}