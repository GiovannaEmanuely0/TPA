import java.util.Scanner;
public class Potencia {

	public static void main(String[] args) {
		Scanner gg = new Scanner(System.in);
		
		System.out.println("Insira a base da potencia");
		int b = gg.nextInt();
		
		System.out.println("Insira o expoente da potencia");
		int e = gg.nextInt();
		
		int i=1, potencia = 1;
		
		while(i<=e) {
			potencia = potencia*b;
			i++;
		}
		System.out.println("A potencia de "+b+" ^ "+e+" = "+potencia);

		
		gg.close();

	}

}
