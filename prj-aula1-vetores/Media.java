import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		final int TAM = 10;
		
		int i, a[], soma, media;
		
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira os valores do vertor a");
			a[i] = Scanner.nextInt();
		}
		soma = a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
		media = soma/TAM;
		System.out.println("A media eh: "+media);
		
		Scanner.close();
		
	}
}
