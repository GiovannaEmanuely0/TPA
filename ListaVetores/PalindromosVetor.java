package listaComplementarVetor;
import java.util.Scanner;
public class PalindromosVetor {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 10;
		int a[] = new int [TAM];
		int i;
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um numero");
			a[i] = Scanner.nextInt();
		}
		

			if(a[0]==a[9] && a[1]==a[8] && a[2]==a[7] && a[3]==a[6] && a[4]==a[5]) {
				System.out.println("eh palindromo");
				
			}else {
				System.out.println("Nao eh palindromo");
				
			}
	
			Scanner.close();
	}

}
