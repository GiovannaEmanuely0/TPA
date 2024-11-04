import java.util.*;
public class Qquadrado {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM=10;
		int a[] = new int [TAM];
		int b[] = new int [TAM];
		
		//Lendo o a
		for(int i=0;i<TAM;i++) {
			System.out.println("Insira os elementos do vetor a[]");
			a[i] = Scanner.nextInt();
			b[i] = a[i]*a[i];
		}
		
		System.out.print("A = [");
		for( int i=0;i<TAM;i++) {
			if(i < 9) {
				System.out.print(a[i]+", ");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.println("]");
		
		System.out.print("B = [");
		for( int i=0;i<TAM;i++) {
			if(i < 9) {
				System.out.print(b[i]+", ");
			}else {
				System.out.print(b[i]);
			}
		}
		System.out.print("]");
		
		Scanner.close();
	}

}
