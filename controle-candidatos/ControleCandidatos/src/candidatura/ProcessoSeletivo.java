package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {


    public static void main(String[] args) {
        
        /*
        System.out.println("Processo seletivo");

        analisarCandidato(2000);
        analisarCandidato(1500);
        analisarCandidato(2400);
        */
        selecaoCandidatos();
        

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){

            System.out.println("Ligar para candidato");

        } else if (salarioBase == salarioPretendido){

            System.out.println("Ligar para candidato com contra-proposta");

        } else {

            System.out.println("Aguardar resultado dos demais candidatos");

        }
    }

    static void selecaoCandidatos(){

        String [] candidatos = {"Lucas Almeida   ", 
                                "Ana Carolina    ", 
                                "Gabriel Santos  ",  
                                "Maria Fernanda  ",  
                                "Rafael Oliveira ", 
                                "Beatriz Costa   ", 
                                "João Pedro      ",  
                                "Isabela Martins ", 
                                "Felipe Rodrigues", 
                                "Larissa Silva   "};

        for (int i = 0; i < candidatos.length; i++){
            //System.out.println(candidatos[i]);        
        }
                        
        for(String candidato:candidatos){
            System.out.println("foreach:"+candidato);
        }
                        

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido(); 

            String resultadoProposta = salarioPretendido <= salarioBase? "e sua proposta foi aprovada" : "e sua proposta foi reprovada";
            if (salarioPretendido <= salarioBase){
                candidatosSelecionados++;
            }

            System.out.println("");
            System.out.println("o candidato "+candidato+" solicitou esse valor de salario "+String.format("%.2f", salarioPretendido)+" "+resultadoProposta);
            if (salarioPretendido <= salarioBase){
                System.err.println(entrarEmContato());
            }


            candidatosAtual++;

            if (candidatosAtual == 10 || candidatosSelecionados == 5) {
                if (candidatosSelecionados == 5){
                    System.out.println("seleção de funcionários concluída com todas as vagas preenchidas.");
                } else {
                    System.out.println("seleção de funcionários concluída com "+candidatosSelecionados+" as vagas preenchidas.");
                }
                break;
            }
         }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static String entrarEmContato() {
        boolean atendeu = false;
        int i;
        for (i = 1; i < 4; i++){
            atendeu = new Random().nextBoolean();
            if (atendeu) break;
        }
        return atendeu ? "contato realizado na tentativa "+i : "contatao não realizado na tentativa "+i;
    }



}
