import java.util.Scanner;
public class ProdutoSimples {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A, B, PROD;
		
		A = in.nextInt();
		B = in.nextInt();
		PROD = A*B;
		
		System.out.println("PROD = "+PROD);
		
	}

}
