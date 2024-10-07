import java.util.Scanner;
public class SomaSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        
        int A, B, SOMA;
        
        A = in.nextInt();
        B = in.nextInt();
        
        SOMA = A+B;
        
        System.out.println("SOMA = "+SOMA);
       
        in.close();
	}

}
