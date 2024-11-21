package listaComplementarVetor;
import java.util.Scanner;
public class PrimoVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 10;
		int naoPrimo=0, a[];
		a = new int [TAM];
		
		for(int j=0;j<TAM;j++) {
			System.out.println("Insira um numero");
			a[j] = Scanner.nextInt();
			for(int i=2;i<=a[j]/2;i++) {
				if(a[j]%i==0) {
					naoPrimo=naoPrimo+1;
					break;
				}
			}
			
			if(naoPrimo>=1) {
				System.out.println(a[j]+" Não é numero primo");
			}else {
				System.out.println(a[j]+" é um numero primo");
			}
		}
		
		
		
		Scanner.close();
	}

}
