import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        System.out.println("1 Depodistar");
        System.out.println("2 Sacar");
        System.out.println("3 Caonsultar Saldo");
        System.out.println("4 Emcerrar");
        while (continuar) {
            int opcao = scanner.nextInt();
         
            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito; 
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Saldo atual: " + saldo);
                    double saque = scanner.nextDouble();
                    if(saldo > saque) {
                        saldo -= saque;
                        System.out.println("Sado ");
                     } else if (saldo < saque)
                        System.out.println("Saldo insuficiente.");
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
