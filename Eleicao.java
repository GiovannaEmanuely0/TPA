import java.util.Scanner;
public class Eleicao {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	double e, a, i;
	
	System.out.println("Escreva o ano da elei��o");
	e = ler.nextDouble();
	
	System.out.println("Escreva o ano do seu nascimento");
	a = ler.nextDouble();
	
	i = e-a;
	System.out.println("Sua idade neste ano ser� "+i);
	
	if(i>16) {
		System.out.println("Voc� poder� votar");
	} else {
		System.out.println("Voc� n�o poder� votar");
	}
	
	ler.close();
}
}
