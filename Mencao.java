import java.util.Scanner;;
public class Mencao {

public static void main(String[] args) {
    Scanner gi = new Scanner(System.in);

    int a, quan, m;
    @SuppressWarnings("unused")
    double p;

    System.out.println("Insira o total de alunos na classe:");
    a = gi.nextInt();

    System.out.println("Insira a mencao:");
    m=gi.nextInt();

    switch (m) {
        case 1:
            System.out.println("quantidade de alunos com mencao MB");
            quan = gi.nextInt();
            p = quan*a/100;
            System.out.println(p);
            break;
        case 2:
            System.out.println("quantidade de alunos com mencao B");
            quan = gi.nextInt();
            p = quan*a/100;
            System.out.println(p);
            break;
        case 3:
            System.out.println("quantidade de alunos com mencao R");
            quan = gi.nextInt();
            p = quan*a/100;
            System.out.println(p);
            break;
        case 4:
            System.out.println("quantidade de alunos com mencao I");
            quan = gi.nextInt();
            p = quan*a/100;
            System.out.println(p);
            break;
        default:
            System.out.println("mencao invalida");
            break;
    }

    gi.close();
}
}
