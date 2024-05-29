import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ProcessoSelevito {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            entrarEmContato(candidato);
        }
    }
    static void entrarEmContato(String candidato) {
        int tenttativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu= false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tenttativaRealizadas++;
            } else
                System.out.println("CONTATO REALIZADO COM SUCESO");
        } while(continuarTentando && tenttativaRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tenttativaRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO DE TENTATIVAS " + tenttativaRealizadas + " REALIZADA"); 
    }
    
            
                
    // Metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    } 

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice ++) {
            System.out.println("O candidato de n " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candatosAtual= 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candatosAtual <  candidatos.length) {
            String candidato = candidatos[candatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candatosAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200); 
    }

    // static void analisarCandidato(double salarioPretendido) {
        
    //     if(salarioBase > salarioPretendido) {
    //         System.out.println("LIGAR PARA O CANDIDATO");
    //     }else if(salarioBase == salarioPretendido)
    //     System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    //     else{
    //         System.out.println("AGUARDANDO O RESULTADOS DOS DEMAIS CANDIDATOS");
    //     }
    // }
}
