package listaComplementarVetor;
import java.util.Scanner;
public class Binarios {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[] = new int [TAM];
		int b[] = new int [TAM];
		
		for(int i=0;i<TAM;i++) {
			System.out.println("Insira o valor do vetor:");
			a[i] = in.nextInt();
			
			if(a[i]%2==0) {
				b[i] = 1;
			}else {
				b[i] = 0;
			}
		}
		
		System.out.print("B = [");
		for(int i=0;i<TAM;i++) {
			if(i<TAM-1) {
				System.out.print(b[i]+", ");
			}else {
				System.out.print(b[i]);
			}
		}
		System.out.println("]");

		in.close();
	}

}
