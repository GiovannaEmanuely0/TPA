package listaComplementarVetor;
import java.util.Scanner;
public class BuscaVetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[] = new int [TAM];
		int x, igual=0;
		
		for (int i=0;i<TAM;i++) {
			System.out.println("Insira um valor:");
			a[i] = in.nextInt();
		}
		System.out.println("Insira um valor de busca:");
		x = in.nextInt();
		
		for(int i = 0; i<TAM; i++) {
			if(x==a[i]) {
				 igual++;
				 break;
			}
		}
		if(igual == 1) {
			System.out.println("O valor "+x+" esta armazenado em A[]");
		}else {
			System.out.println("O valor "+x+" não esta armazenado em A[]");
		}
		
		in.close();
	}

}
