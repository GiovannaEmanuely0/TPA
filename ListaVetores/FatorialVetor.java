package listaComplementarVetor;
import java.util.Scanner;
public class FatorialVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 15;
		int a[] = new int[TAM];
		int b[] = new int[TAM];
		
		for(int i=0;i<TAM;i++) {
			System.out.println("Insira um valor e saiba o fatorial:");
			a[i] = Scanner.nextInt();
			b[i] = 1;
			for(int j=a[i];j>0;j=j-1) {
				
				b[i] = b[i]*j;
			}
			System.out.println(a[i]+"="+b[i]);
		}
		System.out.print("A = [");
		for(int i=0;i<TAM;i++){
			if(a[i]<TAM) {
				System.out.print(a[i]+", ");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.println("]");
		System.out.print("FATORIAIS = [");
		for(int i=0;i<TAM;i++){
			if(b[i]<TAM) {
				System.out.print(b[i]+", ");
			}else {
				System.out.print(b[i]);
			}
		}
		System.out.println("]");
		Scanner.close();
	}

}
