package listaComplementarVetor;
import java.util.Scanner;
public class DivisoresVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 11;
		int a[] = new int [TAM];
		
		for(int i=1;i<TAM;i++) {
			System.out.println("Insira um numero");
			a[i]=Scanner.nextInt();
			
			System.out.print("DIVISORES = [");
			for(int j=1;j<=a[i];j++) {
				if(j%i == 0) {
					System.out.print(j+" - ");
				}
			}
			System.out.println("]");
		}
		
		
		Scanner.close();
	}

}
