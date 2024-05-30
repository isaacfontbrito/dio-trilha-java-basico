import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numeroMenor = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numeroMaior = scanner.nextInt();

        try {
            contar(numeroMenor, numeroMaior);
            
            
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        

    }
    static void contar(int numeroMenor, int numeroMaior) throws ParametrosInvalidosException{
        if(numeroMenor > numeroMaior) {
            throw new ParametrosInvalidosException();
        }else {
         
            int contagem = numeroMaior - numeroMenor;
            for(int contador = 1; contador <= contagem; contador++){
                System.out.println("Imprimir o número " + contador);
            }
        }
        
    }

}
