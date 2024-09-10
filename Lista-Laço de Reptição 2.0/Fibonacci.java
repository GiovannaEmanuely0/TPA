import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner gg = new Scanner(System.in);
		
		int anterior = 0, atual = 1, sucessor, i = 2;
		
		System.out.println("Insira o termo para saber a serie");
		int n = gg.nextInt();
		
		while(i<=n) {
			sucessor = anterior+atual;
			anterior = atual;
			atual = sucessor;
			
			i++;
			System.out.print(sucessor+" , ");
		}
		gg.close();
	}

}
