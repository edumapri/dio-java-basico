import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número de sua conta: ");
        int conta = scanner.nextInt();
        System.out.println("---------------------");

        System.out.print("Digite o número de sua agência: ");
        String agencia = scanner.next();
        System.out.println("---------------------");

        System.out.print("Digite o seu nome: ");
        String cliente = scanner.next();
        System.out.println("---------------------");

        System.out.print("Informe o valor de seu depósito inicial: ");
        double saldo = scanner.nextDouble();
        System.out.println("---------------------");

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e o seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
