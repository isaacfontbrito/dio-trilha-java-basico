/** Modo condicional swith/case*/
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // M / T
        
        switch (plano) {
            case  "T":
            System.out.println("5Gb Youtube");
            /**O uso do break é comum para parar uma condição
             *  nesse exemplo estou usando para uma forma
             *  crescente sem o uso mas em outra condição 
             * se usa em caso de nescecidade */
            case "M":
            System.out.println("WhatsApp e Instagran grátis");
            
            case "B":
            System.out.println("100 minutos de ligação");
            
        }
    }
}
