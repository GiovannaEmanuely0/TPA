import java.util.Scanner;
public class Dinheiro {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double s, d, r;
		
		System.out.println("Insira o valor do seu sal�rio:");
		s = ler.nextDouble();
		
		System.out.println("Insira o valor total das suas d�vidas:");
		d = ler.nextDouble();
		
		r = s-d;
		if(d<s) {
			System.out.println("Ter� sobra do sal�rio no valor de R$" +r);
		
		}else {
			System.out.println("N�o ter� resto do sal�rio e ir� faltar R$" +r);
			ler.close();
		}
	}
}
 