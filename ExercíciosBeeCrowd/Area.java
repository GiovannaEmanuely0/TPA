import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
	Scanner Scanner = new Scanner(System.in);
	
	double pi = 3.14159;
	
	double a = Scanner.nextDouble();
	double b = Scanner.nextDouble();
	double c = Scanner.nextDouble();
	
	double tri = (a*c)/2;
	double cir = (c*c)*pi;
	double tra = (a+b)*c/2;
	double qua = b*b;
	double ret = a*b;
	
	System.out.printf("TRIANGULO: %.3f%n",tri);
	System.out.printf("CIRCULO: %.3f%n",cir);
	System.out.printf("TRAPEZIO: %.3f%n",tra);
	System.out.printf("QUADRADO: %.3f%n",qua);
	System.out.printf("RETANGULO: %.3f%n",ret);
	
	Scanner.close();
	}

}
