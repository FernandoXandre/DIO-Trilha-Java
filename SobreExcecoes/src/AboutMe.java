import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Qual seu nome?");
            String nome = scanner.next();
            
            System.out.println("Seu sobre nome?");
            String sobreNome = scanner.next();
            
            
            System.out.println("Qual sua idade?");
            int idade = scanner.nextInt();
        } catch (InputMismatchException err) {
            System.out.println("Erro: " + err.getMessage());
        }
        



    }
}
