public class ResultadoEscolar {
    public static void main(String[] args) {
        //CONDIÇÃO COMPOSTA
        int nota = 10;
       
        if(nota >= 7)
         System.out.println("Aprovado");
        
         //Condicionas Encadeada
         else if (nota >=5 && nota <7)// true ou falce
         System.out.println("Prova de recuperação");
        
         else
         System.out.println("Reprovado");
    }
}
