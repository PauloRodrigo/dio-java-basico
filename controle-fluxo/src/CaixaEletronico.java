public class CaixaEletronico {
    
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo é "+saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        //************************

        int nota = 6;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >=5 && nota < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");

        //***************************

        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!";
        System.out.println(resultado);

        String resultado2 = nota >= 7 ? "Aprovado!" : (nota >=5 && nota < 7) ? "Recuperação!" : "Reprovado!";
        System.out.println(resultado2);

        //***************************

        String opcao = "M";

        switch (opcao) {
            case "P":
                System.out.println("P");
                break;
            case "M":
                System.out.println("M");
                break;
        }

        switch (opcao) {
            case "P":
                System.out.println("P");
            case "M":
                System.out.println("M");
        }

        
    }
}
