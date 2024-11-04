import java.util.*;
public class SomaVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 10;
		int a[] = new int[TAM];
		int b[] = new int[TAM];
		int c[] = new int[TAM];
		
		for(int i=0;i<TAM;i++) {
			System.out.print("Insira os valores do vetor a");
			a[i] = Scanner.nextInt();
		}
		
		for(int i=0;i<TAM;i++) {
			System.out.print("Insira os valores do vetor b");
			b[i] = Scanner.nextInt();
			c[i] = a[i]+b[i];
		}
		//apresentar os valores
		System.out.print("A = [");
		for(int i=0;i<TAM;i++) {
			if(i<9) {
				System.out.print(a[i]+", ");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.println("]");
		
		System.out.print("B = [");
		for(int i=0;i<TAM;i++) {
			if(i<9) {
				System.out.print(b[i]+", ");
			}else {
				System.out.print(b[i]);
			}
		}
		System.out.println("]");
		
		System.out.print("C = [");
		for(int i=0;i<TAM;i++) {
			if(i<9) {
				System.out.print(c[i]+", ");
			}else {
				System.out.print(c[i]);
			}
		}
		System.out.println("]");
		Scanner.close();
	}

}
