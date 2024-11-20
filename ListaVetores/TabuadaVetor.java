package listaComplementarVetor;
import java.util.*;
public class TabuadaVetor {

	public static void main(String[] args) {
		Scanner ge = new Scanner(System.in);
		final int TAM = 5;
		int a[] = new int[TAM];
		
		for(int i=0;i<TAM;i++) {
			System.out.println("Insira um numero e saiba a tabuada:");
			a[i] = ge.nextInt();
			for(int j=0;j<=10;j++) {
				int resultado =a[i]*j;
				System.out.println(a[i]+"x"+j+"="+resultado);
			}
		}
		ge.close();
	}

}
