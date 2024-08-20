import java.util.Scanner;
public class parOuimpar {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int num, i;
	System.out.println("Escreva o numero");
	num = ler.nextInt();
	
	i = num % 2;
	
	if(i==0) {
		System.out.println("O numero e par");
	} else {
		System.out.println("O numero e impar");
	}
	ler.close();
}
}
