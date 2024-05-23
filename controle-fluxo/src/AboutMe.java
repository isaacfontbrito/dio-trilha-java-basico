import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome =scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //Inprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toLowerCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos" + " e minha altura é " + altura + "cm ");
        scanner.close();   
        // tratamento de exeções com try e catch     
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numericos");
        }
    }
}
