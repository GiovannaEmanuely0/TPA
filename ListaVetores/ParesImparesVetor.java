package listaComplementarVetor;
import java.util.Scanner;
public class ParesImparesVetor {

	public static void main(String[] args) {
		 Scanner Scanner = new Scanner(System.in);
		 
		 final int TAM = 10;
		 int a[] = new int [TAM];
		 int b[]=new int[TAM];
		 
		 for(int i=0;i<TAM;i++) {
			 System.out.println("Insira o numero");
			 a[i] = Scanner.nextInt();
		}
		 
		 System.out.print("B PARES = [");
		 for(int i=0;i<TAM;i++) {
			 if(a[i]%2==0) {
				 b[i] = a[i];
				 System.out.print(b[i]+" - ");
			 }
		 }
		 System.out.print("ÍMPARES:");
		 for(int i=0;i<TAM;i++) {
			 if(a[i]%2!=0) {
				 b[i] = a[i];
				 if(i<TAM-2) {
					 System.out.print(b[i]+" - ");
				 }else {
					 System.out.print(b[i]);
				 }
			 }
		 }
		System.out.println("]");
		 Scanner.close();
		 
	}

}
