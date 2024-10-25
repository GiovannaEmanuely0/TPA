import java.util.Scanner;
public class Esfera {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		double pi = 3.14159;
		double r = Scanner.nextDouble();
		double volume = (4.0/3)*pi*(r*r*r);
		
		System.out.printf("VOLUME = %.3f%n",volume);
		
		Scanner.close();
	}

}
