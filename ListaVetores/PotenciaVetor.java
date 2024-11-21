package listaComplementarVetor;
import java.util.Scanner;
public class PotenciaVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 11;
		int a[] = new int [TAM],potencia=1;
		
		for(int i=0;i<TAM;i++) {
			for(int j=1;j<=i;j++) {
				potencia=potencia*2;
			}
			a[i] = potencia;
			potencia = 1;
		}
		
		System.out.print("A = [");
		for(int i=0;i<TAM;i++) {
			if(i<TAM-1) {
				System.out.print(a[i]+" - ");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.println("]");
		
		Scanner.close();
	}

}
