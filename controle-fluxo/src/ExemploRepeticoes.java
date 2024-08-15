public class ExemploRepeticoes {

    public static void main(String[] args) {
 
        // for simples
        System.out.println("");
        for (int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
            System.out.println(carneirinhos+" fucking carneirinhos");
        }
        System.out.println("joãozinho caiu no boa noite cinderela.... vão comer o cu dele.");

        // for em array
        String alunos [] = {"kiko", "zinho", "lindo"};
        System.out.println("");
        System.out.print("Mandando um abraço para ... ");
        for (int x = 0; x < alunos.length; x++){
            System.out.print(alunos[x]+" ");
        }

        // foreach
        System.out.println("");
        System.out.print("Forte abraço por trás para ... ");
        for (String aluno: alunos){
            System.out.print(aluno+" ");

        }

        // break ... houve uma redução nos carneirinhos
        System.out.println("");
        for (int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
            if (carneirinhos == 5) 
                break;

            System.out.println(carneirinhos+" fucking carneirinhos");
        }
        System.out.println("joãozinho caiu no boa noite cinderela.... vão comer o cu dele.");

        // continuek ... carneirinho 10 estava com diarréia
        System.out.println("");
        System.out.println("Exemplo de Continue:");
        for (int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
            if (carneirinhos == 10) 
                continue;

            System.out.println(carneirinhos+" fucking carneirinhos");
        }
        
        //while 
        int meses = 1;
        while (meses < 13){
            System.out.println(meses);
            meses++;

        }

        //do while 
        meses = 2;
        do{
            System.out.println(meses);
            meses++;
        }while (meses < 13);

    }
}
