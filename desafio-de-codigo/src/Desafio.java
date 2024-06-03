import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        // Lé os valores de entrada:
        Scanner leitotorDeEntrada = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        float valorSalario = leitotorDeEntrada.nextFloat();
        System.out.println("Agora seu beneficio:");
        float valorBeneficios = leitotorDeEntrada.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } if (valorSalario >= 0 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));    
    }
}
