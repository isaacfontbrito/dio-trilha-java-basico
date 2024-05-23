import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorALeatrorio();
            if (valorDoce > mesada) 
                valorDoce = mesada;
            
                System.out.println("Doce do valor: " + valorDoce + " Adiciona no  carrinho");
                mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
        /*
         * Não se preocupe quando a formatação de valores 
         * Iremos explorar os recursos de formatação em breve !!
         */
    }
    private static double valorALeatrorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
