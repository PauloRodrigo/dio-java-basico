public class MinhaClasse {

    public static void main (String [] args){
        
        System.out.println( " Olá print");
        String pNome = "Paulo";
        String sNome = "Rodrigo";

        System.out.println("Nome é "+nomeCompleto(pNome, sNome));
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
        
    }


    
}

