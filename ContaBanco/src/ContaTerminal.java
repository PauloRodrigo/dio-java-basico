import java.util.Scanner;

public class ContaTerminal {

    int numero = 0;
    String agencia;
    String nomeCliente;
    Double saldo; 

    public static void main(String[] args) throws Exception {
        ContaTerminal contaBanco = new ContaTerminal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe  o número da agência:");
        contaBanco.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a agência:");
        contaBanco.agencia = scanner.nextLine();

        System.out.println("Informe seu nome:");
        contaBanco.nomeCliente = scanner.nextLine();

        System.out.println("Informe seu saldo:");
        contaBanco.saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá ["+contaBanco.nomeCliente+"], obrigado por criar uma conta em nosso banco, "+
                           "sua agência é ["+contaBanco.agencia+"], conta ["+contaBanco.numero+"] e "+
                           "seu saldo ["+contaBanco.saldo+"] já está disponível para saque");

    }
}
