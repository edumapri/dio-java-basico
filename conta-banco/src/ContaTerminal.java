import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o numero de sua conta: ");
        int conta = entradaUsuario.nextInt();

        System.out.print("Digite o número de sua agência: ");
        String agencia = entradaUsuario.next();

        System.out.print("Digite o seu primeiro nome: ");
        String nome = entradaUsuario.next();

        System.out.print("Digite o seu sobrenome: ");
        String sobrnome = entradaUsuario.next();

        String cliente = nome + " " + sobrnome;

            
        System.out.print("Informe o valor de seu depósito inicial: ");
        double saldo = entradaUsuario.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e o seu saldo " + saldo + " já está disponível para saque.");

        entradaUsuario.close();
}
