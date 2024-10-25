import java.util.*;
public class AreaDoCirculo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double raio, pi=3.14159, area;
		
		raio = in.nextDouble();
		area = pi*(raio*raio);
		System.out.printf("A=%.4f%n",area);
		
		in.close();

	}

}
