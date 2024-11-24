package listaComplementarVetor;
import java.util.Scanner;
public class SomatorioVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 10;
		int soma = 0, a[] = new int [TAM], b[]= new int[TAM];
		
		
		for(int i=0;i<TAM;i++) {
			System.out.println("Insira um numero");
			a[i] = Scanner.nextInt();
			for(int j=1;j<=a[i];j++) {
				soma = soma+j;
			}
			b[i] = soma;
			soma = 0;
		}
		
		System.out.print("SOMATORIO B = [");
		for(int i=0;i<TAM;i++){
			if(i<TAM-1) {
				System.out.print(b[i]+" - ");
			}else {
				System.out.print(b[i]);
			}
		}
		System.out.println("]");
		
		Scanner.close();
		
	}

}
