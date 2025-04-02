import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int primeiroParametro = scan.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int segundoParametro = scan.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);

        } 
        catch (ParametrosInvalidosException e) {
            System.out.println("Erro");
        }
    }

    
    
    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 0; i < (segundoParametro - primeiroParametro); i++) {
                System.out.println(primeiroParametro + i);
            }
        }
    }
}
