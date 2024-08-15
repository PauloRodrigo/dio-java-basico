import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
       
        try {
            String nome;
            int    idade;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe seu nome:");
            nome = scanner.nextLine();

            System.out.println("Informe sua idade:");
            idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Olá "+nome+" sua idade é de "+idade+" anos de idade");
            scanner.close();
        } catch (Exception e) {
            System.err.println("Houve um erro nas informações digitadas");
        } finally {
            System.out.println("acabou! acabou!");
        }
        


    }

}
