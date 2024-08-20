import java.util.Scanner;
public class Dinheiro {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double s, d, r;
		
		System.out.println("Insira o valor do seu salário:");
		s = ler.nextDouble();
		
		System.out.println("Insira o valor total das suas dívidas:");
		d = ler.nextDouble();
		
		r = s-d;
		if(d<s) {
			System.out.println("Terá sobra do salário no valor de R$" +r);
		
		}else {
			System.out.println("Não terá resto do salário e irá faltar R$" +r);
			ler.close();
		}
	}
}
 