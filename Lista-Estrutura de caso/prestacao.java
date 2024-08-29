import java.util.Scanner;
public class prestacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d;
        double p, jurus, multa, total;

        System.out.println("Insira o valor da prestacao:");
        p = in.nextDouble();

        System.out.println("Insira os dias de atraso:");
        d = in.nextInt();

        if (d > 45){
            multa = p*3/100;
            jurus = (p*0.01/100)*d;
            total = p+multa+jurus;
            System.out.println("O valor atualizado da prestacao: R$"+total);
        }else{
            multa = p*2/100;
            jurus = (p*0.01/100)*d;
            total = p+multa+jurus;
            System.out.println("O valor atualizado da prestacao: R$"+total);
        }
        in.close();
    }    
}
    
