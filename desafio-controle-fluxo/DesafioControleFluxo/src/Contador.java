import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        try {
            int firstParameter;
            int secondParameter;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o primeiro número:");
            firstParameter = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o segundo número:");
            secondParameter = scanner.nextInt();
            scanner.nextLine();

            try {
                countParameters(firstParameter, secondParameter);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }

            scanner.close();
        } catch (Exception e) {
            System.err.println("Houve um erro nas informações digitadas");
        } finally {
            System.out.println("Contador encerrado.");
        }
    }

    static void countParameters(int firstParameter, int secondParameter) throws ParametrosInvalidosException{
        if (secondParameter <= firstParameter){
            throw new ParametrosInvalidosException("O segundo parametro precisa ser superior ao primeiro");
        }

        int contagem = secondParameter - firstParameter;
        // Loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}
