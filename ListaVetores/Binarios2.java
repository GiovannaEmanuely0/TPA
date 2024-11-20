package listaComplementarVetor;
import java.util.*;
public class Binarios2 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 5;
		int a[] = new int[TAM];
		int b[] = new int[TAM];
		int c[] = new int[TAM];
		
		for(int i=0;i<TAM;i++) {
			System.out.println("Insira um numero:");
			a[i] = Scanner.nextInt();
		}
		
		for(int i=0;i<TAM;i++) {
			System.out.println("Insira um numero:");
			b[i] = Scanner.nextInt();
		}
		
		for(int i=0;i<TAM;i++) {
			if(a[i]>b[i]) {
				c[i] = 1;
			}else if(a[i]==b[i]) {
				c[i] = 0;
			}else {
				c[i] = -1;
			}
		}
		
		System.out.print("C = [");
		for(int i=0;i<TAM;i++) {
			if(i<TAM-1) {
				System.out.print(c[i]+", ");
			}else {
				System.out.print(c[i]);
			}
		}
		System.out.println("]");
		
		Scanner.close();
	}

}
