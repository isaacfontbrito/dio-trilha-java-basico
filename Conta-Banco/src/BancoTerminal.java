import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        // TUDO: Conhecer e inportar a classe scanner.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
            
            String nome = "Isaac Brito";
            double conta = 10529; 
            double saldo = 237.48;

            //Exibir as mensagens para o nosso usuário
            System.out.println("Por favor, digite o numero da Agéncia !");
            String numero = "1021";
            System.out.println("Usuario: " + numero + "(depois ENTER para o proximo campo)");
            String agencia = scanner.next();
            
            //Exibir a mensagem conta criada
            System.out.println( "Olá " + nome + ", "+ "obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + "," + " conta " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque!");
    }
}
