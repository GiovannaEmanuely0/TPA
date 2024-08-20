import java.util.Scanner;
public class Quantidade {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		int m, f, salgado, doces, gramas, litros;
		
		System.out.println("Insira a quantidade de convidados do sexo masculino");
		m = ler.nextInt();
		
		System.out.println("Insira a quantidade de convidadas do sexo feminino");
		f = ler.nextInt();
		
		salgado = m*15+f*10;
		doces = m*6+f*8;
		gramas = (m*100+f*100)/1000;
		litros = (m*600+f*500)/1000;
		
	
		System.out.println("A quantidade de salgados �: "+salgado+", a quatidade de doces �: "+doces+", em quilos �: "+gramas+" e em litros: "+litros);

		ler.close();
	}

}
