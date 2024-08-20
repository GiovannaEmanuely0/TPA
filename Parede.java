import java.util.Scanner;
public class Parede {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		//declaração de variáveis
		double largura, comprimento, area, baldes;
		
		System.out.println("Coloque a largura da parede:");
		largura = ler.nextDouble();
		
		System.out.println("Coloque o comprimento da parede:");
		comprimento = ler.nextDouble();
		
		area = largura*comprimento;
		baldes = area/3.8;
		
		System.out.println("Você precisará de "+baldes +" baldes para pintar a parede. ");
		ler.close();
		
	}

}
