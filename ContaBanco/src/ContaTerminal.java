import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o seu nome ?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Qual o saldo que esta disponivel na conta? ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite a sua Agencia ?");
        String agencia = scanner.next();

        System.out.println("Qual o número da sua conta ?");
        int numero = scanner.nextInt();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}
