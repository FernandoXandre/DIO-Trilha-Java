import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Numero, nome, Agencia e saldo
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite sua agência: ");
        String agenciaCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        Double saldoCliente = scanner.nextDouble();

        // Exibir os dados na tela

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agenciaCliente + ", conta " + numeroConta + " e seu saldo de R$" + saldoCliente + " já está disponível para saque.");
    }
}
''