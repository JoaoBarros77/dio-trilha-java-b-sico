import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu Nome !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite sua Agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite seu Saldo !");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
