/** 
 * Um pouco de pratica usando usando scanner, 
 * for: estrutura de repetição, if/else condição / controle de fluxo 
 * */

import java.util.Locale;
import java.util.Scanner; 
public class Pratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("[----------Sistema de Notas-----------] ");
        System.out.println("    E.E.M JOAQUIM BASTOS GONSALVES      ");
        for (int nome = 1; nome <= 5; nome++) {
            
            System.out.println("Digite seu nome: ");
            String nomes = scanner.next();
            System.out.println("Digite sua nota: ");
            double nota = scanner.nextDouble();

            if (nota >= 7) {
                System.out.println("Olá "+ nomes + " sua nota é de "  + nota + " Parabens [APROVADO]");
            } else if (nota > 5 && nota <= 7) {
                System.out.println("Olá "+ nomes + " sua nota é de " + nota + " Voçê esta em [RECUPERAÇÃO]" );
                System.out.println("As provas de recuperação estaram disponiveis em 15 dias!!!");
            } else
                System.out.println("Olá "+ nomes + " sua nota é de " + nota + " Sua nota esta abaixo do desejado estude mais [REPROVADO]");
            
            double media = (nota * 2) / 2;
            
            System.out.println("A sua Media final é de " + media); 
        }
        
            
        System.out.println("Gostou do nosso sistema? Digite 1 ou 2 ");
        int SimOuNao = scanner.nextInt();
        if (SimOuNao == 1) {
            System.out.println("Obrigado fico feliz que gostou. Quer deixar seu feedback? Digite 1 ou 2 para enserrar");
                
        }else if ( SimOuNao == 2) { 
            System.out.println("Que pena não gostou, mas qualquer duvida so entrar em contato tenha um otimo dia ou noite se for o caso");
        }
        int feedback = scanner.nextInt();
        if (feedback == 1) {
            System.out.println("Digite Aqui Seu Feedback:");
            String textoFeedback = scanner.next();
            System.out.println("Obrigado por seu feedback!!!");
        } else if (feedback == 2) 
         System.out.println("Fim");
            
    }
}
            