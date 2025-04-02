import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        System.out.println("qual seu saldo ?");

        Scanner scanner = new Scanner(System.in);
        double saldo = 25.0;
        
        double valorSolicitado = 17.0;
        
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println("Seu saldo é:" + saldo);
    }
}
