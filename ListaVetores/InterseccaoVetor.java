package listaComplementarVetor;
import java.util.Scanner;
public class InterseccaoVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 3;
		int a[] = new int [TAM];
		int b[] = new int [TAM];
		int c[] = new int [TAM];

		//lendo a
		for(int i=0;i<TAM;i++) {
			System.out.println("Insira um valor");
			a[i] = Scanner.nextInt();
		}
		System.out.print("A = [");
		for(int i=0;i<TAM;i++){
			if(i<TAM-1) {
				System.out.print(a[i]+", ");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.println("]");
		//lendo b
		for(int j=0;j<TAM;j++) {
			System.out.println("Insira um valor");
			b[j] = Scanner.nextInt();
		}
		System.out.print("B = [");
		for(int j=0;j<TAM;j++){
			if(j<TAM-1) {
				System.out.print(b[j]+", ");
			}else {
				System.out.print(b[j]);
			}
		}
		System.out.println("]");
		
		System.out.println(" ");
		
		//fazendo c
		int inter = 0;
		
		for(int i=0;i<TAM;i++) {
			for(int j=0;j<TAM;j++) {
				if(a[i]==b[j]) {
					inter++;
					c[j] = a[i];
					
				}
			}
		}
		
		System.out.print("C = [");
		for(int j=0;j<inter;j++) {
			if(j<inter-1) {
				System.out.print(c[j]+", ");
			}else {
				System.out.print(c[j]);
			}
		}
		System.out.println("]");
		Scanner.close();
	}
}
