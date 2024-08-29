import java.util.Scanner;
public class Cantina {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c;
		
		System.out.println("Insira o codigo do produto:");
		c = ler.nextInt();
		
		switch (c) {
		case 1:
			System.out.println("Cachorro quente R$8,00");
			break;
		case 2:
			System.out.println("CheeseBurger R$12,00");
			break;
		case 3:
			System.out.println("X-Salada R$15,00");
			break;
		case 4:
			System.out.println("Misto quente R$11,00");
			break;
		case 5:
			System.out.println("Pao na chapa R$6,00");
			break;
			default:
				System.out.println("codigo invalido");
				break;
		}
		
		ler.close();
	}

}
