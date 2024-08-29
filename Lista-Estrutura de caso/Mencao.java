import java.util.Scanner;
public class Mencao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int mb, b, r, i, total;
		String m;
		double p;
		
		System.out.println("Insira o total de alunos com nota MB");
		mb = ler.nextInt();
		
		System.out.println("Insira o total de alunos com nota B");
		b = ler.nextInt();
		
		System.out.println("Insira o total de alunos com nota R");
		r = ler.nextInt();
		
		System.out.println("Insira o total de alunos com nota I");
		i = ler.nextInt();
		
		total = mb+b+r+i;
		
		System.out.println("Insira a mencao para saber a porcentagem");
		m = ler.next();
		
		switch (m) {
		case "mb":
			p = mb*100/total;
			System.out.println("A porcentagem da mencao MB e: "+p+"%");
			break;
		case "b":
			p = b*100/total;
			System.out.println("A porcentagem da mencao B e: "+p);
			break;
		case "r":
			p = r*100/total;
			System.out.println("A porcentagem da mencao R e: "+p);
			break;
		case "i":
			p = i*100/total;
			System.out.println("A porcentagem da mencao I e: "+p);
			break;
			
		}

		ler.close();
	}

}
