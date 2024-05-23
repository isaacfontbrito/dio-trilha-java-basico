public class ExemploBreakContinue {
    public static void main(String[] args) {
        for ( int numero =1; numero <=5; numero ++) {
            if (numero == 3)
                    //break; // para a aplicação 
                    continue;// mudou o fluxo não para a aplicação
            System.out.println(numero);
        }
    }
}
