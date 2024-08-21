package candidatura;

public class ProcessoSeletivo {


    public static void main(String[] args) {
        
        System.out.println("Processo seletivo");

        analisarCandidato(2000);
        analisarCandidato(1500);
        analisarCandidato(2400);

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

        String [] candidatos = {"Lucas Almeida", "Ana Carolina", "Gabriel Santos",  "Maria Fernanda", "Rafael Oliveira", 
                                "Beatriz Costa", "João Pedro",   "Isabela Martins", "Felipe Rodrigues", "Larissa Silva"};

        for (int i = 0; i < candidatos.length; i++){

            System.out.println(candidatos[i]);

        }

        for(String candidato:candidatos){
            System.out.println("foreach:"+candidato);
        }

    }



}
