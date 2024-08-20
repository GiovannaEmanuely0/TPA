import java.util.Scanner;
public class Euroi {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		double valor, euro, real;
		
		System.out.println("Insira o valor em Euro");
		valor = ler.nextDouble();
		
		System.out.println("Insira a cotação de Euro para Real");
		euro = ler.nextDouble();
		
		real = euro*valor;
		
		System.out.println("O valor em Reais é " +real);
		ler.close();
}
}
