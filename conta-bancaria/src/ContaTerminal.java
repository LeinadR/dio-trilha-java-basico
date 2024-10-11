import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Por favor, preencha corretamente as informações:");
            
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua agência: ");
            String agencia = scanner.nextLine();

            System.out.println("Digite sua conta: ");
            int numero = scanner.nextInt();

            System.out.println("Digite seu saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
        }
    }
}
