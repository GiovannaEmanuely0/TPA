package listaComplementarVetor;
import java.util.Scanner;
public class ParesVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 10;
		int a[] = new int [TAM];
		
		for(int i=0;i<TAM;i++) {		
			System.out.println("Insira um numero");
			a[i] = Scanner.nextInt();
			
			System.out.print("PARES = [");
			for(int j=0;j<=a[i];j=j+2) {
				if(j<a[i]-1) {
					System.out.print(j+" - ");
				}else {
					System.out.print(j);
				}
			}
			System.out.println("]");
		}
		
		Scanner.close();
	}

}
